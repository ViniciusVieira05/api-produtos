package br.edu.ifpi.api_produtos.controller;

import br.edu.ifpi.api_produtos.model.Produto;
import br.edu.ifpi.api_produtos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    List<Produto> produtos = new ArrayList<>();

    @GetMapping("/produto")
    public List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    @PostMapping("/produto")
    public String inserirProduto (@RequestBody Produto produto ){

        produtoRepository.save(produto);

        return "novo produto adicionado com sucesso! ID = "  + produto.getId() +
            ", Nome do produto: " +
            produto.getNome() +
            ", Categoria: " + produto.getCategoria() +
            ", Preço: " + produto.getPreco();
    }

    @PutMapping("/produto/{id}")
    public String atualizarProduto(
            @PathVariable Long id,
            @RequestBody Produto produto) {

        Produto produtoExistente = produtoRepository.findById(id).orElse(null);

        if (produtoExistente == null) {
            return "Produto não encontrado!!";
        }

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setCategoria(produto.getCategoria());
        produtoExistente.setPreco(produto.getPreco());

        produtoRepository.save(produtoExistente);

        return "Produto atualizado com sucesso!!";
    }

    @DeleteMapping("/produto/{id}")
    public String deletarProdutoId(@PathVariable Long id) {

        if (!produtoRepository.existsById(id)) {
            return "Produto não encontrado";
        }

        produtoRepository.deleteById(id);

        return "Produto deletado com sucesso";
    }
}
