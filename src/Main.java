public class Main {
    public static void main(String[] args) {
        Hero heroes [] = {
                new Magic( 300, 45,"ENERGY ATTACK"),
                new Medic(270, 35,"BODY REGENERATION", 40),
                new Warrior(350, 33, "CRITICAL DAMAGE")

        };
        for(Hero hero: heroes){
            hero.applySuperAbility();
            if(hero instanceof Medic){
                ((Medic)hero).increaseExperience();
            }
        }
    }
}