package com.book.flight;

import com.book.flight.entity.Role;
import com.book.flight.service.IRoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    public static void main ( String[] args ) {
        run ();
    }
    private static void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext ( "beans.xml" );
        IRoleService roleService = context.getBean ( IRoleService.class );
        Role testRole = roleService.findById ( 1 );
        System.out.println (testRole );
    }
}
