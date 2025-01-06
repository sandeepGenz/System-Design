package src.main.java.BuilderPattern;

public class Driver {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog.DogBuilder().setName("Bruno").setGender("Male").setBreed("Pug").setPrice(204.98).build();

        System.out.println(dog1);

    }
}
// When .build() is called, the DogBuilder calls the private constructor of the Dog class, passing itself (this) as an argument.