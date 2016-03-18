package cashregister;

class CashRegister {

    private Printer printer;

    public CashRegister(Printer printer) {

        this.printer = printer;
    }

    public void process(Purchase purchase) {

        //throw new UnsupportedOperationException("Not Implemented");
        printer.print(purchase != null ? purchase.asString() : "");
    }
}
