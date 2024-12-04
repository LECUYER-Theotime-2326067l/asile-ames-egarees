import DonneNotable.*;
import creatures.Creature;
import creatures.Dwarf;
import hospital.Doctor;
import hospital.Hospital;
import hospital.MedicalServices.MedicalService;
import hospital.MedicalServices.StandardMedicalService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du Doctor : ");
        String name = scanner.nextLine();
        System.out.println("Veuillez entrer son âge : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Veuillez entrer son genre : ");
        String gender = scanner.nextLine();
        Doctor doctor = new Doctor(name, age, gender);
        System.out.println(doctor);

        Hospital hospital = new Hospital("nom", 10);
        String sex = Sex.generateSex();
        Creature creature = new Dwarf(Name.generateName(sex), sex, Weight.generateWeight("Dwarf"), Size.generateSize("Dwarf"), Age.generateAge("Dwarf"));
        StandardMedicalService medicalService = new StandardMedicalService("1", 1200, 2, MedicalService.BudgetType.INSUFFISANT);
        hospital.addMedicalService(medicalService);
        medicalService.addCreature(creature);
        creature.getSickness();
        creature.getSickness();
        creature.getSickness();
        System.out.println(creature);
    }
}