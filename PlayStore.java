class PlayStore
{
String appName;
float appRating;
String size;


public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of object");

PlayStore app=new PlayStore();
app.appName="Whatsapp";
app.appRating=4.0f;
app.size="28 MB";

System.out.println(app.appName+" "+app.appRating+" "+app.size);

PlayStore play=new PlayStore();
play.appName="Candy Crush";
play.appRating=4.6f;
play.size="72 MB";

System.out.println(play.appName+" "+play.appRating+" "+play.size);

PlayStore store=new PlayStore();
store.appName="Amazon Online Shopping";
store.appRating=4.4f;
store.size="42 MB";

System.out.println(store.appName+" "+store.appRating+" "+store.size);
System.out.println("Main method ended");
}
}

