import org.example.Metodos_calcu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test_Metodos_Calculadora {

    @DisplayName("Evaluacion del metodo suma")
    @Test
    public  void test1 (){
        Metodos_calcu tester1 = new Metodos_calcu();

         boolean resultado_esperado;
         boolean resultado_actual = false;

         //resultado esperado sea verdadero
         int esperado = tester1.suma(2,3);
         if(esperado >= 0){
             resultado_esperado = true;
         } else if (esperado <=0) {
             resultado_esperado = true;
         }else {resultado_esperado = false;}


         //resultado actual sea verdadero y sea igual al resultado esperado. de lo contrario fallara el codigo
        int resultado =  tester1.suma(5, 3);
        if(resultado >= 0){
            resultado_actual = true;
            Assertions.assertEquals(resultado_esperado,resultado_actual);
        } else {
            if (resultado < 0 ) {
                resultado_actual = false;
            }
            Assertions.assertEquals(resultado_esperado,resultado_actual,"resultado es diferente");
        }
        //Assertions.assertNotEquals("","");
        // Assertions.assertTrue(true);
      //  Assertions.assertFalse(false);
    }

    @DisplayName("Evaluacion del metodo resta")
    @Test
    public  void test2 (){
        Metodos_calcu tester2 = new Metodos_calcu();
        tester2.resta(8, 3);
    }

    @DisplayName("Evaluacion del metodo multiplicacion")
    @Test
    public  void test3 (){
        Metodos_calcu tester3 = new Metodos_calcu();
        tester3.multiplicacion(2, 3);
    }

    @DisplayName("Evaluacion del metodo division")
    @Test
    public  void test4 (){
        Metodos_calcu tester4 = new Metodos_calcu();
        tester4.division(9, 3);
    }
}
















