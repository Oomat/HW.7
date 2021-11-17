package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(50);
        setSuperAbilityType("Venom");
        System.out.println("Medic" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE:" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
