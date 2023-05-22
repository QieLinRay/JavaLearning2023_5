package linkList;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> sites=new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.addFirst("Wiki");//在开头添加元素
        sites.addLast("EJOR");//在结尾添加元素
        System.out.println(sites);
        sites.removeFirst();
        sites.removeLast();
        System.out.println(sites);
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
        for(int size= sites.size(),i=0;i<size;i++){//.size()访问链表的大小
            System.out.println(sites.get(i));
        }
        for (String i: sites
             ) {
            System.out.println(i);

        }
    }
}
