package pl.sebastianczarnecki.musicon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sczar on 19.03.2018.
 */

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        // Create an ArrayList of Albums objects
        ArrayList<Albums> musiconAlbums = new ArrayList<Albums>();
        musiconAlbums.add(new Albums("Turn on the bright lights", "Interpol", R.drawable.lights));
        musiconAlbums.add(new Albums("Antics", "Interpol", R.drawable.antics));
        musiconAlbums.add(new Albums("Europop", "Eiffel 65", R.drawable.europop));
        musiconAlbums.add(new Albums("Dark side of the Moon", "Pink Floyd", R.drawable.meteora));
        musiconAlbums.add(new Albums("Good Charlotte", "Good Charlotte", R.drawable.meteora));
        musiconAlbums.add(new Albums("Plaebo", "Battle for the sun", R.drawable.meteora));
        musiconAlbums.add(new Albums("Meteora", "Linkin Park", R.drawable.meteora));
        musiconAlbums.add(new Albums("Meteora", "Linkin Park", R.drawable.meteora));
        musiconAlbums.add(new Albums("Meteora", "Linkin Park", R.drawable.meteora));
        musiconAlbums.add(new Albums("Meteora", "Linkin Park", R.drawable.meteora));

        //set up adapter:
        AlbumsAdapter albumsAdapter = new AlbumsAdapter(this,musiconAlbums);

        GridView gridView = (GridView) findViewById(R.id.gridview_albums);
        gridView.setAdapter(albumsAdapter);

        // Find the View that shows the back button
        TextView back = (TextView) findViewById(R.id.back_button);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                onBackPressed();            }
        });
    }
}
