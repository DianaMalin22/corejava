class Gym
{
String name;
String trainerName;
int fees;
boolean isAvailableMorning;

public Gym(String name, String trainerName, int fees, boolean isAvailableMorning){

this.name=name;
this.trainerName=trainerName;
this.fees=fees;
this.isAvailableMorning=isAvailableMorning;
System.out.println(this.name+" "+this.trainerName+" "+this.fees+" "+this.isAvailableMorning);
}

public static void fit(){
System.out.println("Gym gives fitness and shape to body");
}

public void body(String mast){

System.out.println("Gym makes body "+mast);
}

}