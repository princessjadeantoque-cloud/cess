
package movies1;
 class genres{
     public void plot(){
         System.out.println(" Plot Twist of each Genres");
     }
 }
class Action extends genres{
    public void plot(){
         System.out.println(" Hero saves all");
}}
class Comedy extends genres{
    public void plot(){
         System.out.println(" Funny surprise");
}}class Horror extends genres{
    public void plot(){
         System.out.println(" Monster returns");
}}
class Romance extends genres{
    public void plot(){
         System.out.println(" lovers reunite");
}}
class Scifi extends genres{
    public void plot(){
         System.out.println(" AI takes over");
}}class Fantasy extends genres{
    public void plot(){
         System.out.println(" Magic wins");
}}
class Mystery extends genres{
    public void plot(){
         System.out.println(" Killer Revealed");
}}
class Thriller extends genres{
    public void plot(){
         System.out.println(" Secret Exposed");
}}
class Adventure extends genres{
    public void plot(){
         System.out.println(" Treasure found");
}}
class Drama extends genres{
    public void plot(){
         System.out.println(" Truth changes lives");
}}





public class Movies1 {
 
    public static void main(String[] args) {
      genres a = new genres();
          Action b = new Action();
          Comedy c = new Comedy();
          Horror d = new Horror();
          Romance    e =  new  Romance();
          Scifi g = new Scifi();
          Fantasy h  = new Fantasy();        
          Mystery i = new Mystery();  
          Thriller k = new Thriller();
          Adventure l = new Adventure();
           Drama m = new Drama();
          a.plot();
          b.plot();
          c.plot();
          d.plot();
          e.plot();
          g.plot();
          h.plot();
          i.plot();
          k.plot();
          l.plot();
          m.plot(); 
    }
    
}
