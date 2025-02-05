package OOPs;
//abstract class is a BLUEPRINT CLASS , there is no existence of this class .
//no object can be created using an abstract class because of the above reason
abstract class animals{
    animals(){
        System.out.println("YOU ARE CREATING A NEW ANIMAL");
    }

    String type;
    abstract void walk();
    public void eat(){

        System.out.println("this animal eats "+ this.type);
    }
}
class horse extends animals{
    horse(){
        System.out.println("You are creating a new horse");
    }
    public void typeC(){
        this.type="horse";
    }
    public void walk(){
        System.out.println("WALKS ON 4 LEGS");
    }
}
class chicken extends animals{
    chicken(){
        System.out.println("You are creating a new chicken");
    }
    public void typeC(){
        this.type="chicken";
    }
    public void walk(){
        System.out.println("WALKS ON TWO LEGS");
    }
}

public class abstraction {
    public static void main(String[] args) {
        horse  horse1=new horse();
        chicken chicken1=new chicken();
        horse1.walk();
        chicken1.walk();
        chicken1.typeC();
        horse1.typeC();
        horse1.eat();
        chicken1.eat();
    }
}


//here the output will display constructor chaining
