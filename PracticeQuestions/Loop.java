//Q.1 SUM OF ODD AND EVEN INT
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter how many digits you want to enter");
//         int n = sc.nextInt();

//         int evensum = 0;
//         int oddsum = 0;

//         for(int i=1; i<=n; i++){
//             int num = sc.nextInt();

//             if(num%2==0){
//                 evensum += num;
//             }
//             else{
//                 oddsum += num;
//             }

//         }
//         System.out.println("the sum of even digits is ");
//         System.out.println(evensum);

//         System.out.println("the sum of odd digits is ");
//         System.out.println(oddsum);


//     }
// }


//BY DO WHILE LOOP
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int evensum = 0;
//         int oddsum = 0;
//         int choice;

//         do{
//             System.out.println("Enter a number");
//             int n = sc.nextInt();

//             if(n%2==0){
//                 evensum += n;
//             }
//             else{
//                 oddsum += n;
//             }
//             System.out.println("do you wanna continue? press 1 for yes or 0 for no");
//             choice = sc.nextInt();
//         } while(choice==1);

//         System.out.println("the sum of even nummbers is "+ evensum);
//         System.out.println("the sum of odd numbers is "+oddsum);


//     }
// }



//factorial of n
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int fact = n;

//         for(int i=1; i<=n-1; i++){

//             fact = fact*(n-i);
            
//         }
//         System.out.println(fact);


//     }
// }



//MULTIPLICATION TABLE FOR INT ENTERTED BY USER
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         for(int i=1; i<=10; i++){
//             int result = n*i;
//             System.out.println(n+"*"+i+"="+result);
//         }
//     }
// }

