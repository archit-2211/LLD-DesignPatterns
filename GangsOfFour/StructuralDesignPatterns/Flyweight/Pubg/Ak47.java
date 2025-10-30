package GangsOfFour.StructuralDesignPatterns.Flyweight.Pubg;

class AK47 implements Gun { 
    private String model = "AK47";
    private int damage = 35;
    private String texture = "AK47.png";
    @Override
    public void getGunData() {
        System.out.println("This is AK47 Gun with damage : " + this.damage ) ; 
    }

    

 
}
