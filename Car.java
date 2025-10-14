public class Car {
    // Class members or instance variables
    String brandName;
    String carName;
    String _fuelType;
    static Car obj = null;

    // constructor
    private Car(String brandname, String carName, String fuelType) {
        brandName = brandname;
        this.carName = carName;
        _fuelType = fuelType;
    }

    static Car creatSingleObject(String brandname, String carName, String fuelType) {
        if(obj == null){
            obj = new Car(brandname, carName, fuelType);
        }
        return obj;
    }
}
