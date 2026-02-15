package dev.afinovicz.CadastroDeNinjas.Ninjas;

import dev.afinovicz.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do BANCO DE DADOS!
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne
    // UM NINJA TEM UMA UNICA MISSAO
    @JoinColumn(name = "missoes_id") // CHAVE ESTRANGEIRA
    private MissoesModel missoes;
}