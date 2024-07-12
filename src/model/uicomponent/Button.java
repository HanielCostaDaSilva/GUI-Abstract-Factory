package model.uicomponent;

//Abstract Product
public abstract class Button extends Component {

    protected String color = "FFFFFF";
    protected String text = "CLICK ME";

    

    public abstract String click();

    public abstract void paint(String color);
    
    public String getText() {
        return this.text;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        
        return "Button " +this.text + " value: "+ this.color+ " click: "+ this.click();

    }
}
