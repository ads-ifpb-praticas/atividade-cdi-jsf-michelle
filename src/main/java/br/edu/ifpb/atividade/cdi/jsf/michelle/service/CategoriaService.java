/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.service;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author miolivc
 */
public interface CategoriaService extends Serializable {

    void add(Categoria categoria);

    List<Categoria> getAll();
    
}
