package pl.sebastianczarnecki.musicon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of Songs objects
        ArrayList<Songs> musiconSongs = new ArrayList<Songs>();
        musiconSongs.add(new Songs("Obstacle 2", "Interpol", R.drawable.lights));
        musiconSongs.add(new Songs("The New", "Interpol", R.drawable.lights));
        musiconSongs.add(new Songs("Say hello to the Angels", "Interpol", R.drawable.lights));
        musiconSongs.add(new Songs("Hands Away", "Interpol", R.drawable.lights));
        musiconSongs.add(new Songs("Take you on the cruise", "Interpol", R.drawable.antics));
        musiconSongs.add(new Songs("Slow Hands", "Interpol", R.drawable.antics));
        musiconSongs.add(new Songs("Blue da be da", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("Too much of heaven", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("Move your body", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("Hyperlink", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("Dub in Life", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("The Edge", "Eiffel 65", R.drawable.europop));
        musiconSongs.add(new Songs("Somewhere I belong", "Linkin Park", R.drawable.meteora));
        musiconSongs.add(new Songs("Breaking a habit", "Linkin Park", R.drawable.meteora));
        musiconSongs.add(new Songs("Faint", "Linkin Park", R.drawable.meteora));
        musiconSongs.add(new Songs("Hit the floor", "Linkin Park", R.drawable.meteora));
        musiconSongs.add(new Songs("Numb", "Linkin Park", R.drawable.meteora));

        // set the adapter to grid_view)songs
        SongsAdapter songsAdapter = new SongsAdapter(this,musiconSongs);

        ListView listViewOneSongs = (ListView) findViewById(R.id.grid_view_songs);
        listViewOneSongs.setAdapter(songsAdapter);

        // Find the View that shows the back button
        TextView backsongs = (TextView) findViewById(R.id.back_button);

        // Set a click listener on that View
        backsongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                onBackPressed();            }
        });

    }
}
