public class ContaPoupanca {

    public String nomeCorretista;

    private String rg;

    private String cpf;

    public float saldo;

    private int numeroConta;

    private int agenciaConta;

    public ContaPoupanca(String nomeCorretista, String rg, String cpf,
                         float saldo, int numeroConta, int agenciaConta) {
        this.nomeCorretista = nomeCorretista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
    }

    public String getNomeCorretista() {
        return nomeCorretista;
    }

    public void setNomeCorretista(String nomeCorretista) {
        this.nomeCorretista = nomeCorretista;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(int agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public void listar() {

        System.out.println("Nome: " + this.getNomeCorretista());
        System.out.println("Seu saldo é " + this.getSaldo());
        System.out.println("Número conta: " + this.getNumeroConta());
        System.out.println("Agência: " + this.getAgenciaConta());

    }

    public void alterar(float saldo) {
        setSaldo(1000);
    }


}
