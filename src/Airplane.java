//Класс, представляющий самолет. Наследуется от класса Transport.
public class Airplane extends Transport {
    private double maxFlightHeight;// Максимальная высота полета
    /**
     * Конструктор класса Airplane.
     *
     * @param power Мощность самолета
     * @param cost Стоимость самолета
     * @param number Номер самолета
     * @param brand Марка самолета
     * @param maxFlightHeight Максимальная высота полета
     */
    public Airplane(double power, double cost, String number, String brand, double maxFlightHeight) {
        super(power, cost, number, brand);
        this.maxFlightHeight = maxFlightHeight;
    }

    //Метод для отображения информации о самолете.
    @Override
    public void displayInfo() {
        System.out.println("Airplane: " + brand + ", Number: " + number + ", Power: " + power +
                ", Cost: " + cost + ", Max Flight Height: " + maxFlightHeight);
    }

    //Метод для получения максимальной высоты полета.
    public double getMaxFlightHeight() {
        return maxFlightHeight;
    }
}