public class M extends A{
    public M(String myName, int myId) {
        super(myName, myId);
    }

     void eat(){
        System.out.println("this--mouse eat");

    }
    public void eatTest(){
        this.eat();
        super.eat();
    }
}
