package NewLLD.SOLID;

/*
Violating :

class Invoice {
    public double calculateTotal() {
        return 1000.0;
    }

    public void printInvoice() {
        System.out.println("Printing invoice");
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice");
    }
}
 */
class SingleResponsibility
{
    public double calculateTotal() {
        return 1000.0;
    }
}

class PrintInvoice
{
    public void print(SingleResponsibility invoce) {
        System.out.println("Printing done");
    }
}

class InvoiceDao {
    public void saveDB(SingleResponsibility invoice) {
        System.out.println(invoice + " is Saved to DB");
    }
}
