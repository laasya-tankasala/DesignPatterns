package behavioral.iterator.mediaPlayer;

public interface Playlist<Song> {
    Player<Song> createPlayer(Player<Song> player);
}
