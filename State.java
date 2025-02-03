public abstract class State {

    private String name;
    private SalesTaxBehavior salesTaxBehavior;

    public State() {}

    // Added dynamic setters and getters for private variables of a State object
    public void showTax(double value) {
        System.out.printf("%.2f", salesTaxBehavior.compute(value));
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public SalesTaxBehavior getSalesTaxBehavior() {
        return salesTaxBehavior;
    }

    public void setSalesTaxBehavior(SalesTaxBehavior newSalesTaxBehavior) {
        salesTaxBehavior = newSalesTaxBehavior;
    }

}
