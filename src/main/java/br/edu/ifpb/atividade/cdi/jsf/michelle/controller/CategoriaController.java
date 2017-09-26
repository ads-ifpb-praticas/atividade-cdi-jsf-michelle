/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.controller;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author miolivc
 */

@Named
@ViewScoped
public class CategoriaController implements Serializable {
    
    private List<String> categorias = new ArrayList<>();
    private String categoria = "";

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    public String add() {
        categorias.add(categoria);
        categoria = "";
        return null;
    }
    
    public List<String> list() {
        return Collections.unmodifiableList(categorias);
    }
    
}
