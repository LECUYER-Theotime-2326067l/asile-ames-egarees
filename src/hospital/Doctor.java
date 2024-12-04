package hospital;

import hospital.MedicalServices.MedicalService;

public class Doctor {
    private String name;
    private int age;
    private String gender;

    public Doctor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nDoctor {" +
                "\n Nom = '" + name + '\'' +
                ",\n Age = " + age +
                ",\n Genre = '" + gender + '\'' +
                "\n}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void examineMedicalServiceAndCreatures(MedicalService medicalService) {
        medicalService.characteristics();
        medicalService.getCreatures().forEach(System.out::println);
    }

    public void reviewBudget(MedicalService.BudgetType budget, MedicalService medicalService) {
        medicalService.updateBudget(budget);
    }
}
