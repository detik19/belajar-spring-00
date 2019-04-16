package com.subrutin.belajarspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subrutin.belajarspring.domains.Perusahaan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
       Perusahaan perusahaan = (Perusahaan) ctx.getBean("perusahaan");
       System.out.println(perusahaan);
    }
}
