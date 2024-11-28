package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Reptilian extends Creature implements Death, Scream, Wait {
    MedicalService medicalService;
    Reptilian creature;

    public Reptilian(String name, String sex, double weight, double size, int age) {
        super(name, sex, weight, size, age, 80, false);
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
                System.out.println(creature.getName() + " :  Ssssssssssss");
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
}
