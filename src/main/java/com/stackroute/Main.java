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

        XmlBeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movies = factory.getBean("Movie",Movie.class);
        movies.print();

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movieReg= (Movie) ((DefaultListableBeanFactory)(beanDefinitionRegistry)).getBean("Movie");
        movieReg.print();

    }
}
