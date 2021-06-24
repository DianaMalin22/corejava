class Brands
{
String name;
String ambassadorName;
int year;
int rankInMarket;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating object");

 Brands brand=new Brands();
  brand.name="Vivo";
  brand.ambassadorName="Virat kohli";
  brand.year=2009;
  brand.rankInMarket=5;
 System.out.println(brand.name+" "+brand.ambassadorName+" "+brand.year+" "+brand.rankInMarket);
 
 Brands bran=new Brands();
 bran.name="Samsung";
 bran.ambassadorName="Aamir Khan";
 bran.year=1938;
 bran.rankInMarket=1;
 System.out.println(bran.name+" "+bran.ambassadorName+" "+bran.year+" "+bran.rankInMarket);
 
 Brands br=new Brands();
 br.name="Apple";
 br.ambassadorName="Shahrukh Khan";
 br.year=1976;
 br.rankInMarket=2;
 System.out.println(br.name+" "+br.ambassadorName+" "+br.year+" "+br.rankInMarket);
 
 Brands fame=new Brands();
 fame.name="Amazon";
 fame.ambassadorName="Alia Bhat";
 fame.year=1994;
 fame.rankInMarket=4;
 System.out.println(fame.name+" "+fame.ambassadorName+" "+fame.year+" "+fame.rankInMarket);
 
System.out.println("Main method ended"); 
}
}



