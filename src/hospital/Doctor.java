package hospital;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public MedicalService examineMedicalServiceAndCreatures(MedicalService medicalService) {
        System.out.println(medicalService.caracteristics());
        return medicalService;
    }
}