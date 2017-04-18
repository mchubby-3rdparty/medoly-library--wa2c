package com.wa2c.android.medoly.library;

import android.content.Context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * メディアのプロパティ情報。
 */
public enum MediaProperty implements IProperty {
    /** タイトル。 */
    TITLE                        ( R.string.media_title                         ),

    /** アーティスト。 */
    ARTIST                       ( R.string.media_artist                        ),
    /** オリジナルアーティスト。 */
    ORIGINAL_ARTIST              ( R.string.media_original_artist               ),
    /** アルバムアーティスト。 */
    ALBUM_ARTIST                 ( R.string.media_album_artist                  ),

    /** アルバム。 */
    ALBUM                        ( R.string.media_album                         ),
    /** オリジナルアルバム。 */
    ORIGINAL_ALBUM               ( R.string.media_original_album                ),

    /** ジャンル。 */
    GENRE                        ( R.string.media_genre                         ),
    /** ムード。 */
    MOOD                         ( R.string.media_mood                          ),
    /** シーン。 */
    OCCASION                     ( R.string.media_occasion                      ),

    /** 年。 */
    YEAR                         ( R.string.media_year                          ),
    /** オリジナル年。 */
    ORIGINAL_YEAR                ( R.string.media_original_year                 ),

    /** 作曲者。 */
    COMPOSER                     ( R.string.media_composer                      ),
    /** 編曲者。 */
    ARRANGER                     ( R.string.media_arranger                      ),
    /** 作詞者。 */
    LYRICIST                     ( R.string.media_lyricist                      ),
    /** オリジナル作詞者。 */
    ORIGINAL_LYRICIST            ( R.string.media_original_lyricist             ),
    /** 指揮者  */
    CONDUCTOR                    ( R.string.media_conductor                     ),
    /** プロデューサ。 */
    PRODUCER                     ( R.string.media_producer                      ),
    /** エンジニア。 */
    ENGINEER                     ( R.string.media_engineer                      ),
    /** エンコーダ。 */
    ENCODER                      ( R.string.media_encoder                       ),
    /** ミキサ。 */
    MIXER                        ( R.string.media_mixer                         ),
    /** DJミキサ。 */
    DJMIXER                      ( R.string.media_djmixer                       ),
    /** リミキサ。 */
    REMIXER                      ( R.string.media_remixer                       ),
    /** 著作権。 */
    COPYRIGHT                    ( R.string.media_copyright                     ),
    /** レーベル。 */
    RECORD_LABEL                 ( R.string.media_record_label                  ),

    /** メディア。 */
    MEDIA                        ( R.string.media_media                         ),
    /** ディスクNo。 */
    DISC                         ( R.string.media_disc                          ),
    /** ディスク合計。 */
    DISC_TOTAL                   ( R.string.media_disc_total                    ),
    /** トラックNo。 */
    TRACK                        ( R.string.media_track                         ),
    /** トラック合計。 */
    TRACK_TOTAL                  ( R.string.media_track_total                   ),

    /** コメント。 */
    COMMENT                      ( R.string.media_comment                       ),

    /** ループ開始。 */
    LOOP_START                   ( R.string.media_loop_start                    ),
    /** ループの長さ。  */
    LOOP_LENGTH                  ( R.string.media_loop_length                   ),
    /** テンポ。 */
    TEMPO                        ( R.string.media_tempo                         ),
    /** BPM。 */
    BPM                          ( R.string.media_bpm                           ),
    /** FBPM。 */
    FBPM                         ( R.string.media_fbpm                          ),

    /** 品質。 */
    QUALITY                      ( R.string.media_quality                       ),
    /** レーティング。  */
    RATING                       ( R.string.media_rating                        ),

    /** 言語。 */
    LANGUAGE                     ( R.string.media_language                      ),
    /** スクリプト。 */
    SCRIPT                       ( R.string.media_script                        ),

    /** タグ。 */
    TAGS                         ( R.string.media_tags                          ),
    /** キー。 */
    KEY                          ( R.string.media_key                           ),
    /** Amazon ID。 */
    AMAZON_ID                    ( R.string.media_amazon_id                     ),
    /** Catalog ID。 */
    CATALOG_NO                   ( R.string.media_catalog_no                    ),
    /** ISRC */
    ISRC                         ( R.string.media_isrc                          ),

