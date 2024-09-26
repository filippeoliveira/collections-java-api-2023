package main.java.list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }


    public void public void adcionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
public List<Pessoa> ordenarPorAltura(){
    List<Pessoa>pessoaPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;

    }

}
