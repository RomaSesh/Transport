//Класс, представляющий автомобиль. Наследуется от класса Transport.
public class Car extends Transport {
    private double mileage;
    private boolean technicalInspectionPassed;

    public Car(double power, double cost, String number, String brand, double mileage, boolean technicalInspectionPassed) {
        super(power, cost, number, brand);
        this.mileage = mileage;
        this.technicalInspectionPassed = technicalInspectionPassed;
    }
    //Конструктор класса Car.
    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + ", Number: " + number + ", Power: " + power +
                ", Cost: " + cost + ", Mileage: " + mileage +
                ", Technical Inspection Passed: " + technicalInspectionPassed);
    }

    //Метод для получения пробега автомобиля.
    public double getMileage() {
        return mileage;
    }

    //Метод для проверки, прошел ли техосмотр.
    public boolean isTechnicalInspectionPassed() {
        return technicalInspectionPassed;
    }
}
