 
package movies2;
class directors{
    public void famousworks(){
        System.out.println("Most famous works of each actor");
    }
}
class Spielberg extends directors{
     public void famousworks(){
        System.out.println("Jurassic Park");
}}
class Cameron extends directors{
     public void famousworks(){
        System.out.println("Titanic");
}}
class Nolan extends directors{
     public void famousworks(){
        System.out.println("Inception");
}}
class Tarantino extends directors{
     public void famousworks(){
        System.out.println("Pulp Fiction");
}}
class Scorsese extends directors{
     public void famousworks(){
        System.out.println("Thw wofl of wall street");
}}
class Hitchcock extends directors{
     public void famousworks(){
        System.out.println("Psycho");
}}
class Kubrick extends directors{
     public void famousworks(){
        System.out.println("The Shining");
}}
class Jackson extends directors{
     public void famousworks(){
        System.out.println("The Lord of the Rings");
}}
class Burton extends directors{
     public void famousworks(){
        System.out.println("Edward Scissorhands");
}}
class Scott extends directors{
     public void famousworks(){
        System.out.println("Gladiator");
}}
class Coppola extends directors{
     public void famousworks(){
        System.out.println("The Godfather");
}}
class Miyazaki extends directors{
     public void famousworks(){
        System.out.println("Spirited Away");
}}
class Lucas extends directors{
     public void famousworks(){
        System.out.println("Star Wars");
}}
class DelToro extends directors{
     public void famousworks(){
        System.out.println("Pan's Labyrinth");
}}
class FIncher extends directors{
     public void famousworks(){
        System.out.println("Fight club");
}}

 
public class Movies2 {

  
    public static void main(String[] args) {
    directors a = new directors();
          Spielberg b = new Spielberg();
          Cameron c = new Cameron();
          Nolan d = new Nolan();
          Tarantino    e =  new  Tarantino();
          Scorsese f = new Scorsese();
          Hitchcock g = new Hitchcock();
          Kubrick h  = new Kubrick();        
          Jackson i = new Jackson();   
          Burton j = new Burton();
          Scott k = new Scott();
          Coppola    l=  new  Coppola();
          Miyazaki m = new Miyazaki();
          Lucas n = new Lucas();
          DelToro o  = new DelToro();        
          FIncher p = new FIncher();
       
          a.famousworks();
          b.famousworks();
          c.famousworks();
          d.famousworks();
          e.famousworks();
          f.famousworks();
          g.famousworks();
          h.famousworks();
          i.famousworks();
          j.famousworks();
          k.famousworks();
          l.famousworks();
          m.famousworks();
          n.famousworks();
          o.famousworks();
    }
    
}
