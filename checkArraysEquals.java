
import java.util.Arrays;

public class checkArraysEquals {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to number checker/n ");
        // System.out.println("please enter your number:");
        // int num = input.nextInt();

        // if (num > 0) {
        // System.out.println("your number is positive");

        // } else if (num == 0) {
        // System.out.println("your number is zero");

        // } else {
        // System.out.println("your number is negative");
        // }

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to odd even calculator/n");
        // System.out.println("please enter your number");
        // int num = input.nextInt();

        // if (num % 2 == 0) {
        // System.out.println("your number is an even number");
        // } else {
        // System.out.println("your number is a odd number");

        // }

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to the world of three/n ");
        // System.out.println("please enter your first number:");
        // int first = input.nextInt();
        // System.out.println("please enter your second number");
        // int second = input.nextInt();
        // System.out.println("finaaly enter your third number");
        // int third = input.nextInt();

        // if (first >= second && first >= third) {
        // System.out.println(first + "is the greatest number");
        // } else if (second >= first && second >= third) {
        // System.out.println(second + "is the greatest number");

        // }

        // int num = 1;
        // while (num <= 10) {
        // System.out.println(num);
        // num = num + 1;
        // }

        // int p = 1;
        // while (p <= 1000) {
        // System.out.println(p);
        // p = p + 1;
        // }

        // int h = 500;
        // while (h >= 200) {
        // System.out.println(h);
        // h = h - 1;
        // }

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to calculator/n");
        // System.out.println("please enter the number:");
        // int first = input.nextInt();
        // System.out.println("please enter the number:");
        // int second = input.nextInt();
        // int sum = first + second;
        // System.out.println("sum of the number is:" + sum);

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to multiplication world");
        // System.out.println("please enter your number:");
        // int num = input.nextInt();

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(num + "x" + i + "=" + (num * i));
        // i++;
        // }

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to odd sum");
        // System.out.println("please enter your number:");
        // int num = input.nextInt();
        // System.out.println("oddSum till" + num + "is:");

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to factorial");
        // System.out.println("please enter your number:");
        // int num = input.nextInt();
        // long fact = factorial(num);
        // System.out.println("factorial is:" + fact);

        // Scanner input = new Scanner(System.in);
        // System.out.println("welcome to array sum and average");
        // System.out.println("please enter the number of elements");
        // int size = input.nextInt();
        // int[] nums = new int[size];
        // int i = 0;
        // while (i < size) {
        // System.out.println("please enter element no" + (i + 1) + ":");
        // nums[i] = input.nextInt();
        // i++;

        // }

        // swapping of two numbers ke 5 different ways
        // 1.method

        // int a = 10, b = 20;
        // System.out.println("before swapping values are.." + a + " " + b);
        // int t = a;
        // a = b;
        // b = t;
        // System.out.println("after swapping values are.." + a + " " + b);

        // METHOD 2
        // System.out.println("before swapping values are.." + a + " " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println("after swapping values are.." + a + " " + b);

        // METHOD 3
        // System.out.println("before swapping values are.." + a + " " + b);
        // a = a * b;
        // b = a / b;
        // a = a / b;
        // System.out.println("after swapping values are.." + a + " " + b);

        // METHOD 4
        // System.out.println("before swapping values.." + a + " " + b);
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("after swapping values.." + a + " " + b);

        // METHOD 5
        // System.out.println("before swapping values are.." + a + " " + b);
        // b = a + b - (a = b);
        // System.out.println("after swapping values are.." + a + " " + b);

        // Three different way to reverse a number:
        // method 1
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = input.nextInt();

        // Using algorithm

        // int rev = 0;
        // while (num != 0) {
        // rev = rev * 10 + num % 10;
        // num = num / 10;
        // System.out.println("reverse number is" + rev);

        // }

        // METHOD 2
        // StringBuffer rev:

        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer rev = sb.reverse();
        // System.out.println("reverse num is" + rev);

        // METHOD 3
        // using stringBuilder class

        // StringBuilder sb1 = new StringBuilder();
        // sb1.append(num);
        // StringBuilder rev = sb1.reverse();
        // System.out.println("reverse number is" + rev);

        // Three different ways of reverse a string:
        // method 1 : using + (string concatenation) operator

        // String str = "ABCD";
        // String rev = "";
        // int len = str.length();
        // for (int i = len - 1; i >= 0; i--) {
        // rev = rev + str.charAt(i);
        // System.out.println("reverse string is" + rev);
        // }

        // palindrome number : a palindrome number is a number that remains the same
        // when its digits are reversed.

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number");

        // int num = input.nextInt();

        // int org_num = num;
        // int rev = 0;
        // while (num! = 0) {
        // rev = rev*10 + num%10;
        // num = num/10;
        // if(org_num==rev)
        // System.out.println(org_num +" palindrome Number");
        // else
        // System.out.println(org_num +" not palindrome Number");

