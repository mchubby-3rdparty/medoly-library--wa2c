package com.wa2c.android.medoly.library;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

public class PropertyDataTest {

    PropertyData propertyData;



    @Before
    public void setUp() throws Exception {
        propertyData = new PropertyData();
        propertyData.put(MediaProperty.TITLE, "Title1");
        propertyData.put(MediaProperty.ARTIST, "Artist1");

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void containsKey() throws Exception {
        assertTrue(propertyData.containsKey(MediaProperty.TITLE));
        assertTrue(propertyData.containsKey(MediaProperty.TITLE.getKeyName()));
    }

    @Test
    public void containsValue() throws Exception {
        assertTrue(false);
    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void get() throws Exception {

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

}