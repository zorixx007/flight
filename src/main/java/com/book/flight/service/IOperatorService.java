package com.book.flight.service;

import com.book.flight.entity.Operator;

import java.util.List;
import java.util.Optional;


public interface IOperatorService {
    Optional<Operator> findById ( long id );

    List<Operator> getSortedByFirstName ();

    Optional<Operator> findByEmail ( String str );

}
