class Vehicle {
  int passengers; 
  int fuelcap;
  int mpg;
  int range() {
    return fuelcap * mpg;
  }

  double fuelNeeded (int miles) {
    return (double) miles / mpg;
  }
} 

/**
 * AddMeth
 */
class CompFuel {

  public static void main(String[] args) {
    Vehicle minivan = new Vehicle();
    Vehicle sportcar = new Vehicle();
    double gallons;
    int distance = 252;

    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;

    sportcar.passengers = 2;
    sportcar.fuelcap = 14;
    sportcar.mpg = 12;

    gallons = minivan.fuelNeeded(distance);

    System.out.println("Для поездки на расстояние " + distance + " минивену потребуется " + gallons + " галлонов топлива");
    
    gallons = sportcar.fuelNeeded(distance);

    System.out.println("Для поездки на расстояние " + distance + " спорткару потребуется " + gallons + " галлонов топлива");
  }
}