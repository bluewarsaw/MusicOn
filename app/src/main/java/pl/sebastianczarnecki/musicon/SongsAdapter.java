package pl.sebastianczarnecki.musicon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sczar on 14.03.2018.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {

    private static final String LOG_TAG = SongsAdapter.class.getSimpleName();

    public SongsAdapter(Activity context, ArrayList<Songs> songs ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    //Provides a view for an AdapterView (ListView, GridView, etc.)
    // @param position The position in the list of data that should be displayed in the list item view.
     // @param convertView The recycled view to populate.
    // @param parent The parent ViewGroup that is used for inflation.
    // @return The View for the position in the AdapterView.

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
            View gridItemView = convertView;
            if(gridItemView == null){
                gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_list_details, parent, false);
            }

        // Get the Song object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the songs_list_details.xml layout with the ID version_name
        TextView SongTitle = (TextView) gridItemView.findViewById(R.id.version_name);
        // Get the version name from the current Song object and set this text on the name TextView
        SongTitle.setText(currentSong.getSongTitle());

        TextView SongArtist = (TextView) gridItemView.findViewById(R.id.version_number);
        SongArtist.setText(currentSong.getSongArtist());

        ImageView iconView = (ImageView) gridItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentSong.getImageResourceId());

        return gridItemView;
    }
}
