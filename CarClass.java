/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carclass;

/**
 *
 * @author TTang2026
 */
public class CarClass {

    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.setCarBrand("Tesla Model 3");
        myCar.setMaxSpeed(163);
        myCar.setHorsePower(510);
        myCar.setPrice(55380);
        System.out.println(myCar);
        
        Car myCar2 = new Car();
        myCar2.setCarBrand("Tesla Roadster");
        myCar2.setMaxSpeed(250);
        myCar2.setHorsePower(288);
        myCar2.setPrice(250000);
        System.out.println(myCar2);
        
        Car myCar3 = new Car();
        myCar3.setCarBrand("Pagani Huayra R");
        myCar3.setMaxSpeed(241);
        myCar3.setHorsePower(838);
        myCar3.setPrice(3100000);
        System.out.println(myCar3);
        
    }
}
    
    class Car {
        
        private String brand = "";
        private double maxSpeed = 0;
        private int horsePower = 0;
        private double price = 0;
        
        public Car() {
            brand = "";
            maxSpeed = 0;
            horsePower = 0;
            price = 0;
        }
        
        public void setCarBrand(String inBrand) {
            brand = inBrand;
        }
        
        public String getCarBrand() {
            return brand;
        }
        
        public void setMaxSpeed (double inSpeed) {
            maxSpeed = inSpeed;
        }
        
        public double getMaxSpeed() {
            return maxSpeed;
        }
        
        public void setHorsePower(int inPower) {
            horsePower = inPower;
        }
        
        public int getHorsePower() {
            return horsePower;
        }
        
        public void setPrice(double inPrice) {
            price = inPrice;
        }
        
        public double getPrice() {
            return price;
        }
        
        public String toString() {
            String result = "";
            result = "Car Brand: " + brand + "\n" +
                     "Max Speed (in MPH): " + maxSpeed + "\n" +
                     "Engine Power (in Horse Power): " + horsePower + "\n" +
                     "Price (in $): " + price + "\n";
            return result;
        }
}


