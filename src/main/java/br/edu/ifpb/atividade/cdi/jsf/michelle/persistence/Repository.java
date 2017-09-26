/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.persistence;

import java.util.List;

/**
 *
 * @author miolivc
 */
public interface Repository<T> {
    
    void save(T t);
    List<T> list();
    
}
