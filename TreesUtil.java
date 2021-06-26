class TreesUtil
{
public static void main(String a[])
{
Trees tree=new Trees("Banyan tree","Plantae","Moraceae","Rosales");
tree.printTreesDetails();

Trees tr=new Trees("Coconut tree","Plantae","Arecaceae","Arecales");
tr.printTreesDetails();

Trees.getFreshAir();
}
}