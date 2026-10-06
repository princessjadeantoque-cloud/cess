 
package tech2;
class brands{
    public void flagship(){
        System.out.println("Flagship Product of each brand");
    }
}
class Apple extends brands{
    public void flagship(){
        System.out.println("iPhone");
    }
}
class Samsung extends brands{
    public void flagship(){
        System.out.println("Galaxy S Series");
    }
}class Sony extends brands{
    public void flagship(){
        System.out.println("Playstation 5");
    }
}
class Nike extends brands{
    public void flagship(){
        System.out.println("Air Jordan");
    }
}
class Adidas extends brands{
    public void flagship(){
        System.out.println("Ultraboost");
    }
}
class Tesla extends brands{
    public void flagship(){
        System.out.println("Model S");
    }
}
class Toyota extends brands{
    public void flagship(){
        System.out.println("Corolla");
    }
}
class Cocacola extends brands{
    public void flagship(){
        System.out.println("Colacola");
    }
}
class Pepsi extends brands{
    public void flagship(){
        System.out.println("Pepsicola");
    }
}
class JBL extends brands{
    public void flagship(){
        System.out.println("Flip Seaker");
    }
}
class Microsoft extends brands{
    public void flagship(){
        System.out.println("Surface Pro");
    }
}
class Dell extends brands{
    public void flagship(){
        System.out.println("XPS Laptop");
    }
}
class HP extends brands{
    public void flagship(){
        System.out.println("Spectre x360");
    }
}
class Canon extends brands{
    public void flagship(){
        System.out.println("EOS Camera");
    }
}class Logitech extends brands{
    public void flagship(){
        System.out.println("MX Speaker");
    }
}




 
public class Tech2 {
 
    public static void main(String[] args) {
       brands a = new brands();
          Apple b = new Apple();
          Samsung c = new Samsung();
          Sony d = new Sony();
          Nike    e =  new  Nike();
          Adidas f = new Adidas();
          Tesla g = new Tesla();
          Toyota h  = new Toyota();        
          Cocacola i = new Cocacola();   
          Pepsi j = new Pepsi();
          JBL k = new JBL();
          Microsoft    l=  new  Microsoft();
          Dell m = new Dell();
          HP n = new HP();
          Canon o  = new Canon();        
          Logitech p = new Logitech();
       
          a.flagship();
          b.flagship();
          c.flagship();
          d.flagship();
          e.flagship();
          f.flagship();
          g.flagship();
          h.flagship();
          i.flagship();
          j.flagship();
          k.flagship();
          l.flagship();
          m.flagship();
          n.flagship();
          o.flagship();
    }
    
}
