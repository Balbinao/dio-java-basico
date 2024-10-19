package usuario;

import componentes.Iphone;


public class IphoneUsuario {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        celular.selecionarMusica("Deus é estrangeiro");
        celular.tocar();
        celular.pausar();

        // Testando Aparelho Telefônico
        
        celular.ligar("4002-8922");
        celular.atender();
        celular.iniciarCorreioVoz();

        // Testando celular na Internet
        
        celular.exibirPagina("www.blablabla.com");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }

}
