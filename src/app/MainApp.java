public class MainApp {

    public static void main (String[] args) {

        int orderNumber = 1;
        String product = "smartphone";
        int salesDay = 5;
        double costOneProduct = 220.971090909;
        int soldUnitsDay = 11;
        double salesOneDay = soldUnitsDay * costOneProduct;
        double salesAllDay = salesDay * salesOneDay;
        System.out.printf("Product № %d: %s,\n" +
               "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n" , orderNumber, product, salesDay, salesAllDay, salesOneDay);
        orderNumber = 2;
        product = "laptop";
        salesDay = 7;
        costOneProduct = 374.53035;
        soldUnitsDay = 4;
        salesOneDay = soldUnitsDay * costOneProduct;
        salesAllDay = salesDay * salesOneDay;
        System.out.printf("Product № %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n" , orderNumber, product, salesDay, salesAllDay, salesOneDay);

    }
}
