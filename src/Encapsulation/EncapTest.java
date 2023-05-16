package Encapsulation;

public class EncapTest {
    private String name;
    private String id;
    private int age;
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name=newName;
    }

    public void setId(String newID){
        id=newID;
    }

    public void setAge(int age){
        this.age=age;

    }

}
