public class Song {
    String song_name;
    String artist;
    int length;
    Song next_song;
    public Song(String a, String b, int n){
        song_name = a;
        artist = b;
        length = n;
        next_song = null;
    }
    public void songInfo(){
        System.out.println("Title: "+ song_name);
        System.out.println("Artist: "+artist);
        System.out.println("Length: "+length+" minutes");

    }
}
