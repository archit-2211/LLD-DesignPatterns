package GangsOfFour.CreationalDesignPatterns;


/*
 * This is the best singleton implementation, threadsafe, lazy loaded and reflection safe
 * Because how jvm creates enum is by extending enum class and it intitalises variable 
 * inside jvm as final. 
 */
public enum EnumSingleton {
    INSTANCE ;
    private String name; 

    public void setName(String name) {
        this.name = name ; 
        System.out.println(this.name);
    }
    
    
}
