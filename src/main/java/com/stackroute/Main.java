package com.stackroute;
import com.stackroute.domain.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("Movie",Movie.class);
        movie.print();
        Movie movie1 = context.getBean("Movie2",Movie.class);
        movie1.print();
       Movie movie2 = context.getBean("Movie3",Movie.class);
       movie2.print();
        Movie movie4 = context.getBean("Movie3",Movie.class);
        movie4.print();
        Movie movie5= context.getBean("Movie",Movie.class);
        movie.print();
        Movie movie6= context.getBean("Movie4",Movie.class);
        movie6.print();


        // scope prototype
        if(movie2 == movie4)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        // scope singleton
        if(movie == movie5)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
