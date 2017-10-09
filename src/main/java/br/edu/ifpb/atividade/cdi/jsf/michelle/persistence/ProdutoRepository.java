
package br.edu.ifpb.atividade.cdi.jsf.michelle.persistence;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Produto;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 04/10/2017
 */

public class ProdutoRepository implements Repository<Produto> {
    
    @Inject
    private EntityManager manager;

    @Override
    public void save(Produto produto) {
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
    }

    @Override
    public List<Produto> list() {
        return manager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }

    @Override
    public Produto get(String key) {
        return null;
    }
    
}
