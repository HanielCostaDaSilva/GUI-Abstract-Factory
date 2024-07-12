package model.factory;

import model.macOS.MacOSButton;
import model.macOS.MacOSTextBox;
import model.uicomponent.Button;
import model.uicomponent.TextBox;

public class macOSFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
    
    
}
