package com.wa2c.android.medoly.library;

import android.content.Context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * アルバムアートのプロパティ情報。
 */
public enum AlbumArtProperty implements IProperty {
    /** リソース種別。 */
    RESOURCE_TYPE ( R.string.album_art_resource_type ),
    /** 画像サイズ。 */
    IMAGE_SIZE    ( R.string.album_art_resolution    ),


    /** 取得元名称。 */
    SOURCE_TITLE  ( R.string.source_title            ),
    /** 取得元URI。 */
    SOURCE_URI    ( R.string.source_uri              ),
    /** MIMEタイプ。 */
    MIME_TYPE     ( R.string.mime_type               ),
    /** フォルダパス。 */
    FOLDER_PATH   ( R.string.folder_path             ),
    /** ファイル名。 */
    FILE_NAME     ( R.string.file_name               ),
    /** データサイズ。 */
    DATA_SIZE     ( R.string.data_size               ),
    /** 更新日時。 */
    LAST_MODIFIED ( R.string.last_modified           ),
    /** URI。 */
    DATA_URI      ( R.string.data_uri                );



    /** プロパティのキー名に付く接頭語。 */
    public static final String KEY_PREFIX = "ALBUM_ART";

    /** 名称のID。 */
    private int nameId;
    /** プロパティのキー名。 */
    private String keyName;

    /** プロパティの名称IDを取得。 */
    public int getNameId() {
        return this.nameId;
    }
    /** プロパティの名称を取得。 */
    public String getName(Context context) {
        return context.getString(nameId);
    }
    /** プロパティのキー名を取得。 */
    public String getKeyName() {
        return keyName;
    }

    /** コンストラクタ。 */
    AlbumArtProperty(int nameId) {
        this.nameId = nameId;
        this.keyName = KEY_PREFIX + "_" + this.name();
    }



    // Key-Property map

    /**
     * キー名とプロパティの対応。
     */
    private static final Map<String, AlbumArtProperty> keyPropertyMap = new HashMap<String, AlbumArtProperty>() {{
        for (AlbumArtProperty p : AlbumArtProperty.values()) {
            put(p.getKeyName(), p);
        }
    }};

    /**
     * キー名に対応するプロパティを取得。
     * @param keyName キー名。
     * @return プロパティ。
     */
    public static AlbumArtProperty valueOfKey(String keyName) {
        return keyPropertyMap.get(keyName);
    }



    // Shortening

    /** 省略可否を取得。 */
    public boolean enableShortening() {
        return getShorteningSet().contains(this);
    }

    /** 省略可のプロパティセットを取得。 */
    public static HashSet<AlbumArtProperty> getShorteningSet() {
        return shorteningSet;
    }

    /** 省略可のプロパティセット。 */
    private static HashSet<AlbumArtProperty> shorteningSet = new HashSet<AlbumArtProperty>() {{
        add( RESOURCE_TYPE );
        add( FOLDER_PATH   );
        add( FILE_NAME     );
        add( LAST_MODIFIED );
    }};
}
