package GangsOfFour.StructuralDesignPatterns.Flyweight.Pubg;


class Player {
    private String name;
    private int x, y, z; 
    // Each player can have multiple guns (Flyweights)
    private Gun gunOne ; 
    private Gun gunTwo ; 


    /*For simplicity we can assign guns directly here however we can combine this with factory or prototype or builder depending on the use case to save space  directly to get the gun object
     * Irrespective of how many players we create we always ised shared object. her
    */
    

    public Player(String name, int x,int y,int z) {
        this.x = x ; 
        this.y = y ;
        this.z = z ; 
        this.name = name ; 
       


    }

    public void setGunOne(Gun gun) {
        this.gunOne = gun ; 
    }
    public void setGunTwo(Gun gun) {
        this.gunTwo = gun ; 
    }
 
}