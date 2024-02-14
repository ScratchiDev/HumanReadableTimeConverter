import java.util.Scanner;

public class ConvertisseurTempsAvecJours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le temps en secondes : ");
        int tempsEnSecondes = scanner.nextInt();

        int jours = tempsEnSecondes / 86400;
        int heures = (tempsEnSecondes % 86400) / 3600;
        int minutes = ((tempsEnSecondes % 86400) % 3600) / 60;
        int secondesRestantes = ((tempsEnSecondes % 86400) % 3600) % 60;

        StringBuilder resultat = new StringBuilder("Cela correspond à :");

        if (jours > 0) {
            resultat.append(" ").append(jours).append(" jour").append(jours > 1 ? "s," : ",");
        }
        if (heures > 0) {
            resultat.append(" ").append(heures).append(" heure").append(heures > 1 ? "s," : ",");
        }
        if (minutes > 0) {
            resultat.append(" ").append(minutes).append(" minute").append(minutes > 1 ? "s," : ",");
        }
        if (secondesRestantes > 0) {
            resultat.append(" ").append(secondesRestantes).append(" seconde").append(secondesRestantes > 1 ? "s." : ".");
        }

        if (resultat.toString().endsWith(",")) {
            resultat = new StringBuilder(resultat.substring(0, resultat.length() - 1) + ".");
        }

        if (jours == 0 && heures == 0 && minutes == 0 && secondesRestantes == 0) {
            resultat.append(" 0 seconde.");
        }

        System.out.println(resultat);

        scanner.close();
    }
}
