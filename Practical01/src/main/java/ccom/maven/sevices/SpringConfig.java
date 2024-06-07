package ccom.maven;

import ccom.maven.entities.Address;
import ccom.maven.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "ccom.maven.entities")
public class SpringConfig {
//    @Autowired
//    private Student student;
//    @Autowired
//    private Address address;
//
//    @Bean
//    public void getStudent(){
//        student.setId(12);
//        student.setName("Kedar");
//        student.setContact("9730330804");
//        student.setEmail("kedar@gmail.com");
//        address.setId(12);
//        address.setCity("Kohapur");
//        address.setState("maharashtra");
//        address.setCity("india");
//
//    }
//    @Bean
//    public void getAddress(){
//        return;
//
//
//    }
}


