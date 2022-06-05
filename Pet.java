import java.util.Scanner;

class Pet{
    protected String name;
    protected int age;
    private String colour;
    private int tired;
    private int hunger;
    enum Type {
        cat,
        dog
        
      }
    protected Type type;

    public Pet(String name, int age, Type type) {
        this.name =name;
        this.age = age;
        
        this.type = type;
    }

    public void sleep() {
        System.out.println("Falling asleep");
        tired -= 1;
    }

    public void eat(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Food: ");
        String food = myObj.nextLine();
        myObj.close();
        
        System.out.println("Eat" + food);
        hunger -=1;
    }

    public void play(){
        System.out.println("Play what?");
        System.out.println("1. Play with ball");
        System.out.println("2. Play hide and seek");
        Scanner myObj = new Scanner(System.in);
        int playselect = myObj.nextInt();
        myObj.close();
        if (playselect == 1){
            System.out.println("Play fetch the ball");
        }
        if (playselect == 2){
            System.out.println("Play hide and seek");
        }

    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}