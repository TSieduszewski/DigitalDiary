import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teachers extends Students{
	String teacher = "0";
	
	Teachers(){
		
	}
	
	public Teachers(String st) {
		super(st);
	}
	
	String[][] teachers = {{"Matematyczny Jan", "Matematyka", "Tak", "1A"}, 
							{"Poloniska Anna", "Jêzyk Polski", "Tak", "2B"}, 
							{"Anglo Jan", "Jêzyk Angielski", "Tak", "3C"}, 
							{"Biolicka Zofia", "Biologia", "Tak", "1D"},
							{"Histor Tomasz", "Historia", "Nie", "Brak"}, 
							{"Wosowski Bartosz", "WOS", "Nie", "Brak"}, 
							{"Chemika Katarzyna", "Chemia", "Tak", "4C"},
							{"Fizocki Piotr", "Fizyka", "Nie", "Brak"}, 
							{"Pobo¿na Barbara", "Religia", "Nie", "Brak"}, 
							{"Sportowy Micha³", "WF", "Tak", "2A"}
							};
	
	String[][] tsub = {{"Matematyczny Jan", "Matematyka", "1", "2", "3", "4", "A", "B", "C", "D"}, 
									{"Poloniska Anna", "Jêzyk Polski", "1", "2", "3", "4", "A", "B", "C", "D"}, 
									{"Anglo Jan", "Jêzyk Angielski", "0", "2", "3", "4", "A", "B", "C", "D"}, 
									{"Biolicka Zofia", "Biologia", "0", "2", "3", "0", "A", "B", "C", "D"},
									{"Histor Tomasz", "Historia", "0", "2", "3", "0", "A", "B", "C", "D"}, 
									{"Wosowski Bartosz", "WOS", "0", "2", "3", "0", "A", "B", "C", "D"}, 
									{"Chemika Katarzyna", "Chemia", "1", "2", "0", "0", "A", "B", "C", "D"},
									{"Fizocki Piotr", "Fizyka", "1", "2", "3", "0", "A", "B", "C", "D"}, 
									{"Pobo¿na Barbara", "Religia", "0", "2", "0", "0", "A", "B", "C", "D"}, 
									{"Sportowy Micha³", "WF", "1", "2", "3", "4", "A", "B", "C", "D"}
									};
	
	//String[] classes = {"1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D", "3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D"}; 
	
	@Override
	public void getStudent() {
		
		super.getStudent();
		String finClass=students[getID()][1]+students[getID()][2];
			for(int w=0; w < teachers.length;w++) {
			if(teachers[w][3].equals(finClass)) {
				teacher = teachers[w][0];
				System.out.println(teacher);
			
			}
			} 
			if(teacher=="0") {
				System.out.println("Brak wychowawcy");
			} 
	
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public void getAllTeachers(){
		System.out.printf("%-30s", "Nazwisko i imiê");
		System.out.printf("%-30s", "Przedmiot nauczany");
		System.out.printf("%-30s", "Wychowawstwo?");
		System.out.printf("%-30s\n", "Która klasa");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s", "------------------");
		System.out.printf("%-30s", "-------------");
		System.out.printf("%-30s\n", "-----------");
		for(int w=0; w < teachers.length;w++) {	
			System.out.printf("%-30s", teachers[w][0]);
			System.out.printf("%-30s", teachers[w][1]);
			System.out.printf("%-30s", teachers[w][2]);
			System.out.printf("%-30s\n", teachers[w][3]);
		}
	}
	
	public void getClassTeachers() {
		System.out.printf("%-30s", "Która klasa");
		System.out.printf("%-30s\n", "Wychowawstwo");
		System.out.printf("%-30s", "-----------");
		System.out.printf("%-30s\n", "------------");
		
		for(int w=0; w < classes.length;w++) {	

			System.out.printf("%-30s", classes[w]);	
				for (int e=0; e < teachers.length;e++) {
					if(classes[w].equals(teachers[e][3])) {
						System.out.printf("%-30s\n", teachers[e][0]);
					break;	
					}
					if(e == teachers.length-1) {
						System.out.println("Brak wychowawcy");
						break;
					}
				
			}
			
		}					
	}
	
	public void getTeacher() {
		System.out.println("Podaj dane nauczyciela (imiê i/lub nazwisko, ca³oœæ lub fragment): ");
		Scanner keyb3 = new Scanner(System.in);
		String findName = keyb3.nextLine();
		
		System.out.printf("%-30s", "Nazwisko i imiê");
		System.out.printf("%-30s\n", "Przedmiot");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s\n", "-----");
		
		for(int w=0; w < teachers.length;w++) {
			String testName = teachers[w][0];
			Pattern pa = Pattern.compile(findName, Pattern.CASE_INSENSITIVE);
			Matcher ma = pa.matcher(testName);
			if(ma.find()) {
				System.out.printf("%-30s", teachers[w][0]);
				System.out.printf("%-30s\n", teachers[w][1]);
			}
	}
	}
	
	@Override
	public void getStudent() {
		super.getStudent();
		System.out.println("Wychowawca:");
	}
}*/
