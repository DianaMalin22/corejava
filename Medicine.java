class Medicine{
	
	public int medicineId;
	public String name;
    public String chemical;
    public int noOfTablets;
    public int price;
	public boolean isAvailable;
	
	public Medicine(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.medicineId;
	}
	
	@Override
	public boolean equals(Object medicine){
		if(medicine instanceof Medicine){
			Medicine med1 =(Medicine)medicine;
			if(this.hashCode()==med1.hashCode()){
				return true;
			}
				if(this.name.equals(med1.name)){
					return true;
				}else{
					System.out.println("Names are different");
				}
				if(this.chemical.equals(med1.chemical)){
					return true;
				}else{
					System.out.println("chemical are different");
				}
				if(this.noOfTablets==med1.noOfTablets){
					return true;
				}else{
					System.out.println("tablets are different");
				}
				if(this.price==med1.price){
					return true;
				}else{
					System.out.println("Price are different");
				}
				if(this.isAvailable==med1.isAvailable){
					return true;
				}else{
					System.out.println("Tablets are not available");
				}
			}else{
				System.out.println("Not a same type");
				return false;
			}
			return false;
	}
	
}