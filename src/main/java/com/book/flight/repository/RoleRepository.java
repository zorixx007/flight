package com.book.flight.repository;

import com.book.flight.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

//@Repository
//public class RoleRepository implements IRoleRepository {
//    @PersistenceContext
//    private EntityManager em;
//
//    public Role findById ( int id ) {
//        return em.find ( Role.class , id );
//    }
//
//    public void save ( Role role ) {
//        if ( role.getRoleID ( ) == 0 ) {
//            em.persist ( role );
//        } else {
//            em.merge ( role );
//        }
//    }
//
//    public Role findByName ( String name ) {
//        TypedQuery<Role> query = em.createQuery ( "SELECT r FROM Role r WHERE r.roleName = ?1", Role.class );
//        query.setParameter ( 1, name );
//        return query.getSingleResult ( );
//    }
//
//
//}
