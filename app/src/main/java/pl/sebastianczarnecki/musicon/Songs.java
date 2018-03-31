package pl.sebastianczarnecki.musicon;

/**
 * Created by sczar on 14.03.2018.
 */

public class Songs {

    // name of the song
    private String mSongTitle;

    // name of the Artist of the song
    private String mSongArtist;

    // right picture for the song
    private int mImageResourceId;

    // Create a new Songs object.
    // vSongTitle is the name of the Song title
    // vSongArtist is the corresponding Artist of the song
    // imageResourceId  is drawable reference ID that corresponds to the current Song

    public Songs(String vSongTitle, String vSongArtist, int imageResourceId){
        mSongTitle = vSongTitle;
        mSongArtist = vSongArtist;
        mImageResourceId = imageResourceId;
    }

    // Get the title of the song
    public String getSongTitle(){
        return mSongTitle;
    }

    //get the Artist of the Song
    public String getSongArtist(){
        return mSongArtist;
    }

    //get the image for the song
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
