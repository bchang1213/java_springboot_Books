package com.brianchang.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brianchang.web.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
