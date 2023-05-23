package javaArray;
import java.util.HashSet;
import java.util.Set;
//Set里面的元素具有唯一性,没有union方法，因此可以通过hashset中的set的唯一性来求并集
public class union {
    public static  void main(String[] args) throws Exception{
        //String[] arr1={"1","2","3"};
        //String[] arr2={"2","3","4","5"};
        int[] arr1={1,2,3};
        int[] arr2={2,3,4};
        //String[] result_union= union(arr1,arr2);
        Set<Integer> set=new HashSet<Integer>();
        for(int str:arr1){
            set.add(str);
        }
        for(int str:arr2){
            set.add(str);
        }
        int[] result={};
        //result=set.toArray(result);
        for(int i:set){
            System.out.print(i+" ");
        }
    }
}
