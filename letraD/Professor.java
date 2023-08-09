import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String nome;

    public String titulacao;

    public String formacao;

    public int cargaHoraria;

    private float salario;

    private List<String> disciplinasEnsinadas;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria,
                     float salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinasEnsinadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public List<String> getDisciplinasEnsinadas() {
        return disciplinasEnsinadas;
    }

    public void setDisciplinasEnsinadas(List<String> disciplinasEnsinadas) {
        this.disciplinasEnsinadas = disciplinasEnsinadas;
    }

    public void cadastrar() {
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void alterar() {
        System.out.println("Professor alterado com sucesso!");
    }

    public void alterarDescricaoDisciplinaEnsinada(String disciplina, String novaDescricao) {
        this.disciplinasEnsinadas.set(this.disciplinasEnsinadas.indexOf(disciplina), novaDescricao);
        System.out.println("Descrição da disciplina " + disciplina + " alterada para " + novaDescricao);
    }

    public void listarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Titulação: " + this.getTitulacao());
        System.out.println("Formação: " + this.getFormacao());
        System.out.println("Carga horária: " + this.getCargaHoraria());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Disciplinas ensinadas: " + this.getDisciplinasEnsinadas());
    }
}
