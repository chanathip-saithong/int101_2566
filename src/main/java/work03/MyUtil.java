package work03;
public class MyUtil {

    public static double calculateBMI(double weight,double height) {
        double BMI;
        BMI = weight / Math.pow(height/100,2);
        return BMI;
    }

    public static double average(int v1, int v2, int v3) {
        double b = (v1 + v2 + v3)/ 3;
        return b;
    }
}