package backend.produto.impl.bo;

import backend.produto.impl.repository.ProdutoRepository;
import backend.produto.spec.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoBO {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarProdutos() {
        return produtoRepository.findAll(Sort.by("produto").ascending());
    }

    public Produto inserirProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarProdutoPorId(Integer id) {
        return produtoRepository.findById(id);
    }

    public void removerProduto(Produto produto) {
        produtoRepository.delete(produto);
    }

}
