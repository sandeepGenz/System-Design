package NewLLD.SOLID;

/*
Violation

interface Machine {
    void print();
    void scan();
    void fax();
}

class BasicPrinter implements Machine {
    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        throw new UnsupportedOperationException();
    }

    public void fax() {
        throw new UnsupportedOperationException();
    }
}
 */

interface PrintableMachine {
    public void print();
}

interface ScanableMachine {
    public void scan();
}

interface FaxableMachine {
    public void fax();
}


class PrintPaper implements PrintableMachine {

    @Override
    public void print() {
        System.out.println("Print done");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        PrintableMachine printPaper = new PrintPaper();
        printPaper.print();
    }
}
