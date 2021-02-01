public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("Rex",3,"husky","Texas");
//        System.out.println("Hello World");
        System.out.println("Pet's name is " +pet.getPetName() + " it is " + pet.getPetAge() + " years old and is a " + pet.getPetType());

        JavaPlus.Car car = new JavaPlus.Car("Lexus", "SUV", 2018);
        System.out.println("\n"+"Your car is a "+car.getCarBrand()+" looks like from "+car.getCarYear()+" a good "+car.getCarType());
        if (car.getCarYear() > 2015) {
            System.out.println("...and relatively still new.");
        }
        else {
            System.out.println("...so, are you in the market for a new car yet?");
        }
    }
}
