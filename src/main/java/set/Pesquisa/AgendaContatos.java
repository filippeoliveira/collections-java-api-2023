package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato>contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome (String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("camila", 12345678);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila Dio",9999999);
        agendaContatos.adicionarContato("Maria Silva",11111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva",555555555));

    }

    }

