public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; //31

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // 1111

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; // 1111

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; // 1111

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);// 13

        System.out.println(concatenacao);


        int numero = 5;
        numero = - numero; // transforma o numero em negativo
        System.out.println(numero);

        numero = + numero; // nao funciona, o numero continua negativo

        numero = numero * -1; // transforma o numero em positivo novamente
        System.out.println(numero);

        int num = 4;
        System.out.println(num++);
        System.out.println(num);

        boolean val = true;
        System.out.println(!val);
        System.out.println(val);
        val = !val;
        System.out.println(val);


        

    }
}
