package javaArray;

import java.util.ArrayList;
//计算差集：两个集合，直接利用removeAll(),从一个集合中removeAll另一个集合中含有的所有元素，则该集合中剩余的元素即是两者的差集


public class subtraction {
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
        objArray.removeAll(objArray2);
        System.out.println("the subtraction is:"+objArray);
    }

}
