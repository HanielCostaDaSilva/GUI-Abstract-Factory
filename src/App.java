import model.Client;
import model.factory.UIFactory;
import model.factory.WindowsFactory;
import model.factory.macOSFactory;

public class App {

    public static void main(String[] args) {
        UIFactory factory = new WindowsFactory();
        Client client = new Client(factory);
        client.clickButton();
        System.out.println("\n");
        
        client.writeTextBox("Tela do windows");
        client.displayScreen();
        
        System.out.println("\n");
        client.setFactory(new macOSFactory());
        client.writeTextBox("Tela do macOS");
        client.displayScreen();
        client.clickButton();
    }
}
