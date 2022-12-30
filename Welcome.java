
/*class vehicle{
private byte wheel;
public void setwheel(byte n){
wheel=n;
}
public byte getwheel(){
return wheel;
}
}*/
public class Welcome{
public static void main(String[] abc){
  /* System.out.println(abc[0]);
   System.out.println(abc[2]);*/
   int[]ages=new int[5];
   for(int a:ages){
      System.out.println(a);
   }
   ages[0]=22;
   ages[2]=13;
System.out.printf("%d %d",ages[0],ages[2]);
/*boolean late= true;
if(late){ 
System.out.println("you are late");
}
else {System.out.println("chutiya");
}
byte age = 58;
System.out.println("your age is ");
System.out.println(age);

short salary = 20000;
System.out.println("your salary is ");
System.out.println(salary);

char gender = 'f';
System.out.println("your gender is ");
System.out.println(gender);

vehicle mycar = new vehicle();
mycar.setwheel(age);
System.out.println(mycar.getwheel());*/
   }
}