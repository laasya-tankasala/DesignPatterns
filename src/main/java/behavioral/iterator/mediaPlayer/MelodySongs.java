package behavioral.iterator.mediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MelodySongs<Song> implements Playlist<Song> {

    List<Song> melodies = new ArrayList<Song>();

    void addSong(Song s) {
        melodies.add(s);
    }

    @Override
    public Player<Song> createPlayer(Player<Song> player) {
        if(player instanceof InOrderPlayer<Song>)
            return new InOrderPlayer<Song>(melodies);
        // we can add other players like shuffle players, repeat only one, repeat album, etc.
        return null;
    }
}
