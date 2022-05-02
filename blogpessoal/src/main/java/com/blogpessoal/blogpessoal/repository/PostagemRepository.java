package com.blogpessoal.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
}
