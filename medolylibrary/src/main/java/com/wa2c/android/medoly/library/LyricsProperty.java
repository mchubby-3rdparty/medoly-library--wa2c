package com.wa2c.android.medoly.library;

import android.content.Context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Lyrics properties.
 */
public enum LyricsProperty implements IProperty {
    /** 歌詞。 */
    LYRICS             ( R.string.lyrics_lyrics             ),

    /** リソース種別。 */
    RESOURCE_TYPE      ( R.string.lyrics_resource_type      ),
    /** フォーマット種別。 */
    FORMAT_TYPE        ( R.string.lyrics_format_type        ),
    /** フィールド名。 */
    FIELD_NAME         ( R.string.lyrics_field_name         ),
    /** 同期種別。 */
    SYNC_TYPE          ( R.string.lyrics_sync_type          ),
    /** オフセット時間(ms)。 */
    OFFSET_TIME        ( R.string.lyrics_offset_time        ),
    /** 文字コード別。 */
    CHARACTER_ENCODING ( R.string.lyrics_character_encoding ),

    /** 取得元名称。 */
    SOURCE_TITLE       ( R.string.source_title              ),
    /** 取得元URI。 */
    SOURCE_URI         ( R.string.source_uri                ),
    /** MIME Type */
    MIME_TYPE          ( R.string.mime_type                 ),
    /** フォルダパス。 */
    FOLDER_PATH        ( R.string.folder_path               ),
    /** ファイル名。 */
    FILE_NAME          ( R.string.file_name                 ),
    /** データサイズ。 */
    DATA_SIZE          ( R.string.data_size                 ),
    /** 更新日時。 */
    LAST_MODIFIED      ( R.string.last_modified             ),
    /** URI。 */
    DATA_URI           ( R.string.data_uri                  );



    /** プロパティのキー名に付く接頭語。 */
    public static final String KEY_PREFIX = "LYRICS";

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
    LyricsProperty(int nameId) {
        this.nameId = nameId;
        this.keyName = KEY_PREFIX + "_" + this.name();
    }



    // Key-Property map

    /**
     * キー名とプロパティの対応。
     */
    private static final Map<String, LyricsProperty> keyPropertyMap = new HashMap<String, LyricsProperty>() {{
        for (LyricsProperty p : LyricsProperty.values()) {
            put(p.getKeyName(), p);
        }
    }};

    /**
     * キー名に対応するプロパティを取得。
     * @param keyName キー名。
     * @return プロパティ。
     */
    public static LyricsProperty valueOfKey(String keyName) {
        return keyPropertyMap.get(keyName);
    }

}
