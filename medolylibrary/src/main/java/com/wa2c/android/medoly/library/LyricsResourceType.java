package com.wa2c.android.medoly.library;

/**
 * Lyrics resource type.
 */
public enum LyricsResourceType {
    /** Built-in lyrics. */
    INTERNAL(R.string.lyrics_resource_internal),
    /** External file lyrics. */
    EXTERNAL(R.string.lyrics_resource_file),
    /** External service lyrics. */
    SERVICE(R.string.lyrics_resource_service);

    /** Constructor. */
    LyricsResourceType(int id) {
        this.nameId = id;
    }
    /** Name id. */
    private int nameId;
    /** Get name id. */
    public int getNameId() {
        return nameId;
    }
}