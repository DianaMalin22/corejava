class Languages
{
public static void main(String a[])
{
createLanguages("Kannada","Karnataka");
createLanguages("Telugu","Andhra Pradesh");
createLanguages("Malyalam","Kerala");
createLanguages("Tamil","Tamil Nadu");
}
public static void createLanguages(String languageName,String languagePlace){
System.out.println(languageName);
System.out.println(languagePlace);
}
}