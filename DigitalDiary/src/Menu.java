import java.io.IOException;
import java.util.Scanner;

public class Menu {
	int menuChoice;
	boolean tf;
	
	public void Selector() {
		Scanner menu = new Scanner(System.in);
		menuChoice = menu.nextInt();
	}
	public void Falser() throws IOException {
		System.out.println("Naciœnij dowolny przycisk, aby powróciæ do menu");		
		tf = true;
		System.in.read();
		
	}
	public boolean getFalser() {
		return tf;
	}
	public void MainMenu() {			
		System.out.println("Witaj w dzienniku elektronicznym. Podaj poziom uprawnieñ:");
		System.out.println("1 - Dyrektor\n2 - Nauczyciel\n3 - Rodzic");			
	}
	
	public void DirectorChoice() {
		System.out.println("Co chcesz zrobiæ?");
		System.out.println("1 - Pobraæ bazê uczniów\n2 - Pobraæ bazê nauczycieli\n3 - Pobraæ wszystkie przedmioty");

	}
	
	public int getSelector() {		
		return menuChoice;
		}
	}

