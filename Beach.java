class Beach
{
String name;
String location;
boolean isRestaurantAvailable;
int boatingPrice;

public Beach(){

System.out.println("Object created with zero parameters");
}

public Beach(String name, String location, boolean isRestaurantAvailable, int boatingPrice){
this();
System.out.println("Started object creation with parameters");
this.name=name;
this.location=location;
this.isRestaurantAvailable=isRestaurantAvailable;
this.boatingPrice=boatingPrice;
System.out.println(this.name+" "+this.location+" "+this.isRestaurantAvailable+" "+this.boatingPrice);
System.out.println("Ended object creation");
}

public static void enjoy(){
System.out.println("Beach is the place to enjoy");
}

public static void candle(String couples){
System.out.println("Candle light dinner for "+couples);
}

}