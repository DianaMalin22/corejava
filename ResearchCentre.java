class ResearchCentre
{

String fieldName;
String researchName;
int noOfYears;
String country;

public ResearchCentre(String fieldName, String researchName, int noOfYears, String country)
{
this.fieldName=fieldName;
this.researchName=researchName;
this.noOfYears=noOfYears;
this.country=country;
}

public static void research(){
System.out.println("Research and Development make human life easier");
}
	
public void printResearchCentreDetails(){	
System.out.println("In the field of "+fieldName+" the product called"+researchName+" was discovered in "+noOfYears+" by "+country);
}


}