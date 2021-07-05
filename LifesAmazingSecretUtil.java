import java.util.Scanner;

class LifesAmazingSecretUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the author name: ");
String author=sc.nextLine();

System.out.println("Enter Novel ID: ");
int novelID=sc.nextInt();

System.out.println("Enter number of pages: ");
int noOfPages=sc.nextInt();

System.out.println("Is available in Market: ");
boolean isAvailableInMarket=sc.nextBoolean();

sc.close();

LifesAmazingSecret lifes=new LifesAmazingSecret();
lifes.author=author;
lifes.novelID=novelID;
lifes.noOfPages=noOfPages;
lifes.isAvailableInMarket=isAvailableInMarket;
System.out.println(author +" "+ novelID+" "+ noOfPages +" "+ isAvailableInMarket);
}
}