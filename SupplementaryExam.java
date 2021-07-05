class SupplementaryExam extends Exam{

public SupplementaryExam(){
System.out.println("SupplementaryExam object is created");
}

public boolean allow(HallTicket hallTicket){
System.out.println("Invoked allow from SupplementaryExam");
super.code="453eer";
super.fees=999;
return super.allow(hallTicket);
}

}