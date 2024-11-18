package hospital;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private int maxMedicalService;
    private ArrayList<MedicalService> existingMedicalServicesList;
    private ArrayList<Doctor> doctorList;

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
    public int presentCreatures(){
        int smth = 0;
        for(MedicalService ms : existingMedicalServicesList){
            ms.getCreatures(ms);
            smth++;
        }
        return smth;
    }
}
