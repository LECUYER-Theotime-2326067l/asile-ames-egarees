package creatures;

import FonctionNotable.Death;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Beastman extends Creature implements Wait, Death {
    MedicalService medicalService;
    Beastman creature;
//    private final String type = "Beastman";

    public Beastman(String name, String sex, int weight, int size, int age) {
        super("Beastman", name, sex, weight, size, age, 60, true);
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
        if (MedicalService.getBeastmanNumber() > 1) {
            this.setMoralIndicator(getMoralIndicator() - 2);
        } else {
            this.setMoralIndicator(getMoralIndicator() - 5);
        }
    }

//    @Override
//    public void contamination() {
//        for(Creature creature : this.medicalService.getCreatures(medicalService)){
//            if(creature.getMoralIndicator()<15){
//                Disease disease;
//                creature.getSickness(getDiseaseList(), disease);
//            }
//        }
//    }
}
