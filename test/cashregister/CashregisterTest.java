package cashregister;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashregisterTest {

    MockPrinter mockPrinter;
    CashRegister cashRegister;

    @Before
    public void setUp() throws Exception {

        mockPrinter = new MockPrinter();
        cashRegister = new CashRegister(mockPrinter);
    }

    @Test
    public void shouldPrintEmptyStringWhenPurchaseIsNull() {

        cashRegister.process(null);

        assertEquals(mockPrinter.getPrintCalledCount(), 1);
        assertEquals(mockPrinter.getPrintCalledWith(), "");
    }

    @Test
    public void shouldPrintExpectStringWhichPurchaseGiven() {

        StubPurchase stubPurchase = new StubPurchase("expect");
        cashRegister.process(stubPurchase);

        assertEquals(mockPrinter.getPrintCalledCount(), 1);
        assertEquals(mockPrinter.getPrintCalledWith(), "expect");
    }
}
