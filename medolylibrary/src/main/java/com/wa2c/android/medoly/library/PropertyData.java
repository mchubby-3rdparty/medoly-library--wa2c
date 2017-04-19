package com.wa2c.android.medoly.library;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Property data.
 */
public class PropertyData extends HashMap<String, List<String>> {

    /**
     * Constructor.
     */
    public PropertyData() {
        super();
    }

    /**
     * Copy constructor.
     * @param propertyData property data.
     */
    public PropertyData(PropertyData propertyData) {
        super(propertyData);
    }

    /**
     * Copy constructor.
     * @param propertyData property data.
     */
    public PropertyData(Map<String, List<String>> propertyData) {
        super(propertyData);
    }


    /**
     * Returns true if this map contains a mapping for the specified key.
     * @param key A property key.
     * @return true if this map contains a mapping for the specified key.
     */
    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    /**
     * Returns true if this map contains a mapping for the specified key.
     * @param key A property key.
     * @return true if this map contains a mapping for the specified key.
     */
    public boolean containsKey(IProperty key) {
        return super.containsKey(key.getKeyName());
    }

    /**
     * Returns true if this map maps one or more keys to the specified value.
     * @param value A property value.
     * @return true if this map maps one or more keys to the specified value.
     */
    @Override
    public boolean containsValue(Object value) {
        try {
            return containsValue((List<String>)value);
        } catch (RuntimeException e) {
            return false;
        }
    }

    /**
     * Returns true if this map maps one or more keys to the specified value.
     * @param value A property value.
     * @return true if this map maps one or more keys to the specified value.
     */
    public boolean containsValue(List<String> value) {
        if (value == null)
            return false;

        for (String key : this.keySet()) {
            if (equals(key, value))
                return true;
        }
        return false;
    }

    /**
     * Removes the mapping for a key from this map if it is present (optional operation).
     * @param key key whose mapping is to be removed from the map.
     * @return the previous value associated with key, or null if there was no mapping for key.
     */
    public List<String> remove(IProperty key) {
        return super.remove(key.getKeyName());
    }



    /**
     * Get the property value list.
     * @param key A property key.
     * @return The property value list.
     */
    public List<String> get(String key) {
        return super.get(key);
    }

    /**
     * Get property value list.
     * @param key A property key.
     * @return The property value list.
     */
    public List<String> get(IProperty key) {
        return super.get(key.getKeyName());
    }

    /**
     * Get the first property value.
     * @param key A property key.
     * @return The first property value.
     */
    public String getFirst(String key) {
        List<String> list = super.get(key);
        if (list == null || list.isEmpty())
            return null;
        return list.get(0);
    }

    /**
     * Get the first property value.
     * @param key A property key.
     * @return The first property value.
     */
    public String getFirst(IProperty key) {
        return this.getFirst(key.getKeyName());
    }


    /**
     * Put the new property value list.
     * @param key A property key.
     * @param value The property value list.
     */
    public List<String> put(String key, List<String> value) {
        return super.put(key, value);
    }

    /**
     * Put the new property value list.
     * @param key A property key.
     * @param value The property value list.
     */
    public List<String> put(IProperty key, List<String> value) {
        return super.put(key.getKeyName(), value);
    }

    /**
     * Put the new property value.
     * @param key A property key.
     * @param value The property value.
     */
    public List<String> put(String key, String value) {
        List<String> list = new ArrayList<>();
        list.add(value);
        return super.put(key, list);
    }

    /**
     * Put the new property value.
     * @param key A property key.
     * @param value The property value.
     */
    public List<String>  put(IProperty key, String value) {
        return this.put(key.getKeyName(), value);
    }



    /**
     * Insert the property value to first position.
     * @param key A property key.
     * @param value The property value.
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
     * Insert the property value to first position.
     * @param key A property key.
     * @param value The property value.
     */
    public void insertFirst(IProperty key, String value) {
        this.insertFirst(key.getKeyName(), value);
    }

     /**
     * Insert the property value to last position.
     * @param key A property key.
     * @param value The property value.
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
     * Insert the property value to last position.
     * @param key A property key.
     * @param value The property value.
     */
    public void insertLast(IProperty key, String value) {
        this.insertLast(key.getKeyName(), value);
    }



    /**
     * Get the values concatenated by line breaks as text.
     * @param key A property key.
     * @return The concatenated property text.
     */
    public String getText(IProperty key) {
        return getText(key.getKeyName(), "\n");
    }

    /**
     * Get the values concatenated by line breaks as text.
     * @param key A property key.
     * @return The concatenated property text.
     */
    public String getText(String key) {
        return getText(key, "\n");
    }

    /**
     * Get the values concatenated by separator as text.
     * @param key A property key.
     * @param separator A separator.
     * @return The concatenated property text.
     */
    public String getText(IProperty key, String separator) {
        return getText(key.getKeyName(), separator);
    }

    /**
     * Get the values concatenated by separator as text.
     * @param key A property key.
     * @param separator A separator.
     * @return The concatenated property text.
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
     * Returns true if this property has media data.
     * @return true if this map has no media data.
     */
    public boolean isMediaEmpty() {
        return TextUtils.isEmpty(this.getFirst(MediaProperty.DATA_URI));
    }

    /**
     * Returns true if this property has album art data.
     * @return true if this map has no album art data.
     */
    public boolean isAlbumArtEmpty() {
        return TextUtils.isEmpty(this.getFirst(AlbumArtProperty.RESOURCE_TYPE));
    }

    /**
     * Returns true if this property has lyrics data.
     * @return true if this map has no lyrics data.
     */
    public boolean isLyricsEmpty() {
        return TextUtils.isEmpty(this.getFirst(LyricsProperty.RESOURCE_TYPE));
    }

    /**
     * Returns true if this map contains no key-value mappings.
     * @return true if this map contains no key-value mappings.
     */
    public boolean isEmpty(IProperty key) {
        return this.isEmpty(key.getKeyName());
    }

    /**
     * Returns true if this map contains no key-value mappings.
     * @param key key whose presence in this map is to be tested.
     * @return true if this map contains no key-value mappings.
     */
    public boolean isEmpty(String key) {
        List<String> list = this.get(key);
        return (list == null || list.size() == 0);
    }


    /**
     * Creates and returns a copy of this object.
     * @return A clone of this instance.
     */
    @Override
    public PropertyData clone() {
        return (PropertyData)super.clone();
    }

    /**
     * Compares the specified object with this map for equality.
     * @return true if the specified object is equal to this map.
     */
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

    /**
     * Compares the specified object with this map for equality.
     * @param property A property key.
     * @param list A property value list.
     * @return true if the specified object is equal to this map.
     */
    public boolean equals(IProperty property, List<String> list) {
        return this.equals(property.getKeyName(), list);
    }

    /**
     * Compares the specified object with this map for equality.
     * @param property A property key.
     * @param list A property value list.
     * @return true if the specified object is equal to this map.
     */
    public boolean equals(String property, List<String> list) {
        List<String> thisList = this.get(property);
        if (list == null || thisList == null || list.size() != thisList.size())
            return false;

        if (list.size() == 0 && thisList.size() == 0)
            return true;

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
