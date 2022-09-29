public class Principal {
    public static void main(String[] args) {
        Vendedores v1 = new Vendedores(10,5000);

        v1.calculaSalarioBase();
        v1.calculaComissao();

        v1.exibirDetalhes();
    }
}
