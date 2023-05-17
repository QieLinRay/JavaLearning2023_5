package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(12);
        ArrayList<String> sites=new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("tianmao");
        System.out.println(sites);
        sites.set(2,"Wiki");
        sites.remove(3);
        Collections.sort(sites);
        System.out.println(sites);
        System.out.println(sites.size());
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));

        }
        System.out.println();
        for (String i:sites
             ) {
            System.out.println(i);

        }
    }
}
