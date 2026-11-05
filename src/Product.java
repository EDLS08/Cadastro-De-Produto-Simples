public class Product {
    private String name;
    private Double price;
    private int quantity;


    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
    public Double calcularEstoque() {
        Double total = this.price * this.quantity;
        System.out.printf("Total em estoque : %.2f%n", total);
        return total; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
