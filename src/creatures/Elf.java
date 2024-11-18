package creatures;

import hospital.MedicalService;

public class Elf extends Creature {
    public Elf(String name, String sex, double weight, double height, int age) {
        super(name, sex, weight, height, age, 35, false);
    }

    public void die(Elf creature, MedicalService medicalService) {
        System.out.println(creature.getName()+" est mort, c'était un/une elfe... Par conséquent, ");
        // démoralise de 2 toutes les créatures du service où il était
        medicalService.getCreatures();
        medicalService.removeCreatures(creature);
    }
}
