class Prophets
{
String name;
String relegion;
int age;
int followers;

public Prophets(String na,String rel,int ag,int follow){
name=na;
relegion=rel;
age=ag;
followers=follow;
}

public static void preaching(){
System.out.println("Prophets taught us good way of living");
}
	
public void printProphetsDetails(){	
System.out.println(name+" was prophet of "+relegion+" and died at age of "+age+" and had followers of about "+followers );
}


}