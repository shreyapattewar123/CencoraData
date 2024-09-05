package com.test.innerbean;

public class InvoiceGenerator {
    private Product product;
    public InvoiceGenerator(Product product){
        this.product= product;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public void generateInvoice(){
        System.out.println("geneated the product" + product);
    }
}
