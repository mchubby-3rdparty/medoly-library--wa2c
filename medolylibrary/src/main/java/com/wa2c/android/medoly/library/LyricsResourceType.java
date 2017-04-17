package com.wa2c.android.medoly.library;

/**
 * 歌詞のデータ種別。
 */
public enum LyricsResourceType {
    /** 内蔵。 */
    INTERNAL(R.string.lyrics_resource_internal),
    /** 外部ファイル。 */
    EXTERNAL(R.string.lyrics_resource_file),
    /** 外部サービス。 */
    SERVICE(R.string.lyrics_resource_service);

    /** 初期化。 */
    LyricsResourceType(int id) { this.nameId = id; }
    /** 名前のID。 */
    private int nameId;
    /** 名前のIDを取得する。 */
    public int getNameId() { return nameId; }
}