/*Given a java program for a music player, complete the code as required ...
Class Song has instance variables title, artist, genre, duration. 
It also has a contrcutor to initialise these instance variables and accessor method to get the values of these instance variables.
Class MusicPlaylist has three methods: 
    - isLongDuration(int duration) that checks if the duration of any song is greater than 300 and returns true, otherwise false
    - removeLongDurationSongs that takes a LinkedHashMap as input parameter and removes all the long songs in this Map.
        (HINT: Use an iterator for the entrySet() of the Map)
    - displayPlaylist that takes a LinkedHashMap as input parameter and prints the elements as required by the output.

Input Test Case 1:

Ordinary_Person Anirudh 185 Tamil
Shape_Of_You Ed_Sheeran 345 English
Mehram Sachet 286 Hindi
Ek_Tarfa Darshan_Raval 368 Hindi
Thalli_Pogadhey ArRahman 256 Tamil

Output :

Playlist after removing long duration songs:
ID: 1, Title: Ordinary_Person, Artist: Anirudh, Duration: 185s, Genre: Tamil
ID: 3, Title: Mehram, Artist: Sachet, Duration: 286s, Genre: Hindi
ID: 5, Title: Thalli_Pogadhey, Artist: ArRahman, Duration: 256s, Genre: Tamil
*/



import java.util.*;

class MusicPlaylist {
    public boolean isLongDuration(int duration) {
        return duration > 300; 
    }


    //In your removeLongDurationSongs method, you're iterating over the entrySet of the playlist map,
    //and inside the loop, you're removing entries from the map. This is not allowed, as it modifies 
    //the collection while iterating over it.
   
    /*  // method to remove long songs in the playlist
    public void removeLongDurationSongs(LinkedHashMap<Integer, Song> playlist) {
        for (Map.Entry<Integer, Song> entry : playlist.entrySet()) {
            if (isLongDuration(entry.getValue().getDuration())) {
                playlist.remove(entry.getKey());
    }}}*/

    public void removeLongDurationSongs(LinkedHashMap<Integer, Song> playlist) {
        Iterator<Map.Entry<Integer, Song>> iterator = playlist.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Song> entry = iterator.next();
            if (isLongDuration(entry.getValue().getDuration())) {
                iterator.remove();
            }
        }
    }


    // method to display songs in the playlist
    public void displayPlaylist(LinkedHashMap<Integer, Song> playlist){
        for(Map.Entry<Integer, Song> entry:playlist.entrySet()){
            //ID: 1, Title: Ordinary_Person, Artist: Anirudh, Duration: 185s, Genre: Tamil

            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }

}

class Song {
    private String title;
    private String artist;
    private int duration;
    private String genre;

    public Song(String title, String artist, int duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration + "s, Genre: " + genre;
    }
}

public class prob1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Song> playlist = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for 5 songs (Title, Artist, Duration (seconds), Genre):");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Song " + i + ": ");
            String title = scanner.next();
            String artist = scanner.next();
            int duration = scanner.nextInt();
            String genre = scanner.next();
            playlist.put(i, new Song(title, artist, duration, genre));
        }
        MusicPlaylist musicPlayer = new MusicPlaylist();
        musicPlayer.removeLongDurationSongs(playlist);
        System.out.println("\nPlaylist after removing long duration songs:");
        musicPlayer.displayPlaylist(playlist);
    }
}
