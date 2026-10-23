public class Main {

    public static void main(String[] args) {

        Product Produto1 = new Product("Camiseta", 34.99, 45);
        Product Produto2 = new Product("Calça", 54.99, 12);

        System.out.println(Produto1.getQuantity());
        System.out.println(Produto2.getQuantity());

        Produto1.setQuantity(154);
        Produto2.setQuantity(34);

        System.out.println(Produto1.getQuantity());
        System.out.println(Produto2.getQuantity());

        System.out.println(Produto1.getName());
        Produto1.calcularEstoque();

        System.out.println(Produto2.getName());
        Produto2.calcularEstoque();
    }
}