    // URI
    URL_OFFICIAL_RELEASE_SITE    ( R.string.media_url_official_release_site     ),
    URL_OFFICIAL_ARTIST_SITE     ( R.string.media_url_official_artist_site      ),
    URL_LYRICS_SITE              ( R.string.media_url_lyrics_site               ),

    // Wikipedia URI
    URL_WIKIPEDIA_RELEASE_SITE   ( R.string.media_url_wikipedia_release_site    ),
    URL_WIKIPEDIA_ARTIST_SITE    ( R.string.media_url_wikipedia_artist_site     ),

    // Discogs URI
    URL_DISCOGS_RELEASE_SITE     ( R.string.media_url_discogs_release_site      ),
    URL_DISCOGS_ARTIST_SITE      ( R.string.media_url_discogs_artist_site       ),

    // Music Brainz Information
    MUSICBRAINZ_RELEASEID        ( R.string.media_musicbrainz_release_id        ),
    MUSICBRAINZ_ARTISTID         ( R.string.media_musicbrainz_artist_id         ),
    MUSICBRAINZ_RELEASEARTISTID  ( R.string.media_musicbrainz_release_artist_id ),
    MUSICBRAINZ_RELEASE_GROUP_ID ( R.string.media_musicbrainz_release_group_id  ),
    MUSICBRAINZ_DISC_ID          ( R.string.media_musicbrainz_disc_id           ),
    MUSICBRAINZ_TRACK_ID         ( R.string.media_musicbrainz_track_id          ),
    MUSICBRAINZ_WORK_ID          ( R.string.media_musicbrainz_work_id           ),
    MUSICBRAINZ_RELEASE_STATUS   ( R.string.media_musicbrainz_release_status    ),
    MUSICBRAINZ_RELEASE_TYPE     ( R.string.media_musicbrainz_release_type      ),
    MUSICBRAINZ_RELEASE_COUNTRY  ( R.string.media_musicbrainz_release_country   ),

    MUSICIP_ID                   ( R.string.media_musicip_id                    ),


    /** タグ種別。 */
    TAG_TYPE                     ( R.string.media_tag_type                      ),
    /** 文字コード。 */
    CHARACTER_ENCODING           ( R.string.media_character_encoding            ),
    /** 音声フォーマット。 */
    FORMAT                       ( R.string.media_format                        ),
    /** 音声エンコード種別。 */
    ENCODING_TYPE                ( R.string.media_encoding_type                 ),
    /** ビットレート。 */
    BIT_RATE                     ( R.string.media_bit_rate                      ),
    /** サンプリングレート。 */
    SAMPLE_RATE                  ( R.string.media_sample_rate                   ),
    /** 音声チャンネル。 */
    CHANNELS                     ( R.string.media_channels                      ),
    /** 曲の長さ。 */
    DURATION                     ( R.string.media_duration                      ),

    /** 取得元名称。 */
    SOURCE_TITLE                 ( R.string.source_title                        ),
    /** 取得元URI。 */
    SOURCE_URI                   ( R.string.source_uri                          ),
    /** MIMEタイプ。 */
    MIME_TYPE                    ( R.string.mime_type                           ),
    /** フォルダパス。 */
    FOLDER_PATH                  ( R.string.folder_path                         ),
    /** ファイル名。 */
    FILE_NAME                    ( R.string.file_name                           ),
    /** データサイズ。 */
    DATA_SIZE                    ( R.string.data_size                           ),
    /** 更新日時。 */
    LAST_MODIFIED                ( R.string.last_modified                       ),
    /** URI。 */
    DATA_URI                     ( R.string.data_uri                            );



    /** プロパティのキー名に付く接頭語。 */
    public static final String KEY_PREFIX = "MEDIA";

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
    MediaProperty(int nameId) {
        this.nameId = nameId;
        this.keyName = KEY_PREFIX + "_" + this.name();
    }



    // Key-Property map

    /**
     * キー名とプロパティの対応。
     */
    private static final Map<String, MediaProperty> keyPropertyMap = new HashMap<String, MediaProperty>() {{
        for (MediaProperty p : MediaProperty.values()) {
            put(p.getKeyName(), p);
        }
    }};

    /**
     * キー名に対応するプロパティを取得。
     * @param keyName キー名。
     * @return プロパティ。
     */
    public static MediaProperty valueOfKey(String keyName) {
        return keyPropertyMap.get(keyName);
    }

}
