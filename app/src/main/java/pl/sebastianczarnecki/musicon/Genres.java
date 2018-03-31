package pl.sebastianczarnecki.musicon;

public class Genres {

    // right picture for the song
    private int mImageResourceId;

    public Genres(int imageResourceId){
        mImageResourceId = imageResourceId;
    }

    //get the image for the song
    public int getImageResourceId(){
        return mImageResourceId;
    }

}
