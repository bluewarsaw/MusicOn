package pl.sebastianczarnecki.musicon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsAdapter extends ArrayAdapter<Artists> {

    private static final String LOG_TAG = ArtistsAdapter.class.getSimpleName();

    public ArtistsAdapter(Activity context, ArrayList<Artists> artists ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemViewArtists = convertView;
        if(gridItemViewArtists == null){
            gridItemViewArtists = LayoutInflater.from(getContext()).inflate(R.layout.artist_list_details, parent, false);
        }

        // Get the Artist object located at this position in the list
        Artists currentArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView ArtistTitle = (TextView) gridItemViewArtists.findViewById(R.id.artists_textview);
        // Get the version name from the current Artist object and set this text on the name TextView
        ArtistTitle.setText(currentArtist.getArtistTitle());

        return gridItemViewArtists;
}}
