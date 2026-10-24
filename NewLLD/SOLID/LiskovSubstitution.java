package NewLLD.SOLID;

/*
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Inherits fly()
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException(
            "Penguins cannot fly"
        );
    }
}
 */

class Bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

interface Flying {
    public void fly ();
}

class Sparrow extends Bird implements Flying {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    public void swim () {
        System.out.println("Penguin is swimming");
    }
}

// enclosing in a service

class FlyService {
    public void makeFly(Flying bird) {
        bird.fly();
    }
}


public class LiskovSubstitution {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.swim();

        FlyService service = new FlyService();
        service.makeFly(new Sparrow());
    }
}
