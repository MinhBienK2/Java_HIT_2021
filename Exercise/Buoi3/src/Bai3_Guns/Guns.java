package Bai3_Guns;

public class Guns {
    private String weaponName;
    public int ammoNumber;

    public Guns() {
        weaponName = "";
        ammoNumber = 0;
    }
    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }


    public void Load(int x) {
        ammoNumber+=x;
    }

    public void shoot(int x) {
        if(ammoNumber - x >=0)
            ammoNumber-=x;
        if(ammoNumber==0)
            System.out.println("Hết đạn");
    }
//
//    @Override
//    public String toString() {
//        return "Guns{" +
//                "weaponName='" + weaponName + '\'' +
//                ", ammoNumber=" + ammoNumber +
//                '}';
//    }
}
