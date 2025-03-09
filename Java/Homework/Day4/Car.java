class Car {
    double gasInTank;
    double totalKmRun;
    double efficiency;

    void drive(double distance) {
        totalKmRun += distance;
        gasInTank -= distance / efficiency;
        System.out.println("Drove " + distance + " km.");
    }

    void loadGas(double liters) {
        gasInTank += liters;
        System.out.println("Loaded " + liters + " liters of gas.");
    }

    void changeEfficiency(double newEfficiency) {
        efficiency = newEfficiency;
        System.out.println("Efficiency changed to " + newEfficiency + " km/liter.");
    }

    void checkGas() {
        System.out.println("Gas in tank: " + gasInTank + " liters.");
    }

    void checkOdometer() {
        System.out.println("Total km run: " + totalKmRun + " km.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.loadGas(50);
        car.changeEfficiency(15);
        car.drive(150);
        car.checkGas();
        car.checkOdometer();
    }
}