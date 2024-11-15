package creatures;

import java.util.ArrayList;

public class Creature {
    private String name;
    private String sex;
    private double weight;
    private double height;
    private int age;
    private int moralIndicator;
    private ArrayList<Sickness> sicknessList = new ArrayList<Sickness>();

    public void setName(String name) {
        this.name = name;
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

    public void setMoralIndicator(int moralIndicator) {
        this.moralIndicator = moralIndicator;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
                '}';
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

    public void die(){

    }
}