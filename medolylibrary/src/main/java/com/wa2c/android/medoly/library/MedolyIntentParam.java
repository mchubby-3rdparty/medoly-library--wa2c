package com.wa2c.android.medoly.library;

import android.content.Intent;
import android.net.Uri;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Intent parameters.
 */
public class MedolyIntentParam {

    /** Property data. */
    private PropertyData propertyData;
    /** Property extra data. */
    private PropertyData propertyExtraData;

    /** Action ID.。 */
    private String actionId;
    /** Source package name. */
    private String srcPackage;
    /** Event state. */
    private boolean isEvent;
    /** Category info. */
    private Set<String> categorySet;
    /** Key info. */
    private Set<String> keySet;

    /** Media URI. */
    private Uri mediaUri;
    /** Album art URI. */
    private Uri albumArtUri;
    /** Lyrics URI. */
    private Uri lyricsUri;



    /**
     * Constructor.
     * @param intent A intent.
     */
    public MedolyIntentParam(Intent intent) {
        if (intent.hasExtra(MedolyEnvironment.PLUGIN_VALUE_KEY)) {
            Serializable serializable = intent.getSerializableExtra(MedolyEnvironment.PLUGIN_VALUE_KEY);
            if (serializable != null) {
                this.propertyData = new PropertyData((Map<String, List<String>>) serializable);
            }
        }
        if (this.propertyData == null)
            this.propertyData = new PropertyData();

        if (intent.hasExtra(MedolyEnvironment.PLUGIN_EXTRA_KEY)) {
            Serializable serializable = intent.getSerializableExtra(MedolyEnvironment.PLUGIN_EXTRA_KEY);
            if (serializable != null) {
                this.propertyExtraData = new PropertyData((Map<String, List<String>>) serializable);
            }
        }
        if (this.propertyExtraData == null)
            this.propertyExtraData = new PropertyData();


        this.actionId = intent.getStringExtra(MedolyEnvironment.PLUGIN_ACTION_ID);

        this.srcPackage = intent.getStringExtra(MedolyEnvironment.PLUGIN_SRC_PACKAGE);

        this.isEvent = intent.getBooleanExtra(MedolyEnvironment.PLUGIN_EVENT_KEY, false);

        this.categorySet = intent.getCategories();

        this.keySet = intent.getExtras().keySet();

        // URI取得
        String uri;
        if ((uri = this.propertyData.getFirst(MediaProperty.DATA_URI)) != null)
            try { this.mediaUri = Uri.parse(uri);    } catch (Exception e) { this.mediaUri    = null; }
        if ((uri = this.propertyData.getFirst(AlbumArtProperty.DATA_URI)) != null)
            try { this.albumArtUri = Uri.parse(uri); } catch (Exception e) { this.albumArtUri = null; }
        if ((uri = this.propertyData.getFirst(LyricsProperty.DATA_URI)) != null)
            try { this.lyricsUri = Uri.parse(uri);   } catch (Exception e) { this.lyricsUri   = null; }
    }



    /**
     * Get the property data.
     * @return Tge property data.
     */
    public PropertyData getPropertyData() {
        return this.propertyData;
    }

    /**
     * Get the action ID.
     * @return The action ID.
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * Get the source package name.
     * @return The source package name.
     */
    public String getSrcPackage() {
        return srcPackage;
    }

    /**
     * Check the event state.
     * @return  True as event.
     */
    public boolean isEvent() {
        return isEvent;
    }

    /**
     * Check if the plugin operation category exists.
     * @param category A plugin operation category.
     * @return True if the category exits.
     */
    public boolean hasCategories(PluginOperationCategory category) {
        return categorySet.contains(category.getCategoryValue());
    }

    /**
     * Check if the plugin type category exists.
     * @param category Plugin type category.
     * @return True if the category exits.
     */
    public boolean hasCategories(PluginTypeCategory category) {
        return categorySet.contains(category.getCategoryValue());
    }

    /**
     * Check if the execute ID exists.
     * @param id A execute ID.
     * @return True if the execute ID exists.
     */
    public boolean hasExecuteId(String id) {
        return keySet.contains(id) || keySet.contains("execute_id_" + id);

    }



    /**
     * Get the media URI.
     * @return The media URI.
     */
    public Uri getMediaUri() {
        return mediaUri;
    }

    /**
     * Get the album art URI.
     * @return The album art URI.
     */
    public Uri getAlbumArtUri() {
        return albumArtUri;
    }

    /**
     * Get the lyrics URI.
     * @return The lyrics URI.
     */
    public Uri getLyricsUri() {
        return lyricsUri;
    }



    /**
     * Create a response intent.
     * @return A response intent.
     */
    public Intent createReturnIntent() {
        Intent returnIntent = new Intent(PluginAction.ACTION_MEDIA.getActionValue());
        returnIntent.setPackage(srcPackage);
        returnIntent.putExtra(MedolyEnvironment.PLUGIN_ACTION_ID, actionId);
        return returnIntent;
    }

}

