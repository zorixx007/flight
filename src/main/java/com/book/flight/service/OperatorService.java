package com.book.flight.service;

import com.book.flight.entity.Operator;
import com.book.flight.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OperatorService implements IOperatorService {
    @Autowired
    private OperatorRepository operatorRepository;

    public Operator findById ( int id ) {
        return operatorRepository.findById ( id );
    }

}
