import java.io.FileOutputStream;

public class Calculation {

    private int ValueOne,ValueTwo;
    private DisplayValue displayValue;


    public Calculation(DisplayValue displayValue) {
        this.displayValue=displayValue;
    }

    public void setValueOne(int valueOne) {
        ValueOne = valueOne;
    }

    public void setValueTwo(int valueTwo) {
        ValueTwo = valueTwo;
    }

   /* public void setDisplayValue(DisplayValue displayValue) {
        this.displayValue = displayValue;
    }*/




    public void temp()
    {
        //System.out.println("Hello World");
        displayValue.Addition(ValueOne,ValueTwo);
        displayValue.Division(ValueOne,ValueTwo);
        displayValue.Multiplication(ValueOne,ValueTwo);
        displayValue.Subtraction(ValueOne,ValueTwo);
    }



}
