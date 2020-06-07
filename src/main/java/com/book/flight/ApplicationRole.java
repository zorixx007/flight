package com.book.flight;

import com.book.flight.entity.Role;
import com.book.flight.service.IRoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRole {
    public static void main ( String[] args ) {
        run ();
    }
    private static void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext ( "beans.xml" );
        IRoleService roleService = context.getBean ( IRoleService.class );
        //        Role test = roleService.findByName ( "operator" );
        //        System.out.println (test );
//        Role testRole = roleService.findById ( 1 );
//        System.out.println (testRole );

//        add new roles
//        Role administrator  = new Role ();
//        administrator.setRoleName ( "administrator" );
//        roleService.save ( administrator );
//
    //        Role manager  = new Role ();
    //        manager.setRoleName ( "manager" );
    //        roleService.save ( manager );
//
//        Role accountant = new Role ();
//        accountant.setRoleName ( "accountant" );
//        roleService.save ( accountant );
//
//        Role operator = new Role ();
//        operator.setRoleName ( "operator" );
//        roleService.save ( operator );

    }
}
