package com.book.flight.service;

import com.book.flight.entity.Role;
import com.book.flight.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;

//    public Role findById ( long id ) {
//        return roleRepository.findById ( id );
//    }
//
//    @Transactional
//    public void save ( Role role ) {
//        roleRepository.save ( role );
//    }
//
//    public Role findByName ( String name ) {
//        return roleRepository.findByName ( name );
//    }


}
