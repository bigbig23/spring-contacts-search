package com.example.dao;

 

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.entities.Contact;

 
public interface ContactRepository extends JpaRepository<Contact, Long> {
 
	@Query("select c from Contact c where c.nom like :x")
	public Page<Contact> search(@Param("x") String mc, Pageable pageable);
}
