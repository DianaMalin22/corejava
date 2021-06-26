class PhotoFrame
{
String shape;
int noOfEdges;


public PhotoFrame(String sha,int edge){
shape=sha;
noOfEdges=edge;

}

public static void getMemories(){
System.out.println("Memories are in photo frames");
}
	
public void printPhotoFrameDetails(){	
System.out.println(" The "+shape+" has "+noOfEdges );
}


}