package com.wa2c.android.medoly.library;


import android.content.Context;

public interface IProperty {
    /** プロパティの名称IDを取得。 */
    int getNameId();
    /** プロパティの名称を取得。 */
    String getName(Context context);
    /** プロパティのキー名を取得。 */
    String getKeyName();

    /** 省略可否。 */
    boolean enableShortening();

}
