package pl.sebastianczarnecki.musicon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main layout file
        setContentView(R.layout.activity_main);

    // Find the View that shows the songs
    TextView songs = (TextView) findViewById(R.id.songs);
    // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers category is clicked on.
        @Override
        public void onClick(View view) {
            // Create a new intent to open the SongsActivity
            Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
            // Start the new activity
            startActivity(songsIntent);
        }
    });

        TextView genres = (TextView) findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, GenresActivity.class);
       startActivity(numbersIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
             startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
        startActivity(albumsIntent);
            }
        });

        TextView player = (TextView) findViewById(R.id.player);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playerIntent);
            }
        });
    }}
