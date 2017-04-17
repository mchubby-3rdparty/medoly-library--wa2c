package com.wa2c.android.medoly.library;

/** プラグイン種別カテゴリ */
public enum PluginTypeCategory {
    /** 実行(汎用)。 */
    TYPE_RUN,

    /** メッセージ通知。 */
    TYPE_POST_MESSAGE,

    /** アルバムアート要求。 */
    TYPE_GET_ALBUM_ART,
    /** アルバムアート返信。 */
    TYPE_PUT_ALBUM_ART,

    /** 歌詞要求。 */
    TYPE_GET_LYRICS,
    /** 歌詞返信。 */
    TYPE_PUT_LYRICS,

    /** プロパティ要求。 */
    TYPE_GET_PROPERTY,
    /** プロパティ返信。 */
    TYPE_PUT_PROPERTY;

    /** コンストラクタ。 */
    PluginTypeCategory() {
        categoryValue = "com.wa2c.android.medoly.plugin.category." + this.name();
    }

    /** カテゴリの値。 */
    private String categoryValue;
    /** カテゴリの値を取得。 */
    public String getCategoryValue() {
        return categoryValue;
    }
}
