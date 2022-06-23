package capFour;
// Classe Student que armazena o nome e a média de um aluno.
public class Student {
	
	private String name;
	
	private double avarege;
	
	public Student (String name, double avarege) {
		
		this.name = name;
		
		if(avarege > 0.0 && avarege <= 100.0) {
			
			this.avarege = avarege;
			
		}
			
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	
	public void setAvarege(double avarege) {
		
		if(avarege > 0.0 && avarege <= 100.0) {
			
			this.avarege = avarege;
			
		}
		
	}
	
	public double getAvarege() {
		
		return avarege;
		
	}
	
	public String getLetterGrade() {
		
		if(avarege >= 90.0) {
			
			return "A";
			
		}
		
		if(avarege >= 80.0) {
			
			return "B";
			
		}
		
		if(avarege >= 70.0) {
			
			return "C";
			
		}
		
		if(avarege >= 60.0) {
			
			return "D";
			
		}
		
		return "F";
		
	}
	
	
	

}
