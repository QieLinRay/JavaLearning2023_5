// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void  show(abstract_animal a){
        a.eat();
        if(a instanceof cat){
            cat c=(cat) a;
            c.work();
        }else if(a instanceof dog_abstract){
            dog_abstract c=(dog_abstract) a;
            c.work();
        }
    }
    public static void main(String[] args) {
        show(new cat());
        show(new dog_abstract());

        abstract_animal a=new cat();
        a.eat();
        cat c=(cat) a;
        c.work();




//        shape c=new circle();
//        shape s=new square();
//        shape t=new triangle();
//        c.draw();
//        s.draw();
//        t.draw();
//        overloading o=new overloading();
//        System.out.println(o.test());
//        o.test();
//        System.out.println(o.test(1,"test3"));
//        System.out.println(o.test("test4",1));
       /* A animal=new A("AA",1);
        animal.eat();
        M mouse=new M("MM",2);
        mouse.eatTest();*/
        //This 用于调用自己的方法，super用于调用父类
//        SubClass sc1=new SubClass();
//        SubClass sc2=new SubClass(100);
//        animal_override a=new dag_override();
//        //dag_override b=new dag_override();
//        a.move();// 执行 Animal 类的方法
//        b.move();//执行 Dog 类的方法
//        b.bark();



    }
}