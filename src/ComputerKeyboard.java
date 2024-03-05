public class ComputerKeyboard {
    private KeyboardType keyboardType;
    private KeyboardBacklight keyboardBacklight;
    private int keyboardWeight;

    public ComputerKeyboard(KeyboardType keyboardType, KeyboardBacklight keyboardBacklight, int keyboardWeight) {
        this.keyboardType = keyboardType;
        this.keyboardBacklight = keyboardBacklight;
        this.keyboardWeight = keyboardWeight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public KeyboardBacklight getKeyboardBacklight() {
        return keyboardBacklight;
    }

    public void setKeyboardBacklight(KeyboardBacklight keyboardBacklight) {
        this.keyboardBacklight = keyboardBacklight;
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }

    public void setKeyboardWeight(int keyboardWeight) {
        this.keyboardWeight = keyboardWeight;
    }

    @Override
    public String toString() {
        return  "Тип клавиатуры: " + keyboardType + "\n" +
                "Подсветка: " + keyboardBacklight + "\n" +
                "Вес: " + keyboardWeight + "\n";
    }
}
