package javaArray;
import java.util.ArrayList;
//retainAll() 方法用于保留 arraylist 中在指定集合中也存在的那些元素，也就是删除指定集合中不存在的那些元素。
//意味着这个函数可以用来求两者之间的交集，A保留B中也有的元素，那就是求交集啦
public class intersection {
    public static void main(String[] args) {
        ArrayList<String> objArray=new ArrayList<String>();
        ArrayList<String> objArray2=new ArrayList<>();
        objArray.add("1");
        objArray.add("2");
        objArray.add("3");
        objArray2.add("2");
        objArray2.add("3");
        System.out.println("array:"+objArray);
        System.out.println("array2:"+objArray2);
        objArray.retainAll(objArray2);
        System.out.println("the intersection is:"+objArray);

    }
}
