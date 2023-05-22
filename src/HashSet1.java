import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> sites=new HashSet<String>();
        //add elements
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        System.out.println(sites);
        //判断元素是否存在
        System.out.println(sites.contains("tianmao"));
        System.out.println("Google");
        System.out.println(sites);
        sites.clear();//delete all the elements
        sites.size();

        for (String i:sites
             ) {
            System.out.println(i);
        }

    }
}
