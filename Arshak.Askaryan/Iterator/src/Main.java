public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addToPlaylist(new Music("Music 1 ", "Singer 1", 3.5));
        playlist.addToPlaylist(new Music("Music 2 ", "Singer 2", 3.7));
        playlist.addToPlaylist(new Music("Music 3 ", "Singer 3", 4.8));
        playlist.addToPlaylist(new Music("Music 4 ", "Singer 4", 3.0));
        playlist.addToPlaylist(new Music("Music 5 ", "Singer 5", 3.1));
        Iterator iterator = playlist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
