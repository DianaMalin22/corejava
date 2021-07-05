class ExamUtil
{
public static void main(String a[]){
Exam exam=new Exam();
exam.code="453eer";
exam.fees=999;

HallTicket hallTicket= new HallTicket("5yutr",6,"Nitin Reddy");

boolean allowed=exam.allow(hallTicket);
if(allowed)
{
System.out.println("can write the exam");
}
else
{
System.out.println("Cannot write exam");
}


System.out.println("**************************************************");
SupplementaryExam supplementaryExam=new SupplementaryExam();
exam.code="453eer";
exam.fees=999;
boolean allowedForSuplementary = supplementaryExam.allow(hallTicket);
if(allowedForSuplementary){
System.out.println("Can write supplementaryExam");
}
else{
System.out.println("Cannot write supplementaryExam");
}
}
}


