package model;

import model.factory.UIFactory;

import model.uicomponent.Button;
import model.uicomponent.TextBox;

public class Client {
    
    private UIFactory factory;

    private Button button;
    private TextBox textBox;

    public Client(UIFactory factory){
        this.factory = factory;
        this.updateLayout();
    }

    public void writeTextBox(String value){
        this.textBox.write(value);
    }
    
    public void clickButton(){
        System.out.println(this.button.click());
    }

    private void updateLayout(){
        this.button = this.factory.createButton();
        this.textBox = this.factory.createTextBox(); 
    }

    public void setFactory(UIFactory f){
        this.factory= f;
        this.updateLayout();
    }

    public void displayScreen(){
        
        System.out.println("**************************************************");
        System.out.println(this.button);
        System.out.println(this.textBox);
        System.out.println("**************************************************");
    }
}
