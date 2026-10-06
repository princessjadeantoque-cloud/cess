 
package tech1;
class devices{
    public void features(){
        System.out.print("Unique features of each device");
    }
}
class Smartphone extends devices{
    public void features(){
        System.out.println("POrtable device for calls, apps, and internet access");
    }
}
class Laptop extends devices{
    public void features(){
        System.out.println("Portable computer with a built-in keyboard and battery");
    }
}
class Dekstop extends devices{
    public void features(){
        System.out.println("High Performance");
    }
}
class Tablet extends devices{
    public void features(){
        System.out.println("Touchscreen device");
    }
}
class Printer extends devices{
    public void features(){
        System.out.println("Prints documents");
    }
}class Scanner extends devices{
    public void features(){
        System.out.println("Scans files");
    }
}
class Camera extends devices{
    public void features(){
        System.out.println("Take Photos");
    }
}class Router  extends devices{
    public void features(){
        System.out.println("Shares Internet");
    }
}class Projector extends devices{
    public void features(){
        System.out.println("Displays visuals");
    }
}
class Smartwatch extends devices{
    public void features(){
        System.out.println("Fitness Tracking"); 
    }
}
 

public class Tech1 {
 
    public static void main(String[] args) {
      devices a = new devices();
          Smartphone b = new Smartphone();
          Laptop c = new Laptop();
          Dekstop d = new Dekstop();
          Tablet    e =  new  Tablet();
          Printer g = new Printer();
          Scanner h  = new Scanner();        
          Camera i = new Camera();  
          Router k = new Router();
          Projector l = new Projector();
           Smartwatch m = new Smartwatch();
          a.features();
          b.features();
          c.features();
          d.features();
          e.features();
          g.features();
          h.features();
          i.features();
          k.features();
          l.features();
          m.features(); 
    }
    
}
