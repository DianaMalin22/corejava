class Research
{
String fieldName;
String researchName;
int noOfYears;
String country;


public Research(String fn,String rn,int year,String cty){
fieldName=fn;
researchName=rn;
noOfYears=year;
country=cty;
}

public static void research(){
System.out.println("Research and Development make human life easier");
}
	
public void printResearchDetails(){	
System.out.println("In the field of "+fieldName+" the product called"+researchName+" was discovered in "+noOfYears+" by "+country);
}


}