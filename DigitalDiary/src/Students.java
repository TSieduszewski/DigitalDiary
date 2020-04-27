import java.util.*;
import java.util.regex.*;

public class Students extends Data {


	int idS;
	boolean testMenu;
	
	String[][] students = {{"Abacki Grzegorz", "1", "A", "10001"}, 
							{"Adacki Marian", "1", "A", "10002"}, 
							{"Anicki Bartosz", "1", "A", "10003"}
							,
							{"Babacki Grzegorz", "1", "B", "10004"}, 
							{"Badacki Marian", "1", "B", "10005"}, 
							{"Balucki Tomasz", "1", "B", "10006"}
							,
							{"Cabacki Grzegorz", "1", "C", "10007"}, 
							{"Cawacka Ma³gorzata", "1", "C", "10008"},  
							{"Cabedzki Micha³", "1", "C", "10009"}
							,
							{"Dabacki Grzegorz", "1", "D", "10010"}, 
							{"Dadacki Marian", "1", "D", "10011"}, 
							{"Dabedzki Micha³", "1", "D", "10012"}
							,
							{"Fabacki Grzegorz", "2", "A", "10013"}, 
							{"Fadacki Marian", "2", "A", "10014"}, 
							{"Fabedzki Micha³", "2", "A", "10015"}
							,
							{"Gabacki Grzegorz", "2", "B", "10016"},  
							{"Gakacki Julian", "2", "B", "10017"}, 
							{"Gabedzki Micha³", "2", "B", "10018"}
							,
							{"Habacki Grzegorz", "2", "C", "10019"},  
							{"Hatocka Julia", "2", "C", "10020"},
							{"Habedzki Micha³", "2", "C", "10021"}
							,
							{"Jabacki Grzegorz", "2", "D", "10022"}, 
							{"Jajecka Barbara", "2", "D", "10023"}, 
							{"Jabedzki Micha³", "2", "D", "10024"}
							,
							{"Kabacki Grzegorz", "3", "A", "10025"},  
							{"Kanicki Bartosz", "3", "A", "10026"}, 
							{"Kajencka Katarzyna", "3", "A", "10027"}
							,
							{"Labacki Grzegorz", "3", "B", "10028"},  
							{"Lalucki Tomasz", "3", "B", "10029"}, 
							{"Lanicki Bartosz", "3", "B", "10030"} 
							,
							{"£abacki Grzegorz", "3", "C", "10031"}, 
							{"£adacki Marian", "3", "C", "10032"},  
							{"£abedzki Micha³", "3", "C", "10033"}
							,
							{"Mabacki Grzegorz", "3", "D", "10034"}, 
							{"Madacki Marian", "3", "D", "10035"}, 
							{"Mabedzki Micha³", "3", "D", "10036"}
							,
							{"Nabacki Grzegorz", "4", "A", "10037"}, 
							{"Nadacki Marian", "4", "A", "10038"},  
							{"Nabedzki Micha³", "4", "A", "10039"}
							,
							{"Pabacki Grzegorz", "4", "B", "10040"}, 
							{"Padacki Marian", "4", "B", "10041"},  
							{"Pabedzki Micha³", "4", "B", "10042"}
							,
							{"Rabacki Grzegorz", "4", "C", "10043"}, 
							{"Ratacki Pawe³", "4", "C", "10044"}, 
							{"Rabedzki Micha³", "4", "C", "10045"}
							,
							{"Sabacki Grzegorz", "4", "D", "10046"},  
							{"Satacki Pawe³", "4", "D", "10047"}, 
							{"Sabedzki Micha³", "4", "D", "10048"}
							};

	
	
	public Students(){
		
	}
	
	public Students(String st) {	
		super(st);

	}
	@Override	
	public void getStudent() {
		
		
		System.out.printf("%-30s", "Nazwisko i imiê");
		System.out.printf("%-30s", "Klasa");
		System.out.printf("%-30s\n", "Wychowawca");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s\n", "--------------");
		
		for(int w=0; w < students.length;w++) {
		//	String testName = students[w][3];
			//Pattern pa = Pattern.compile(st, Pattern.CASE_INSENSITIVE);
		//	Matcher ma = pa.matcher(testName);
			if(students[w][3].equals(st)) {
				System.out.printf("%-30s", students[w][0]);
				System.out.printf("%-30s", students[w][1]+students[w][2]);
				idS=w;
				
			}

			}
	}
	@Override
	public int getID() {
		return idS;
	}
	
	@Override
	public void setTest() {
		for(int z=0; z < students.length;z++) {
				if(students[z][3].equals(st)) {
					testMenu = true;					
				}

				}	
	}
	@Override
	public boolean getTest() {
		return testMenu;
	}
	
	@Override
	public char setFinish() {
		System.out.println("Zakoñczyæ? [T]-tak, [N]-nie");
		Scanner keyb5 = new Scanner(System.in);
		char option = keyb5.next().charAt(0);
	return option;
	}
}

/*
public void getAllStudents() {
System.out.printf("%-30s", "Nazwisko i imiê");
System.out.printf("%-30s\n", "Klasa");
System.out.printf("%-30s", "---------------");
System.out.printf("%-30s\n", "-----");
for(int w=0; w < students.length;w++) {	
System.out.printf("%-30s", students[w][0]);
System.out.printf("%-30s\n", students[w][1]+students[w][2]);
}
}

public void getClassStudents() {
		System.out.println("Podaj rocznik:");
		Scanner keyb = new Scanner(System.in);
		String year = keyb.nextLine();
		System.out.println("Podaj literê szukanej klasy");
		Scanner keyb2 = new Scanner(System.in);
		String classLetter = keyb2.nextLine().toUpperCase();	
		String finalClass = year+classLetter;

		System.out.printf("%-30s", "Nazwisko i imiê");
		System.out.printf("%-30s\n", "Klasa");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s\n", "-----");
		
		for(int w=0; w < students.length;w++) {
			String finCl = students[w][1]+students[w][2];
			if(finalClass.equals(finCl)) {
				System.out.printf("%-30s", students[w][0]);
				System.out.printf("%-30s\n", students[w][1]+students[w][2]);
			}
			
		}					
	}

*/