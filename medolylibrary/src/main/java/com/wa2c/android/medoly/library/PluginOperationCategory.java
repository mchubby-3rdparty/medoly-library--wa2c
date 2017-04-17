package com.wa2c.android.medoly.library;

/** プラグイン操作カテゴリ。 */
public enum PluginOperationCategory {
    /** 実行 */
    OPERATION_EXECUTE,
    /** メディア開始。 */
    OPERATION_MEDIA_OPEN,
    /** 再生開始。 */
    OPERATION_PLAY_START,
    /** 再生停止。 */
    OPERATION_PLAY_STOP,
    /** メディア終了。 */
    OPERATION_MEDIA_CLOSE,
    /** 再生中。 */
    OPERATION_PLAY_NOW,
    /** 再生完了。 */
    OPERATION_PLAY_COMPLETE;

    /** コンストラクタ。 */
    PluginOperationCategory() {
        categoryValue = "com.wa2c.android.medoly.plugin.category." + this.name();
    }

    /** カテゴリの値。 */
    private String categoryValue;
    /** カテゴリの値を取得。 */
    public String getCategoryValue() {
        return categoryValue;
    }
}
