package arrayList;
import java.util.ArrayList;

public class clone {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        System.out.println(a);
        System.out.println("after cloning");
        ArrayList<String> b=(ArrayList<String>) a.clone();
        System.out.println("b"+b);
        a.add("D");
        System.out.println("b"+b);
        System.out.println("a"+a);

    }

}
