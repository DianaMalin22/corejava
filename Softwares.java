class Softwares
{
int softwareId;
String name;
String purpose;
boolean isOpenSource;

public Softwares(int softwareId, String name, String purpose, boolean isOpenSource)
{
this.softwareId=softwareId;
this.name=name;
this.purpose=purpose;
this.isOpenSource=isOpenSource;
}

public static void makeLifeEasier()
{
System.out.println("It makes human lives more easier");
}

public void printSoftwareDetails()
{
System.out.println(softwareId+" called "+name+" is used for "+purpose+" and it is "+isOpenSource+" opensource ");
}
}
