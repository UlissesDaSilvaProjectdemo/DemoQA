
public class practice {
	public  String name;
	public  int age;
	public  String salary;
	public  int bonus; 
	public  String address;
	public  String postcode;


	public void first(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println(name + age);

	}

	public  void second(String salary, int bonus) {
		this.salary=salary;
		this.bonus=bonus;
		System.out.println(salary+bonus);
	}

	public void third(String address, String postcode) {
		this.address=address;
		this.postcode=postcode;
		System.out.println(address + postcode);
	}
	
	
	public static void fourth() {
	 System.out.println("fourth");
	 
	 int count =10;
	 for(count=0;count<10;count++) {
		 System.out.println(count);
		 
	       }
	 
	}
	
	
	  
		 
		 public void missingNumberArray() {
			 int array[] = {1,2,3,5,};
			 int sum = 0;
			 for(int i=0; i<array.length;i++) {
				 sum =sum =array[i];
				 	 
			 }	
			 System.out.println(sum);	 
		 }
		 	 		 
	 
		 
     	 public  void  findDuplicateStringArray(){
			 
			 String names[] = {"java","python","Ruby","Java"};
			 
			 for(int i=0;i<names.length;i++) {
				 for(int j = i+1; j<names.length;j++) {
					 if(names.equals(names[j])) {
						 //System.out.println("duplicate is::" + names[i]);
					 } 
				 } 
				 System.out.println("duplicate is::" + names[i]);
			 } 
			 
		 }
     	 
  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	practice obj = new practice();
//		obj.first("marta",10);
//		obj.second("one",25);
//		obj.third("E78UH","65 holborn");
//		
//		obj.fourth();
//		practice.fourth();
//		
	//	array objarray = new array();
		//objarray.missingNumberArray();
		
    	obj.findDuplicateStringArray(); 
    	 

	}

}
