package com.capg.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.entity.Books;

@Repository
public interface BookRepository extends CrudRepository<Books,Integer>{

}
