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
public class Main {
// Define displayPlayers() method here
public static void displayPlayers(ArrayList<CricketPlayer> l,ArrayList<CricketPlayer> m){
for(int i=0;i<l.size();i++){
if(i<l.size()-1){
System.out.print(l.get(i).getName());
System.out.print(" ");
}
else{
System.out.println(l.get(i).getName());
}
}
for(int i=0;i<m.size();i++){
if(i<m.size()-1){
System.out.print(m.get(i).getName());
System.out.print(" ");
}
else{
System.out.println(m.get(i).getName());;
}
}
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
ArrayList<CricketPlayer> l=new ArrayList<CricketPlayer>();
l.add(p1);
l.add(p2);
l.add(p3);
l.add(p4);
ArrayList<CricketPlayer> bt=new ArrayList<CricketPlayer>();
ArrayList<CricketPlayer> bw=new ArrayList<CricketPlayer>();
for(CricketPlayer i:l){
    double r=i.avgRuns();
    double w=i.avgWickets();
    if(r>25){
        bt.add(i);
    }
    if(w>1){
        bw.add(i);
    }
}
displayPlayers(bw, bt);
}
}