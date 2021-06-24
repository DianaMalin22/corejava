class Zomato
{
public static void main(String a[])
{
order(2);
order("brother");
}
public static void order(int noOfPizzas){
System.out.println("Ordered "+noOfPizzas +"Cheese Pizza in Zomato");
}
static void order(String family){
System.out.println("Eating pizza with "+family);
}
}