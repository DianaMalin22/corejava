class Trees
{
String name;
String kingdom;
String family;
String order;
 public Trees(String name, String kingdom, String family, String order)
 {
 this.name=name;
 this.kingdom=kingdom;
 this.family=family;
 this.order=order;
 }
 
 public static void getFreshAir()
 {
 System.out.println("Save Trees");
 }
 
 public void printTreesDetails()
 {
 System.out.println(name+" belongs to "+kingdom+" kingdom "+kingdom+" family "+family+" order "+order);
 }
 }
