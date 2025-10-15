package GangsOfFour.CreationalDesignPatterns.Prototype.CopyConstructor ;


class Person {
                    private String name;
                    private int age;

                    // Normal constructor
                    public Person(String name, int age) {
                        this.name = name;
                        this.age = age;
                    }

                    // Copy Constructor ------------------------------------------------------------------------
                    public Person(Person other) {
                        this.name = other.name;
                        this.age = other.age;
                    }

                    // Getters
                    public String getName() { return name; }
                    public int getAge() { return age; }

                    // For display
                    @Override
                    public String toString() {
                        return name + " (" + age + ")";
                    }
                }