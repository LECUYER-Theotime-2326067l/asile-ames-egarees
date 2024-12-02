package creatures;

import FonctionNotable.Contamination;
import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Orc extends Creature implements Scream, Wait, Death, Contamination {
    MedicalService medicalService;
    Orc creature;
    String type = "Orc";
    public Orc(String name, String sex, double weight, double size, int age) {
        super(name, sex, weight, size, age, 40, false);
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 15) {
                System.out.println(creature.getName() + " :  Ouaf!");
                scream = true;
            }
        }
        return scream;
    }
    public String getType(){
        return type;
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
    public void die() {
        this.medicalService.removeCreatures(this);
    }

    @Override
    public void waiting() {
        if(medicalService.getOrcNumber()>1){
            this.setMoralIndicator(getMoralIndicator()-2);
        } else {
            this.setMoralIndicator(getMoralIndicator()-5);
        }
    }

    @Override
    public void contamination() {

    }
}
