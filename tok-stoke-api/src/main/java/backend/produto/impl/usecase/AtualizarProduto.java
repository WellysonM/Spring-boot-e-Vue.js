package backend.produto.impl.usecase;

import backend.produto.impl.bo.ProdutoBO;
import backend.produto.spec.dto.ProdutoDTO;
import backend.produto.spec.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtualizarProduto {
    @Autowired
    private ProdutoBO produtoBO;

    public void atualizarProduto(ProdutoDTO produtoDTO) {
        Produto produto = produtoBO.buscarProdutoPorId(produtoDTO.getId()) ;
        preencherProduto(produto, produtoDTO);
        produtoBO.atualizarProduto(produto);
    }

    private static void preencherProduto(Produto produto, ProdutoDTO produtoDTO) {
        produto.setProduto(produtoDTO.getProduto());
        produto.setPreco(produtoDTO.getPreco());
    }
}