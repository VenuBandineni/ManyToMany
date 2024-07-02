package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.PersonConfig;
import com.jsp.dao.Dao;
import com.jsp.dao.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
       Dao dao = context.getBean(Dao.class);
       dao.insertPersonDetails();
    }
}
