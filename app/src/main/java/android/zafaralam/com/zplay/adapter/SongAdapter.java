package android.zafaralam.com.zplay.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.zafaralam.com.zplay.R;
import android.zafaralam.com.zplay.modal.Song;

/**
 * Created by alamz on 7/07/14.
 */
public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> songs) {
        this.songs = songs;
        songInf = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (R.layout.song, viewGroup, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songs.get(i);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(i);
        return songLay;
    }
}
