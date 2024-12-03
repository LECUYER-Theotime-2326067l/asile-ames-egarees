import DonneNotable.*;
import creatures.Creature;
import creatures.Dwarf;
import hospital.Hospital;
import hospital.MedicalService;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("nom", 10);
        String sex = Sex.generateSex();
        Creature creature = new Dwarf(Name.generateName(sex), sex, Weight.generateWeight("Dwarf"), Size.generateSize("Dwarf"), Age.generateAge("Dwarf"));
        MedicalService medicalService = new MedicalService("1", 1200, 2, "insuffisant");
        hospital.addMedicalService(medicalService);
        medicalService.addCreatures(creature);
        creature.getSickness();
        creature.getSickness();
        creature.getSickness();
        creature.getDiseaseList();
        System.out.println(creature);
    }
}