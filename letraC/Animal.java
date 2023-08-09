
public class Animal {

    private String especie;

    private String dataNascimento;

    public String nome;

    protected int numeroRegistro;

    private String localNascimento;

    public Animal(String especie, String dataNascimento,
                  String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public void listar() {
        System.out.println("Espécie: " + this.getEspecie());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número de Registro: " + this.getNumeroRegistro());
        System.out.println("Local de Nascimento: " + this.getLocalNascimento());
    }

    //Quando quiser alterar
    private void alterar() {
        setNome("Pantera Negra");
        setEspecie("Felino");
        setDataNascimento("22/09/2015");
        setLocalNascimento("Pantanal - Brasil");
        setNumeroRegistro(30);
    }

}
