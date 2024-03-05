public class Computer {
    private ComputerProcessor computerProcessor;
    private ComputerRAM computerRAM;
    private ComputerHardDrive computerHardDrive;
    private ComputerScreen computerScreen;
    private ComputerKeyboard computerKeyboard;

    private static final String vendor = "Lenovo";
    private static final String name = "Y530";

    public Computer(ComputerProcessor computerProcessor, ComputerRAM computerRAM, ComputerHardDrive computerHardDrive, ComputerScreen computerScreen, ComputerKeyboard computerKeyboard) {
        this.computerProcessor = computerProcessor;
        this.computerRAM = computerRAM;
        this.computerHardDrive = computerHardDrive;
        this.computerScreen = computerScreen;
        this.computerKeyboard = computerKeyboard;
    }

    //Getters

    public ComputerProcessor getComputerProcessor() {
        return computerProcessor;
    }

    public ComputerRAM getComputerRAM() {
        return computerRAM;
    }

    public ComputerHardDrive getComputerHardDrive() {
        return computerHardDrive;
    }

    public ComputerScreen getComputerScreen() {
        return computerScreen;
    }

    public ComputerKeyboard getComputerKeyboard() {
        return computerKeyboard;
    }

    public static String getVendor() {
        return vendor;
    }

    public static String getName() {
        return name;
    }

    //Setters

    public void setComputerProcessor(ComputerProcessor computerProcessor) {
        this.computerProcessor = computerProcessor;
    }

    public void setComputerRAM(ComputerRAM computerRAM) {
        this.computerRAM = computerRAM;
    }

    public void setComputerHardDrive(ComputerHardDrive computerHardDrive) {
        this.computerHardDrive = computerHardDrive;
    }

    public void setComputerScreen(ComputerScreen computerScreen) {
        this.computerScreen = computerScreen;
    }

    public void setComputerKeyboard(ComputerKeyboard computerKeyboard) {
        this.computerKeyboard = computerKeyboard;
    }

    @Override
    public String toString() {
        return  "Процессор: " + "\n" + computerProcessor + "\n" +
                "Оперативная памаять: " + "\n" + computerRAM + "\n" +
                "Жесткий диск: " + "\n" + computerHardDrive + "\n" +
                "Экран: " + "\n" + computerScreen + "\n" +
                "Клавиатура: " + "\n" + computerKeyboard + "\n";
    }
}
