package ln.materialdesigndemo.model;

/**
 * Created by comp-1 on 27/1/17.
 */

public class Gallary
{

    private String name;
    private int numOfSongs;
    private int thumbnail;

    public Gallary() {
    }

    public Gallary(String name, int numOfSongs, int thumbnail) {

        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
