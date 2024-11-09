class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return cargaHoraria * 10; // Exemplo de cálculo de XP para um curso
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria = " + cargaHoraria +
                ", titulo = '" + titulo + '\'' +
                ", descrica o= '" + descricao + '\'' +
                '}';
    }
}
