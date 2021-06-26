class Furniture
{
String name;
String wood;
String use;


public Furniture(String nm,String wo,String us){
name=nm;
wood=wo;
use=us;
}

public static void madeEasy(){
System.out.println("Furnitures make human to take rest");
}
	
public void printFurnitureDetails(){	
System.out.println(name+" made up of "+wood+" is used to "+use );
}


}