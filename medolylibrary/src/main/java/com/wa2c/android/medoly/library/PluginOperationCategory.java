package com.wa2c.android.medoly.library;

/**
 * Plugin operation category.
 */
public enum PluginOperationCategory {
    /** Execute. */
    OPERATION_EXECUTE,
    /** Open media. */
    OPERATION_MEDIA_OPEN,
    /** Start playing. */
    OPERATION_PLAY_START,
    /** Stop playing. */
    OPERATION_PLAY_STOP,
    /** Close media. */
    OPERATION_MEDIA_CLOSE,
    /** Now playing. */
    OPERATION_PLAY_NOW,
    /** Complete playing. */
    OPERATION_PLAY_COMPLETE;



    /** Constructor. */
    PluginOperationCategory() {
        categoryValue = "com.wa2c.android.medoly.plugin.category." + this.name();
    }
    /** Category value. */
    private String categoryValue;
    /** Get the category value. */
    public String getCategoryValue() {
        return categoryValue;
    }

}
