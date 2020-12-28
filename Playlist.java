import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
   ArrayList <String> desertIslandPlaylist = new ArrayList<String>(); 
   desertIslandPlaylist.add("Machanyenge");
   desertIslandPlaylist.add("HERO");
   desertIslandPlaylist.add("Love me like you do");
   desertIslandPlaylist.add("Corona go");
   desertIslandPlaylist.add("Jai Corona");
   desertIslandPlaylist.add("fhilaal");
  //  printing play list.
   System.out.println(desertIslandPlaylist);
  //  Checking the size of playlist.
   System.out.println(desertIslandPlaylist.size());

  //  removing the songs from playlist.
   desertIslandPlaylist.remove("Jai Corona");
   
  //  getting the indexex of the songs
  int indexA = desertIslandPlaylist.indexOf("HERO");
  int indexB = desertIslandPlaylist.indexOf("Corona go");
  String tempA = "HERO";
  // Swapping the songs
  desertIslandPlaylist.set(indexA,"Corona go");
  System.out.println(desertIslandPlaylist);
  desertIslandPlaylist.set(indexB,tempA);
  System.out.println(desertIslandPlaylist);
  }
  
}