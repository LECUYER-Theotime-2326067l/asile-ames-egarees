package creatures;

import java.util.ArrayList;

public class Creature {
    protected String name;
    protected String sex;
    protected double weight;
    protected double height;
    protected int age;
    protected int moralIndicator;
    protected boolean isContagious;

    public Creature(String name, String sex, double weight, double height, int age, int moralIndicator, boolean isContagious) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.moralIndicator = moralIndicator;
        this.isContagious = isContagious;
    }
    public boolean isContagious() {
        return isContagious;
    }

    public boolean setContagious(boolean contagious) {
        isContagious = contagious;
        return contagious;
    }

    protected ArrayList<Sickness> sicknessList = new ArrayList<Sickness>();

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

    public double getHeight() {
        return height;
    }

    public int getMoralIndicator() {
        return moralIndicator;
    }

    public ArrayList<Sickness> getSicknessList() {
        return sicknessList;
    }

    public void setSicknessList(ArrayList<Sickness> sicknessList) {
        this.sicknessList = sicknessList;
    }

    public int setMoralIndicator(int moralIndicator) {
        this.moralIndicator = moralIndicator;
        return moralIndicator;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public String setSex(String sex) {
        return this.sex = sex;
    }

    public void waiting(){
        this.moralIndicator--;
    }

    public boolean screaming(){
        boolean screaming = false;
        if(this.moralIndicator == 0){
            System.out.println(this.name + " hurle");
            screaming = true;
        }
        return screaming;
    }

    public void getAngry(){
        int i=0;
        if(screaming()){
            i++;
        }
        if(i==5){
            System.out.println(this.name + " décide de tabasser quelqu'un avec sa chaise.");
            i = 0;
        }
    }

    @Override
    public String toString() {
        return "Caractéristiques de " +
                name + " : "+'\n'+
                "sexe : '" + sex + '\'' +
                ", poids : " + weight +
                ", taille : " + height +
                ", âge : " + age +
                ", niveau de moral : " + moralIndicator +
                ", liste de maladies : " + sicknessList +
                " et la contagiosité est définie sur "+isContagious;
    }

    public ArrayList<Sickness> getSickness(ArrayList<Sickness> sicknessList, Sickness sickness){
        this.sicknessList.add(sickness);
        return sicknessList;
    }

    public void loseSickness(ArrayList<Sickness> sicknessList, Sickness sickness){
        this.sicknessList.remove(sickness);
    }

    public String getName(){
        return name;
    }
}
