import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Tomek
 * @version 0.1.5
 * Dziennik elektroniczny - æwiczenie JAVA
 */
public class DigitalDiaryDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		boolean t = true;
		Subjects n;
		
		
		
		while (t) {
			System.out.println("Podaj ID ucznia (od 10001 do 10040): ");
			Scanner keyb3 = new Scanner(System.in);
			String findName = keyb3.nextLine();
			n = new Subjects(findName);
			n.setTest();
			if(n.getTest()) {
			n.getStudent();	
			} else {
				System.out.println("B³êdny numer lub brak ucznia");
			}
				
			char option=n.setFinish();
			if(option=='T' || option=='t') {
				t = false;
			}	
						
		}		
	}
	
}	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*boolean test = true;
	do {
		
	Menu menu = new Menu();	
	Students stud = new Students();
	Teachers teach = new Teachers();
	Subjects sub = new Subjects();
	menu.MainMenu();
	menu.Selector();	
	menu.getSelector();
	switch(menu.getSelector()) {
	case 1: {
		menu.DirectorChoice();
		menu.Selector();	
		menu.getSelector();
		boolean testmenu = true;
					
		switch(menu.getSelector()) {
		
			case 1: {			
			stud.getAllStudents();
			break;
			}
			case 2: {
			teach.getStudent();
			
			break;
			}
			case 3: {
			sub.getAllSubjects();
			
			break;
			}
			default: {System.out.println("Wybrano niepoprawn¹ opcjê");testmenu = true; }
		}
		
	 
	break;	
	}
	case 2: {
		System.out.println("Opcja nr2");
		break;
	}
	default: {System.out.println("Wybrano niepoprawn¹ opcjê");test = true; }
	}
	} while (test);
	}	
}

		
		System.out.println("Wybierz sekcje");
		System.out.println("1 - Uczniowie\n2 - Nauczyciele\n3 - Przedmioty");
		Scanner menu11 = new Scanner(System.in);
		int menuChoice = menu11.nextInt();
		

*/