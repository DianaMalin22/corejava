
		class MedicineTester{
	
	    public static void main(String a[]){
		Medicine medicine =new Medicine();
		
		medicine.medicineId=56;
		medicine.name="Sumo Cold";
		medicine.chemical="Brufin";
		medicine.noOfTablets=30;
		medicine.price=6;
		medicine.isAvailable=true;
		System.out.println(medicine.name);
		System.out.println(medicine.hashCode());
		
		boolean type=medicine.equals(medicine);
		System.out.println(type);
		}
		}