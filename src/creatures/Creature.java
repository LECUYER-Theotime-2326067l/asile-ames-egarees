package creatures;

import DonneNotable.Disease;
import hospital.MedicalServices.MedicalService;

import java.util.ArrayList;

public class Creature {
    private final String type;
    public MedicalService medicalService;
    private int enervement = 0;
    private String name;
    private String sex;
    private int weight;
    private int size;
    private int age;
    private int moralIndicator;
    private boolean isContagious;
    private ArrayList<Disease> diseaseList;

    public Creature(String type, String name, String sex, int weight, int size, int age, int moralIndicator, boolean isContagious, MedicalService medicalService) {
        this.type = type;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.moralIndicator = moralIndicator;
        this.isContagious = isContagious;
        this.diseaseList = new ArrayList<>();
        this.medicalService = medicalService;
    }

    public String getType() {
        return type;
    }

    public void healCreature(Disease disease) {
        ArrayList<Disease> list = getDiseaseList();
        if (!list.contains(disease)) return;
        for (Disease d : list) {
            if (d.getCurrentLevel() - 1 <= 0) {
                this.loseSickness(d);
            } else d.decreaseLevel();
        }
    }

    public void beMoreSick(Disease disease) {
        for (Disease d : diseaseList) {
            if (d == disease) {
                d.increaseLevel();
            }
        }
    }

    public void getAngry() {
        if (getMoralIndicator() < 15) {
            enervement++;
            if (enervement == 5) {
                System.out.println(getName() + " décide de tabasser quelqu'un avec sa chaise.");
                enervement = 0;
            }
        }
    }

    public boolean isContagious() {
        return isContagious;
    }

    public boolean setContagious(boolean contagious) {
        isContagious = contagious;
        return contagious;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMoralIndicator() {
        return moralIndicator;
    }

    public void setMoralIndicator(int moralIndicator) {
        this.moralIndicator = moralIndicator;
    }

    public ArrayList<Disease> getDiseaseList() {
        return this.diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public double setHeight(int height) {
        this.size = height;
        return height;
    }

    public double setWeight(int weight) {
        this.weight = weight;
        return weight;
    }

    public String setSex(String sex) {
        return this.sex = sex;
    }

    public void getSickness() {
        this.diseaseList.add(Disease.getRandomDisease());
    }

    public void loseSickness(Disease disease) {
        this.diseaseList.remove(disease);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "-Creature {" +
                "\n Nom = '" + name + '\'' +
                ",\n Sex = '" + sex + '\'' +
                ",\n Poids = " + weight +
                "kg,\n Taille = " + size +
                "cm,\n Age = " + age +
                ",\n Moral actuel = " + moralIndicator +
                ",\n Est contagieux ? : " + isContagious +
                ",\n Liste de maladie : " + diseaseList +
                "\n}";
    }
}
