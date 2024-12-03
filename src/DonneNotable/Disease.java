package DonneNotable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Disease {
    private final String fullName;
    private final String abbreviatedName;
    private int currentLevel;
    private final int maxLevel;

    private static List<Disease> diseases;
    private static Random rand;

    static {
        diseases = new ArrayList<>();
        rand = new Random();
        Diseases();
    }
    public Disease(String fullName, String abbreviatedName) {
        this.fullName = fullName;
        this.abbreviatedName = abbreviatedName;
        this.currentLevel = 0;
        this.maxLevel = 50;
    }

    public void decreaseLevel() {
        currentLevel--;
    }

    public void increaseLevel() {
        currentLevel++;
    }

    public int changeLevel() {
        if (currentLevel > maxLevel) {
            currentLevel = maxLevel;
        }
        return currentLevel;
    }

    public boolean isLethal(Disease disease) {
        boolean isLethal = false;
        if (currentLevel == maxLevel) {
            isLethal = true;
            System.out.println("Le niveau de la maladie est létal.");
        }
        return isLethal;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    private static void Diseases() {
        diseases.add(new Disease("Maladie débilitante chronique", "MDC")); // Provoque une fatigue physique et mentale paralysante.
        diseases.add(new Disease("Syndrome fear of missing out", "FOMO")); // Anxiété liée à la peur de manquer des opportunités sociales.
        diseases.add(new Disease("Dépendance aux réseaux sociaux", "DRS")); // Addiction empêchant de se déconnecter des plateformes sociales.
        diseases.add(new Disease("Porphyrie érythropoïétique congénitale", "PEC")); // Sensibilité extrême au soleil, associée à des mythes vampiriques.
        diseases.add(new Disease("Zoopathie paraphrénique lycanthropique", "ZPL")); // &&&&&Trouble où l'individu se croit transformé en animal sauvage.

        diseases.add(new Disease("Trouble de débogage chronique", "TDC")); // Obsession pour corriger des bugs, même imaginaires, sans passer des nuits blanches.
        diseases.add(new Disease("Syndrome erreur 404", "E404")); // Sentiment constant d'être perdu ou introuvable. / Une confusion mentale où le cerveau "ne trouve pas" ce qu'il cherche.
        diseases.add(new Disease("Anxiété de perte de paquets", "APP")); // Peur irrationnelle que chaque communication soit perdue dans le vide ou dans un mur.
        diseases.add(new Disease("Surcharge de latence", "SL")); // Frustration liée aux retards humains répétés.
        diseases.add(new Disease("Fièvre de la syntaxe", "FS")); // Trouble causé par des erreurs constantes dans le code. / Obsession de corriger les erreurs de syntaxe dans tout, y compris les conversations.
        diseases.add(new Disease("Trouble de la boucle infinie", "TBI")); // Blocage mental dû à des répétitions sans fin d'une meme tache. / Perte totale de productivité due à une boucle mentale répétitive.
        diseases.add(new Disease("Débordement de mémoire cache", "DMC")); // Confusion causée par un excès de pensées inutilisées. / Difficulté à se concentrer, car trop d’informations inutiles restent en mémoire.
        diseases.add(new Disease("Paranoïa de l'intelligence artificielle", "PIA")); // Peur irrationnelle des machines pensantes. / Conviction que toute technologie travaille contre vous.
        diseases.add(new Disease("Syndrome de fatigue de téléchargement", "SFT")); // Épuisement provoqué par l'attente interminable de téléchargements ou mises à jour.
        diseases.add(new Disease("Trouble de faim de données", "TFD")); // Frénésie d'accumulation de fichiers inutiles. / Un besoin insatiable de consommer des contenus, même inutiles.
        diseases.add(new Disease("Dépendance au Wi-Fi", "DW")); // Anxiété lorsque le Wi-Fi est indisponible. / Panique immédiate dès qu'une connexion Wi-Fi est perdue.
        diseases.add(new Disease("Traumatisme d'écran bleu", "TEB")); // Crainte persistante d'une panne catastrophique. / Terreur irrationnelle provoquée par la vue d’un écran bleu, même sur un panneau d’affichage.
        diseases.add(new Disease("Burnout d'overclocking", "BO")); // Surmenage dû à une performance excessive. / Conséquence directe de toujours forcer les limites, que ce soit mentalement ou physiquement.
        diseases.add(new Disease("Syndrome d'abus d'émoticônes", "SAE")); // Usage compulsif et inapproprié d'émoticônes. / Incapacité de communiquer sans ajouter au moins trois émojis à chaque phrase.
        diseases.add(new Disease("Syndrome de crédulité face aux fake news", "SCFN")); // Tendance à croire ou partager sans réfléchir des informations douteuses.
        diseases.add(new Disease("Trouble de la rage du ping", "TRP")); // Colère excessive provoquée par un délai d'attente trop long.
        diseases.add(new Disease("Trouble du Tenrack aigue", "TTA")); // Obsession à manger constament des plats à base de Raclette et de Tenders.
    }

    // Récupération aléatoire d'une maladie
    public static Disease getRandomDisease() {
        return diseases.get(rand.nextInt(diseases.size()));
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "\nMaladie {" +
                "\n Nom = '" + abbreviatedName + '\'' +
                " : '" + fullName + '\'' +
                ",\n Niveau actuel = " + currentLevel +
                ",\n Niveau maximal = " + maxLevel +
                "\n}";
    }
}
