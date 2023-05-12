public class SubClass extends SuperClass{
    private int n;
    SubClass(){
        System.out.println("SubClass");
    }
     SubClass(int n){
        //super(9);
        System.out.println("SubClass(int n):"+n);
        this.n=n;
    }
}
