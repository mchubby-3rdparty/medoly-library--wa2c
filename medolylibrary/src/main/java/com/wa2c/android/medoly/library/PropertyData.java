package com.wa2c.android.medoly.library;

import android.content.Intent;
import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * プロパティデータ。
 */
public class PropertyData extends HashMap<String, List<String>> {

    /**
     * コンストラクタ。
     */
    public PropertyData() {
        super();
    }

    /**
     * コピーコンストラクタ。
     * @param propertyData プロパティデータ。
     */
    public PropertyData(PropertyData propertyData) {
        super(propertyData);
    }

    /**
     * コピーコンストラクタ。
     * @param propertyData プロパティデータ。
     */
    public PropertyData(Map<String, List<String>> propertyData) {
        super(propertyData);
    }


    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    public boolean containsKey(IProperty key) {
        return super.containsKey(key.getKeyName());
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            return containsValue((List<String>)value);
        } catch (RuntimeException e) {
            return false;
        }
    }

    public boolean containsValue(List<String> value) {
        if (value == null)
            return false;

        for (String key : this.keySet()) {
            if (equals(key, value))
                return true;
        }
        return false;
    }

    public List<String> remove(IProperty key) {
        return super.remove(key.getKeyName());
    }



    /**
     * プロパティを取得
     * @param key プロパティキー。
     * @return プロパティ値。
     */
    public List<String> get(String key) {
        return super.get(key);
    }

    /**
     * プロパティを取得
     * @param key プロパティキー。
     * @return プロパティ値。
     */
    public List<String> get(IProperty key) {
        return super.get(key.getKeyName());
    }

    /**
     * 先頭のプロパティを取得。
     * @param key プロパティキー。
     * @return プロパティ値。
     */
    public String getFirst(String key) {
        List<String> list = super.get(key);
        if (list == null || list.isEmpty())
            return null;
        return list.get(0);
    }

    /**
     * 先頭のプロパティを取得。
     * @param key プロパティキー。
     * @return プロパティ値。
     */
    public String getFirst(IProperty key) {
        return this.getFirst(key.getKeyName());
    }


    /**
     * 新しいプロパティ値を設定。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public List<String> put(String key, List<String> value) {
        return super.put(key, value);
    }

    /**
     * 新しいプロパティ値を設定。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public List<String> put(IProperty key, List<String> value) {
        return super.put(key.getKeyName(), value);
    }

    /**
     * 新しいプロパティ値を設定。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public List<String> put(String key, String value) {
        List<String> list = new ArrayList<>();
        list.add(value);
        return super.put(key, list);
    }

    /**
     * 新しいプロパティ値を設定。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public List<String>  put(IProperty key, String value) {
        return this.put(key.getKeyName(), value);
    }



    /**
     * 先頭にプロパティ値を挿入。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public void insertFirst(String key, String value) {
        List<String> list = get(key);
        if (list == null) {
            list = new ArrayList<>();
            super.put(key, list);
        }
        list.add(0, value);
    }

    /**
     * 先頭にプロパティ値を挿入。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public void insertFirst(IProperty key, String value) {
        this.insertFirst(key.getKeyName(), value);
    }

    /**
     * 末尾にプロパティ値を追加。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public void insertLast(String key, String value) {
        List<String> list = get(key);
        if (list == null) {
            list = new ArrayList<>();
            super.put(key, list);
        }
        list.add(value);
    }

    /**
     * 末尾にプロパティ値を追加。
     * @param key プロパティキー。
     * @param value プロパティ値。
     */
    public void insertLast(IProperty key, String value) {
        this.insertLast(key.getKeyName(), value);
    }



    /**
     * 値を改行で連結してテキストとして返す。
     * @param key プロパティキー。
     * @return テキスト。
     */
    public String getText(IProperty key) {
        return getText(key.getKeyName(), "\n");
    }

    /**
     * 値を改行で連結してテキストとして返す。
     * @param key プロパティキー。
     * @return テキスト。
     */
    public String getText(String key) {
        return getText(key, "\n");
    }

    /**
     * 値を連結してテキストとして返す。
     * @param key プロパティキー。
     * @param separator 連結文字列。
     * @return テキスト。
     */
    public String getText(IProperty key, String separator) {
        return getText(key.getKeyName(), separator);
    }

    /**
     * 値を連結してテキストとして返す。
     * @param key プロパティキー。
     * @param separator 連結文字列。
     * @return テキスト。
     */
    public String getText(String key, String separator) {
        List<String> list = this.get(key);
        if (list == null || list.size() == 0)
            return "";
        if (list.size() == 1)
            return list.get(0);
        if (separator == null)
            separator = "";

        StringBuilder builder = new StringBuilder();
        for (String text : list) {
            builder.append(text).append(separator);
        }
        return builder.substring(0, builder.length() -  separator.length());
    }

    /**
     * メディアの存在を確認。
     * @return メディアが存在する場合はtrue。
     */
    public boolean isMediaEmpty() {
        return TextUtils.isEmpty(this.getFirst(MediaProperty.DATA_URI));
    }

    /**
     * アルバムアートの存在を確認。
     * @return アルバムアートが存在する場合はtrue。
     */
    public boolean isAlbumArtEmpty() {
        return TextUtils.isEmpty(this.getFirst(AlbumArtProperty.RESOURCE_TYPE));
    }

    /**
     * 歌詞の有無を確認。
     * @return 歌詞が存在する場合はtrue。
     */
    public boolean isLyricsEmpty() {
        return TextUtils.isEmpty(this.getFirst(LyricsProperty.RESOURCE_TYPE));
    }

    /**
     * データの有無を確認。
     * @return データ無しの場合はtrue。
     */
    public boolean isEmpty(IProperty key) {
        return this.isEmpty(key.getKeyName());
    }

    /**
     * データの有無を確認。
     * @return データ無しの場合はtrue。
     */
    public boolean isEmpty(String key) {
        List<String> list = this.get(key);
        return (list == null || list.size() == 0);
    }

    @Override
    public PropertyData clone() {
        return (PropertyData)super.clone();
    }


    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Map))
            return false;

       try {
            Map map = (Map)object;
            for (String key : this.keySet()) {
                List<String> val = (List<String>)map.get(key);
                if (!this.equals(key, val))
                    return false;
            }
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    public boolean equals(IProperty property, List<String> list) {
        return this.equals(property.getKeyName(), list);
    }

    public boolean equals(String property, List<String> list) {
        List<String> thisList = this.get(property);
        if (list == null || thisList == null || list.size() != thisList.size())
            return false;

        if (list.size() == 0 && thisList.size() == 0)
            return false;

        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            String b = thisList.get(i);
            if (a == null || b == null)
                return false;
            if (!a.equals(b))
                return false;
        }
        return true;
    }

}
