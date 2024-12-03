package creatures;

import FonctionNotable.Contamination;
import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Orc extends Creature implements Wait, Death, Contamination {
    MedicalService medicalService;
    Orc creature;
//    String type = "Orc";
    public Orc(String name, String sex, double weight, double size, int age) {
        super("Orc", name, sex, weight, size, age, 40, false);
    }
//    public String getType(){
//        return type;
//    }

    @Override
    public void die() {
        this.medicalService.removeCreatures(this);
    }

    @Override
    public void waiting() {
        if(MedicalService.getOrcNumber()>1){
            this.setMoralIndicator(getMoralIndicator()-2);
        } else {
            this.setMoralIndicator(getMoralIndicator()-5);
        }
    }

    @Override
    public void contamination() {

    }
}
