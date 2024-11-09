import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Bootcamp {
    private String nome;
    private String descricao;
    private List<Conteudo> conteudos = new ArrayList<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public void inscreverDev(Dev dev) {
        dev.inscreverBootcamp(this);
    }

    public void registrarProgresso(Dev dev) {
        dev.progredir();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
