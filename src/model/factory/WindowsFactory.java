package model.factory;

import model.uicomponent.Button;
import model.uicomponent.TextBox;
import model.windows.WinButton;
import model.windows.WinTextBox;

public class WindowsFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WinTextBox();
    }
    
}
