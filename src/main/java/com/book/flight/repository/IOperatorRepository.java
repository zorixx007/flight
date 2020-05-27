package com.book.flight.repository;

import com.book.flight.entity.Operator;

public interface IOperatorRepository {
    public Operator findById ( int id );
}
