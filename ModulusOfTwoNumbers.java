class ModulusOfTwoNumbers
{
public static void main(String a[]){
System.out.println("Main method started");
mod(24,12);
mod(9,3);
mod(6,4);
System.out.println("Main method ended");
}

public static void mod(int a, int b){
System.out.println("Modulus method started");
int num=a%b;
System.out.println(num);
System.out.println("Modulus method ended");
}
}