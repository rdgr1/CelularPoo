package org.iphone;

import org.iphone.functions.AparelhoTelefonico;
import org.iphone.functions.NavegadorInternet;
import org.iphone.functions.ReprodutorMusical;

public class IPhone implements NavegadorInternet,AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando..");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a ..");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Musica...");
    }
}

