class Flowers
{
String name;
String color;
int noOfPetals;


public Flowers(String nm,String clr,int petal){
name=nm;
color=clr;
noOfPetals=petal;
}

public static void getPlanted(){
System.out.println("Flowers look pretty");
}
	
public void printFlowersDetails(){	
System.out.println(name+" with color "+color+" and petals "+noOfPetals);
}

}