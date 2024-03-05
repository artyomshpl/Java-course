public class Main {
    public static void main(String[] args) {
        ComputerHardDrive hdd = new ComputerHardDrive(TypeHDD.HDD, 500, 350);
        ComputerKeyboard keyboard = new ComputerKeyboard(KeyboardType.MECHANICAL, KeyboardBacklight.NO, 500);
        ComputerRAM RAM = new ComputerRAM(TypeRAM.DDR4,16, 200);
        ComputerScreen screen = new ComputerScreen(16, ScreenType.IPS, 440);
        ComputerProcessor processor = new ComputerProcessor(ProcessorFrequency.FREQUENCY_1GHz, ProcessorNumberOfCores.QUAD_CORE, ProcessorManufacturer.INTEL, 100);

        Computer computer = new Computer(processor, RAM, hdd, screen, keyboard);

        System.out.println("Проиводитель ПК: " + Computer.getVendor());
        System.out.println("Модель: " + Computer.getName() + "\n");

        System.out.print(computer);

        System.out.println("Общий вес компонентов пк: "
                + calculateWholeWeight(hdd.getHddWeight(),
                keyboard.getKeyboardWeight(),
                RAM.getWeight(),
                screen.getScreenWeight(),
                processor.getProcessorWeight()));
    }

    public static int calculateWholeWeight(int hddWeight,
                                           int keyboardWeight,
                                           int weightRAM,
                                           int screenWeight,
                                           int processorWeight){
        return hddWeight + keyboardWeight + weightRAM + screenWeight + processorWeight;
    }
}