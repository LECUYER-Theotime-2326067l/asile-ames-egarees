package creatures;

public class Disease {
    private String fullName;
    private String name;
    private int currentLevel;
    private final int maxLevel;

    public Disease(String fullName, String name, int currentLevel, int maxLevel) {
        this.fullName = fullName;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
