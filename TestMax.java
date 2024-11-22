import java.util.Scanner;

public class TestMax{

    public static int max(int num1, int num2){
        int result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = max(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + result);
    }
}