package creatures;

import FonctionNotable.Death;
import FonctionNotable.Revive;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Zombie extends Creature implements Revive, Death, Wait, Scream {
    MedicalService medicalService;
    Zombie creature;

    public Zombie(String name, String sex, double weight, double height, int age) {
        super(name, sex, weight, height, age, 100, false);
    }

    @Override
    public void die() {
        if(getMoralIndicator()==0){
            revive();
        }
    }

    @Override
    public void revive() {
        setMoralIndicator(100);
    }

    @Override
    public void waiting() {
        if(medicalService.getZombieNumber()>1){
            this.setMoralIndicator(getMoralIndicator()-2);
        } else {
            this.setMoralIndicator(getMoralIndicator()-5);
        }
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 15) {
                System.out.println(creature.getName() + " :  Uhhhhhh... Argh ohhh.");
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
}