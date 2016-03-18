package cashregister;

public class StubPurchase extends Purchase {

    private String expectString;

    public StubPurchase(Item[] items) {
        super(items);
    }

    public StubPurchase(String expectString) {
        super(null);
        this.expectString = expectString;
    }

    @Override
    public String asString(){
        return expectString;
    }
}
