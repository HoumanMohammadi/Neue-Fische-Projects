// test
//Die Rentenkasse möchte ein Programm haben, um zu berechnen, ob Beiträge ausgezahlt werden sollen.
//Aufgabe A. :
//Lies mit Scanner ein wann die Person angefangen hat zu arbeiten
//Finde heraus wie lange die Person gearbeitet hat (Tipp: Du brauchst das jetzige Jahr)
//Hat die Person weniger als 50 Arbeitsjahre gib die Nachricht aus: "Rente ist noch nicht in Aussicht..."
//Hat die Person zwischen 50 & 54 Arbeitsjahre gib die Nachricht aus: "Du gehst bald in Rente"
//Hat die Person 55 oder mehr Arbeitsjahre gib die Nachricht aus: "Du darfst in die Rente! Hier sind 100€, viel Spaß haha"
//Aufgabe B. :
//Erweiter die Anwendung. Bevor das Alter geprüft wird, soll geprüft werden, ob die Person überhaupt Mitglied in der Rentenkasse ist.
//Lies dafür einen boolean ein
//Wenn die Person in der Rentenkasse ist, sollen die Jahre berechnet werden
//Wenn nicht, gib aus "Du bist gar nicht in der Rentenkasse du Schmarotzer!"


package de.iav.helloworld;
import java.time.Year;
import java.util.Scanner;
public class Rentenkasse {
	public static void main(String[] args) {
		System.out.println("Sind Sie Mitgelied der Rentenkasse? (Wenn Ja mit 'true' sonst mit 'false' beantworten) ");		
		Scanner scanner = new Scanner(System.in);
		boolean mitglied=scanner.nextBoolean();		

		if(mitglied) {
			System.out.println("Wann haben Sie angefangen zu arbeiten? ");		
			int anfangsJahr=scanner.nextInt();
			Year year= Year.now();
			int currentYear= year.getValue();
			int arbeitsJahre=currentYear-anfangsJahr;
			if(arbeitsJahre<50) {
				System.out.println("Sie haben nur "+arbeitsJahre+" gearbeitet!");
				System.out.println("Rente ist noch nicht in Aussicht...");
			}else if(arbeitsJahre>=50 && arbeitsJahre<=54) {
				System.out.println("Sie haben "+arbeitsJahre+" gearbeitet!");
				System.out.println("Du gehst bald in Rente");
			}else {
				System.out.println("Sie haben "+arbeitsJahre+" gearbeitet!");
				System.out.println("Du darfst in die Rente! Hier sind 100€, viel Spaß haha");
			}
			scanner.close();
		}else {
			System.out.println("Du bist gar nicht in der Rentenkasse du Schmarotzer!");
		}
		
	}

}
