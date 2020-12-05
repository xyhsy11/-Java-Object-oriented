package com.siyu.demo19;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/25 11:15
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = null;
        try {
            f1 = new File(new URI("https://www.baidu.com"));
            System.out.println(File.separator);

            System.out.println(f1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
