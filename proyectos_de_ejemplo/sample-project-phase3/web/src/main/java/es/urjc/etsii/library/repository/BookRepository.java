package es.urjc.etsii.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.urjc.etsii.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}