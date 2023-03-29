
import java.util.ArrayList;
import java.util.List;
public class SalesAnalysis {
    private static final String[] PRODUCTS = {"Tea", "Coffee", "GreenTea"};
    private static final double[] SALES_2021 = {100.0, 129.0, 140.0};
    private static final double[] SALES_2022 = {120.0, 234.0, 168.0};

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < PRODUCTS.length; i++) {
            products.add(new Product(PRODUCTS[i], SALES_2021[i], SALES_2022[i]));
        }

        System.out.println("Product\t\tSales2021\tSales2022\tVariance\tVariancePct\tTotal");
        for (Product p : products) {
            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%%\t\t%.2f\n",
                    p.name, p.sales2021, p.sales2022, p.variance(), p.variancePct(), p.total());
        }
    }
    static class Product {
        private final String name;
        private final double sales2021;
        private final double sales2022;

        Product(String name, double sales2021, double sales2022) {
            this.name = name;
            this.sales2021 = sales2021;
            this.sales2022 = sales2022;
        }

        double variance() {
            return sales2022 - sales2021;
        }

        double variancePct() {
            return (sales2022 - sales2021) / sales2021 * 100;
        }

        double total() {
            return sales2021 + sales2022;
        }
    }
}
            
                

output:
Product         Sales2021       Sales2022       Variance        VariancePct     Total
Tea             100.00          120.00          20.00           20.00%          220.00
Coffee          129.00          234.00          105.00          81.40%          363.00
GreenTea                140.00          168.00          28.00           20.00%          308.00





