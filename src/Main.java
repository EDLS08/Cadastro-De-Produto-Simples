public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Camiseta", 34.99, 45);
        Product product2 = new Product("Calça", 54.99, 12);

        product1.setQuantity(154);
        product2.setQuantity(34);

        System.out.printf("%s: R$ %.2f%n", product1.getName(), product1.calculateStockValue());
        System.out.printf("%s: R$ %.2f%n", product2.getName(), product2.calculateStockValue());
    }
}
