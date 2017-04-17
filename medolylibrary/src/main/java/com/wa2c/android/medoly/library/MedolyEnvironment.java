package com.wa2c.android.medoly.library;


public class MedolyEnvironment {
    /** Medoly package. */
    public static String MEDOLY_PACKAGE = "com.wa2c.android.medoly";
    /** Medoly library package. */
    public static String MEDOLY_LIBRARY_PACKAGE = "com.wa2c.android.medoly.library";
    /** Medoly plugin package. */
    public static String MEDOLY_PLUGIN_PACKAGE = "com.wa2c.android.medoly.plugin";


    // Plugin intent keys

    /** アクションID */
    public static final String PLUGIN_ACTION_ID = "action_id";
    /** 呼び出し元パッケージ名。 */
    public static final String PLUGIN_SRC_PACKAGE = "src_package";

    /** 値マップのキー。 */
    public static final String PLUGIN_VALUE_KEY  = "value_map";
    /** 拡張値マップのキー。 */
    public static final String PLUGIN_EXTRA_KEY  = "extra_map";
    /** イベントキー。 */
    public static final String PLUGIN_EVENT_KEY = "is_event";

}
