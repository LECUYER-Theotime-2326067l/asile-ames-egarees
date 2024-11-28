package creatures;

import DonneNotable.Disease;

import java.util.ArrayList;

public class Creature {
    private String name;
    private String sex;
    private double weight;
    private double size;
    private int age;
    private int moralIndicator;
    private boolean isContagious;

    public Creature(String name, String sex, double weight, double size, int age, int moralIndicator, boolean isContagious) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
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

    private ArrayList<Disease> diseaseList = new ArrayList<Disease>();

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

    public int getMoralIndicator() {
        return moralIndicator;
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
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
        this.size = height;
        return height;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public String setSex(String sex) {
        return this.sex = sex;
    }

//    public void waiting(){
//        this.moralIndicator = moralIndicator-5;
//    }

//    public boolean screaming(){
//        boolean screaming = false;
//        if(this.moralIndicator == 0){
//            System.out.println(this.name + " hurle");
//            screaming = true;
//        }
//        return screaming;
//    }

//    public void getAngry(){
//        int i=0;
//        if(screaming()){
//            i++;
//        } if(i==5){
//            System.out.println(this.name + " décide de tabasser quelqu'un avec sa chaise.");
//            i = 0;
//        }
//    }

    @Override
    public String toString() {
        return "Caractéristiques de " +
                name + " : "+'\n'+
                "sexe : '" + sex + '\'' +
                ", poids : " + weight +
                ", taille : " + size +
                ", âge : " + age +
                ", niveau de moral : " + moralIndicator +
                ", liste de maladies : " + diseaseList +
                " et la contagiosité est définie sur "+isContagious;
    }

    public ArrayList<Disease> getSickness(ArrayList<Disease> diseaseList, Disease disease){
        this.diseaseList.add(disease);
        return diseaseList;
    }

    public void loseSickness(ArrayList<Disease> diseaseList, Disease disease){
        this.diseaseList.remove(disease);
    }

    public String getName(){
        return name;
    }
}
