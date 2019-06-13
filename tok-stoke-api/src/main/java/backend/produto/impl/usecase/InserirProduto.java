package backend.produto.impl.usecase;

import backend.produto.impl.bo.ProdutoBO;
import backend.produto.spec.dto.ProdutoDTO;
import backend.produto.spec.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirProduto {

    @Autowired
    private ProdutoBO produtoBO;

    public void InserirProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        preencherProduto(produto, produtoDTO);
        produtoBO.inserirProduto(produto);
    }

    private static void preencherProduto(Produto produto, ProdutoDTO produtoDTO) {
        produto.setProduto(produtoDTO.getProduto());
        produto.setPreco(produtoDTO.getPreco());
    }
}
