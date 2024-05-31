package ccom.maven;

import ccom.maven.entities.Address;
import ccom.maven.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        student s = new student();
        s.setId(1);
        s.setName("Kedar Padalkar");
        s.setContact("9730331804");
        s.setEmail("kedarpadalakar@gmail.com");
        Address a =new Address();
        a.setId(1);
        a.setCity("kolhapur");
        a.setState("maharshtra");
        a.setCountry("india");
        a.setPincode(12345);
        s.setA(a);
        System.out.println(s.toString());
    }

}
