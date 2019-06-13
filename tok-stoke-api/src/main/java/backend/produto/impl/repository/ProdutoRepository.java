package backend.produto.impl.repository;


import backend.produto.spec.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(Integer produtoDTOId);
}