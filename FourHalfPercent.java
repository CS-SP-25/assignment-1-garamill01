public class FourHalfPercent implements SalesTaxBehavior{

    // Added new class for computing the 4.5% tax for Hawaii
    public double compute(double value) {
        return value * 0.045;
    }
}
