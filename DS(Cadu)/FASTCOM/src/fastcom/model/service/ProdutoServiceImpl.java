package fastcom.model.service;

import java.util.List;

import javax.transaction.Transactional;

import fastcom.model.dao.ProdutoDao;
import fastcom.model.domain.Produto;

public class ProdutoServiceImpl implements ProdutoService {
	@inject
	private ProdutoDao produtoDao;

	/* (non-Javadoc)
	 * @see fastcom.model.service.ProdutoService#getProdutos()
	 */
	@Override
	public List<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return produtoDao.getProdutos();
	}

	/* (non-Javadoc)
	 * @see fastcom.model.service.ProdutoService#salvar()
	 */
	@Override
	@Transactional
	public Produto salvar (Produto produto) {
		// TODO Auto-generated method stub
		return produtoDao.salvar(produto);
	}

	/* (non-Javadoc)
	 * @see fastcom.model.service.ProdutoService#salvar(fastcom.model.domain.Produto)
	 */

	/* (non-Javadoc)
	 * @see fastcom.model.service.ProdutoService#excluir(fastcom.model.domain.Produto)
	 */
	@Override
	@Transactional
	public void excluir(Produto produto) {
		produtoDao.Excluir(produto);
		
	}

	/* (non-Javadoc)
	 * @see fastcom.model.service.ProdutoService#atualizar(fastcom.model.domain.Produto)
	 */
	@Override
	public void atualizar(Produto produto) {
		produtoDao.atualizar(produto);		
	}

}
