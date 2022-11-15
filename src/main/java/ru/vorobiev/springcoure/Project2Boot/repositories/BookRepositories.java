package ru.vorobiev.springcoure.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vorobiev.springcoure.Project2Boot.models.Book;

import java.util.List;

@Repository
public interface BookRepositories extends JpaRepository<Book, Integer> {
    List<Book> findByNameStartingWith(String author);//метод будет искать книги по начальным буквам в названии
}
