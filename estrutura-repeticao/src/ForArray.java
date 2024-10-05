public class ForArray{
    public static void main(String[] args) {
        String alunos[] = {"Gustavo", "Davi", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é o(a) " + alunos[x]);
        }

        //forma abreviada
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}