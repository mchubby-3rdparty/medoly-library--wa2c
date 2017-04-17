package com.wa2c.android.medoly.library;

import android.content.Intent;
import android.net.Uri;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Intentパラメータ。
 */
public class MedolyIntentParam {

    /** プロパティ情報。 */
    private PropertyData propertyData;
    /** プロパティ拡張情報 */
    private PropertyData propertyExtraData;

    /** アクションID。 */
    private String actionId;
    /** 送信元パッケージ名。 */
    private String srcPackage;
    /** イベント状態。 */
    private boolean isEvent;
    /** カテゴリー情報。 */
    private Set<String> categorySet;
    /** キー情報。 */
    private Set<String> keySet;


    /** メディアURI。 */
    private Uri mediaUri;
    /** アルバムアートURI。 */
    private Uri albumArtUri;
    /** 歌詞URI。 */
    private Uri lyricsUri;



    /**
     * コンストラクタ。
     * @param intent インテント。
     */
    public MedolyIntentParam(Intent intent) {
        if (intent.hasExtra(MedolyEnvironment.PLUGIN_VALUE_KEY)) {
            Serializable serializable = intent.getSerializableExtra(MedolyEnvironment.PLUGIN_VALUE_KEY);
            if (serializable != null) {
                this.propertyData = new PropertyData((Map<String, List<String>>) serializable);
            }
        }

        if (intent.hasExtra(MedolyEnvironment.PLUGIN_EXTRA_KEY)) {
            Serializable serializable = intent.getSerializableExtra(MedolyEnvironment.PLUGIN_EXTRA_KEY);
            if (serializable != null) {
                this.propertyExtraData = new PropertyData((Map<String, List<String>>) serializable);
            }
        }


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
     * プロパティ情報を取得。
     * @return プロパティ情報。
     */
    public PropertyData getPropertyData() {
        return this.propertyData;
    }

    /**
     * アクションIDを取得。
     * @return アクションID。
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * 送信元パッケージ名を取得
     * @return 送信元パッケージ。
     */
    public String getSrcPackage() {
        return srcPackage;
    }

    /**
     * イベント状態をチェック。
     * @return イベント実行の場合はtrue。
     */
    public boolean isEvent() {
        return isEvent;
    }

    /**
     * プラグイン操作カテゴリの有無をチェック。
     * @param category プラグイン操作カテゴリ。
     * @return カテゴリが存在する場合はtrue。
     */
    public boolean hasCategories(PluginOperationCategory category) {
        return categorySet.contains(category.getCategoryValue());
    }

    /**
     * プラグイン種別カテゴリの有無をチェック。
     * @param category プラグイン種別カテゴリ。
     * @return カテゴリが存在する場合はtrue。
     */
    public boolean hasCategories(PluginTypeCategory category) {
        return categorySet.contains(category.getCategoryValue());
    }

    /**
     * 実行IDの有無をチェック。
     * @param id 実行ID。
     * @return 実行IDが存在する場合はtrue。
     */
    public boolean hasExecuteId(String id) {
        return keySet.contains(id) || keySet.contains("execute_id_" + id);

    }



    /**
     * メディアURIを取得。
     * @return メディアURI。
     */
    public Uri getMediaUri() {
        return mediaUri;
    }

    /**
     * アルバムアートURIを取得。
     * @return アルバムアートURI。
     */
    public Uri getAlbumArtUri() {
        return albumArtUri;
    }

    /**
     * 歌詞URIを取得。
     * @return 歌詞URI。
     */
    public Uri getLyricsUri() {
        return lyricsUri;
    }



    /**
     * 返信インテントを作成。
     * @return 返信インテント。
     */
    public Intent createReturnIntent() {
        Intent returnIntent = new Intent(PluginAction.ACTION_MEDIA.getActionValue());
        returnIntent.setPackage(srcPackage);
        returnIntent.putExtra(MedolyEnvironment.PLUGIN_ACTION_ID, actionId);
        return returnIntent;
    }

}

