public class Showroom {
    public static void main(String[] args) {
        Car car1 = Car.creatSingleObject("Maruti", "Alto", "CNG");
        Car car2 = Car.creatSingleObject("Mahindra", "Thar", "Petrol");
        Car car3 = Car.creatSingleObject("Honda", "City", "Diesel");

        System.out.println(car1.carName);
        System.out.println(car2.carName);
        System.out.println(car3.carName);
    }
}
