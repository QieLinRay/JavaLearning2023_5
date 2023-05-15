public class overloading {
    public int test(){
        System.out.println("test int");
        return 1;
    }
    public void test(int a){
        System.out.println("test a");
    }

    public String test(int a,String s){
        System.out.println(" test int and string");
        return "test3";
    }
    public String test(String s,int i){
        System.out.println("test s and int");
        return "test4";
    }
}
