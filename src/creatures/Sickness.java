package creatures;

public class Sickness {
    private String fullName;
    private String name;
    private int currentLevel;
    private int maxLevel;

    public Sickness(String fullName, String name, int currentLevel, int maxLevel) {
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

    public boolean isLethal(Sickness sickness){
        boolean isLethal = false;
        if(currentLevel == maxLevel){
            isLethal = true;
            System.out.println("Le niveau de la maladie est létal.");
        }
        return isLethal;
    }
}
