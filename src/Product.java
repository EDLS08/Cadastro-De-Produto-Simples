public class Product {
    private String name;
    private Double price;
    private int quantity;

    // Construtor corrigido (fechando as chaves corretamente)
    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } // <-- O construtor termina aqui!

    // Método corrigido (fora do construtor e usando os atributos da própria classe)
    public Double calcularEstoque() {
        Double total = this.price * this.quantity;
        System.out.printf("Total em estoque : %.2f%n", total);
        return total; // Como o método é Double, ele precisa retornar o valor
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
