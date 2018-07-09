package fastcom.model.dao;

import java.util.List;

import fastcom.model.domain.Produto;

public interface ProdutoDao {

	List<Produto> getProdutos();

	Produto salvar(Produto produto);

	void Excluir(Produto produto);

	void atualizar(Produto produto);

}