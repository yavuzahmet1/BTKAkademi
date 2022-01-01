public class ProductManager {
    public void add(Product product) {
        //ProductValidator productValidator = new ProductValidator();
        //if (productValidator.isValid(product)) {
        if (ProductValidator.isValid(product)) {//ProductValidator sınıfının metodunu statik yaptık direk çağırdık
            System.out.println("Eklendi");
        } else {
            System.out.println("Ürün bilgileri geçersiz!!!");
        }
        ProductValidator productValidator = new ProductValidator();//newlediğimiz için yapıcı blok çalıştı.
        productValidator.bisey();
    }
}
