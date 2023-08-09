package letraA;

public class XPTOVeiculos {
    public static void main(String[] args) {

        Carro carro = new Carro("XPTO01", "Audi", "Preto",
                "RS6", 2022, 4, "Gasolina",
                2, 500.000f, true);

        carro.listar();
    }
}
