class Virus
{
String name;
String ill;
int year;
boolean isVaccineAvailable;

public Virus( String name, String ill, int year, boolean isVaccineAvailable){
this.name=name;
this.ill=ill;
this.year=year;
this.isVaccineAvailable=isVaccineAvailable;
}

public static void getIllness()
{
System.out.println("Leads to increase of death and decrease of population");
}

public void printVirusDetails()
{
System.out.println("The virus called "+name+" causes "+ill+" and was discovered in "+year+" and the vaccine availability is "+isVaccineAvailable);
}
}
