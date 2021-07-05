import java.util.Scanner;

class AppleUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the model");
String model=sc.nextLine();

System.out.println("Enter price");
int price=sc.nextInt();

sc.close();

Apple app=new Apple();
app.model=model;
app.price=price;

System.out.println(model+" "+price);
app.lifeEasy();
}
}


