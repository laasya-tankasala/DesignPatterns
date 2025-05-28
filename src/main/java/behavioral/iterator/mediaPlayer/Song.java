package behavioral.iterator.mediaPlayer;

public class Song {

    String title;
    String artist;
    int durationInSeconds;
    String album;
    String genre;
    int trackNumber;

    public Song(String title, String album, int trackNumber, String artist, int durationInSeconds, String genre) {
        this.title = title;
        this.album = album;
        this.trackNumber = trackNumber;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("%s by %s [%s] (%d sec)", title, artist, genre, durationInSeconds);
    }
}
