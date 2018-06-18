import java.util.Arrays;

public class Playlist {
    Music[] playlist = {};

    public void addToPlaylist(Music music){
        int currentIndex = playlist.length;
        this.playlist = Arrays.copyOf(playlist, playlist.length + 1);
        this.playlist[currentIndex] = music;
    }

    public Iterator iterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < playlist.length;
        }

        @Override
        public Object next() {
            return playlist[index++];
        }
    }
}
