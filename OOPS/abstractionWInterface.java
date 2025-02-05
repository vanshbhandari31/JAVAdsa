package OOPs;
// interface can not have constructors
//interface can only have abstract methods
//interfaces are not "extended" interfaces are "implemented("implements")
interface animal{
    int eyes=2;
    abstract void walk();

}
interface Herb{
    abstract void eating();
}  

class cat implements animal,Herb{
    public void walk(){
        System.out.println("walks on four legs");
        System.out.println(eyes);
    }
    public void eating(){
        System.out.println("eats grass");
    }

}
class bird implements animal{
    public void walk(){
        System.out.println("flies");
        System.out.println(eyes);
    }
    public void eating(){
        System.out.println("water");
    }

}
public class abstractionWInterface {
    public static void main(String[] args) {
        cat cat1=new cat();
        cat1.walk();
        cat1.eating();
        bird bird1=new bird();
        bird1.walk();
        bird1.eating();
    }

}
