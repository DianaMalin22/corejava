class Exam
{
String code;
HallTicket hallTicket;
static String universityName="VTU";
double fees;

public Exam()
{
System.out.println("Exam Object is created");
}

public boolean allow(HallTicket hallTicket){
System.out.println("invoked allow");
boolean there=false;
if(this.fees>=1000){
System.out.println("Fees is paid");
if(hallTicket!=null){
there=true;
this.hallTicket=hallTicket;
this.hallTicket.displayHallTicketDetails();
System.out.println("EXAM CODE:"+this.code);
}

else{
System.out.println("No HallTicket");
}
}
else{
System.out.println("Fees is less");
}
return there;
}

}