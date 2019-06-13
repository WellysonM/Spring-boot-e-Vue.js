package backend.produto.service;

import backend.produto.spec.IProduto;
import backend.produto.spec.dto.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoService {

    @Autowired
    private IProduto iProduto;

    @GetMapping("/produtos")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<ProdutoDTO> buscarProdutos() {
        return iProduto.buscarProdutos();
    }

    @PostMapping("/produtos")
    @CrossOrigin(origins = "http://localhost:8080")
    public void inserirProduto(@RequestBody ProdutoDTO produtoDTO) {
        iProduto.inserirProduto(produtoDTO);
    }

    @DeleteMapping("/produtos/{produtoId}")
    @CrossOrigin(origins = "http://localhost:8080")
    public void removerProduto(@PathVariable(value = "produtoId") Integer produtoId) {
        iProduto.removerProduto(produtoId);
    }

    @PutMapping("/produtos")
    @CrossOrigin(origins = "http://localhost:8080")
    public void atualizaProduto(@RequestBody ProdutoDTO produtoDTO) {
        iProduto.atualizarProduto(produtoDTO);
    }
}