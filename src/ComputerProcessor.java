public class ComputerProcessor {
    private ProcessorFrequency processorFrequency;
    private ProcessorNumberOfCores processorNumberOfCores;
    private ProcessorManufacturer processorManufacturer;
    private int processorWeight;

    public ComputerProcessor(ProcessorFrequency processorFrequency, ProcessorNumberOfCores processorNumberOfCores, ProcessorManufacturer processorManufacturer, int processorWeight) {
        this.processorFrequency = processorFrequency;
        this.processorNumberOfCores = processorNumberOfCores;
        this.processorManufacturer = processorManufacturer;
        this.processorWeight = processorWeight;
    }


    public ProcessorFrequency getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(ProcessorFrequency processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public ProcessorNumberOfCores getProcessorNumberOfCores() {
        return processorNumberOfCores;
    }

    public void setProcessorNumberOfCores(ProcessorNumberOfCores processorNumberOfCores) {
        this.processorNumberOfCores = processorNumberOfCores;
    }

    public ProcessorManufacturer getProcessorManufacturer() {
        return processorManufacturer;
    }

    public void setProcessorManufacturer(ProcessorManufacturer processorManufacturer) {
        this.processorManufacturer = processorManufacturer;
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

    public void setProcessorWeight(int processorWeight) {
        this.processorWeight = processorWeight;
    }

    @Override
    public String toString() {
        return  "Частота процессора: " + processorFrequency + "\n" +
                "Количество ядер: " + processorNumberOfCores + "\n" +
                "Производитель: " + processorManufacturer + "\n" +
                "Вес: " + processorWeight + "\n";
    }
}
