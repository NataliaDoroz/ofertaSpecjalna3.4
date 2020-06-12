public class Test {
    public static void main(String[] args) {
        Category category1 = new Category("słodycze", "coś słodkiego");
        Category category2 = new Category("mrożonki", "mrożone owoce i warzywa");
        Product product1 = new Product("Czekolada Mleczna", 5, "Wawel, 1 tabliczka", category1);
        Product product2 = new Product("Batonik Michałek", 3, "czekoladowy batonik ", category1);
        Product product3 = new Product("Truskawki ", 5, "mrożone 300g, bio", category2);
        Product product4 = new Product("Okno", 500, "białe, plastikowe", null);

        SpecialOffer specialOffer1 = new SpecialOffer(product1, "Wielka promocja",
                "10.06", "20.06", 0.2);

        System.out.println("Produkt1: " + product1.name + "\t Cena: " + product1.price + "zł\t Opis: " + product1.description +
                "\t Kategoria: " + product1.category.name + "\t  Opis kategorii: " + product1.category.description);
        System.out.println("Produkt2: " + product2.name + "\t Cena: " + product2.price + "zł\t Opis: " + product2.description +
                "\t Kategoria: " + product2.category.name + "\t  Opis kategorii: " + product2.category.description);
        System.out.println("Produkt3: " + product3.name + "\t Cena: " + product3.price + "zł\t Opis: " + product3.description +
                "\t Kategoria: " + product3.category.name + "\t  Opis kategorii: " + product3.category.description);
        System.out.println("Produkt4: " + product4.name + "\t Cena: " + product4.price + "zł\t Opis: " + product4.description);

        double discountDiscount = specialOffer1.discount * product1.price;
        System.out.println(specialOffer1.product.name + " \t" + specialOffer1.offer + " od " + specialOffer1.timeFrom + " do " + specialOffer1.timeTo +
                " \t Jedyne: " + (product1.price - discountDiscount) + "zł!!!");
    }
}
