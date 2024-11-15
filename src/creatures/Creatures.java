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

    }
    public void screaming(){

    }
    public void getAngry(){

    }
    public ArrayList<String> getSickness(ArrayList<String> sicknessList){
        Sickness sickness;
        sicknessList.add(sickness);
        return sicknessList;
    }

    public void loseSickness(){

    }
    public String getName(){
        return name;
    }
    public void die(){

    }
}
