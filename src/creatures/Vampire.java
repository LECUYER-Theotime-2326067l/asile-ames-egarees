package creatures;

import DonneNotable.Disease;
import FonctionNotable.*;
import hospital.MedicalService;

import java.util.ArrayList;

public class Vampire extends Creature implements Death, Wait, Contamination, Revive {
    MedicalService medicalService;
    Vampire creature;
//    String type = "Vampire";

    public Vampire(String name, String sex, int weight, int size, int age) {
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
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator()-10);
    }

    @Override
    public void revive() {
        this.setMoralIndicator(120);
    }
}
