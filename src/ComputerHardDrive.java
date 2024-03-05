public class ComputerHardDrive{
    private TypeHDD typeHDD;
    private int hddCapacity;
    private int hddWeight;

    public ComputerHardDrive(TypeHDD typeHDD, int hddCapacity, int hddWeight) {
        this.typeHDD = typeHDD;
        this.hddCapacity = hddCapacity;
        this.hddWeight = hddWeight;
    }

    public TypeHDD getTypeHDD() {
        return typeHDD;
    }

    public void setTypeHDD(TypeHDD typeHDD) {
        this.typeHDD = typeHDD;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public int getHddWeight() {
        return hddWeight;
    }

    public void setHddWeight(int hddWeight) {
        this.hddWeight = hddWeight;
    }

    @Override
    public String toString() {
        return  "Тип жесткого диска: " + typeHDD + "\n" +
                "Объем: " + hddCapacity + "\n" +
                "Вес: " + hddWeight + "\n";
    }
}
