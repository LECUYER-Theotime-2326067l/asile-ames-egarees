import DonneNotable.Disease;
import creatures.Creature;
import creatures.Dwarf;
import hospital.Hospital;
import hospital.MedicalService;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("nom", 10);
        Disease disease = new Disease("Fear Of Missing Out", "FOMO", 15);
        Creature creature = new Dwarf("1", "F", 18.3, 90, 22);
        MedicalService medicalService = new MedicalService("1", 1200, 2, "insuffisant");
        hospital.addMedicalService(medicalService);
        medicalService.addCreatures(creature);
        creature.getSickness(disease);
        creature.getDiseaseList();
    }
}