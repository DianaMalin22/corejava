class JewellaryTester
{
public static void main(String a[]){

Jewellary jew=new Jewellary("Ring","diamond",24);
jew.printJewellaryDetails();
Jewellary gold=new Jewellary("Earring","gold",22);
gold.printJewellaryDetails();
Jewellary ruby=new Jewellary("Pendant","Ruby",24);
ruby.printJewellaryDetails();

Jewellary.ornaments();
}
}