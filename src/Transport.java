//Абстрактный класс, представляющий общий интерфейс для всех транспортных средств.
public abstract class Transport {
    protected double power;// Мощность транспортного средства
    protected double cost;// Стоимость транспортного средства
    protected String number;// Номер транспортного средства
    protected String brand;// Марка транспортного средства

    //Конструктор класса Transport.
    public Transport(double power, double cost, String number, String brand) {
        this.power = power;//Мощность транспортного средства
        this.cost = cost;//Стоимость транспортного средства
        this.number = number;//Номер транспортного средства
        this.brand = brand;//Марка транспортного средства
    }

    //Абстрактный метод для отображения информации о транспортном средстве.
    public abstract void displayInfo();

    public double getCost() {
        return cost;
    }
}