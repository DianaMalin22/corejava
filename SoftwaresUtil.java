class SoftwaresUtil
{
public static void main(String a[])
{
Softwares soft=new Softwares(15675,"Firefox","browsing",true);
soft.printSoftwareDetails();

Softwares ware=new Softwares(16754,"Adobe photoshop","editing",true);
ware.printSoftwareDetails();

Softwares sft=new Softwares(678543,"JDK","programming",false);
sft.printSoftwareDetails();


Softwares.makeLifeEasier();

}
}
