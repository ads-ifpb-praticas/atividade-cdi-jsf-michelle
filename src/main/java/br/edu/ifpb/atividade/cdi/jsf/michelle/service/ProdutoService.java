
package br.edu.ifpb.atividade.cdi.jsf.michelle.service;

import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Categoria;
import br.edu.ifpb.atividade.cdi.jsf.michelle.model.Produto;
import br.edu.ifpb.atividade.cdi.jsf.michelle.persistence.Repository;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 04/10/2017
 */

public class ProdutoService implements Service<Produto> {
    
    @Inject
    private Repository<Produto> repository;

    @Inject
    private CategoriaService service;

    @Override
    public void add(Produto produto) {
        Categoria categoria = service.get(produto.getCategoria().getNome());
        if(categoria != null) {
            produto.setCategoria(categoria);
        } 
        repository.save(produto);
    }

    @Override
    public List<Produto> getAll() {
        return repository.list();
    }
    
    @Override 
    public Produto get(String key) {
        return null;
    }
    
}
