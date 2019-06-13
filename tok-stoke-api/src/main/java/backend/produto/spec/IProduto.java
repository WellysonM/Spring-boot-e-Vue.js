package backend.produto.spec;

import backend.produto.spec.dto.ProdutoDTO;

import java.util.List;

public interface IProduto {

    List<ProdutoDTO> buscarProdutos();

    void removerProduto(Integer id);

    void inserirProduto(ProdutoDTO produtoDTO);

    void atualizarProduto(ProdutoDTO produtoDTO);

}
