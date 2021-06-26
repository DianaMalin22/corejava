class VirusUtil
{
public static void main(String a[])
{
Virus vr=new Virus("Ebola","fever and vomiting",2018,false);
vr.printVirusDetails();

Virus vir=new Virus("Chicken pox","fever and body aches",1954,false);
vir.printVirusDetails();

Virus virus=new Virus("Covid-19","fever and breating problems",2019,true);
virus.printVirusDetails();

Virus.getIllness();
}
}