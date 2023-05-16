package Polymorphism;

public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void setSalary(double newsalary){
        if(newsalary>0.0){
          salary = newsalary;
        }
    }
    public void mailCheck(){
        System.out.println("salary class mailCheck");
        //System.out.println("salary send to "+getName()+" salary="+salary);
    }
    public double computePay(){
        //System.out.println("caculate salary,pay to "+getName());
        return salary/2;
    }
    
    
}
