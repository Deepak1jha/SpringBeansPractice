import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:Beans.xml");
       // System.out.println("Beans set");
        Calculation calculation_obj= (Calculation) applicationContext.getBean("calculation_bean");
        //DisplayValue displayValue_obj= (DisplayValue) applicationContext.getBean("displayValue_bean");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Value");
        int First_value=scanner.nextInt();
        System.out.println("Enter Second Value");
        int Seconnd_value=scanner.nextInt();

        //calculation_obj.setDisplayValue(displayValue_obj);
        calculation_obj.setValueOne(First_value);
        calculation_obj.setValueTwo(Seconnd_value);
        calculation_obj.temp();



        /*FileOutputStream fout=new FileOutputStream("file.txt");

        //creating Printstream obj
        PrintStream out=new PrintStream(fout);
        String s="First"; */


    }
}
