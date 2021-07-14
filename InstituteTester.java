
		class InstituteTester{
	
	    public static void main(String a[]){
		Institute institute =new Institute();
		
		institute.instituteId=56;
		institute.name="PDIT";
		institute.location="T B Dam";
		institute.noOfBranches=7;
		institute.noOfBlocks=6;
		institute.isHostelAvailable=true;
		System.out.println(institute.name);
		System.out.println(institute.hashCode());
		
		boolean type=institute.equals(institute);
		System.out.println(type);
		}
		}