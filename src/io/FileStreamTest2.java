package io;
import java.io.*;

public class FileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File f=new File("a.txt");
        FileOutputStream fop=new FileOutputStream(f);
        //构建FileOutputStream object,文件不会在自动新建
        OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
        //构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统默认编码，windows上是gbk
        writer.append("中文输入");
        writer.append("\r\n");
        //换行
        writer.append("English");
        //刷新缓存冲，写入到文件，如果下面已经没有写入的内容了，直接close也会写入
        writer.close();
        //关闭写入流，同时会把缓冲区内容写入文件
        fop.close();
        //关闭输出流，释放系统资源

        FileInputStream fip=new FileInputStream(f);

        InputStreamReader reader=new InputStreamReader(fip,"UTF-8") ;

        StringBuffer sb=new StringBuffer();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}
