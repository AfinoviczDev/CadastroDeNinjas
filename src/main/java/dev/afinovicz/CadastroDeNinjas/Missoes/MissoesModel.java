package dev.afinovicz.CadastroDeNinjas.Missoes;

import dev.afinovicz.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    // UMA MISSAO VAI TER VARIOS NINJAS
    private NinjaModel ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nomeMissao, String dificuldade, NinjaModel ninjas) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinjas() {
        return ninjas;
    }

    public void setNinjas(NinjaModel ninjas) {
        this.ninjas = ninjas;
    }
}

