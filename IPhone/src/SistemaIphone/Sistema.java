/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaIphone;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

/**
 *
 * @author kevin
 */
public class Sistema implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void Atender() {
        System.out.println("Aceitar ligação");
    }

    @Override
    public void Liga() {
        System.out.println("Telefone ligado");
    }
    
    @Override
    public void Desligar(){
        System.out.println("Telefone desligado");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Adicionado uma nova aba");
    }

    @Override
    public void ExibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void Tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void Pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void SelecionarMusica(String nome) {
        System.out.println("Música "+nome+" selecionada");
    }

}
