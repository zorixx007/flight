package com.book.flight.service;

import com.book.flight.entity.Role;
import com.book.flight.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role findById ( int id ) {
        return roleRepository.findById ( id );
    }

}
