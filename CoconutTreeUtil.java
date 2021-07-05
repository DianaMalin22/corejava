import java.util.Scanner;

class CoconutTreeUtil
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The use of coconut tree is ");
String use=sc.nextLine();

System.out.println("The life span of coconut tree is ");
int lifespan=sc.nextInt();

CoconutTree tree=new CoconutTree();
tree.use=use;
tree.lifespan=lifespan;
System.out.println(use+" "+lifespan);
tree.giveShelter();
}
}

