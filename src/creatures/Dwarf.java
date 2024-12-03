package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Dwarf extends Creature implements Death, Wait {
    MedicalService medicalService;
//    String type = "Dwarf";

    public Dwarf(String name, String sex, double weight, double size, int age) {
        super("Dwarf", name, sex, weight, size, age, 100, false);
    }

//    public String getType(){
//        return type;
//    }

    @Override
    public void die() {
        this.medicalService.removeCreatures(this);
    }

//    @Override
//    public boolean scream() {
//        boolean scream = false;
//        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
//            if (creature.getMoralIndicator() < 15) {
//                System.out.println(creature.getName() + " :  Ce *** ose me faire attendre ?! QUEL FILS DE [ceci a été volontairement censuré].");
//                scream = true;
//            }
//        }
//        return scream;
//    }
//
//    @Override
//    public void getAngry() {
//        int i=0;
//        if(scream()){
//            i++;
//        } if(i==5){
//            System.out.println(creature.getName() + " décide de tabasser quelqu'un avec sa chaise.");
//        }
//    }


    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator()-10);
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "type='" + type + '\'' +
                '}';
    }
}
