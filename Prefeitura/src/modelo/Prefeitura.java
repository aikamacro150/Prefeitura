/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private Integer nr_de_funcionarios;
    private Integer codigo;
    private String nome;
    private String endereco;

    public Integer getNr_de_funcionarios() {
        return nr_de_funcionarios;
    }

    public void setNr_de_funcionarios(Integer nr_de_funcionarios) {
        this.nr_de_funcionarios = nr_de_funcionarios;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Prefeitura{" + "nome=" + nome + '}';
    }
}
