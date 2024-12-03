package creatures;

import DonneNotable.Disease;
import FonctionNotable.*;
import hospital.MedicalService;

import java.util.ArrayList;

public class Vampire extends Creature implements Death, Wait, Scream, Contamination, Revive {
    MedicalService medicalService;
    Vampire creature;
//    String type = "Vampire";

    public Vampire(String name, String sex, double weight, double size, int age) {
        super("Vampire", name, sex, weight, size, age, 120, true);
    }

    @Override
    public void contamination() {
//        ArrayList<Disease> diseases = getDiseaseList();
//        for(Creature creature1 : medicalService.getCreatures(medicalService)) {
//            getSickness();
//        }
    }
//    public String getType(){
//        return type;
//    }
    @Override
    public void die() {
        if(getMoralIndicator()==0){
            revive();
        }
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 20) {
                System.out.println(creature.getName() + " :  ...");
                scream = true;
            }
        }
        return scream;
    }

    @Override
    public void getAngry() {
        int i=0;
        if(scream()){
            i++;
        } if(i==5){
            System.out.println(creature.getName() + " décide de tabasser quelqu'un avec sa chaise.");
        }
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator()-10);
    }

    @Override
    public void revive() {
        this.setMoralIndicator(120);
    }
}
