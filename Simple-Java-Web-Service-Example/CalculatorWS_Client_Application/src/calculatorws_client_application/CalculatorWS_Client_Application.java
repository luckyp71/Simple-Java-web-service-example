package calculatorws_client_application;

/**
 *
 * @author Lucky Pratama
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i ;
        int j;

        List list1 = new ArrayList();
        String[] list2;

        try{
            i = 10;
            j = 2;
        
        list1.add(String.valueOf(add(i,j)));
        list1.add(String.valueOf(subtract(i,j))); 
        list1.add(String.valueOf(multiply(i, j)));
        list1.add(String.valueOf(divide(i, j)));
        
        list2 = new String[] {"10 + 2","10 - 2","10 x 2", "10 : 2"};
        
        int b = 0;
        
        for(Object a: list1){
            System.out.println(list2[b]+" = "+a);
            b++;
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int add(int i, int j) {
        com.lucky.CalculatorWS_Service service = new com.lucky.CalculatorWS_Service();
        com.lucky.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    private static int subtract(int i, int j) {
        com.lucky.CalculatorWS_Service service = new com.lucky.CalculatorWS_Service();
        com.lucky.CalculatorWS port = service.getCalculatorWSPort();
        return port.subtract(i, j);
    }

    private static int multiply(int i, int j) {
        com.lucky.CalculatorWS_Service service = new com.lucky.CalculatorWS_Service();
        com.lucky.CalculatorWS port = service.getCalculatorWSPort();
        return port.multiply(i, j);
    }

    private static int divide(int i, int j) {
        com.lucky.CalculatorWS_Service service = new com.lucky.CalculatorWS_Service();
        com.lucky.CalculatorWS port = service.getCalculatorWSPort();
        return port.divide(i, j);
    }   
}
