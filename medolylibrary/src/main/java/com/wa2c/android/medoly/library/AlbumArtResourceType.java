package com.wa2c.android.medoly.library;

/**
 * Album art resource type.
 */
public enum AlbumArtResourceType {
    /** Built-in image. */
    INTERNAL(R.string.album_art_resource_internal),
    /** External file lyrics. */
    EXTERNAL(R.string.album_art_resource_external),
    /** External service image. */
    SERVICE(R.string.album_art_resource_service),
    /** Content provider image. */
    PROVIDER(R.string.album_art_resource_provider);

    /** Constructor. */
    AlbumArtResourceType(int id) {
        this.nameId = id;
    }
    /** Name id. */
    private int nameId;
    /** Get name id. */
    public int getNameId() {
        return nameId;
    }
}
