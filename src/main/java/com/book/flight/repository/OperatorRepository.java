package com.book.flight.repository;

import com.book.flight.entity.Operator;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OperatorRepository implements IOperatorRepository {
    @PersistenceContext
    private EntityManager em;

    public Operator findById ( int id ) {
        return em.find ( Operator.class , id );
    }
}
