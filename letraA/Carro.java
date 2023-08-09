package letraA;

public class Carro {

    private String codigo;
    public String marca;
    public String cor;
    public String modelo;
    public int anoFabricacao;
    public int numeroPortas;
    private String tipoCombustivel;
    private int quantidadeDisponivel;
    private float preco;
    private boolean completoOuBasico;

    public Carro(String codigo, String marca, String cor, String modelo, int anoFabricacao,
                 int numeroPortas, String tipoCombustivel, int quantidadeDisponivel,
                 float preco, boolean completoOuBasico) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completoOuBasico = completoOuBasico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isCompletoOuBasico() {
        return completoOuBasico;
    }

    public void setCompletoOuBasico(boolean completoOuBasico) {
        this.completoOuBasico = completoOuBasico;
    }

    public void alterar() {
        setMarca("Audi");
        setCor("Azul");
        setModelo("RS6");
        setAnoFabricacao(2023);
        setNumeroPortas(4);
        setTipoCombustivel("Elétrico");
        setQuantidadeDisponivel(5);
        setPreco(1.0000f);
        setCompletoOuBasico(true);
    }

    public void listar() {
        System.out.println("O código do carro: " + this.getCodigo());
        System.out.println("O carro é da marca " + this.getMarca());
        System.out.println("O cor do carro é " + this.getCor());
        System.out.println("O modelo do carro é " + this.getModelo());
        System.out.println("O ano de fabricação do veículo é " + this.getAnoFabricacao());
        System.out.println("O " + this.getMarca() + " tem " + this.getNumeroPortas() + " portas");
        System.out.println("O tipo de combustivel é " + this.getTipoCombustivel());
        System.out.println("Na loja tem cerca de " + this.getQuantidadeDisponivel() + " automóveis");
        System.out.println("O preço do carro é R$:" + this.getPreco() + " reais");
        System.out.println("O veículo é completo? " + this.isCompletoOuBasico());
    }

}
