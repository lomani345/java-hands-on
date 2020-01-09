package section7;

public class Product2 {
    private Long id;
    private String productName;
    private String supplierName;

    public Product2() {

    }

    public Product2(Long id, String productName, String supplierName) {
        super();
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Product2 [id=" + id + ", productName=" + productName + ", supplierName="
                + supplierName + "]";
    }

}
