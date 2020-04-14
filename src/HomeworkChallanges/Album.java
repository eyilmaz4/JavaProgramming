package HomeworkChallanges;

public class Album {
    String albumName;
    int albumSongQuantity;
    String songsName;
    int albumID;

    public Album(String albumName, int albumSongQuantity, String songsName, int albumID) {
        this.albumName = albumName;
        this.albumSongQuantity = albumSongQuantity;
        this.songsName = songsName;
        this.albumID = albumID;
    }

    public String changeAlbumName(String albumName){
        return this.albumName=albumName;
    }
    public String getAlbumName() {
        return albumName;
    }
public String[] getSongs(String[] songList){
        return songList;
}

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", albumSongQuantity=" + albumSongQuantity +
                ", songsName='" + songsName + '\'' +
                ", albumID=" + albumID +
                '}';
    }
}
