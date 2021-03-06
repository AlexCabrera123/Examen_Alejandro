public class Calculadora {
    private String marca;
    private boolean esCientifica;
    private double primerValor;
    private double segundoValor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    public double sumar() {

        return primerValor + segundoValor;
    }

    public double restar() {
        return primerValor - segundoValor;
    }

    public double multiplicar() {
        return primerValor * segundoValor;
    }

    public double dividir() {
        double division;
        division = primerValor / segundoValor;

        if (segundoValor == 0) {
            return 0.0;
        } else {
            return division;
        }
    }

        public String elevarAPotencia(){
        if(esCientifica==true){
            return " "+Math.pow(primerValor,segundoValor);
        }else{
            return "Su calculadora no es científica";
        }
        }

        public String toString(){
            if(esCientifica==true){
                return "La calculadora es cientifica y es de marca " +marca;
            }else{
                return "La calculadora no es cientifica y es de marca " +marca;
            }

    }
}
