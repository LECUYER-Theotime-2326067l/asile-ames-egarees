package DonneNotable;

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

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public void setAbbreviatedName(String abbreviatedName) {
        this.abbreviatedName = abbreviatedName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isLethal(Disease disease){
        boolean isLethal = false;
        if(currentLevel == maxLevel){
            isLethal = true;
            System.out.println("Le niveau de la maladie est létal.");
        }
        return isLethal;
    }
}