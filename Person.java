public class Person {

    double weightLb;
    double weightKg;
    double heightFt;
    double heightMeters;
    double bmi1; // Imperial
    double bmi2; // Metrics System

    public void setWeightLb (double weightLb){
        this.weightLb = weightLb;
    }
    public double getWeightLb (){
        return weightLb;
    }
    public void setWeightKg (double weightKg){
        this.weightKg = weightKg;
    }
    public double getWeightKg (){
        return weightKg;
    }
    public void setHeightFt (double heightFt){
        this.heightFt = 12 * heightFt;

    }
    public double getHeightFt (){
        return heightFt;
    }
    public void setHeightMeters (double heightMeters){
        this.heightMeters = heightMeters;
    }
    public double getHeightMeters (){
        return heightMeters;
    }
    public void setBodyMassIndex1 (double heightFt, double weightLb){
        // weight * height^2 * 703
        this.bmi1 = (weightLb / Math.pow(heightFt, 2)) * 703;
    }
    public double getBodyMassIndex1(){
        return bmi1;
    }
    public void setBodyMassIndex2 (double heightMeters, double weightKg){
        // weight / meters^2
        this.bmi2 = weightKg / Math.pow(heightMeters, 2);
    }
    public double getBodyMassIndex2(){
        return bmi2;
    }
    public void getResultUs(){
        System.out.printf("%.2flb", weightLb);
        System.out.println();
        System.out.printf("%.2fin", heightFt);
        System.out.println();
        System.out.printf("BMI: %.2f", bmi1);
        System.out.println();

        if (getBodyMassIndex1() < 18.5){
            System.out.println("You are underweight");
        } else if (getBodyMassIndex1() > 18.5 && getBodyMassIndex1() <= 25){
            System.out.println("You are at normal range");
        } else if (getBodyMassIndex1() >25 && getBodyMassIndex1() <= 30){
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }

    }
    public void getResultsWorld(){
        System.out.printf("Your weight in kilograms: %.2fkg", weightKg);
        System.out.println();
        System.out.printf("Your height in meters: %.2fm", heightMeters);
        System.out.println();
        System.out.printf("BMI: %.2f", getBodyMassIndex2());
        System.out.println();

        if (bmi2 < 18.5){
            System.out.println("You are underweight");
        } else if (getBodyMassIndex2() > 18.5 && getBodyMassIndex2() <= 25){
            System.out.println("You are at normal range");
        } else if (getBodyMassIndex2() >25 && getBodyMassIndex2() <= 30){
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}
