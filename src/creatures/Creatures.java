package creatures;

import java.util.ArrayList;

public class Creatures {
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
        }
    }

    public ArrayList<Sickness> getSickness(ArrayList<Sickness> sicknessList, Sickness sickness){
        this.sicknessList.add(sickness);
        return sicknessList;
    }

    public ArrayList<Sickness> loseSickness(ArrayList<Sickness> sicknessList){
        this.sicknessList.remove(sickness);
        return sicknessList;
    }

    public String getName(){
        return name;
    }

    public void die(){

    }
}
