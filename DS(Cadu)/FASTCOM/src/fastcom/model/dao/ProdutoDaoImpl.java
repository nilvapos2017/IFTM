package fastcom.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fastcom.model.domain.Produto;

public class ProdutoDaoImpl implements ProdutoDao {
	@PersistenceContext(unitName=FASTCOMPU)
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see fastcom.model.dao.ProdutoDao#getProdutos()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos() {
		javax.persistence.Query query = entityManager.createQuery("from Produto");
		return query.getResultList();
	}

	/* (non-Javadoc)
	 * @see fastcom.model.dao.ProdutoDao#salvar(fastcom.model.domain.Produto)
	 */
	@Override
	public Produto salvar(Produto produto) {
		entityManager.persist(produto);
		return produto;
	}

	/* (non-Javadoc)
	 * @see fastcom.model.dao.ProdutoDao#Excluir(fastcom.model.domain.Produto)
	 */
	@Override
	public void Excluir(Produto produto) {
		Produto produtoMerge = entityManager.merge(produto);
		entityManager.remove(produtoMerge);
		
	}

	/* (non-Javadoc)
	 * @see fastcom.model.dao.ProdutoDao#atualizar(fastcom.model.domain.Produto)
	 */
	@Override
	public void atualizar(Produto produto) {
		Produto produtoMerge = entityManager.merge(produto);
		entityManager.persist(produtoMerge);
		
	}

}
