package org.example;

public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
    /*

    public Phone(String mob) {
        this.mob = mob;
    }
*/
    @Override
    public String toString() {
        return "Phone{" +
                "mobile='" + mob + '\'' +
                '}';
    }
}
