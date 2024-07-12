package model.macOS;
import model.uicomponent.Button;

public class MacOSButton extends Button {

    @Override
    public String click() {
       return "macOS Button Click!";        
    }

    @Override
    public void paint(String color) {
        this.setColor(color);
        
    }
    
}
