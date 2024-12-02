package creatures;

import FonctionNotable.Scream;
import hospital.MedicalService;

public class ScreamAngry implements Scream {
    MedicalService medicalService;
    Creature creature;
    String type = Creature.class.getTypeName();
    @Override
    public boolean scream() {
        boolean scream = false;
        for (Creature creature : this.medicalService.getCreatures(medicalService)) {
            if (creature.getMoralIndicator() < 15) {
                switch (type) {
                    case "Beastman":
                        System.out.println(creature.getName() + " :  Grrrrrrrrrrrrrrrrr");
                    case "Dwarf":
                        System.out.println(creature.getName() + " :  Ce *** ose me faire attendre ?! QUEL FILS DE [ceci a été volontairement censuré].");
                    case "Elf":
                        System.out.println(creature.getName() + " :  [censuré].");
                    case "Reptilian":
                        System.out.println(creature.getName() + " :  Ssssssssssss");
                    case "Orc":
                        System.out.println(creature.getName() + " :  Ouaf!");
                    case "Vampire":
                        System.out.println(creature.getName() + " :  ...");
                    case "Zombie":
                        System.out.println(creature.getName() + " :  Uhhhhhh... Argh ohhh.");
                    case "Werewolf":
                        System.out.println(creature.getName() + " :  AOUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
                }
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
    public static void main(String[] args) {
        Creature oui = new Elf("bonjour", "femelle", 8, 2, 680);
        System.out.println(oui);
    }
}
