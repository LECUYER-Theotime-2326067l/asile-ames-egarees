package DonneNotable;

import java.util.Random;

public class Age {
    private int age;
    private final Random rand = new Random();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int ageHumain() {
        this.age = rand.nextInt(18,100);
        return this.age;
    }

    public int ageElf() {
        this.age = rand.nextInt(18,1000);
        return this.age;
    }
    public int ageDwarve() {
        this.age = rand.nextInt(18,400);
        return this.age;
    }
    public int ageOrque() {
        this.age = rand.nextInt(18,100);
        return this.age;
    }
    public int ageBeastMen() {
        this.age = rand.nextInt(18,100);
        return this.age;
    }
    public int ageZombie() {
        this.age = rand.nextInt(20,999999999);
        return this.age;
    }
    public int ageVampire() {
        this.age = rand.nextInt(20,999999999);
        return this.age;
    }
    public int ageWerewolves() {
        this.age = rand.nextInt(20,150);
        return this.age;
    }
    public int ageReptilian() {
        this.age = rand.nextInt(20,300);
        return this.age;
    }
}
