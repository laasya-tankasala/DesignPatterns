package behavioral.iterator.mediaPlayer;

public interface Player<Song> {

    Song next();
    boolean hasNext();
    Song previous();
    boolean hasPrevious();
    void pause();
    void play();
    boolean isPlaying();
    void repeat();
    void rewind();
    int getPosition();
}
