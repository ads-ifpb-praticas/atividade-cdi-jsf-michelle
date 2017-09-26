/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.controller;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import br.edu.ifpb.atividade.cdi.jsf.michelle.service.CategoriaService;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author miolivc
 */

@Named
@RequestScoped
public class CategoriaController {
    
    @Inject
    private CategoriaService service;
    
    private String nomeCategoria = "";

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String adicionarCategoria() {
        service.add(new Categoria(nomeCategoria));
        nomeCategoria = "";
        return null;
    }
    
    public List<Categoria> list() {
        return Collections.unmodifiableList(service.getAll());
    }
    
}
