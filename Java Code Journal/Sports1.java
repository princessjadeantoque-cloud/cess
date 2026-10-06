package sports1;
 class games{
     public void rules(){
         System.out.println("Basic Rules of each Sport");
                 }}
     class Basketball extends games{
         public void rules(){
             System.out.println("This contains two teams of five players aim to score points by shooting a ball through an elevated hoop");
         }}
     class Soccer extends games{
         public void rules(){
             System.out.println("Players use their feet, heads, and chests to control the ball, as using hands or arms is a foul, except for goalkeepers inside their penalty box");
         }}
     class Badminton extends games{
     public void rules(){
         System.out.println("A match consists of the best of three games. The first side to reach 21 points wins a game, and points are scored on every rally regardless of who served");
     }}
     class Boxing extends games{
     public void rules(){
         System.out.println("A match consists of the best of three games. The first side to reach 21 points wins a game, and points are scored on every rally regardless of who served");
         }}
                  
        class Volleyball extends games{
         public void rules(){
             System.out.println("Each team is allowed a maximum of three contacts to return the ball");
         }}
     class Tennis extends games{
         public void rules(){
             System.out.println("The ball can only bounce once before you return it, and hitting the ball out of bounds or into the net costs a point");
         }}
     class Baseball extends games{
     public void rules(){
         System.out.println("The objective of baseball is to score more runs than the opponent by hitting a pitched ball and safely running counterclockwise around four bases: first, second, third, and home plate");
     }}
     class Pickleball extends games{
     public void rules(){
         System.out.println("The ball must bounce once on each side before being hit out of the air, and players cannot volley while standing in the non-volley zone");
     }}
 public class Sports1 {
      public static void main(String[] args) {
          games a = new games();
          Basketball b = new Basketball();
          Soccer c = new Soccer();
          Badminton d = new Badminton();
          Boxing    e =  new  Boxing();
          Volleyball f = new Volleyball();
          Tennis g = new Tennis();
          Baseball h  = new Baseball();        
          Pickleball i = new Pickleball();     
          a.rules();
          b.rules();
          c.rules();
          d.rules();
          e.rules();
          f.rules();
          g.rules();
          h.rules();
          i.rules();
                  
      }
       
    }
    
 
