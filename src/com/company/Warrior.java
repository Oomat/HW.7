package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(40);
        setSuperAbilityType("CRITICAL DAMAGE");
        System.out.println("Warrior" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE:" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
