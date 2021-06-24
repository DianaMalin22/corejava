class Library
{ 
String nameOfBook;
String author;
int noOfPages;
int price;
String language;
boolean isAvailabeInMarket;

public static void main(String a[])
{
System.out.println("Main method started");

Library lib=new Library();
lib.nameOfBook="Malgudi Days";
lib.author="R K Narayan";
lib.noOfPages=150;
lib.price=146;
lib.language="Hindi";
lib.isAvailabeInMarket=true;
System.out.println(lib.nameOfBook+" "+lib.author+" "+lib.noOfPages+" "+lib.price+" "+lib.language+" "+lib.isAvailabeInMarket);

Library book=new Library();
book.nameOfBook="Life is Beautiful";
book.author="Jogi";
book.noOfPages=276;
book.price=499;
book.language="Kannada";
book.isAvailabeInMarket=true;
System.out.println(book.nameOfBook+" "+book.author+" "+book.noOfPages+" "+book.price+" "+book.language+" "+book.isAvailabeInMarket);

Library librar=new Library();
librar.nameOfBook="The Secret";
librar.author="Rhonda Byrne";
librar.noOfPages=326;
librar.price=292;
librar.language="Telugu";
librar.isAvailabeInMarket=true;
System.out.println(librar.nameOfBook+" "+librar.author+" "+librar.noOfPages+" "+librar.price+" "+librar.language+" "+librar.isAvailabeInMarket);

System.out.println("Main method ended");
}
}

