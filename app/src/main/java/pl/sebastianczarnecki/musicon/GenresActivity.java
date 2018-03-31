
package pl.sebastianczarnecki.musicon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;


    public class GenresActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.genres_list);

            // Create an ArrayList of Songs objects
            ArrayList<Genres> musiconGenres = new ArrayList<Genres>();
            musiconGenres.add(new Genres(R.drawable.lights));
            musiconGenres.add(new Genres(R.drawable.lights));
            musiconGenres.add(new Genres( R.drawable.lights));
            musiconGenres.add(new Genres(R.drawable.lights));

            GenresAdapter genresAdapter = new GenresAdapter(this,musiconGenres);

            GridView listViewOneGenres = (GridView) findViewById(R.id.gridview_genres);
            listViewOneGenres.setAdapter(genresAdapter);

          //back button
            TextView backsongs = (TextView) findViewById(R.id.back_button);
            backsongs.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers category is clicked on.
                @Override
                public void onClick(View view) {
                    onBackPressed();            }
            });

        }
    }

