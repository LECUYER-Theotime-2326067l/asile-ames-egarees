package creatures;

import FonctionNotable.Contamination;
import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Beastman extends Creature implements Scream, Wait, Death, Contamination {
    MedicalService medicalService;
    Beastman creature;
    public Beastman(String name, String sex, double weight, double size, int age) {
        super(name, sex, weight, size, age, 60, true);
    }

    @Override
    public void die() {
        this.medicalService.removeCreatures(this);
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 15) {
                System.out.println(creature.getName() + " :  Grrrrrrrrrrrrrrrrr");
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
