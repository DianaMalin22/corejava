import java.util.Scanner;

class SumoColdUtil
{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Tablet ID");
String tabletID=sc.nextLine();

System.out.println("Enter Manufactured Date");
String mfgDate=sc.nextLine();

System.out.println("Enter Expiry Date");
String expDate=sc.nextLine();

System.out.println("Enter price for 30 tablets");
int price=sc.nextInt();
sc.close();

SumoCold cold=new SumoCold();
cold.tabletID=tabletID;
cold.mfgDate=mfgDate;
cold.expDate=expDate;
cold.price=price;
System.out.println(tabletID+" "+mfgDate+" "+expDate+" "+price);
cold.healing();
}

}


