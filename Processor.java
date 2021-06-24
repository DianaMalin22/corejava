class Processor
{
public static void main(String a[]){
saveProcessor("Intel Xeon E5205",64);
saveProcessor("AMD Athlon 11 240 Regor",64);
}
public static void saveProcessor(String processorName,int bit){
System.out.println(processorName);
System.out.println(bit);
}
}