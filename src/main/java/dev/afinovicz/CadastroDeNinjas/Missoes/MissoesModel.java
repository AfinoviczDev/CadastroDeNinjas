package dev.afinovicz.CadastroDeNinjas.Missoes;

import dev.afinovicz.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    // UMA MISSAO VAI TER VARIOS NINJAS
    private NinjaModel ninjas;

}

