class Dog extends Pet {

    
    enum Breed {
        golden_retriver,
        husky,
        shiba_inu,
        bulldog,
        chihuahua,
        german_shepherd,
        labrador
        
    }

    private Breed breed;

    public Dog (String name, int age, Type type, Breed breed)
    {
        super(name, age, Type.dog);
        
        this.breed = breed;
        
    }

    public static void main(String[] args) 
    {
        Dog dog1 = new Dog("Goldie", 5, Type.dog, Breed.golden_retriver);

        dog1.sleep();
        dog1.getAge();
        System.out.println("Name: " + dog1.getName());
        System.out.println("Age: " +  dog1.getAge());
    }   
}