import java.util.Scanner;

class WaterUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Water has character of ");
String character=sc.nextLine();

System.out.println("The source of water is ");
String source=sc.nextLine();

Water wat=new Water();
wat.character=character;
wat.source=source;
System.out.println(character+" "+source);
wat.flow();
}

}

