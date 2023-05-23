package javaArray;

public class arrayExtend {
    public static void main(String[] args) {
        String[] names=new String[]{"A","B","C"};
        String[] extend=new String[5];
        extend[3]="D";
        extend[4]="E";
        System.arraycopy(names,1,extend,1,names.length-1);
        //system.arraycopy(src:要复制的源数组,srcPos：源数组中的起始位置，
        //dest:目标数组，destPos:目标数组中的起始位置，length:要复制的数组元素的数量
        //就是将源数组中从i开始复制n个元素到extend数组中从j开始的地方开始替换，没有的地方将为null
        //要先重新定义一个需要的长度的数组
        for (String str:extend
             ) {
            System.out.println(str);
        }
    }
}
