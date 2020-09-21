package com.siyu.demo14;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * "C:\Program Files\Java\jdk1.8.0_191\bin\java" "-javaagent:F:\Program\IntelliJ IDEA 2017.3.4\lib\idea_rt.jar=50272:F:\Program\IntelliJ IDEA 2017.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;E:\IdeaProjects\Demo2\out\production\Demo2" com.siyu.demo14.Demo2
 * 33
 * 1
 * 34
 * 2
 * 3
 * 32
 *
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/12 9:56
 */
public class Demo2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("33");
        hs.add("34");
        hs.add("2");
        hs.add("3");
        hs.add("32");
        hs.add("32");
        for (String s : hs) {
           // System.out.println(s);
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("zhangsan");
        linkedHashSet.add("zhangsan1");
        linkedHashSet.add("zhangsan2");
        linkedHashSet.add("zhangsan3");
        linkedHashSet.add("zhangsan");
        linkedHashSet.add("zhangsan1");
        linkedHashSet.add("zhangsan2");
        linkedHashSet.add("zhangsan3");
        for (String set : linkedHashSet ) {
            System.out.println(set);

        }


    }
}
