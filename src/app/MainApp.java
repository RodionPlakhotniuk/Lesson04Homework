public class MainApp {

    public static void main (String[] args) {

        int orderNumber = 1;
        String product = "smartphone";
        int day = 5;
        double salesPerDay = 12153.41 / 5;
        double totalSales = salesPerDay * day;


        System.out.printf("Product № %d: %s,\n" +
               "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n" , orderNumber, product, day, totalSales, salesPerDay);
        orderNumber = 2;
        product = "laptop";
        day = 7;
        salesPerDay = 10486.85 / 7;
        totalSales = salesPerDay * day;
        System.out.printf("Product № %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n" , orderNumber, product, day, totalSales, salesPerDay);

    }
}
