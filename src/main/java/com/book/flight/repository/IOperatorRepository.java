package com.book.flight.repository;

import com.book.flight.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IOperatorRepository extends JpaRepository<Operator, Long> {
//    public Operator findById ( int id );
List<Operator> findAllByOrderByFirstName ();

}
