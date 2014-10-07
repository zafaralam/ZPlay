package android.zafaralam.com.zplay.modal;

/**
 * Created by alamz on 7/07/14.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    private long songLength;
    private int icon;

    public Song(long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getSongLength() {
        return songLength;
    }

    public void setSongLength(long songLength) {
        this.songLength = songLength;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}

