package com.wa2c.android.medoly.library;

/**
 * Plugin type category.
 */
public enum PluginTypeCategory {
    /** Run plugin. */
    TYPE_RUN,

    /** Post message plugin. */
    TYPE_POST_MESSAGE,

    /** Get album art plugin. */
    TYPE_GET_ALBUM_ART,
    /** Put album art plugin. */
    TYPE_PUT_ALBUM_ART,

    /** Get lyrics plugin. */
    TYPE_GET_LYRICS,
    /** Put lyrics plugin. */
    TYPE_PUT_LYRICS,

    /** Get property plugin */
    TYPE_GET_PROPERTY,
    /** Put property plugin. */
    TYPE_PUT_PROPERTY;

    /** Constructor. */
    PluginTypeCategory() {
        categoryValue = "com.wa2c.android.medoly.plugin.category." + this.name();
    }
    /** Category value. */
    private String categoryValue;
    /** Get category value. */
    public String getCategoryValue() {
        return categoryValue;
    }
}
