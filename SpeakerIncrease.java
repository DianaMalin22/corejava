class SpeakerIncrease
{
public static String brandName="Boat";
public static String color="Black";
public static int minVolumeLevel=0;
public static int currentVolumeLevel=0; 
public static int maxVolumeLevel=6;
public static boolean connected;


public static void onOrOff()
{
System.out.println("Speaker is off");
if(connected==false){
connected=true;
System.out.println("Speaker is on");
}
else if(connected==true){
connected=false;
System.out.println("Turn off the speaker");
}
}


public static int increaseVolume(){
if(connected==true)
{
if(currentVolumeLevel < maxVolumeLevel){
currentVolumeLevel=currentVolumeLevel+1;
System.out.println("The Current Volume is: "+currentVolumeLevel);
}
else{
System.out.println("Maximum Volume reached");
}
}
else{
System.out.println("Speaker is off");
}
return currentVolumeLevel;
}

public static void main(String a[]){
	
onOrOff();
int vol=increaseVolume();
System.out.println(vol);
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
}
}

