package com.pivas.projeto_tomaz.Repository;

import com.pivas.projeto_tomaz.Entity.*;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, UUID> {
  
  }