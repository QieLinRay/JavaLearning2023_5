package arrayList;
import java.util.Collections;
import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers=new ArrayList<>();
        primeNumbers.add(10);
        primeNumbers.add(11);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        numbers.addAll(primeNumbers);
        System.out.println("Prime numvers"+primeNumbers);
        System.out.println("numbers"+numbers);
    }
}
