package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage("Magical");
        boss.setSuperpower("Fly");

        Weapon gun = new Weapon();
        gun.setName("Gun");
        gun.setType("pistol");


        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " +
                boss.getSuperpower() + " " + gun.getName() + " " + gun.getType());

    }

}
