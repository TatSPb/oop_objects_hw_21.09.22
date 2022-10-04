public class Car {
    String brand;
    String model;
    String color;
    int productionYear;
    String productionCountry;
    double engineVolume;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки " + productionCountry + ", цвет кузова " + color + ", " +
                "объем двигателя " + engineVolume + " литра.");
    }
}
   // Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7