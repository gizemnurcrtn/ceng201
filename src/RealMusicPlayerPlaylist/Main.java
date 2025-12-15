package RealMusicPlayerPlaylist;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedPlaylist playlist = new DoubleLinkedPlaylist();
        playlist.addSong("Can Bonomo - Bardak Taşıyor");
        playlist.addSong("Müslüm Gürses - Senden Vazgeçmem");
        playlist.addSong("Melih Görgün - 14 Bahar");
        playlist.addSong("Sıla - Oluruna Bırak");
        playlist.addSong("Nilüfer - İnkar Etme");

        playlist.printPlaylist();

        playlist.nextSong();
        playlist.nextSong();
        playlist.previousSong();
        playlist.previousSong();
        playlist.removeCurrent();
        playlist.printPlaylist();

    }
}
