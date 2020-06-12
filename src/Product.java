public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String p_name, double p_price, String p_description, Category p_category) {
        name = p_name;
        price = p_price;
        description = p_description;
        category = p_category;
    }
}
