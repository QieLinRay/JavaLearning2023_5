package javaArray;

public class findRepitation {
    //找重复元素：对数组中的元素遍历，
    // 用i=0;k=i+1进行遍历，并且给出一个标记位，如果相等就改变标记位并输出，
    //记得重新给标记位赋值
    public static void main(String[] args) {
        int[] my_array={1,2,2,3,4,5,5,6};
        findRepitation(my_array);
    }
    public static  void findRepitation(int[] a){
        int count=0;
        for(int j=0;j<a.length;j++){
            for(int k=j+1;k<a.length;k++){
                if(a[j]==a[k]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("重复元素："+a[j]);
                count=0;
            }
        }
    }
}
