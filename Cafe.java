class Cafe
{
String name;
String location;
int price;
boolean isZomatoAvailable;

public Cafe(){
System.out.println("Object with zero parameters");
}

public Cafe(String name, String location, int price, boolean isZomatoAvailable){
this();
this.name=name;
this.location=location;
this.price=price;
this.isZomatoAvailable=isZomatoAvailable;
System.out.println(this.name+" "+this.location+" "+this.price+" "+this.isZomatoAvailable);
}

public void party( String friends){
System.out.println("Enjoying Coffee with "+friends);
}
}