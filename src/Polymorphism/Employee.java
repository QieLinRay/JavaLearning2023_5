package Polymorphism;

public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(){};
    public Employee(String name,String address,int number){
        System.out.println("Employee is comstructor");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public void mailCheck(){
        System.out.println(" mail sent to "+this.name+" "+this.address);
    }
    public String getName(){
        return name;//为什么不是this.name?
    }

    public String getAddress(){
        return address;
    }

    public int getNumber(){
        return number;
    }

    public void setAddress(String newAddress){
        address=newAddress;
    }
}
