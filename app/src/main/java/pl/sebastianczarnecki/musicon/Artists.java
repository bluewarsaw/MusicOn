package pl.sebastianczarnecki.musicon;

public class Artists {

    // name of the Artist
    private String mArtistTitle;

    public Artists(String vArtistTitle) {
        mArtistTitle = vArtistTitle;
    }

    // Get the title of the song
    public String getArtistTitle(){
        return mArtistTitle;
    }

}
