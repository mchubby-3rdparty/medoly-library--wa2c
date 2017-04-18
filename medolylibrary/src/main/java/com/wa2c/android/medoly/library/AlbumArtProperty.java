package com.wa2c.android.medoly.library;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Album art properties.
 */
public enum AlbumArtProperty implements IProperty {
    /** Resource type. */
    RESOURCE_TYPE ( R.string.album_art_resource_type ),
    /** Image size. */
    IMAGE_SIZE    ( R.string.album_art_resolution    ),

    /** Source name. */
    SOURCE_TITLE  ( R.string.source_title            ),
    /** Source URI. */
    SOURCE_URI    ( R.string.source_uri              ),
    /** MIME Type. */
    MIME_TYPE     ( R.string.mime_type               ),
    /** Folder path. */
    FOLDER_PATH   ( R.string.folder_path             ),
    /** File name. */
    FILE_NAME     ( R.string.file_name               ),
    /** Data size. */
    DATA_SIZE     ( R.string.data_size               ),
    /** Last modified date. */
    LAST_MODIFIED ( R.string.last_modified           ),
    /** URI. */
    DATA_URI      ( R.string.data_uri                );



    /** Prefix to property key name. */
    public static final String KEY_PREFIX = "ALBUM_ART";

    /** Name id */
    private int nameId;
    /** Property key name */
    private String keyName;

    /** Get property name id. */
    public int getNameId() {
        return this.nameId;
    }
    /** Get property name. */
    public String getName(Context context) {
        return context.getString(nameId);
    }
    /** Get property key name. */
    public String getKeyName() {
        return keyName;
    }

    /** Constructor. */
    AlbumArtProperty(int nameId) {
        this.nameId = nameId;
        this.keyName = KEY_PREFIX + "_" + this.name();
    }



    // static

    /**
     * Map of key name and property.
     */
    private static final Map<String, AlbumArtProperty> keyPropertyMap = new HashMap<String, AlbumArtProperty>() {{
        for (AlbumArtProperty p : AlbumArtProperty.values()) {
            put(p.getKeyName(), p);
        }
    }};

    /**
     * Get property of key name.
     * @param keyName Key name.
     * @return Property.
     */
    public static AlbumArtProperty valueOfKey(String keyName) {
        return keyPropertyMap.get(keyName);
    }
}
