package pl.sebastianczarnecki.musicon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create an ArrayList of Songs objects
        ArrayList<Artists> musiconArtists = new ArrayList<Artists>();
        musiconArtists.add(new Artists("Interpol"));
        musiconArtists.add(new Artists("Linkin Park"));
        musiconArtists.add(new Artists("Florence and the machine"));
        musiconArtists.add(new Artists("Placebo"));
        musiconArtists.add(new Artists("Arctic Monkeys"));
        musiconArtists.add(new Artists("Pink Floyd"));
        musiconArtists.add(new Artists("AC/DC"));
        musiconArtists.add(new Artists("Rammstein"));
        musiconArtists.add(new Artists("Black Sabbath"));
        musiconArtists.add(new Artists("Bob Marley"));
        musiconArtists.add(new Artists("The Editors"));
        musiconArtists.add(new Artists("Mozart"));
        musiconArtists.add(new Artists("Gramatik"));
        musiconArtists.add(new Artists("The Rolling Stones"));

        ArtistsAdapter artistsAdapter = new ArtistsAdapter(this,musiconArtists);

        //set up the adapter
        ListView listViewArtists = (ListView) findViewById(R.id.artists_listview);
        listViewArtists.setAdapter(artistsAdapter);

        // back button:
        TextView backsongs = (TextView) findViewById(R.id.back_button);
        backsongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                onBackPressed();            }
        });

    }
}





