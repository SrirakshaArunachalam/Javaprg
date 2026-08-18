public class Cricketer {
public int playerId;
public String playerName;
public int matchesplayed;
public int totalRuns;
public float avgRuns;
Cricketer()
{
    this.playerId=0;
    this.playerName=" ";
    this.matchesplayed=0;
    this.totalRuns=0;
}
Cricketer(int id,String name, int matches, int total)
{
    this.playerId=id;
    this.playerName=name;
    this.matchesplayed=matches;
    this.totalRuns=total;
}
Cricketer(Cricketer c)
{
    this.playerId=c.playerId;
    this.playerName=c.playerName;
    this.matchesplayed=c.matchesplayed;
    this.totalRuns=c.totalRuns;
}
void calculateBattingAverage()
{
avgRuns=(float)totalRuns/matchesplayed;
}
@Override
public String toString(){
    return "Playerid:"+playerId+
    "\nPlayerName:"+playerName+
    "\nmatches played:"+matchesplayed+
"\nTotal runs:"+totalRuns+
    "\nAvg runs:"+avgRuns;
}
}
class CricketerDemo{
    public static void main (String args[]){
    Cricketer[] p =new Cricketer[3];
    p[0]=new Cricketer();
    p[0].playerId=1;
    p[0].playerName="Dhoni";
    p[0].matchesplayed=20;
    p[0].totalRuns=10000;
    p[1]=new Cricketer(2,"Sachin",30,30000);
    p[2]=new Cricketer(p[1]);
    p[2].playerId=3;
    p[2].playerName="kohli";
    p[2].matchesplayed=10;
    p[2].totalRuns=40000;
for(int i=0;i<3;i++)
{
    p[i].calculateBattingAverage();
}
for(int i=0;i<3;i++)
{
    System.out.println(p[i]);
    System.out.println();
}
Cricketer h =p[0];
for(int i=0;i<3;i++){
if(p[i].avgRuns>h.avgRuns)
{
    h=p[i];
}
}
System.out.println("HIGHEST BATTING: ");
System.out.println(h);

}



    
}
