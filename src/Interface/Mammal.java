package Interface;

public class Mammal implements Animal{
    public void eat(){
        System.out.println("mammal eats");
    }

    public void travel(){
        System.out.println("mammal travels");
    }
    public int age(){
        return 0;
    }
    public static void main(String[] args){
        Mammal m=new Mammal();
        m.eat();
        m.travel();

    }
}
