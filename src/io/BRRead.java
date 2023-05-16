package io;
import java.io.*;

public class BRRead {
    public static void main(String[] args)throws IOException{
//        char c;
//        //使用system.in创建BuffereReader
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("input character,press 'q' to quit");
//
//        do{
//            c=(char) br.read();
//            System.out.println(c);
//        }while (c!='q');

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' to quit");

        do{
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));


    }
}
