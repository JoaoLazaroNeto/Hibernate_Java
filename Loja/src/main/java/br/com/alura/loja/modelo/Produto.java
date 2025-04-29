package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;

//Essa classe produto é uma entidade, existe uma tabela no banco que ela está representando.

@Entity     //O nome da tabela não for o mesmo da entidade, deve ensinar para a JPA.
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Como o valor dessa chave primária será gerado.
    private long id;
    private String nome;
    //@Column(name = "desc") quando o nome da coluna do banco está diferente da entidade no código.
    private String descricao;
    private BigDecimal preco;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
