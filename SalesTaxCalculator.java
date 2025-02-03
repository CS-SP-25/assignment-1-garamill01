public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Initialize variables for state along with pre-tax and post-tax values
        State state = null;
        double value = Double.parseDouble(args[1]);

        // Switch statement for checking and declaring the state accordingly
        // Changed the switch statement to dynamically assign the tax behavior to the state after the
        // name of the state is identified
        boolean flag = switch (args[0]) {
            case "Alaska" -> {
                state = new Alaska();
                state.setSalesTaxBehavior(new NoTax());
                yield true;
            }
            case "Indiana" -> {
                state = new Indiana();
                state.setSalesTaxBehavior(new SevenPercent());
                yield true;
            }
            case "Hawaii" -> {
                state = new Hawaii();
                state.setSalesTaxBehavior(new FourHalfPercent());
                yield true;
            }
            default -> false;


        };

        // If statement so that the print statement only runs if the state variable has been declared Indiana or Alaska.
        if (flag) {
            System.out.printf("The sales tax on $%.2f in %s is $", value,args[0]);
            state.showTax(value);
            System.out.print(".");
        }

    }
}
