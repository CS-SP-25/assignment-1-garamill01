public class NoTax implements SalesTaxBehavior{

    public double compute(double value) {
        return value * 0;
    }

}
