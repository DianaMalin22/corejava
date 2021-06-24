class Factorial
{
public static void main(String a[]){
int factorial=myFact(5);
System.out.println(factorial);
int value=myFact(7);
System.out.println(value);
int ans=myFact(13);
System.out.println(ans);
int fact=myFact(10);
System.out.println(fact);
}

public static int myFact(int num){
int f=1;
for(int i=1;i<=num;i++){
f=f*i;
}
return f;
}
}