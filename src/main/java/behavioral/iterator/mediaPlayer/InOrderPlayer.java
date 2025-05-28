package behavioral.iterator.mediaPlayer;

import java.util.List;

public class InOrderPlayer<Song> implements Player<Song> {

    private final List<Song> playlist;
    private int position = 0;
    private boolean isPlaying= false;

    public InOrderPlayer(List<Song> playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return position < playlist.size();
    }

    @Override
    public Song next() {
        return hasNext() ? playlist.get(position++) : null;
    }

    @Override
    public boolean hasPrevious() {
        return position != 0;
    }

    @Override
    public Song previous() {
        return hasNext() ? playlist.get(position--) : null;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Playing: " + playlist.get(position));
    }

    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("Paused: " + playlist.get(position));
    }

    @Override
    public void repeat() {
        System.out.println("Repeating: " + playlist.get(position));
    }

    @Override
    public void rewind() {
        position = 0;
        System.out.println("Rewound to: " + playlist.get(position));
    }

    @Override
    public int getPosition() {
        return position;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
