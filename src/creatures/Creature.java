package creatures;

import DonneNotable.*;

import java.util.ArrayList;

public class Creature {
    private String name;
    private String sex;
    private double weight;
    private double size;
    private int age;
    private int moralIndicator;
    private boolean isContagious;
    ScreamAngry screamAngry;
    private ArrayList<Disease> diseaseList;
    public Creature(String name, String sex, double weight, double size, int age, int moralIndicator, boolean isContagious) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.moralIndicator = moralIndicator;
        this.isContagious = isContagious;
        this.diseaseList = new ArrayList<>();
    }

    public boolean getScream(){
        return screamAngry.scream();
    }

    public void getAngry(){
        screamAngry.getAngry();
    }

//    public static String getType(){
//        return this.type;
//    }

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

    public int getMoralIndicator() {
        return moralIndicator;
    }

    public ArrayList<Disease> getDiseaseList() {
        for(Disease disease : diseaseList){
            System.out.println(disease);
        }
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public void setMoralIndicator(int moralIndicator) {
        this.moralIndicator = moralIndicator;
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

    public ArrayList<Disease> getSickness(Disease disease){
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
