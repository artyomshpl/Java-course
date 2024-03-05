public class ComputerRAM {
    private TypeRAM typeRAM;
    private int volumeRAM;
    private int weight;

    public ComputerRAM(TypeRAM typeRAM, int volumeRAM, int weight) {
        this.typeRAM = typeRAM;
        this.volumeRAM = volumeRAM;
        this.weight = weight;
    }

    //Getters

    public TypeRAM getTypeRAM() {
        return typeRAM;
    }

    public void setTypeRAM(TypeRAM typeRAM) {
        this.typeRAM = typeRAM;
    }

    public int getVolumeRAM() {
        return volumeRAM;
    }

    //Setters

    public void setVolumeRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Тип оперативной памяти: " + typeRAM + "\n" +
                "Объем: " + volumeRAM + "\n" +
                "Вес: " + weight + "\n";
    }
}
