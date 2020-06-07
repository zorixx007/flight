package com.book.flight.service;

import com.book.flight.entity.Operator;
import com.book.flight.repository.IOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OperatorService implements IOperatorService {
    @Autowired
    private IOperatorRepository operatorRepository;

    @Override
    public Optional<Operator> findById ( long id ) {
        return operatorRepository.findById ( id );
    }


    public List<Operator> getSortedByFirstName(){
        return operatorRepository.findAllByOrderByFirstName ( );
    }

}
