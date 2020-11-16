package com.siyu.demo19;

import java.io.*;
import java.util.*;

/**
 * @author Thomas Siyu
 * @version 1.00
 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        //show9();

        show12();

    }


    private static void show12() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fos.txt"));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();

    }

    private static void show11() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\mumu3\\assistant.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\IdeaProjects\\Demo2\\src\\com\\siyu\\demo19\\img1.zip"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {

            bos.write(bytes, 0, len);

        }
        bos.flush();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - start));
    }

    private static void show10() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
        bos.write("Nihao,这里是java".getBytes());
        bos.flush();
        bos.close();

    }

    private static void show9() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("a", "1");
        properties.setProperty("b", "2");
        properties.store(new FileWriter("1.txt"), "sadasdas");
    }

    private static void show8() {

        Properties properties = new Properties();
        properties.setProperty("a", "b");
        properties.setProperty("c", "d");
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(value);
        }

    }

    private static void show7() {
        try (FileInputStream fileInputStream = new FileInputStream("D:\\mumu3\\assistant.zip");
             FileOutputStream fileOutputStream = new FileOutputStream("E:\\IdeaProjects\\Demo2\\src\\com\\siyu\\demo19\\img.zip");) {
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void show6() throws IOException {
        FileWriter fileWriter = new FileWriter("1.txt", true);
        for (int i = 0; i < 10; i++) {
            fileWriter.write("helloworld" + i);
        }
        fileWriter.close();


    }


    private static void show5() throws IOException {
        FileReader fileReader = new FileReader("1.txt");
        int len = 0;

        while ((len = fileReader.read()) != 0) {
            System.out.print((char) len);


        }
    }

    private static void show4() throws IOException {
        long e = System.currentTimeMillis();


        //C:\Users\xyhsy\Pictures\Saved Pictures 读
        FileInputStream fis = new FileInputStream("D:\\mumu3\\assistant.zip");
        FileOutputStream fos = new FileOutputStream("E:\\IdeaProjects\\Demo2\\src\\com\\siyu\\demo19\\img.zip");
        //byte[] bytes = new byte[100000];
        int len = 0;
    /*    while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }*/
        while ((len = fis.read()) != -1) {

            fos.write(len);
        }
        fos.close();
        fis.close();
        long e1 = System.currentTimeMillis();
        System.out.println(e1 - e);

    }

    private static void show3() throws IOException {
        FileInputStream fis = new FileInputStream("fos2.txt");
        int len = 0;
        while ((len = fis.read()) != -2) {
            System.out.println(len);
            if (len == -1) {
                break;
            }
        }
        fis.close();

    }

    private static void show2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("fos2.txt", true);

        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();

    }

    private static void show1() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write('9');
        fos.close();
    }
}