        // }

        // Palindrome String : a palindrome string is a string that remains the same
        // when its character are reversed.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your String ");
        // String str = sc.next();
        // String org_str = str;
        // String rev = "";
        // int len = str.length();
        // for (int i = len - 1; i >= 0; i--) {
        // rev = rev + str.charAt(i);
        // }
        // System.out.println(rev);

        // number of digits in a number
        // int num = 8765;
        // int count = 0;
        // while (num > 0) {
        // num = num / 10;
        // count++;
        // System.out.println("number of digits:" + count);

        // }

        // Number of even and odd digits in a number.
        // int num = 1234;
        // int even_count = 0;
        // int odd_count = 0;
        // while(num>0) {
        // int rem = num%10;
        // if(rem%2==0);{

        // } even_count++;
        // else{

        // }
        // odd_count++;

        // }
        // num = num/10;
        // }

        // count sum of digits in a number.
        // int num = 1234;
        // int sum = 0;
        // while (num > 0) {
        // sum = sum + num % 10;
        // num = num / 10;
        // System.out.println("sum of digit in a number is:" + sum);
        // }

        // largest of three number.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int first = sc.nextInt();
        // System.out.println("Enter second number");
        // int second = sc.nextInt();
        // System.out.println("Enter third number");
        // int third = sc.nextInt();

        // if (first > second && second > third) {
        // System.out.println(first + "is largest number");
        // } else if (second > first && second > third) {
        // System.out.println("second + is greatest number");

        // } else {
        // System.out.println("third + is greatest number");
        // }

        // Fibonaci series: a series of number in which each number (Fibonacci
        // numtwober) is the sum of the two precedding numbers.
        // int n1 = 0, n2 = 1, sum = 0;
        // System.out.println(n1 + " " + n2);
        // for (int i = 2; i < 10; i++) {
        // sum = n1 + n2;
        // System.out.println(" " + sum);
        // n1 = n2;
        // n2 = sum;
        // }

        // check a number is prime or not.
        // how to generate random numbers and strings.
        // factorial: a factorial is a function that multiplies a number by every number
        // below it.
        // for example 5! = 5*4*3*2*1 = 120.
        // int num = 5;
        // long factorial = 1;
        // for (int i = 1; i <= num; i++) {
        // factorial = factorial * i;
        // System.out.println("factorial of a number is:" + factorial);
        // }

        // sum of element in an array.
        // int a[] = { 5, 2, 7, 9, 6 };
        // int sum = 0;
        // for (int i = 0; i <= a.length - 1; i++) {
        // sum = sum + a[i];
        // System.out.println("sum of array elements:" + sum);

        // }

        // int a[] = { 1, 2, 3, 4, 5, 6 };
        // Extracting even number...........
        // System.out.println("Even number in an array.........");
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] % 2 == 0)
        // System.out.println(a[i]);

        // System.out.println("odd number in array...........");

        // for (int i = 0; i<a.length; i++) {

        // }

        // if (a[i] % 2 == 0)
        // System.out.println(a[i]);
        // }

        // check 2 arrays are equal or not:
        // int a1[] = { 1, 2, 10, 4, 5 };
        // int a2[] = { 1, 2, 3, 4, 5 };
        // boolean status = Arrays.equals(a1, a2);
        // if (status == true) {
        // System.out.println("Arrays are equal");

        // } else
        // System.out.println("Arrays are not equal");

        // Missing number in arrays.

        // int a[] = { 1, 2, 4, 5 };
        // int sum1 = 0;
        // for (int i = 0; i < a.length; i++) {
        // sum1 = sum1 + a[i];
        // System.out.println("sum of elements in array:" + sum1);
        // int sum2 = 0;
        // for (int l = 1; i <= 5; i++) {
        // sum2 = sum2 + i;
        // System.out.println("sum of range of elements in array" + sum2);
        // System.out.println("Missing number is:" + (sum2 - sum1));
        // }
        // }

        // maximum and minimum elements in array.
        // int a[] = { 50, 30, 40, 20, 60 };
        // int max = a[0];
        // for (int i = 1; i < a.length; i++) {
        // if (a[i] > max) {
        // max = a[i];
        // System.out.println("maximum element in array is:" + max);
        // }
        // }

        // int min = a[0];
        // for (int i = 1; i <= a.length; i++) {
        // if (a[i] < min) {
        // min = a[i];
        // System.out.println("minimum value in array is:" + min);
        // }
        // }

        // Duplicate element in array
        // search element in array'

        int a[] = { 10, 20, 40, 50, 30 };
        int search_ele = 50;
        boolean flag = false;
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
            if (search_ele == a[i]) {
                System.out.println("element found at:" + i);
                break;

            }
        }

        if (flag == false) {

        }
        System.out.println("element not found");
    }
}
