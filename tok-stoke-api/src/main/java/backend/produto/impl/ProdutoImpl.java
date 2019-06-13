package backend.produto.impl;

import backend.produto.impl.usecase.AtualizarProduto;
import backend.produto.impl.usecase.RemoverProduto;
import backend.produto.impl.usecase.BuscarProdutos;
import backend.produto.impl.usecase.InserirProduto;
import backend.produto.spec.IProduto;
import backend.produto.spec.dto.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoImpl implements IProduto {

    @Autowired
    private BuscarProdutos buscar;

    @Autowired
    private InserirProduto inserir;

    @Autowired
    private AtualizarProduto atualizar;

    @Autowired
    private RemoverProduto remover;

    @Override
    public List<ProdutoDTO> buscarProdutos() {
        return buscar.BuscarProdutos();
    }

    @Override
    public void removerProduto(Integer id) {
        remover.RemoverProduto(id);
    }

    @Override
    public void inserirProduto(ProdutoDTO produtoDTO) {
        inserir.InserirProduto(produtoDTO);
    }

    @Override
    public void atualizarProduto(ProdutoDTO produtoDTO) {
        atualizar.atualizarProduto(produtoDTO);
    }
}
