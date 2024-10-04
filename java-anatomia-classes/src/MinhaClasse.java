public class MinhaClasse {
    
    public static void main(String[] args) {
        System.out.println("Aula da DIO");

        final String BR = "Brasil"; //final = a variavel nao pode ser alterada, por estar em letras maiusculas também ja é final
        String pNome = "Gustavo";
        String sNome = "Balbino";

        String nomeCompleto = nomeCompleto(pNome, sNome);
        System.out.println(nomeCompleto);
       
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
