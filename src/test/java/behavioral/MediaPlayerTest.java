package behavioral;

import behavioral.iterator.mediaPlayer.InOrderPlayer;
import behavioral.iterator.mediaPlayer.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MediaPlayerTest {
        private InOrderPlayer player;
        private Song song1, song2, song3;

        @BeforeEach
        void setup() {
            song1 = new Song("Song1", "Album1", 1, "Artist1", 200, "Genre1");
            song2 = new Song("Song2", "Album2", 2, "Artist2", 210, "Genre2");
            song3 = new Song("Song3", "Album3", 3, "Artist3", 220, "Genre3");
            player = new InOrderPlayer<Song>(Arrays.asList(song1, song2, song3));
        }

        @Test
        void testInitialPlay() {
            player.play();
            assertTrue(player.isPlaying());
            assertEquals(0, player.getPosition());
        }

        @Test
        void testNextAndPrevious() {
            player.next();
            assertEquals(1, player.getPosition());
            player.previous();
            assertEquals(0, player.getPosition());
        }

        @Test
        void testRewind() {
            player.next();
            player.next();
            assertEquals(2, player.getPosition());
            player.rewind();
            assertEquals(0, player.getPosition());
        }

        @Test
        void testPause() {
            player.play();
            player.pause();
            assertFalse(player.isPlaying());
        }

        @Test
        void testRepeat() {
            player.play();
            player.next();
            player.next();
            assertEquals(2, player.getPosition());
            player.repeat();
            assertTrue(player.isPlaying());
        }
}
