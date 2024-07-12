package model.windows;
import model.uicomponent.Button;

public class WinButton extends Button {

    @Override
    public String click() {
       return "Win Click!";        
    }

    @Override
    public void paint(String color) {
        this.setColor(color);
        
    }
    
}
