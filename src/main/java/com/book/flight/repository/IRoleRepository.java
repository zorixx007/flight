package com.book.flight.repository;

import com.book.flight.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepository extends CrudRepository<Role, Long> {
//    public Role findById ( int id );
//    public void save (Role role);
//    public Role findByName ( String name );

}
