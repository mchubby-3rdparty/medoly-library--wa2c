package com.wa2c.android.medoly.library;

import android.content.Context;

import java.util.HashSet;

/**
 * 再生キューのプロパティ情報。
 */
public enum QueueProperty implements IProperty {
    CURRENT_POSITION ( R.string.queue_current_position ),
    /** 現在の再生曲No。 */
    CURRENT_NO       ( R.string.queue_current_no       ),
    /** 合計再生曲数。 */
    TOTAL_COUNT      ( R.string.queue_total_count      ),
    /** 再生済曲数。 */
    PLAYED_COUNT     ( R.string.queue_played_count     ),
    /** 合計再生時間。 */
    TOTAL_TIME       ( R.string.queue_total_time       ),
    /** 再生済時間。 */
    PLAYED_TIME      ( R.string.queue_played_time      ),
    /** ループ回数。 */
    LOOP_COUNT       ( R.string.queue_loop_count       );



    /** プロパティのキー名に付く接頭語。 */
    public static final String KEY_PREFIX = "QUEUE";

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
    QueueProperty(int nameId) {
        this.nameId = nameId;
        this.keyName = KEY_PREFIX + "_" + this.name();
    }



    // Shortening

    /** 省略可否を取得。 */
    public boolean enableShortening() {
        return getShorteningSet().contains(this);
    }

    /** 省略可のプロパティセットを取得。 */
    public static HashSet<QueueProperty> getShorteningSet() {
        return shorteningSet;
    }

    /** 省略可のプロパティセット。 */
    private static HashSet<QueueProperty> shorteningSet = new HashSet<QueueProperty>() {{
    }};
}