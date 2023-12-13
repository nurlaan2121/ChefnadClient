public enum Meel {
    BURGER(5.99),
    PIZZA(8.99),
    SALAD(6.49),
    PASTA(7.99);


    private final double price;

    Meel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
