package src.main.java.AbstractFactoryDesignPattern;

interface Button
{
    void render();
}

interface Checkbox
{
    void render();
}

class WindowsButton implements Button{
    @Override
    public void render()
    {
        System.out.println("Windows Button");
    }
}

class WindowsCheckbox implements Checkbox{
    @Override
    public void render()
    {
        System.out.println("Windows CheckBox");
    }
}

//---------

class MacButton implements Button{
    @Override
    public void render()
    {
        System.out.println("Mac Button");
    }
}

class MacCheckbox implements Checkbox{
    @Override
    public void render()
    {
        System.out.println("Mac CheckBox");
    }
}


interface GuiFactory{
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

public class Main{
    public static void main(String[] args)
    {
        GuiFactory guiFactory;
        String os = detectOperatingSystem(); // Simulate runtime decision

        if(os.equals("Windows"))
        {
            guiFactory = new WindowsFactory();
        }
        else {
            guiFactory = new MacFactory();
        }

        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.render();
        checkbox.render();


    }

    // Simulate OS Detection (for demonstration)
    private static String detectOperatingSystem() {
        // Assume it's MacOS for this example
        return "MacOS";
    }
}

