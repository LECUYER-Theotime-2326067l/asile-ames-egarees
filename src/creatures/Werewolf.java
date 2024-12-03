package creatures;

//import FonctionNotable.Scream;

import FonctionNotable.Contamination;
import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalService;

public class Werewolf extends Creature implements Wait, Death, Contamination {
    private String ageCategory;
    private int strength;
    private int dominationFactor;
    private int dominationRank;
    private int level;
    private int impetuosityFactor;
    private String pack;
//    String type = "Werewolf";

    public Werewolf(String name, String sex, int weight, int size, int age) {
        super("Werewolf", name, sex, weight, size, age, 40, true);
    }

    @Override
    public String toString() {
        return "Werewolf{" +
                "ageCategory='" + ageCategory + '\'' +
                ", strength=" + strength +
                ", dominationFactor=" + dominationFactor +
                ", dominationRank=" + dominationRank +
                ", level=" + level +
                ", impetuosityFactor=" + impetuosityFactor +
                ", pack='" + pack + '\'' +
                '}';
    }
//    public String getType(){
//        return type;
//    }
    @Override
    public void contamination() {

    }

    @Override
    public void die() {

    }

    @Override
    public void waiting() {
        if(MedicalService.getWerewolfNumber()>1){
            this.setMoralIndicator(getMoralIndicator()-2);
        } else {
            this.setMoralIndicator(getMoralIndicator()-5);
        }
    }
}
