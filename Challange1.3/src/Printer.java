public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else if (tonerLevel <= 0){
            this.tonerLevel = 0;
        }else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
         tonerLevel += tonerAmount;
        if(tonerLevel > 100){
            return 100;
        }else if(tonerLevel < 0){
            return -1;
        }else {
            return tonerLevel;
        }

    }
    public int printPages(int pages){
        if(duplex == true){
            pagesPrinted += (pages * 2);
            return pagesPrinted;
        }else {
            return pagesPrinted;
        }

    }
}
