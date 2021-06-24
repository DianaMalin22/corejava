class DivideTwoNumbers
{
public static void main(String a[]){
System.out.println("Main method started");
div(12,4);
div(36,9);
div(117,13);
System.out.println("Main method ended");
}

public static void div(double a, double b){
System.out.println("Division method started");
double num=a/b;
System.out.println(num);
System.out.println("Division method ended");
}
}