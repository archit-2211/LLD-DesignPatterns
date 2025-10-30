package GangsOfFour.StructuralDesignPatterns.Flyweight.Pubg;


class M416 implements Gun {
    // Intrinsic state (shared)
    private final String model = "M416";
    private final int damage = 33;
    private final double fireRate = 0.09;
    private final String caliber = "5.56mm";
    private final double reloadTime = 2.2;
    private final String texture = "M416.png";
    @Override
    public void getGunData() {
        System.out.println("This is M416 with damage " + this.damage) ; 
    }

   
}
