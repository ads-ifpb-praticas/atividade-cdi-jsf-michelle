/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.service;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import br.edu.ifpb.atividade.cdi.jsf.michelle.persistence.CategoriaRepository;
import br.edu.ifpb.atividade.cdi.jsf.michelle.persistence.Repository;
import br.edu.ifpb.atividade.cdi.jsf.michelle.qualifiers.CategoriaPersistence;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author miolivc
 */
@Default
public class CategoriaServiceImpl implements CategoriaService {

    @Inject
    @CategoriaPersistence
    private Repository<Categoria> repository;

    public CategoriaServiceImpl() {
    }

    @Override
    public void add(Categoria categoria) {
        repository.save(categoria);
    }
    
    @Override
    public List<Categoria> getAll() {
        return repository.list();
    }

}
