package br.edu.ifpi.api_produtos.repository;

import br.edu.ifpi.api_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
