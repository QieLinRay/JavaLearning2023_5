package Polymorphism;

public class Main {
    public static void main(String[] args){
        //Salary s=new Salary("S","SHU",3,100);
        Employee e=new Employee("E","THU",2);
        //没有构造函数的话，上面这一行会红掉
        //System.out.println("-----Salary_mailCheck----");
//        s.mailCheck();
//        s.getName();
        System.out.println("-----employee-mailCheck---");
        e.mailCheck();


    }

}
