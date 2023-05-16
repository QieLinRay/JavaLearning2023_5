package Encapsulation;

public class RunEncap {
    public static void main(String[] args){
        EncapTest encap=new EncapTest();
        encap.setAge(23);
        encap.setId("1912");
        encap.setName("Miumiu");
        System.out.println("Name:"+encap.getName());
    }
}
