package creatures;

import FonctionNotable.*;
import hospital.MedicalService;

public class Reptilian extends Creature implements Death, Wait {
    MedicalService medicalService;
    Reptilian creature;
//    String type = "Reptilian";

    public Reptilian(String name, String sex, double weight, double size, int age) {
        super("Reptilian", name, sex, weight, size, age, 80, false);
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
        this.setMoralIndicator(getMoralIndicator()-10);
    }
}
