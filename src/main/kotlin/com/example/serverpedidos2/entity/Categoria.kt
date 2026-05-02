package com.example.serverpedidos2.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Categoria {
    @Id
    var id : Int = 0
    var nome: String = ""
}

/*
INSERT INTO CATEGORIA VALUE (1, 'CATEGORIA 1');
INSERT INTO CATEGORIA VALUE (2, 'CATEGORIA 2');
INSERT INTO CATEGORIA VALUE (3, 'CATEGORIA 3');
 */