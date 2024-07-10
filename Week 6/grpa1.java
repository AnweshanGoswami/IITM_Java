import java.lang.classfile.BufWriter;
import java.util.*;
class CricketPlayer{
  private String name;
  private int wickets;
  private int runs;
  private int matches;
  public CricketPlayer(String s, int w, int r, int m){
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public String getName(){
    return name;
  }
  public int getWickets(){
    return wickets;
  }
  public int getRuns(){
    return runs;
  }
  public double avgRuns(){
    return runs/matches;
  }
  public double avgWickets(){
    return wickets/matches;
  }
} 
public class grpa1 {
// Define displayPlayers() method here
public static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt){
  for(CricketPlayer bowler: bw){
    System.out.print(bowler.getName() + " ");
  }
  System.out.println("");

  for(CricketPlayer batsman:bt){
    System.out.print(batsman.getName() + " ");
  }
  System.out.println("");
}

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());

    // Define ArrayList objects here
    ArrayList<CricketPlayer> objects = new ArrayList<CricketPlayer>();
    ArrayList<CricketPlayer> bw = new ArrayList<CricketPlayer>();
    ArrayList<CricketPlayer> bt = new ArrayList<CricketPlayer>();
    objects.add(p1);
    objects.add(p2);
    objects.add(p3);
    objects.add(p4);

    for(CricketPlayer player:objects){
      if (player.avgWickets() > 1){
        bw.add(player);
      }

      if (player.avgRuns() > 25){
        bt.add(player);
      }
    }




 displayPlayers(bw, bt);
  }
}  