package com.wa2c.android.medoly.library;


import android.content.Context;

/**
 * Property interface.
 */
public interface IProperty {
    /** Get property name id. */
    int getNameId();
    /** Get property name. */
    String getName(Context context);
    /** Get property key name. */
    String getKeyName();
}
