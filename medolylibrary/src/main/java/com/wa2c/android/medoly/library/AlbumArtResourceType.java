package com.wa2c.android.medoly.library;


/**
 * アルバムアートのデータ種別。
 */
public enum AlbumArtResourceType {
    /** 外部ファイル。 */
    EXTERNAL(R.string.album_art_resource_external),
    /** 内蔵。 */
    INTERNAL(R.string.album_art_resource_internal),
    /** コンテンツプロバイダ。 */
    PROVIDER(R.string.album_art_resource_provider);

    /** 初期化する。 */
    AlbumArtResourceType(int id) { this.nameId = id; }
    /** 名前のID。 */
    private int nameId;
    /** 名前のIDを取得する。 */
    public int getNameId() { return nameId; }
}
