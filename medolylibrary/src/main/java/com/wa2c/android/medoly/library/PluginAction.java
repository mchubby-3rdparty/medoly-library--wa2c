package com.wa2c.android.medoly.library;

/** プラグインアクション。 */
public enum PluginAction {
    /** メディアプラグイン。 */
    ACTION_MEDIA,
    /** 検索プラグイン。 */
    ACTION_SEARCH;

    /** コンストラクタ。 */
    PluginAction() {
        actionValue = "com.wa2c.android.medoly.plugin.action." + this.name();
    }

    /** アクションの値。 */
    private String actionValue;
    /** アクションの値を取得。 */
    public String getActionValue() {
        return actionValue;
    }
}
