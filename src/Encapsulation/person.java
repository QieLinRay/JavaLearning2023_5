package Encapsulation;
//封装的步骤：
//修改属性的可见性来限制对属性的访问private
//对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法
//也就是getter和setter方法

public class person {
    private String name;
    private int age;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String name){
        this.name=name;
    }
    //采用this是为了解决实例变量-private String name和局部变量
    //SetName(String name))之间发生变量同名的冲突
}
