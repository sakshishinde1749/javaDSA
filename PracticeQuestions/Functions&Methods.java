//Q.1 AVG OF 3 NUM
// import java.util.Scanner;
// public class practiceq{
//     public static int AvgNum(int a, int b, int c){
//         int avg = (a+b+c)/3;

//         return avg;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter n1, n2 and n3");
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int n3 = sc.nextInt();

//         int AvgOfNum = AvgNum(n1, n2, n3);
//         System.out.println("The average of these 3 numbers is "+AvgOfNum);
//     }
// }



//EVEN OR ODD
// import java.util.Scanner;
// public class practiceq{

//     public static boolean EvenOdd(int n){
//         boolean ans;

//         if(n%2==0){
//             ans = true;
//         }
//         else{
//             ans = false;
//         }
//         return ans;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n1 = sc.nextInt();

//         Boolean EvenOrOdd = EvenOdd(n1);
//         System.out.println(EvenOrOdd);

//     }
// }



//Q.5 SUM OF DIGITS OF INTEGER
// public class practiceq{
//     public static void DigitSum(int n){
//         int sum = 0;

//         for(int i=1; n>0; i++){
//             int LastDigit = n%10;

//             sum += LastDigit;

//             n = n/10;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String args[]){

//         System.out.print("The sum of digits of given integer is  ");
//         DigitSum(124254);
//     }
// }



//Q.3 palindrome
public class practiceq{
    public static void PalindromeOrNot(int n){
        int rev = 0;

        for(int i=1; n>0; i++){
            int LastDigit = n%10;

            rev = (rev*10) + LastDigit;

            n = n/10;
        }

        if(n==rev){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The nummber is not palindrome");
        }

    }
    public static void main(String args[]){
        PalindromeOrNot(121);
    }
}



