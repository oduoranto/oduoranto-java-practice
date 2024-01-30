public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {

        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0) ? -1 : tonerLevel;
        this.printedPages = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 100 || tonerAmount < 0){
            return -1;
        }
        int total =tonerAmount + tonerLevel;
        if(total > 100 || total < -1){
            return -1;
        }else {
            return total;
        }
    }
    public int printedPages(int pages){
        int totalPrintedPages = duplex ? (pages *2) + (pages/2): printedPages;
        return totalPrintedPages;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
