package DonneNotable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Disease {
    private String fullName;
    private String abbreviatedName;
    private int currentLevel;
    private int maxLevel;

    public Disease(String fullName, String abbreviatedName, int currentLevel, int maxLevel) {
        this.fullName = fullName;
        this.abbreviatedName = abbreviatedName;
        this.currentLevel = currentLevel;
        this.maxLevel = maxLevel;
    }

    public int decreaseLevel() {
        currentLevel--;
        return currentLevel;
    }

    public int increaseLevel() {
        currentLevel++;
        return currentLevel;
    }

    public int changeLevel() {
        currentLevel = maxLevel;
        return currentLevel;
    }

    public boolean isLethal(Disease disease){
        boolean isLethal = false;
        if(currentLevel == maxLevel){
            isLethal = true;
            System.out.println("Le niveau de la maladie est létal.");
        }
        return isLethal;
    }

    public Disease(String fullName, String abbreviatedName) {
        this.fullName = fullName;
        this.abbreviatedName = abbreviatedName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public static class DiseaseManager {
        private List<Disease> diseases;
        private Random rand;

        public DiseaseManager() {
            this.diseases = new ArrayList<>();
            this.rand = new Random();
            populateDiseases();
        }

        private void populateDiseases() {
            diseases.add(new Disease("Maladie débilitante chronique", "MDC"));
            diseases.add(new Disease("Syndrome fear of missing out", "FOMO"));
            //continuer la trad
            diseases.add(new Disease("Social Media Dependency", "SMD"));
            diseases.add(new Disease("Congenital Erythropoietic Porphyria", "CEP"));
            diseases.add(new Disease("Paraphrenic Lycanthropic Zoopathy", "PLZ"));

            diseases.add(new Disease("Chronic Debugging Disorder", "CDD"));
            diseases.add(new Disease("Error 404 Syndrome", "E404"));
            diseases.add(new Disease("Packet Loss Anxiety", "PLA"));
            diseases.add(new Disease("Latency Overload Syndrome", "LOS"));
            diseases.add(new Disease("Syntax Fever", "SF"));
            diseases.add(new Disease("Ctrl+Alt+Del Dependency", "CADD"));
            diseases.add(new Disease("Infinite Loop Disorder", "ILD"));
            diseases.add(new Disease("Cache Memory Overflow", "CMO"));
            diseases.add(new Disease("Artificial Intelligence Paranoia", "AIP"));
            diseases.add(new Disease("Download Fatigue Syndrome", "DFS"));
            diseases.add(new Disease("Byte Hunger Disorder", "BHD"));
            diseases.add(new Disease("Blockchain Obsession Disorder", "BOD"));
            diseases.add(new Disease("Wi-Fi Dependency Disorder", "WDD"));
            diseases.add(new Disease("Blue Screen Trauma", "BST"));
            diseases.add(new Disease("Firmware Amnesia Syndrome", "FAS"));
            diseases.add(new Disease("Overclocking Burnout", "OB"));
            diseases.add(new Disease("Emoticon Overuse Syndrome", "EOS"));
            diseases.add(new Disease("Digital Hoarding Disorder", "DHD"));
            diseases.add(new Disease("Fake News Susceptibility Syndrome", "FNSS"));
            diseases.add(new Disease("Ping Rage Disorder", "PRD"));
        }

        // Récupération aléatoire d'une maladie
        public Disease getRandomDisease() {
            return diseases.get(rand.nextInt(diseases.size()));
        }
    }
}
