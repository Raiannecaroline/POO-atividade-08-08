public class FaculdadeXPTO {

    public static void main(String[] args) {

        Professor professor = new Professor("Cleber", "Pesquisador", "Análise em Desenvolvimento de Sistemas",
                160, 10000);

        professor.listarDados();
        professor.alterar();
        professor.cadastrar();

    }
}
