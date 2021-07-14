class Chocolate{
	
	
	public String name;
    public String brand;
    public int noOfBites;
    public int price;
	public boolean isOfferAvailable;
	
	public Chocolate(){
		System.out.println();
	}

	
	@Override
	public boolean equals(Object chocolate){
		if(chocolate instanceof Chocolate){
			Chocolate choco1 =(Chocolate)chocolate;
			if(this.hashCode()==choco1.hashCode()){
				return true;
			}
				if(this.name.equals(choco1.name)){
					return true;
				}else{
					System.out.println("Names are different");
				}
				if(this.brand.equals(choco1.brand)){
					return true;
				}else{
					System.out.println("Brands are different");
				}
				if(this.noOfBites==choco1.noOfBites){
					return true;
				}else{
					System.out.println("Bites are different");
				}
				if(this.price==choco1.price){
					return true;
				}else{
					System.out.println("price are different");
				}
				if(this.isOfferAvailable==choco1.isOfferAvailable){
					return true;
				}else{
					System.out.println("Offers are not available");
				}
			}else{
				System.out.println("Not a same type");
				return false;
			}
			return false;
	}
	
}