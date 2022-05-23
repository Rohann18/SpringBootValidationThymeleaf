package com.inti.SpringBootValidationThymeleaf.repository;

import com.inti.SpringBootValidationThymeleaf.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{

}
