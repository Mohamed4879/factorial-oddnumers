import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int fact1 = 1 , fact2 = 1;
    static int even1 = 0 , even2 = 0 , odd1 = 0 , odd2 = 0 ;
public static void fact(int num1, int num2){
    for (int i = 1; i <= num1; i++) {
        fact1 *= i;
    }
    for (int j = 1; j <= num2; j++) {
        fact2 *= j;

    }
}
public static void calc(int num1, int num2){
    for (int i = 0; i <= num1; i++) {
        if (i % 2 == 0)
            even1++;
        else
            odd1++;
    }
    for (int i = 0; i <= num2; i++) {
        if (i % 2 == 0)
            even2++;
        else
            odd2++;
    }

}

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
int num1 = input.nextInt();
System.out.println("enter the second number");
int num2 = input.nextInt();

        fact(num1,num2);
        calc(fact1,fact2);
        System.out.println("the factorial of " + num1 + " is " + fact1);
        System.out.println("the factorial of " + num2 + " is " + fact2);
        System.out.println("the number of even numbers of  "+fact1 +" is "+ even1);
        System.out.println("the number of odd numbers of " +fact1 +" is "+ odd1);
        System.out.println("the number of even numbers of " +fact2+" is "+ even2);
        System.out.println("the number of odd numbers of " +fact2 +" is "+ odd2);



    }
}