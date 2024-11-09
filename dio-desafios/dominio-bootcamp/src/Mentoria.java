import java.time.LocalDate;

class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return 20; //Exemplo de XP fixo para uma mentoria
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{ " +
                " data = " + data +
                ", titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                '}';
    }
}
