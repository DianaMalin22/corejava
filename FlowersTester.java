class FlowersTester
{
public static void main(String a[]){

Flowers flo=new Flowers("Rose","red",25);
flo.printFlowersDetails();
Flowers flow=new Flowers("Tulip","lavender",7);
flow.printFlowersDetails();
Flowers flowf=new Flowers("Sunflower","yellow",45);
flowf.printFlowersDetails();

Flowers.plants();
}
}