class MultiplyTwoNumbers
{
public static void mul(int a, int b){
System.out.println("Multiplication method started");
int num=a*b;
System.out.println(num);
System.out.println("Multiplication method ended");
}

public static void main(String a[]){
System.out.println("Main method started");
mul(1,4);
mul(9,6);
mul(79,0);
System.out.println("Main method ended");
}
}