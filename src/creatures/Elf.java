package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Elf extends Creature implements Death, Scream, Wait {
    MedicalService medicalService;
    Elf creature;
    String type = "Elf";

    public Elf(String name, String sex, double weight, double height, int age) {
        super(name, sex, weight, height, age, 100, false);
    }

//    public void die(Elf creature, MedicalService medicalService) {
//        System.out.println(creature.getName()+" est mort, c'était un/une elfe... Par conséquent, ");
//        // démoralise de 2 toutes les créatures du service où il était
//        medicalService.getCreatures(medicalService);
//        medicalService.removeCreatures(creature);
//    }

    @Override
    public void die() {
        // démoralise 3 créatures du même service médical à sa mort.
        this.medicalService.getCreatures(medicalService);
        for(int i=0; i<=3; i++){
             creature.setMoralIndicator(creature.getMoralIndicator()-2);
        }
        this.medicalService.removeCreatures(this);
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 10) {
                System.out.println(creature.getName() + " :  [censuré].");
                scream = true;
            }
        }
        return scream;
    }

    @Override
    public void getAngry(){
        int i=0;
        if(scream()){
            i++;
        } if(i==5){
            System.out.println(creature.getName() + " décide de tabasser quelqu'un avec sa chaise.");
        }
    }

    public String getType(){
        return type;
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator()-10);
    }
}
