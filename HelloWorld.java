package wk9;

public class HelloWorld {

    public static void main(String[] args){
        example10();
    }
    /*

               inheritance?
                   something being passed down to you

               OLD                     NEW

               base                    derived
               parent                  child
               super                   sub


               Java: only inherit from ONE other class


           Great Grandmother       GrandMother           Mother            Female


           direct inheritance

           indirect inheritance


               Object
                   default constructor
                   toString(), getClass(), hashCode(), equals()
           What is inherited by child class
               default constructor
               all non-private instance variables
               all non-private methods

           When to create a subclass?
               create a newer version
               create something more specific


           general                     specific

           Animal          Cat         Lion

           */

    static void example1(){

        /*

            inheritance?
                something being passed down to you

            OLD                     NEW

            base                    derived
            parent                  child
            super                   sub


            Java: only inherit from ONE other class


        Great Grandmother       GrandMother           Mother            Female


        direct inheritance

        indirect inheritance


            Object
                default constructor
                toString(), getClass(), hashCode(), equals()
        What is inherited by child class
            default constructor
            all non-private instance variables
            all non-private methods

        When to create a subclass?
            create a newer version
            create something more specific


        general                     specific

        Animal          Cat         Lion




        */


        HelloWorld hw = new HelloWorld();
        System.out.println(hw);


    }
    static void example2(){
        Cat c = new Cat();
        System.out.println(c.getHeight());
    }
    static void example3(){
        Cat c = new Cat("meow", 10);
        System.out.println(c.getHeight());
    }
    static void example4(){
        Animal a1 = new Animal("Hello", 10);

        Cat c1 = new Cat("meow", 20);
        c1.name = "Cat";
        System.out.println(a1);
        System.out.println(c1);

    }
    static void example5(){

        Animal a1 = new Animal("Hello", 10);

        Cat c1 = new Cat("meow", 20, 4);
        c1.name = "Cat";
        System.out.println(a1);
        System.out.println(c1);


    }
    static void example6(){

        Animal a1 = new Cat();
        System.out.println(a1);


        Animal[] animals = {new Animal(), new Cat()};

        //System.out.println(animals[0].name);
        System.out.println();
        System.out.println("Loop");
        System.out.println();

        for(Animal animal : animals){

            if(animal instanceof Cat){
                System.out.println("Paws = " + ((Cat)(animal)).getPaws());
            }
            else{
                System.out.println("Paws method not found");
            }

        }

    }
    static void example7(){
        Canine c1 = new Canine("Guau", 20,"Black", 5);
        Canine c2 = new Canine("white",2);
        System.out.println(c1);
        System.out.println(c2);
    }
    static void example8(){
        Student n1 = new Student("kevin", 533345,98.6,24);
        System.out.println(n1);
    }
    static void example9(){
        HonorRollStudent n2 = new HonorRollStudent("kevin", 533345,88.6,24,"a backpack");
        System.out.println(n2);
    }
    static void example10(){
        MatureStudent n3 = new MatureStudent("kevin", 533345,88.6,"a backpack",22,"Programer");
        System.out.println(n3);
    }

}
