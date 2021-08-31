import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double superCoolAndRadNumber = scanner.nextDouble();
        int superCoolAndRadNumberButRounded = (int)(superCoolAndRadNumber + 0.5);
        System.out.print("Rating rounded: " + superCoolAndRadNumberButRounded);

    }
}
