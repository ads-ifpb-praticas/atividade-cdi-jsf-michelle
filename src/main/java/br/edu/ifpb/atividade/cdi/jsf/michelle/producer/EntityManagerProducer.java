/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade.cdi.jsf.michelle.producer;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author miolivc
 */
public class EntityManagerProducer {
    
    private static EntityManager manager = null;
    
    @Produces
    public static EntityManager getEntityManager() {
        manager = Persistence
                .createEntityManagerFactory("atividade-cdi-jsf-michelle")
                .createEntityManager();
        return manager;
    }
    
}
