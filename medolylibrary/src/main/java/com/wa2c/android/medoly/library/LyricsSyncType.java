package com.wa2c.android.medoly.library;

/**
 * 歌詞の同期種別。
 */
public enum LyricsSyncType {
    /** 同期歌詞。 */
    SYNC(R.string.lyrics_sync_sync),
    /** 非同期歌詞。 */
    UNSYNC(R.string.lyrics_sync_unsync);

    /** 初期化する。 */
    LyricsSyncType(int id) { this.nameId = id; }
    /** 名前のID。 */
    private int nameId;
    /** 名前のIDを取得する。 */
    public int getNameId() { return nameId; }
}
