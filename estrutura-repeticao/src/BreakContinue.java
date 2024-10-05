public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero<=5; numero++){
            if(numero == 3){
                break;// conta apenas até o 2
            }
            System.out.println(numero);
        }

        for(int numero = 1; numero<=5; numero++){
            if(numero == 3){
                continue; // pula o numero 3
            }
            System.out.println(numero);
        }
        
    }
}
