package Pac2;

import javax.swing.*;
import java.io.*;
import java.util.Properties;
import java.util.Set;

//E:\test\file.txt
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties=new Properties();
        properties.put(1,"dsa");
        properties.put("sda",1);
        Set<Object> objects = properties.keySet();
        for (Object o:objects
             ) {
            System.out.println(o+","+ properties.get(o));
        }
    }
}
