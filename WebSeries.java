class WebSeries
{
public static void main(String a[])
{
saveWebSeries("Software Developer","Telugu","NA",true);
saveWebSeries("The Family Man","Hindi","Amazon Prime",true);
saveWebSeries("DOM","English","Netflix",true);
}

public static void saveWebSeries(String webSeriesName, String language,String ottPlatform,boolean isOriginals){
System.out.println(webSeriesName);
System.out.println(language);
System.out.println(ottPlatform);
System.out.println(isOriginals);
}
}	