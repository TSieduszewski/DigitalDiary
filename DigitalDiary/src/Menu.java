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
		System.out.println("Naci�nij dowolny przycisk, aby powr�ci� do menu");		
		tf = true;
		System.in.read();
		
	}
	public boolean getFalser() {
		return tf;
	}
	public void MainMenu() {			
		System.out.println("Witaj w dzienniku elektronicznym. Podaj poziom uprawnie�:");
		System.out.println("1 - Dyrektor\n2 - Nauczyciel\n3 - Rodzic");			
	}
	
	public void DirectorChoice() {
		System.out.println("Co chcesz zrobi�?");
		System.out.println("1 - Pobra� baz� uczni�w\n2 - Pobra� baz� nauczycieli\n3 - Pobra� wszystkie przedmioty");

	}
	
	public int getSelector() {		
		return menuChoice;
		}
	}

