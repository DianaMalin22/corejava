class Theatre
{
String name;
String location;
boolean isBookingAvailable;
int noOfSeats;
int noOfShows;

public Theatre(){
	
System.out.println("Object is created with zero parameters");
}

public Theatre(String name,String location,boolean isBookingAvailable,int noOfSeats,int noOfShows)
{
this();
System.out.println("Object created with three parameters");

this.name=name;
this.location=location;
this.isBookingAvailable=isBookingAvailable;
this.noOfSeats=noOfSeats;
this.noOfShows=noOfShows;
System.out.println(this.name+" "+this.location+" "+this.isBookingAvailable+" " +this.noOfSeats +" "+this.noOfShows);
}






public void entertainment(){
System.out.println("Went to theatre with friends");
}

public  void popcorn(String popcorn){
System.out.println("Ate"+popcorn);
}

}