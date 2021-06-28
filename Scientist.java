class Scientist
{
String name;
String birthPlace;
String famousInvention;
boolean gotNoblePrize;

public Scientist()
{
System.out.println("Scientist constructor created with zero parameters");
}

public Scientist(String name, String birthPlace,String famousInvention,boolean gotNoblePrize){
this();
System.out.println("Scientist object with two parameters");
this.name=name;
this.birthPlace=birthPlace;
this.famousInvention=famousInvention;
this.gotNoblePrize=gotNoblePrize;
System.out.println(this.name+" "+this.birthPlace+" "+this.famousInvention+" "+this.gotNoblePrize);
}



public void invention(){
System.out.println("Scientists are pride of our Nation");
}

public static void science( String development){
System.out.println("Improve nation's towards"+development);
}

}
