package week_1.assignment_2;

public class Song implements IComponent {

    private String songName;
    private String artist;
    private float speed;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
        this.speed = 1.0f;
    }

    @Override
    public void play() {
        System.out.println("Playing Song " + getName());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return artist;
    }
}
