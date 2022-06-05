class Cat extends Pet {

    
    enum Breed {
        sg,
        egypt,
        american
        
    }

    private Breed breed;

    public Cat (String name, int age, Type type, Breed breed)
    {
        super(name, age, Type.cat);
        this.breed = breed;
        
    }

    public static void main(String[] args) 
    {
        Cat cat1 = new Cat("Zumi", 5, Type.cat, Breed.sg);

        cat1.sleep();
        cat1.getAge();
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " +  cat1.getAge());
    }   
}