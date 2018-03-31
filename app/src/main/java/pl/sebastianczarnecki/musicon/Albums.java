package pl.sebastianczarnecki.musicon;

/**
 * Created by sczar on 19.03.2018.
 */

public class Albums {

    // title of the album
    private String mAlbumTitle;

    // name of the Artist of the album
    private String mAlbumArtist;

    // right picture for the album
    private int mImageResourceIdAlbum;

    // Create a new Albums object.
    // vAlbumTitle is the name of the Album title
    // vArtistAlbum is the corresponding Artist of the Album
    // imageResourceIdAlbum  is drawable reference ID that corresponds to the current Album

    public Albums(String vAlbumTitle, String vAlbumArtist, int imageResourceIdAlbum){
        mAlbumTitle = vAlbumTitle;
        mAlbumArtist = vAlbumArtist;
        mImageResourceIdAlbum = imageResourceIdAlbum;
    }

    // Get the title of the Album
    public String getAlbumTitle(){
        return mAlbumTitle;
    }

    //get the Artist of the Album
    public String getAlbumArtist(){
        return mAlbumArtist;
    }

    //get the image for the Album
    public int getImageResourceIdAlbum(){
        return mImageResourceIdAlbum;
    }
}
