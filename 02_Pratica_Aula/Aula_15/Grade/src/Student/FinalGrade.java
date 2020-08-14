package Student;

public class FinalGrade {
	
	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	public String result;
	
	
	public double Final(){
		return (grade1 + grade2 + grade3);
	}
	
	public String Evaluation(){

		if ((grade1 + grade2 + grade3) < 60) {
			result  = "FAILED";
		} else {
			result = "PASS";
		}
		
		return result;
	}
	
	public double Missing(){
		return (60 - (grade1 + grade2 + grade3));
	}

}
