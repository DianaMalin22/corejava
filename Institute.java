
class Institute{
	
	public int instituteId;
	public String name;
    public String location;
    public int noOfBranches;
    public int noOfBlocks;
	public boolean isHostelAvailable;
	
	public Institute(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.instituteId;
	}
	
	@Override
	public boolean equals(Object institute){
		if(institute instanceof Institute){
			Institute inst1 =(Institute)institute;
			if(this.hashCode()==inst1.hashCode()){
				return true;
			}
				if(this.name.equals(inst1.name)){
					return true;
				}else{
					System.out.println("Names are different");
				}
				if(this.location.equals(inst1.location)){
					return true;
				}else{
					System.out.println("Location are different");
				}
				if(this.noOfBranches==inst1.noOfBranches){
					return true;
				}else{
					System.out.println("Branches are different");
				}
				if(this.noOfBlocks==inst1.noOfBlocks){
					return true;
				}else{
					System.out.println(" Blocks are different");
				}
				if(this.isHostelAvailable==inst1.isHostelAvailable){
					return true;
				}else{
					System.out.println("Hostels are not available");
				}
			}else{
				System.out.println("Not a same type");
				return false;
			}
			return false;
	}
	
}