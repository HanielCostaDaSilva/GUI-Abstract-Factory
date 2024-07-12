package model.uicomponent;

//Abstract Product
public abstract class TextBox extends Component{
    protected String value="";
    
    
    public abstract String click();


    public void write(String value) {
        this.value += value;        
    }

    
    public void delete() {
        this.value="";
        
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        
        return "TextBox" + " value: "+ this.value + " click: "+ this.click();

    }


}
