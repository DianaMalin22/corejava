
		class ChocolateTester{
	
	    public static void main(String a[]){
		Chocolate chocolate =new Chocolate();
		
		
		chocolate.name="Silk";
		chocolate.brand="Dairy milk";
		chocolate.noOfBites=7;
		chocolate.price=134;
		chocolate.isOfferAvailable=true;
		System.out.println(chocolate.name);
		System.out.println(chocolate.hashCode());
		
		boolean type=chocolate.equals(chocolate);
		System.out.println(type);
		}
		}