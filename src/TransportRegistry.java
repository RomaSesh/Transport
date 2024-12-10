import java.util.ArrayList;
import java.util.List;
//Класс для управления реестром транспортных средств.
public class TransportRegistry {
    private List<Car> carRegistry = new ArrayList<>();
    private List<Airplane> airplaneRegistry = new ArrayList<>();

    //Метод для добавления автомобиля в реестр.
    public void addCar(Car car) {
        carRegistry.add(car);
    }

    //Метод для добавления самолета в реестр.
    public void addAirplane(Airplane airplane) {
        airplaneRegistry.add(airplane);
    }

    //Метод для поиска автомобиля по номеру.
    public Car findCar(String number) {
        for (Car car : carRegistry) {
            if (car.number.equals(number)) {
                return car;
            }
        }
        return null; // Not found
    }

    //Метод для подсчета налога с регистрации всех автомобилей.
    public double calculateCarRegistrationTax() {
        double totalTax = 0;
        for (Car car : carRegistry) {
            totalTax += car.getCost() * 0.05;
        }
        return totalTax;
    }

    //Метод для проверки, прошел ли техосмотр владелец самой дорогой машины.
    public boolean hasTechnicalInspectionPassedForMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : carRegistry) {
            if (mostExpensiveCar == null || car.getCost() > mostExpensiveCar.getCost()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar != null && mostExpensiveCar.isTechnicalInspectionPassed();
    }

    public Airplane findAirplane(String number) {
        for (Airplane airplane : airplaneRegistry) {
            if (airplane.number.equals(number)) {
                return airplane;
            }
        }
        return null; // Not found
    }

    //Метод для подсчета налога с регистрации всех самолетов.
    public double calculateAirplaneRegistrationTax() {
        double totalTax = 0;
        for (Airplane airplane : airplaneRegistry) {
            totalTax += airplane.getCost() * 0.03;
        }
        return totalTax;
    }
    //Метод для получения самого дорогого самолета.
    public Airplane getMostExpensiveAirplane() {
        Airplane mostExpensiveAirplane = null;
        for (Airplane airplane : airplaneRegistry) {
            if (mostExpensiveAirplane == null || airplane.getCost() > mostExpensiveAirplane.getCost()) {
                mostExpensiveAirplane = airplane;
            }
        }
        return mostExpensiveAirplane;
    }

    //Метод для отображения информации обо всех транспортных средствах.
    public void displayAllTransport() {
        for (Car car : carRegistry) {
            car.displayInfo();
        }
        for (Airplane airplane : airplaneRegistry) {
            airplane.displayInfo();
        }
    }

    //Главный метод программы. Создает реестр и добавляет транспортные средства.
    public static void main(String[] args) {
        TransportRegistry registry = new TransportRegistry();

        // Создание объектов автомобилей и самолетов
        Car car1 = new Car(150, 20000, "A123BC", "Toyota", 30000, true);
        Car car2 = new Car(120, 15000, "B456CD", "Ford", 25000, false);
        Airplane airplane1 = new Airplane(1000, 500000, "P123AB", "Boeing", 10000);
        Airplane airplane2 = new Airplane(1200, 600000, "P456CD", "Airbus", 12000);

        // Добавление автомобилей и самолетов в реестр
        registry.addCar(car1);
        registry.addCar(car2);
        registry.addAirplane(airplane1);
        registry.addAirplane(airplane2);

        // Поиск стоимости и пробега для заданного автомобиля
        Car foundCar = registry.findCar("A123BC");
        if (foundCar != null) {
            System.out.println("Found Car: Cost = " + foundCar.getCost() + ", Mileage = " + foundCar.getMileage());
        }

        // Подсчитать налог с регистрации всех машин
        double carTax = registry.calculateCarRegistrationTax();
        System.out.println("Total Car Registration Tax: " + carTax);

        // Выяснить, прошел ли техосмотр владелец самой дорогой машины
        boolean techInspectionPassed = registry.hasTechnicalInspectionPassedForMostExpensiveCar();
        System.out.println("Technical Inspection Passed for Most Expensive Car: " + techInspectionPassed);

        // Найти мощность и максимальную высоту полета для заданного самолета
        Airplane foundAirplane = registry.findAirplane("P123AB");
        if (foundAirplane != null) {
            System.out.println("Found Airplane: Power = " + foundAirplane.power + ", Max Flight Height = " + foundAirplane.getMaxFlightHeight());
        }

        // Подсчитать налог с регистрации всех самолетов
        double airplaneTax = registry.calculateAirplaneRegistrationTax();
        System.out.println("Total Airplane Registration Tax: " + airplaneTax);

        // Определить мощность, стоимость и марку самого дорогого самолета
        Airplane mostExpensiveAirplane = registry.getMostExpensiveAirplane();
        if (mostExpensiveAirplane != null) {
            System.out.println("Most Expensive Airplane: Brand = " + mostExpensiveAirplane.brand +
                    ", Power = " + mostExpensiveAirplane.power +
                    ", Cost = " + mostExpensiveAirplane.getCost());
        }

        // Получить полную информацию обо всех автомобилях и самолетах
        registry.displayAllTransport();
    }
}
