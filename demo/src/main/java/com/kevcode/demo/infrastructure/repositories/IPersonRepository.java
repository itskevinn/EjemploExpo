package com.kevcode.demo.infrastructure.repositories;

import com.kevcode.demo.domain.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
}
