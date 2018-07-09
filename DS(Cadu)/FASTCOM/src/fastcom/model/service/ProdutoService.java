package fastcom.model.service;

import java.util.List;

import fastcom.model.domain.Produto;

public interface ProdutoService {

	List<Produto> getProdutos();

	Produto salvar();

	Produto salvar(Produto produto);

	void excluir(Produto produto);

	void atualizar(Produto produto);

}