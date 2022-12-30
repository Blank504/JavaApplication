//Check wether a number is even or odd-----------------------------

/*import java.util.Scanner;
public class Assignment{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int num= scan.nextInt();
System.out.println("num =" + num);
if(num%2==0){
System.out.println("It's a Even Number");
}
else{
System.out.println("It's a Odd Number");
}
}
}*/

//Program to print number respect to days in a week-------------------

import java.util.Scanner;
public class Assignment{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
System.out.println("Enter a number from 1 to 7");
int num = scan.nextInt();
switch(num){

case 1:
System.out.println("Sunday");
break;

case 2:
System.out.println("Monday");
break;

case 3:
System.out.println("Tuesday");
break;

case 4:
System.out.println("Wednesday");
break;


case 5:
System.out.println("Thursday");
break;


case 6:
System.out.println("Friday");
break;


case 7:
System.out.println("Saturday");
break;

default:
System.out.println("J pai Tei number dine haina chuts");
break;


}
}
}