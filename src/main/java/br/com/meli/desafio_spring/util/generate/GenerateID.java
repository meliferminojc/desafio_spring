package br.com.meli.desafio_spring.util.generate;

public class GenerateID {

    private static Integer idCustomer = 1;
    private static Integer idSeller = 1;
    private static Integer idProduct = 1;
    private static Integer idCategory = 1;
    private static Integer idPost = 1;
    private static Integer idPromoPost = 1;

    public static Integer ToCusomer() {
        return idCustomer++;
    }

    public static Integer ToSeller() {
        return idSeller++;
    }

    public static Integer ToProduct() {
        return idProduct++;
    }

    public static Integer ToCategory() {
        return idCategory++;
    }

    public static Integer ToPost() {
        return idPost++;
    }

    public static Integer ToPromoPost() { return idPromoPost++; }

}
