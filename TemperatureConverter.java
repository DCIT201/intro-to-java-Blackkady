//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TemperatureConverter
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

           // it prompts the user to choose an option

        System.out.println("choose an option:");
                System.out.println("1.convert Celsius to Fahrenheit");
        System.out.println("2.convert Fahrenheit to Celsius");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter temperature in Celsius");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                 celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius: " + celsius);
                break;
            default:
                System.out.println("Invalid option.run the program again and choose 1 or 2");
                break;
        }

           scanner.close();
        }
    }
