import java.util.Scanner;

public class Assignment {

    public void checkPalindrome( int a){
        int b = a;
        int r,temp=0;
        do {
            r = a % 10;
            a = a / 10;
            temp = (temp * 10) + r;
        } while (a > 0);
        if (temp == b)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not a Palindrome");
        System.out.println();
    }


    public void printPattern(int a) {
        int i = a,k;
        do {
            k = i;
            do {
                System.out.print("*");
                k--;
            } while (k > 0);
            System.out.println();
            i--;
        } while (i > 0);
        System.out.println();
    }



    //function to check no is prime or not

    public void checkPrimeNumber(int a) {
        int temp = 0, i=2;
        do {
            if (a % i == 0) {
                temp = 1;
                break;
            }
            i++;
        } while (i <= (a / 2));
        if (temp == 0)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
        System.out.println("");
    }



    // function to print Fibonacci Series

    public void printFibonacciSeries(int a) {
        int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);
        int i = 0, temp;
        do {
            System.out.println(first+ second);
            temp = first+ second;
            first=second;
            second=temp;
            i++;
        } while (i < a - 2);
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Assignment obj= new Assignment();
        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        int input= sc.nextInt();
        int temp=0,r,k;
        do {
            switch (input) {
                case 0: break;
                case 1: System.out.println("Enter the number");
                        int a = sc.nextInt();
                        obj.checkPalindrome(a);
                        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                        input= sc.nextInt();
                        break;
                case 2: System.out.println("Enter the number");
                        a = sc.nextInt();
                        obj.printPattern(a);
                        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                        input= sc.nextInt();
                        break;
                case 3: System.out.println("Enter the number");
                        a = sc.nextInt();
                        obj.checkPrimeNumber(a);
                        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                        input= sc.nextInt();
                        break;
                case 4: System.out.println("Enter the size");
                        a = sc.nextInt();
                        obj.printFibonacciSeries(a);
                        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                        input= sc.nextInt();
                        break;
                default:System.out.println("error- Wrong option chosen");
                        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                        input= sc.nextInt();
                        break;
            }
        } while (input!=0);
    }
}

