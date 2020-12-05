package com.siyu.demo19;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/11/7 18:05
 */
public class FileDemo {
    public static void main(String[] args) {
        show3();
        //System.out.println(show4(5));

    }

    private static int show4(int n) {
        if(n == 1){
            return 1;
        }else{
            return n*show4(n -1);
        }


    }

    private static void show3() {
        File file1 = new File("src\\com\\siyu\\demo19");

        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);

        }

    /*    file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().toLowerCase().equals(".java")){

                    return true;
                }
                return false;
            }
        });
*/
    }

    private static void show2() {
        File file1 = new File("2.txt");
        if(file1.exists()){
                try {
                file1.createNewFile();
                file1.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file2 = new File("3.txt");
        try {
            System.out.println(file2.createNewFile());
            file2.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show1() {
        File f1 = new File("1.txt");
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
        if(f1.exists()&&f1.isDirectory()){
            //....
        }else{
            //.....
        }
    }


    public String toString() {
        return "1";
    }
}
