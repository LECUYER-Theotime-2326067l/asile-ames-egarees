package hospital;

import DonneNotable.Disease;
import creatures.Creature;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hospital {
    private String hospitalName = "un nom";
    private int maxMedicalService;
    private ArrayList<MedicalService> existingMedicalServicesList;
    private ArrayList<Doctor> doctorList;

    public Hospital(String hospitalName, int maxMedicalService) {
        this.hospitalName = hospitalName;
        this.maxMedicalService = maxMedicalService;
        this.existingMedicalServicesList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<MedicalService> getExistingMedicalServicesList() {
        return existingMedicalServicesList;
    }

    public void setExistingMedicalServicesList(ArrayList<MedicalService> existingMedicalServicesList) {
        this.existingMedicalServicesList = existingMedicalServicesList;
    }

    public int getMaxMedicalService() {
        return maxMedicalService;
    }

    public void setMaxMedicalService(int maxMedicalService) {
        this.maxMedicalService = maxMedicalService;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int presentCreatures(MedicalService medicalService) {
        int smth = 0;
        for (MedicalService ms : existingMedicalServicesList) {
            ms.getCreatures(ms);
            smth++;
        }
        return smth;
    }

    public void addMedicalService(MedicalService medicalService) {
        if (existingMedicalServicesList.size() != maxMedicalService) {
            existingMedicalServicesList.add(medicalService);
        } else {
            System.out.println("Medical service already exists");
        }
    }

    public void removeMedicalService(MedicalService medicalService) {
        existingMedicalServicesList.remove(medicalService);
    }

    public Object randomlyEditStateOfCreature(Creature creature) {
        Random randomNumber = new Random();
        int index = randomNumber.nextInt(5);
        if (index == 1) {
            creature.getSickness();
        } else if (index == 2) {
            for (Disease disease : creature.getDiseaseList()) {
                disease.increaseLevel();
            }
        } else if (index == 3) {
            creature.setMoralIndicator(creature.getMoralIndicator() - 5);
        } else if (index == 4) {
            for (Disease disease : creature.getDiseaseList()) {
                disease.changeLevel();
            }
        } else {
            creature.setMoralIndicator(0);
        }
        return creature;
    }

    public Object randomlyEditStateOfMedicalService(MedicalService medicalService) {
        Random randomNumber = new Random();
        int index = randomNumber.nextInt(5);
        if (index == 1) {
            //TODO
        }
        return medicalService;
    }

//    public void handToDoctor() {
//        System.out.println("Docteur, que voulez-vous faire ?" + '\n'
//                "1 : soigner quelqu'un" + '\n' + "2 : aucune idée");
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.nextLine().equals("1")) {
//            System.out.println("Entrez le nom de la créature que vous voulez soigner : ");
//            String name = scanner.nextLine();
//            String disease = scanner.nextLine();
//            for (Creature creature : MedicalService.getAllCreatures()) {
//                if (creature.getName().equals(name)) {
//                    System.out.println(creature.getDiseaseList());
//                    System.out.println("Quelle maladie souhaitez-vous soigner ?");
//                    String fullDiseaseName = scanner.nextLine();
//                    if(fullDiseaseName.equals(Disease.getFullName())){
//
//                    }
//                }
//            }
//        }
//    }
}
