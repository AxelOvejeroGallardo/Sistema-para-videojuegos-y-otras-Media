package TPn12;

public class OperacionMatematica<T> {

    private <T extends Number> double suma(T datoA, T datoB){
        try{
            return datoA.doubleValue() + datoB.doubleValue();
        }catch (NumberFormatException e ){
            e.printStackTrace();
        }
        return 0;
    }

    private <T extends Number> double resta(T datoA, T datoB){
        try{
            return datoA.doubleValue() - datoB.doubleValue();
        }catch (NumberFormatException e ){
            e.printStackTrace();
        }
        return 0;
    }

    private <T extends Number> double multiplicacion(T datoA, T datoB){
        try{
            return datoA.doubleValue() * datoB.doubleValue();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        return 0;
    }

    private <T extends Number> double division(T datoA, T datoB){
        try{
            return datoA.doubleValue()/datoB.doubleValue();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(ArithmeticException a){
            a.printStackTrace();
        }
        return 0;
    }
}
