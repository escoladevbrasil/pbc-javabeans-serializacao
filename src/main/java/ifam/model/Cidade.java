package ifam.model;

import java.io.Serializable;

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String ibge;

    private Estado estado;

    public Cidade() {
    }

    public Cidade(String nome, String ibge) {
        this.nome = nome;
        this.ibge = ibge;
    }

    public Cidade(String nome, String ibge, Estado estado) {
        this.nome = nome;
        this.ibge = ibge;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
