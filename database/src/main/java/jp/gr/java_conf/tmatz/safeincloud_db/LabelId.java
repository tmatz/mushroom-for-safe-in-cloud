package jp.gr.java_conf.tmatz.safeincloud_db;

import org.apache.commons.lang.StringUtils;

import java.io.PrintStream;

/**
 * Created by matsuda on 17/03/05.
 */

public class LabelId {

    private final String mId;

    public LabelId(String id)
    {
        mId = StringUtils.trimToEmpty(id);
    }

    public String getId() {
        return mId;
    }

    public void dump(PrintStream out, int depth) {
        for (int i = 0; i < depth; i++) {
            out.print("  ");
        }
        out.println("label_id " + getId());
    }
}
