package src.com.javaForBeginners.chapter4;
class Vehicle {
  int passengers; 
  int fuelcap;
  int mpg;

  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
  }

  int range() {
    return fuelcap * mpg;
  }

  double fuelNeeded (int miles) {
    return (double) miles / mpg;
  }
} 

class VehConsDemo {

  public static void main(String[] args) {
    Vehicle minivan = new Vehicle(7, 16, 21);
    Vehicle sportcar = new Vehicle(2, 14, 12);
    double gallons;
    int distance = 252;

    gallons = minivan.fuelNeeded(distance);

    System.out.println("Для поездки на расстояние " + distance + " минивену потребуется " + gallons + " галлонов топлива");
    
    gallons = sportcar.fuelNeeded(distance);

    System.out.println("Для поездки на расстояние " + distance + " спорткару потребуется " + gallons + " галлонов топлива");
  }
}