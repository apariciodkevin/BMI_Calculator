import java.util.Scanner;

/* I ended up using Person as class name as it helped me relate it to
the application of this a lot more and also because i didn't want to have too much
"bmi" written on my code.
 */


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Ask user for Imperial system or metric system
        System.out.println("Type 1 for Imperial or 2 for Metric System: ");

        //Validate user input
        int userChoice = sc.nextInt();
        while (userChoice < 1 || userChoice > 2){
            System.out.println("Sorry wrong Input!");
            System.out.println("Enter ! or 2: ");
            userChoice = sc.nextInt();
        }

        if (userChoice == 1){
            // Create object for person using imperial system
            Person obj = new Person();

            System.out.println("Enter your weight in pounds: ");
            obj.setWeightLb(sc.nextDouble()); // Set user input as the weight

            System.out.println("Enter your height in feet: ");
            obj.setHeightFt(sc.nextDouble());

            // Set BMI
            obj.setBodyMassIndex1(obj.getHeightFt(), obj.getWeightLb());

            // Validate Results
            obj.getResultUs();
        } else {
            Person obj2 = new Person();

            System.out.println("Enter your weight in kilograms: ");
            obj2.setWeightKg(sc.nextDouble());

            System.out.println("Enter your height in meters: ");
            obj2.setHeightMeters(sc.nextDouble());

            // Set BMI2
            obj2.setBodyMassIndex2(obj2.getHeightMeters(), obj2.getWeightKg());

            obj2.getResultsWorld();
        }
        sc.close();
    }
}