package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        System.out.println("Processo seletivo!");
        String [] candidatos = {"Marcelo", "Julia", "Julio", "Raphinha", "Igor"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            //Elas precisarão sofrer alterções
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso.");
            }


        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contatos com " + candidato + " na "+ tentativasRealizadas +" tentativa");

        }else{
            System.out.println("Não conseguimos contato com "+ candidato +", número maximo de tentativas "+ tentativasRealizadas+ " realizadas");
        }
    }
    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Marcelo", "Julia", "Julio", "Raphinha", "Igor"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for(int i = 0; i<candidatos.length; i++){
            System.out.println("O candidato de numero "+ (i+1) +" é "+candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Marcelo", "Julia", "Julio", "Raphinha", "Igor", "Monica", "Luana", "Agnes", "Gerson", "Bianca"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("\nO candidato " + candidato + " solicitou este valor de salário R$"+ salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}