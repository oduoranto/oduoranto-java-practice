public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else if (tonerLevel <= 0){
            this.tonerLevel = -1;
        }else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
}
