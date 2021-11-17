package com.company;

public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(60);
        setSuperAbilityType("Fire");
        System.out.println("Fire" + "\n" + "HP:" + getHp() + "\n" + "DAMAGE:" + getDamage() + "\n" + "СУПЕР СПОСОБНОСТЬ:" + getSuperAbilityType() );
    }
}
