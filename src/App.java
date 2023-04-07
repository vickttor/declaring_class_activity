
// Car of choice: https://www.audi.com.br/br/web/pt/models/r8/r8-coupe-v10-performance-quattro.html

/**
 * Brand: Audi
 * Model: R8 - sports car model manufactured by the German automobile manufacturer Audi. 
 * maximum speed: 330 KM/H
 * aceleration: 0 to 100 KM/h in 3.2 seconds
 */

/** Main class */
public class App {
    public static void main(String[] args) throws Exception {
        
       Car audiR8 = new Car(330, "Audi R8 - sport car");

       // Initial State
       System.out.println("\n ===== Initial Car State ==== \n");

       System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 0;
       System.out.println("Max Velocity: " + audiR8.getMaxVelocity() + " KM/H"); // equal 330;
       System.out.println("Model : " + audiR8.getModel()); // equal "Audi R8 - sport car";

        audiR8.speedUp(45); // from 0 to 45 km/h
        audiR8.stop(15); // from 45 to 30 km/h
        audiR8.speedUp(120); // from 30 to 150 km/h

        System.out.println("\n ===== Car State after accelerate ==== \n");

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 150;
       
        System.out.println("\n ===== Car state after accelerating more than possible ==== \n");

        audiR8.speedUp(300); 
        // this will throw a message because 150 + 300 is higher than his maximum velocity.
        // The actual velocity will continues equal 150 km/h

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 150;

        System.out.println("\n ===== Car state after decelerating  ==== \n");

        audiR8.stop(70); // from 150 to 80 km/h;
        audiR8.stop(55); // from 70 to 25 km/h

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 25;

        System.out.println("\n ===== Car state after decelerating more than possible  ==== \n");

        audiR8.stop(50);
        // this will throw a message because 25 - 50 is a negative number (i32).
        // The actual velocity will continues equal 25 km/h

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 25;

        System.out.println("\n ===== Car state after switch off  ==== \n");

        audiR8.switchOff(); // success

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 0;

        audiR8.switchOff(); // It's already switched off. it'll throw a message.

        System.out.println("\n ===== Final Car State  ==== \n");

        System.out.println("Actual Velocity: " + audiR8.getActualVelocity() + " KM/H"); // equal 0;

    }
}
