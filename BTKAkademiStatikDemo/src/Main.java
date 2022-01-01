public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mause";
        productManager.add(product);
        DatabaseHelper.Crud.Delete();

    }
}
