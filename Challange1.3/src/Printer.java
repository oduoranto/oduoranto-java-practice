public class Printer {
    public int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else if (tonerLevel <= 0){
            this.tonerLevel = 0;
        }else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
         int total = tonerLevel + tonerAmount;
        if(total > 100){
            return 100;
        }else if(total < 0){
            return -1;
        }else {
            return total;
        }

    }
    public int printPages(int pages){
        if(duplex == true){
            pagesPrinted += (pages / 2)+ (pages % 2);
            return pagesPrinted;
        }else {
            return pagesPrinted;
        }

    }
}
