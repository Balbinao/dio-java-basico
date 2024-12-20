import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
* Representa uma operação que combina dois argumentos do tipo T e retorna os resultados do mesmo tipo T
* É usada para realizar operações de redução em pares de elementos, como achar números ou combinar objetos.
* */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

//        int resultado = numeros.stream()
//                .reduce(0, somar);

        //outra forma
        int resultado = numeros.stream()
//              .reduce(0, (n1,  n2) -> n1 + n2)
                .reduce(0, Integer::sum);


        System.out.println("O a soma dos numeros é: " + resultado);

    }
}
