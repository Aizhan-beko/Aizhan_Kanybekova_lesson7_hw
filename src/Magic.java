 class Magic extends Hero {

    public Magic(int health, int damage, String havingSuperAbilityType){
        super(health, damage, havingSuperAbilityType);
    }
    public void applySuperAbility(){
        System.out.println("Magic использовал суперспособность" + superAbilityType);
    }

}
