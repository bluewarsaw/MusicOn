package pl.sebastianczarnecki.musicon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sczar on 19.03.2018.
 */

public class AlbumsAdapter extends ArrayAdapter<Albums>{

    private static final String LOG_TAG = AlbumsAdapter.class.getSimpleName();

    public AlbumsAdapter(Activity context, ArrayList<Albums> albums ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemViewAlbums = convertView;
        if(gridItemViewAlbums == null){
            gridItemViewAlbums = LayoutInflater.from(getContext()).inflate(R.layout.album_list_details, parent, false);
        }

        // Get the Albums object located at this position in the list
        Albums currentAlbum = getItem(position);

        // Find the TextView in the album_list_details.xml layout with the ID version_name
        TextView AlbumTitle = (TextView) gridItemViewAlbums.findViewById(R.id.album_title);
        // Get the name from the current Album object and set this text on the name TextView
        AlbumTitle.setText(currentAlbum.getAlbumTitle());

        TextView AlbumArtist = (TextView) gridItemViewAlbums.findViewById(R.id.album_artist);
        AlbumArtist.setText(currentAlbum.getAlbumArtist());

        ImageView iconAlbum = (ImageView) gridItemViewAlbums.findViewById(R.id.album_icon);
        iconAlbum.setImageResource(currentAlbum.getImageResourceIdAlbum());

        return gridItemViewAlbums;

    }
}
