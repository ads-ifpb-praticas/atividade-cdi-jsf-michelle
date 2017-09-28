/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author miolivc
 */

@Entity
@SequenceGenerator(name = "categoria_seq", sequenceName = "categoria_seq")
@NamedQueries({
    @NamedQuery(name = "all", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "codigo", query = "SELECT c FROM Categoria c WHERE codigo = :codigo")
})

public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_seq")
    private int codigo;
    
    @Column(length = 30, unique = true, nullable = false)
    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
