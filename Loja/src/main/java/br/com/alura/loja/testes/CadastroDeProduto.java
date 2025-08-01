package br.com.alura.loja.testes;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto celular = new Produto();
        celular.setDescricao("Xiamoi");
        celular.setDescricao("Roxo, com tampa de vidro");
        celular.setPreco(new BigDecimal("800"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(celular); //Insert do celular, na tabela de produto.
        em.getTransaction().commit();
        em.close();
    }
}
