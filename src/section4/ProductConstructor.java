package section4;

public class ProductConstructor {
    private Long id;
    private String productName;
    private String suppliertName;

    public ProductConstructor() {

    }

    public ProductConstructor(Long id, String productName, String suppliertName) {

        this.id = id;
        this.productName = productName;
        this.suppliertName = suppliertName;
    }

    public Long getid() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getsupplierName() {
        return suppliertName;
    }

    void display(Long id, String productName, String suppliertName) {
        System.out.println("Product id is " + id);
        System.out.println("product Name is " + productName);
        System.out.println("supplier Name is " + suppliertName);
    }
}
