package cashregister;

/**
 * Created by xyiwang on 3/18/16.
 */
public class MockPrinter extends Printer{
    private int printCalledCount = 0;
    private String printCalledWith = null;

    public int getPrintCalledCount() {
        return printCalledCount;
    }

    @Override
    public void print(String printThis) {
        this.printCalledWith = printThis;
        printCalledCount ++;
    }

    public String getPrintCalledWith() {
        return printCalledWith;
    }
}
