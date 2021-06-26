class MusuemsTester
{
public static void main(String a[])
{
Museums mus=new Museums("National Museum","New Dehli","pre historic era",1949);
mus.printMuseumsDetails();

Museums eum=new Museums("Visveraya Industrial and Technological Museum","Banglore","scientific and technological innovations",1865);
eum.printMuseumsDetails();

Museums.getMemories();
}
}