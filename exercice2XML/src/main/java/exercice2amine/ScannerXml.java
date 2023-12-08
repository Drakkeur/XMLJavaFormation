package exercice2amine;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerXml {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des informations pour le premier compte
        System.out.println("Informations pour le premier compte :");
        CompteBancaire compte1 = lireInfosCompte(scanner);

        // Lecture des informations pour le deuxième compte
        System.out.println("Informations pour le deuxième compte :");
        CompteBancaire compte2 = lireInfosCompte(scanner);

        // Création d'un objet XStream pour sérialiser en XML
        XStream xStream = new XStream();
        xStream.alias("compte", CompteBancaire.class); // Alias pour le nom de l'élément XML

        // Sérialisation des comptes en XML
        String xmlCompte1 = xStream.toXML(compte1);
        String xmlCompte2 = xStream.toXML(compte2);

        // Stockage des données dans un fichier XML
        try {
            FileWriter fileWriter = new FileWriter("comptes.xml");
            fileWriter.write("<comptes>\n");
            fileWriter.write(xmlCompte1 + "\n");
            fileWriter.write(xmlCompte2 + "\n");
            fileWriter.write("</comptes>");
            fileWriter.close();
            System.out.println("Les comptes ont été stockés dans le fichier comptes.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour lire les informations d'un compte à partir du scanner
    private static CompteBancaire lireInfosCompte(Scanner scanner) {
        System.out.println("Numéro de compte : ");
        int numCompte = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la fin de la ligne

        System.out.println("Nom du propriétaire : ");
        String nomProprietaire = scanner.nextLine();

        System.out.println("Solde : ");
        double solde = scanner.nextDouble();
        scanner.nextLine(); // Pour consommer la fin de la ligne

        System.out.println("Date de création (AAAA-MM-JJ) : ");
        LocalDate dateCreation = LocalDate.parse(scanner.nextLine());

        System.out.println("Type de compte : ");
        String typeCompte = scanner.nextLine();

        return new CompteBancaire(numCompte, nomProprietaire, solde, dateCreation, typeCompte);
    }
}