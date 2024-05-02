package br.com.cadUser;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pessoaBean")
@RequestScoped
public class PessoaBean {

    private String nome;
    private ArrayList<String> nomesCadastrados = new ArrayList<>();

    public PessoaBean() {
    }

    public void cadastrarNome() {
        nomesCadastrados.add(nome);
        nome = ""; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    public void setNomesCadastrados(ArrayList<String> nomesCadastrados) {
        this.nomesCadastrados = nomesCadastrados;
    }
}
