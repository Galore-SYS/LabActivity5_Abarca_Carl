import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        double[] history = new double[10];
        int historyCount = 0;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = readInt(input);

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = readDouble(input);
                    System.out.print("Enter second number: ");
                    double num2 = readDouble(input);
                    double res1 = num1 + num2;
                    System.out.println("Result: " + res1);
                    historyCount = addHistory(history, historyCount, res1);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = readDouble(input);
                    System.out.print("Enter second number: ");
                    num2 = readDouble(input);
                    double res2 = num1 - num2;
                    System.out.println("Result: " + res2);
                    historyCount = addHistory(history, historyCount, res2);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = readDouble(input);
                    System.out.print("Enter second number: ");
                    num2 = readDouble(input);
                    double res3 = num1 * num2;
                    System.out.println("Result: " + res3);
                    historyCount = addHistory(history, historyCount, res3);
                    break;

                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = readDouble(input);
                    System.out.print("Enter divisor: ");
                    num2 = readDouble(input);
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        double res4 = num1 / num2;
                        System.out.println("Result: " + res4);
                        historyCount = addHistory(history, historyCount, res4);
                    }
                    break;

                case 5:
                    System.out.print("Enter a non-negative integer: ");
                    int nFact = readInt(input);
                    if (nFact < 0) {
                        System.out.println("Error: Factorial is undefined for negative numbers.");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= nFact; i++) {
                            fact *= i;
                        }
                        System.out.println("Result: " + fact);
                        historyCount = addHistory(history, historyCount, fact);
                    }
                    break;

                case 6:
                    System.out.print("Enter base (x): ");
                    double base = readDouble(input);
                    System.out.print("Enter exponent (y): ");
                    double exp = readDouble(input);
                    double res6 = Math.pow(base, exp);
                    System.out.println("Result: " + res6);
                    historyCount = addHistory(history, historyCount, res6);
                    break;

                case 7:
                    System.out.print("Enter N: ");
                    int nSum = readInt(input);
                    if (nSum < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        int sum = 0;
                        for (int i = 1; i <= nSum; i++) {
                            sum += i;
                        }
                        System.out.println("Result: " + sum);
                        historyCount = addHistory(history, historyCount, sum);
                    }
                    break;

                case 8:
                    System.out.print("Enter an integer: ");
                    int pNum = readInt(input);
                    boolean isPrime = pNum > 1;
                    for (int i = 2; i * i <= pNum; i++) {
                        if (pNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(pNum + " is a prime number.");
                    } else {
                        System.out.println(pNum + " is NOT a prime number.");
                    }
                    break;

                case 9:
                    System.out.print("Enter first integer: ");
                    int g1 = readInt(input);
                    System.out.print("Enter second integer: ");
                    int g2 = readInt(input);
                    int aGCD = Math.abs(g1);
                    int bGCD = Math.abs(g2);
                    while (bGCD != 0) {
                        int temp = bGCD;
                        bGCD = aGCD % bGCD;
                        aGCD = temp;
                    }
                    System.out.println("Result: " + aGCD);
                    historyCount = addHistory(history, historyCount, aGCD);
                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    double absVal = readDouble(input);
                    double res10 = Math.abs(absVal);
                    System.out.println("Result: " + res10);
                    historyCount = addHistory(history, historyCount, res10);
                    break;

                case 11:
                    System.out.print("Enter count of numbers (N): ");
                    int countAvg = readInt(input);
                    if (countAvg <= 0) {
                        System.out.println("Error: Size must be greater than zero.");
                    } else {
                        double[] arrAvg = new double[countAvg];
                        double sumAvg = 0;
                        for (int i = 0; i < countAvg; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            arrAvg[i] = readDouble(input);
                            sumAvg += arrAvg[i];
                        }
                        double avgRes = sumAvg / countAvg;
                        System.out.println("Average: " + avgRes);
                        historyCount = addHistory(history, historyCount, avgRes);
                    }
                    break;

                case 12:
                    System.out.print("Enter count of numbers (N): ");
                    int countMax = readInt(input);
                    if (countMax <= 0) {
                        System.out.println("Error: Size must be greater than zero.");
                    } else {
                        double[] arrMax = new double[countMax];
                        for (int i = 0; i < countMax; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            arrMax[i] = readDouble(input);
                        }
                        double max = arrMax[0];
                        for (int i = 1; i < countMax; i++) {
                            if (arrMax[i] > max) {
                                max = arrMax[i];
                            }
                        }
                        System.out.println("Maximum: " + max);
                        historyCount = addHistory(history, historyCount, max);
                    }
                    break;

                case 13:
                    if (historyCount == 0) {
                        System.out.println("No history available.");
                    } else {
                        System.out.println("--- Results History ---");
                        for (int i = 0; i < historyCount; i++) {
                            System.out.println((i + 1) + ". " + history[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();

        } while (choice != 0);

        input.close();
    }

    public static void printMenu() {
        System.out.println("=== Math App Menu ===");
        System.out.println("1.  Addition of two numbers");
        System.out.println("2.  Subtraction of two numbers");
        System.out.println("3.  Multiplication of two numbers");
        System.out.println("4.  Division of two numbers");
        System.out.println("5.  Factorial of a number");
        System.out.println("6.  Power (x^y)");
        System.out.println("7.  Sum of numbers 1 to N");
        System.out.println("8.  Check if a number is prime");
        System.out.println("9.  Greatest Common Divisor (GCD)");
        System.out.println("10. Absolute value of a number");
        System.out.println("11. Average of N numbers (stored in an array)");
        System.out.println("12. Maximum of N numbers (stored in an array)");
        System.out.println("13. Results History");
        System.out.println("0.  Exit");
    }

    public static int readInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid integer: ");
            input.next();
        }
        return input.nextInt();
    }

    public static double readDouble(Scanner input) {
        while (!input.hasNextDouble()) {
            System.out.print("Invalid input! Enter a valid number: ");
            input.next();
        }
        return input.nextDouble();
    }

    public static int addHistory(double[] history, int count, double value) {
        if (count < 10) {
            history[count] = value;
            return count + 1;
        } else {
            for (int i = 0; i < 9; i++) {
                history[i] = history[i + 1];
            }
            history[9] = value;
            return 10;
        }
    }
}
