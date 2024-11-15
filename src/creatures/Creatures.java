package creatures;

import java.util.ArrayList;

public class Creatures {
    private String name;
    private boolean sex;
    private double weight;
    private double height;
    private int age;
    private int moralIndicator;
    private ArrayList<Sickness> sicknessList = new ArrayList<Sickness>();

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
        // si a hurlé 5 fois, alors s'emporte
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

    public ArrayList<Sickness> loseSickness(ArrayList<Sickness> sicknessList, Sickness sickness){
        this.sicknessList.remove(sickness);
        return sicknessList;
    }

    public String getName(){
        return name;
    }

    public void die(){

    }
}
