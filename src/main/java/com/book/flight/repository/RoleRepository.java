package com.book.flight.repository;

import com.book.flight.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RoleRepository implements IRoleRepository {
    @PersistenceContext
    private EntityManager em;

    public Role findById ( int id ) {
        return em.find ( Role.class , id );
    }

}
