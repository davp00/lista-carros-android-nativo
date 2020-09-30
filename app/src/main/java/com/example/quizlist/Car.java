package com.example.quizlist;

public class Car {

    private String model;
    private String brand;
    private String license;

    public Car(String model, String brand, String license) {
        this.model = model;
        this.brand = brand;
        this.license = license;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public boolean isNotEmpty()
    {
        return !this.model.isEmpty() && !this.brand.isEmpty() && !this.license.isEmpty();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}
