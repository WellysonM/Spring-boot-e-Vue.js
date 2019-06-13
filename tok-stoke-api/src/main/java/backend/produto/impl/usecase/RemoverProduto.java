package backend.produto.impl.usecase;

import backend.produto.impl.bo.ProdutoBO;
import backend.produto.spec.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemoverProduto {

    @Autowired
    private ProdutoBO produtoBO;

    public void RemoverProduto(Integer id) {
        Produto produto = produtoBO.buscarProdutoPorId(id);
        produtoBO.removerProduto(produto);
    }
}
