package pl.sebastianczarnecki.musicon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GenresAdapter extends ArrayAdapter<Genres>{

    private static final String LOG_TAG = GenresAdapter.class.getSimpleName();

    public GenresAdapter(Activity context, ArrayList<Genres> genres ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, genres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemViewGenres = convertView;
        if(gridItemViewGenres == null){
            gridItemViewGenres = LayoutInflater.from(getContext()).inflate(R.layout.genres_list_details, parent, false);
        }

        // Get the Genres object located at this position in the list
        Genres currentGenres = getItem(position);

        ImageView iconViewGenres = (ImageView) gridItemViewGenres.findViewById(R.id.genres_image);
        iconViewGenres.setImageResource(currentGenres.getImageResourceId());

        return gridItemViewGenres;
    }
}
