package com.inti.SpringBootValidationThymeleaf.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private @NonNull String nom;
	private String prenom;
	@Column(unique=true)
	private String username;
	private String email;
	private String mdp;
	private String telephone;
}
