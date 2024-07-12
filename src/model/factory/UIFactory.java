package model.factory;

import model.uicomponent.Button;
import model.uicomponent.TextBox;

public interface UIFactory {

    public Button createButton();
    
    public TextBox createTextBox();

}
