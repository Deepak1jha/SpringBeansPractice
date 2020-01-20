import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class DisplayValue {

   // private FileOutputStream fileOutputStream;

    private System sys;



   //FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
 //  PrintStream out;




    public DisplayValue() throws FileNotFoundException {

       // this.fileOutputStream=fileOutputStream;
        //out=new PrintStream(fileOutputStream);

    }

    public DisplayValue(System sys) {
        this.sys=sys;
    }


    public void Addition(int ValueOne, int ValueTwo) {
       sys.out.println("Additon ="+(ValueOne+ValueTwo));

    }

    public void Multiplication(int ValueOne, int ValueTwo)
    {

       sys.out.println("Multiplication ="+(ValueOne*ValueTwo));

    }

    public void Division(int ValueOne, int ValueTwo)
    {
       sys.out.println("Division ="+(ValueOne/ValueTwo));

    }

    public void Subtraction(int ValueOne, int ValueTwo)
    {
      sys.out.println("Subtraction="+(ValueOne-ValueTwo));

    }


}
