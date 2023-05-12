public class A {
   /* void eat(){
        System.out.println("animal:eat");
    }*/
    private String name;
    private int id;
    public A(String myName,int myId){//String要带引号
        name=myName;
        id=myId;
    }//构造方法？？初始类
     void eat(){
        System.out.println("Animal "+name+" is eating");
    }
    public void sleep(){
        System.out.println(name+"is sleeping");
    }
    public void introduction(){
        System.out.println("Hello,I am"+id);
    }
}

