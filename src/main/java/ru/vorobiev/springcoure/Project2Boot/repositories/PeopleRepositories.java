package ru.vorobiev.springcoure.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vorobiev.springcoure.Project2Boot.models.Person;

import java.util.Optional;

@Repository
public interface PeopleRepositories extends JpaRepository<Person, Integer> {
    Optional<Person> findByFio(String fio);
}

