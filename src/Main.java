public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora("patito",false);

        Calculadora cientifica = new Calculadora("casio",true);

        basica.setPrimerValor(284.9);
        basica.setSegundoValor(0.0);

        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);

        System.out.println("CALCULADORA BÁSICA");
        System.out.println("La suma de " +basica.getPrimerValor()+ " + " + " " +basica.getSegundoValor() +" = "+basica.sumar());
        System.out.println("La resta de " +basica.getPrimerValor()+ " - " + " " +basica.getSegundoValor() +" = "+basica.restar());
        System.out.println("La multiplicacion de " +basica.getPrimerValor()+ " * " + " " +basica.getSegundoValor() +" = "+basica.multiplicar());
        System.out.println("La division de " +basica.getPrimerValor()+ " / " + " " +basica.getSegundoValor() +" = " +basica.dividir());
        System.out.println("La potencia de " +basica.getPrimerValor()+ " elevado a" + " " +basica.getSegundoValor() + " =  \n"  +basica.elevarAPotencia());
        System.out.println(basica.toString());

        System.out.println("CALCULADORA CIENTÍFICA");
        System.out.println("La suma de " +cientifica.getPrimerValor()+ " + " + " " +cientifica.getSegundoValor() +" = "+cientifica.sumar());
        System.out.println("La resta de " +cientifica.getPrimerValor()+ " - " + " " +cientifica.getSegundoValor() +" = "+cientifica.restar());
        System.out.println("La multiplicacion de " +cientifica.getPrimerValor()+ " * " + " " +cientifica.getSegundoValor() +" = "+cientifica.multiplicar());
        System.out.println("La division de " +cientifica.getPrimerValor()+ " / " + " " +cientifica.getSegundoValor() +" = " +cientifica.dividir());
        System.out.println("La potencia de " +cientifica.getPrimerValor()+ " elevado a" + " " +cientifica.getSegundoValor() + " = " +cientifica.elevarAPotencia());
        System.out.println(cientifica.toString());


    }


}
