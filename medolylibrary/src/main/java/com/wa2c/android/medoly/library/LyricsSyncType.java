package com.wa2c.android.medoly.library;

/**
 * Lyrics sync type.
 */
public enum LyricsSyncType {
    /** Synchronous lyrics. */
    SYNC(R.string.lyrics_sync_sync),
    /** Asynchronous lyrics. */
    UNSYNC(R.string.lyrics_sync_unsync);

    /** Constructor. */
    LyricsSyncType(int id) { this.nameId = id; }
    /** Name id. */
    private int nameId;
    /** Get name id. */
    public int getNameId() { return nameId; }
}
