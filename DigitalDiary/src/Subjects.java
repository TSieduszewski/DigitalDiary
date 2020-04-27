import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subjects extends Teachers {
	String subject;
	boolean test = true;
	Subjects(){
		
	}
	
	public Subjects(String st) {
		super(st);
	}
	
	
	String[][] subjects = {{"Matematyka", "1", "2", "3", "4"},
							{"Jêzyk Polski", "1", "2", "3", "4"},
							{"Jêzyk Angielski", "0", "2", "3", "4"},
							{"Biologia", "0", "2", "3", "0"},
							{"Historia", "0", "2", "3", "0"},
							{"WOS", "0", "2", "3", "0"},
							{"Chemia", "1", "2", "0", "0"},
							{"Fizyka", "1", "2", "3", "0"},
							{"Religia", "0", "2", "0", "0"},
							{"WF", "1", "2", "3", "4"},			
							};
	
	@Override
	public void getStudent() {
		super.getStudent();
		System.out.println("");
		System.out.println("Zestawienie ocen ucznia");
		System.out.println("");
	System.out.printf("%-30s", "Nazwa przedmiotu");
	System.out.printf("%-30s", "Nauczyciel przedmiotu");
	System.out.printf("%-30s\n", "Oceny ucznia(jeszcze nie dzia³a)");
	System.out.printf("%-30s", "----------------");
	System.out.printf("%-30s", "---------------------");
	System.out.printf("%-30s\n", "-----------------");
	
	for(int w=0; w < subjects.length;w++) {	
		for(int j=1; j<=4;j++) {					
			if(subjects[w][j].equals(students[idS][1])) {
				subject = subjects[w][0];
				System.out.printf("%-30s",subject);
				
				for(int k=0;k<tsub.length;k++) {
					if(subject.equals(tsub[k][1])) {
					System.out.println(tsub[k][0]);									
					}	
				}
			}
		}				
	}				
	}	
}	
	/*	System.out.printf("%-30s", subjects[w][0]);
		if(subjects[w][1].equals("0")) {
			System.out.printf("%-5s"," ");
		} else {
		System.out.printf("%-5s", subjects[w][1]);
		}
		if(subjects[w][2].equals("0")) {
			System.out.printf("%-5s"," ");
		} else {
		System.out.printf("%-5s", subjects[w][2]);
		}
		if(subjects[w][3].equals("0")) {
			System.out.printf("%-5s"," ");
		} else {
		System.out.printf("%-5s", subjects[w][3]);
		}
		if(subjects[w][4].equals("0")) {
			System.out.printf("%-5s\n"," ");
		} else {
		System.out.printf("%-5s\n", subjects[w][4]);
		}*/

/*	public void getAllSubjects(){
		System.out.printf("%-30s", "Nazwa przedmiotu");
		System.out.printf("%-30s\n", "W jakich klasach");
		System.out.printf("%-30s", "----------------");
		System.out.printf("%-30s\n", "-----------------");
		for(int w=0; w < subjects.length;w++) {				
			System.out.printf("%-30s", subjects[w][0]);
			if(subjects[w][1].equals("0")) {
				System.out.printf("%-5s"," ");
			} else {
			System.out.printf("%-5s", subjects[w][1]);
			}
			if(subjects[w][2].equals("0")) {
				System.out.printf("%-5s"," ");
			} else {
			System.out.printf("%-5s", subjects[w][2]);
			}
			if(subjects[w][3].equals("0")) {
				System.out.printf("%-5s"," ");
			} else {
			System.out.printf("%-5s", subjects[w][3]);
			}
			if(subjects[w][4].equals("0")) {
				System.out.printf("%-5s\n"," ");
			} else {
			System.out.printf("%-5s\n", subjects[w][4]);
			}
		}
	}
	
	public void getSubject() {
		System.out.println("Podaj nazwê przedmiotu (ca³oœæ lub fragment): ");
		Scanner keyb4 = new Scanner(System.in);
		String findSubject = keyb4.nextLine();
		
		System.out.printf("%-30s", "Nazwa przedmiotu");
		System.out.printf("%-30s\n", "W jakich klasach");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s\n", "-----------------");
		
		for(int w=0; w < subjects.length;w++) {
			String testSubject = subjects[w][0];
			Pattern pa = Pattern.compile(findSubject, Pattern.CASE_INSENSITIVE);
			Matcher ma = pa.matcher(testSubject);
			if(ma.find()) {
				System.out.printf("%-30s", subjects[w][0]);
				if(subjects[w][1].equals("0")) {
					System.out.printf("%-5s"," ");
				} else {
				System.out.printf("%-5s", subjects[w][1]);
				}
				if(subjects[w][2].equals("0")) {
					System.out.printf("%-5s"," ");
				} else {
				System.out.printf("%-5s", subjects[w][2]);
				}
				if(subjects[w][3].equals("0")) {
					System.out.printf("%-5s"," ");
				} else {
				System.out.printf("%-5s", subjects[w][3]);
				}
				if(subjects[w][4].equals("0")) {
					System.out.printf("%-5s\n"," ");
				} else {
				System.out.printf("%-5s\n", subjects[w][4]);
				}
			}
	}
	}
	
	public void getClassSubjects() {
		System.out.println("Podaj rocznik: ");
		Scanner keyb4 = new Scanner(System.in);
		String findSubject = keyb4.nextLine();
		
		System.out.printf("%-30s\n", "Nazwa przedmiotów");
		System.out.printf("%-30s\n", "-----------------");
		int k = Integer.parseInt(findSubject);
		
		while(k>1) {
		
		for(int w=0; w < subjects.length;w++) {
			String testSubject = subjects[w][k];
			Pattern pa = Pattern.compile(findSubject, Pattern.CASE_INSENSITIVE);
			Matcher ma = pa.matcher(testSubject);
			if(ma.find()) {
				System.out.printf("%-30s\n", subjects[w][0]);
			} 
	} k=-1;
	}
*/
