package com.book.flight;

import com.book.flight.entity.Role;
import com.book.flight.service.IOperatorService;
import com.book.flight.service.IRoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationOperator {
    public static void main ( String[] args ) {
        run ();
    }
    private static void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext ( "beans.xml" );
        IOperatorService operatorService = context.getBean ( IOperatorService.class );
//        operatorService.findById ( 1 ).ifPresent ( System.out::println );
        operatorService.getSortedByFirstName().forEach ( n-> System.out.println (n ) );
        System.out.println ("find by email ba@ex.com" );
        operatorService.findByEmail("ba@ex.com").ifPresent ( System.out::println );

    }
}
