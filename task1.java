import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion:");
        System.out.print("Temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print(" Unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        scanner.nextLine(); 
        String originalUnit = scanner.nextLine().toLowerCase();

        double Celsius = 0;
        double Fahrenheit = 0;
        double Kelvin = 0;

        if (originalUnit.equals("celsius")) {
            Celsius = temperature;
            Fahrenheit = (temperature * 9/5) + 32;
            Kelvin = temperature + 273.15;
        } else if (originalUnit.equals("fahrenheit")) {
            Celsius = (temperature - 32) * 5/9;
            Fahrenheit = temperature;
            Kelvin = (temperature - 32) * 5/9 + 273.15;
        } else if (originalUnit.equals("kelvin")) {
            Celsius = temperature - 273.15;
            Fahrenheit = (temperature - 273.15) * 9/5 + 32;
            Kelvin = temperature;
        } else {
            System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        System.out.println("TEMPERATURES:");
        System.out.println("Celsius: " + Celsius + " C");
        System.out.println("Fahrenheit: " + Fahrenheit + " F");
        System.out.println("Kelvin: " + Kelvin + " K");
    }
}