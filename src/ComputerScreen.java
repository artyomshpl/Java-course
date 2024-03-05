public class ComputerScreen {
    private int screenDiagonal;
    private ScreenType screenType;
    private int screenWeight;

    public ComputerScreen(int screenDiagonal, ScreenType screenType, int screenWeight) {
        this.screenDiagonal = screenDiagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public int getScreenWeight() {
        return screenWeight;
    }

    public void setScreenWeight(int screenWeight) {
        this.screenWeight = screenWeight;
    }

    @Override
    public String toString() {
        return  "Диагональ экрана: " + screenDiagonal + "\n" +
                "Тип матрицы: " + screenType + "\n" +
                "Вес экрана: " + screenWeight + "\n";
    }
}
