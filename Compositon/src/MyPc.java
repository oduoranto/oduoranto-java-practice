public class MyPc extends Product{
    private Monitor monitor;
    private ComputerCase computercase;
    private MotherBoard motherBoard;



    public MyPc(String model, String manufacture) {
        super(model, manufacture);
    }

    public MyPc(String model, String manufacture, Monitor monitor,
                ComputerCase computercase, MotherBoard motherBoard) {
        super(model, manufacture);
        this.monitor = monitor;
        this.computercase = computercase;
        this.motherBoard = motherBoard;
    }

    private void drawlogo(){
        monitor.drawpixelAt(7,78,"yellow");
    }
    public void powerUp(){
        drawlogo();
        computercase.pressPowerbutton();
    }
}
