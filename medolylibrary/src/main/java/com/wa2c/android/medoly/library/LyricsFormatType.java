package com.wa2c.android.medoly.library;

/**
 * 歌詞のフォーマット種別。
 */
public enum LyricsFormatType {
    /** プレーンテキスト。 */
    TEXT(R.string.lyrics_format_text, "text/plain"),
    /** LRCフォーマット。 */
    LRC(R.string.lyrics_format_lrc, "text/plain"),
    /** KRAフォーマット。 */
    KRA(R.string.lyrics_format_kra, "text/plain"),
    /** JoyHackフォーマット。 */
    JOYHACK(R.string.lyrics_format_joyhack, "text/plain"),
    /** SRT (SubRip) フォーマット。 */
    SRT(R.string.lyrics_format_srt, "text/srt"),
    /** STL (Spruce subtitle) フォーマット。 */
    STL(R.string.lyrics_format_stl, "application/octet-stream"),
    /** SCC (Scenarist Closed Caption) フォーマット。 */
    SCC(R.string.lyrics_format_scc, "text/plain"),
    /** SSA/ASS (SubStation Alpha) フォーマット。 */
    ASS(R.string.lyrics_format_ass, "application/x-ass"),
    /** TTML (Timed Text Markup Language) フォーマット。 */
    TTML(R.string.lyrics_format_ttml, "application/ttml+xml"),

    /** 内蔵歌詞フィールド */
    LYRICS(R.string.lyrics_format_lyrics, null),
    /** SYLT フィールド */
    SYLT(R.string.lyrics_format_sylt, null),
    /** MP3 Lyrics3 v1 フィールド */
    MP3_LYRICS3V1(R.string.lyrics_format_mp3_lyrics3v1, null),
    /** MP3 Lyrics3 v2 フィールド */
    MP3_LYRICS3V2(R.string.lyrics_format_mp3_lyrics3v2, null);

    /** 初期化。 */
    LyricsFormatType(int id, String mimeType) {
        this.nameId = id;
        this.mimeType = mimeType;
    }


    /** 名前のID。 */
    private int nameId;
    /** MIME Type */
    private String mimeType;

    /** 名前のIDを取得する。 */
    public int getNameId() { return nameId; }
    /** MimeTypeを取得する。 */
    public String getMimeType() { return mimeType; }
}

