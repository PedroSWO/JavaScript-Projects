import java.util.ArrayList;
import java.util.*;

class IslandPlaylist {
  
  public static void main(String[] args) {
    // Create the playlist and adding some songs to it
    ArrayList<String> desertIsIslandPlaylist = new ArrayList<String>();
    desertIsIslandPlaylist.add("Color me");
    desertIsIslandPlaylist.add("Lose Yourself");
    desertIsIslandPlaylist.add("Roman");
    desertIsIslandPlaylist.add("Skrilla");
    desertIsIslandPlaylist.add("Godzilla");
    desertIsIslandPlaylist.add("Mis mierdas");
    desertIsIslandPlaylist.add("Humble");
    desertIsIslandPlaylist.add("Sensations");
    System.out.println(desertIsIslandPlaylist);
    System.out.println("You have " + desertIsIslandPlaylist.size() + " songs in your playlist");

    // Delete songs from the playlist
    desertIsIslandPlaylist.remove(2);
    desertIsIslandPlaylist.remove(4);
    desertIsIslandPlaylist.remove(3);
    System.out.println("You have " + desertIsIslandPlaylist.size() + " songs in your playlist");
    System.out.println(desertIsIslandPlaylist);

    // Swap playlist order
    System.out.println("The index of the song Humble is: " + desertIsIslandPlaylist.indexOf("Humble"));
    System.out.println("The index of the song Sensations is: " + desertIsIslandPlaylist.indexOf("Sensations"));
    String temporalA = "Humble";
    desertIsIslandPlaylist.set(3,"Sensations");
    System.out.println(desertIsIslandPlaylist);

    // Shuffle the playlist
    Collections.shuffle(desertIsIslandPlaylist);
    System.out.println(desertIsIslandPlaylist);
    
  } 
}