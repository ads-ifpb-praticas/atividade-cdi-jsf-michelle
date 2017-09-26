/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.service;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import br.edu.ifpb.atividade.cdi.jsf.michelle.qualifiers.CategoriaPersistence;
import br.edu.ifpb.atividade.cdi.jsf.michelle.persistence.Repository;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author miolivc
 */
public class CategoriaService {
    
    @CategoriaPersistence
    @Inject
    private Repository<Categoria> repository;

    public void add(Categoria categoria) {
        repository.save(categoria);
    }
    
    public List<Categoria> getAll() {
        return repository.list();
    }
    
}
