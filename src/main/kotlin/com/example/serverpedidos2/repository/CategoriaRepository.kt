package com.example.serverpedidos2.repository

import com.example.serverpedidos2.entity.Categoria
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRepository : JpaRepository<Categoria, Int>