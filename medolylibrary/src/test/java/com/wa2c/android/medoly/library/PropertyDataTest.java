package com.wa2c.android.medoly.library;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PropertyDataTest {

    PropertyData propertyData;

    @Before
    public void setUp() throws Exception {
        propertyData = new PropertyData() {{
            put(MediaProperty.TITLE,  new ArrayList<String>() {{ add("Title1");  add("Title2");  }});
            put(MediaProperty.ARTIST, new ArrayList<String>() {{ add("Artist1"); add("Artist2"); }});
            put(MediaProperty.ALBUM,  new ArrayList<String>() {{ add("Album1");  add("Album1");  }});

            put(MediaProperty.COMPOSER, new ArrayList<String>());
            ArrayList<String> list = null;
            put(MediaProperty.LYRICIST, list);
        }};
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void containsKey() throws Exception {
        assertTrue(propertyData.containsKey(MediaProperty.TITLE));
        assertTrue(propertyData.containsKey(MediaProperty.TITLE.getKeyName()));
        assertTrue(propertyData.containsKey(MediaProperty.ARTIST));
        assertTrue(propertyData.containsKey(MediaProperty.ARTIST.getKeyName()));
        assertTrue(propertyData.containsKey(MediaProperty.ALBUM));
        assertTrue(propertyData.containsKey(MediaProperty.ALBUM.getKeyName()));

        assertTrue(propertyData.containsKey(MediaProperty.COMPOSER));
        assertTrue(propertyData.containsKey(MediaProperty.LYRICIST));
        assertFalse(propertyData.containsKey(MediaProperty.ARRANGER));
    }

    @Test
    public void containsValue() throws Exception {
        assertFalse(propertyData.containsValue(null));
        assertFalse(propertyData.containsValue("Title1"));
        assertFalse(propertyData.containsValue(new ArrayList<String>() {{ add("Title1"); }}));
        assertTrue(propertyData.containsValue(new ArrayList<String>() {{ add("Title1"); add("Title2"); }}));
        assertTrue(propertyData.containsValue(new ArrayList<String>()));
    }

    @Test
    public void remove() throws Exception {
        List<String> list1 = propertyData.get(MediaProperty.TITLE);
        List<String> list2 = propertyData.remove(MediaProperty.TITLE);
        assertEquals(list1, list2);
        assertFalse(propertyData.containsValue(list2));

        List<String> list3 = propertyData.get(MediaProperty.ARTIST);
        List<String> list4 = propertyData.remove(MediaProperty.ARTIST);
        assertEquals(list3, list4);
        assertFalse(propertyData.containsValue(list4));
    }

    @Test
    public void get() throws Exception {
        List<String> val = propertyData.get(MediaProperty.TITLE);
        assertNotNull(val);
        assertTrue(val.equals(new ArrayList<String>() {{ add("Title1"); add("Title2"); }}));
    }

    @Test
    public void getFirst() throws Exception {

    }


    @Test
    public void put() throws Exception {

    }

    @Test
    public void insertFirst() throws Exception {

    }

    @Test
    public void insertLast() throws Exception {

    }

    @Test
    public void getText() throws Exception {

    }

    @Test
    public void isMediaEmpty() throws Exception {

    }

    @Test
    public void isAlbumArtEmpty() throws Exception {

    }

    @Test
    public void isLyricsEmpty() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void equals() throws Exception {

    }

}