package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import hospital.MedicalService;

public class Elf extends Creature implements Death, Scream {
    MedicalService medicalService;
    Creature creature;
    public Elf(String name, String sex, double weight, double height, int age) {
        super(name, sex, weight, height, age, 35, false);
    }

//    public void die(Elf creature, MedicalService medicalService) {
//        System.out.println(creature.getName()+" est mort, c'était un/une elfe... Par conséquent, ");
//        // démoralise de 2 toutes les créatures du service où il était
//        medicalService.getCreatures(medicalService);
//        medicalService.removeCreatures(creature);
//    }

    @Override
    public void die() {
        this.medicalService.getCreatures(medicalService);
        for(int i=0; i<=3; i++){
             creature.setMoralIndicator(creature.getMoralIndicator()-2);
        }
    }

    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() == 0) {
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
}
