import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("Temperature in celsius?");
        while (!in.hasNextInt())
        {
            in.next();
            System.out.println("invalid entry, please enter an integer");
        }
        celsius = in.nextInt();

        fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
    }
}
