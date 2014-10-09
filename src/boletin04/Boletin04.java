package boletin04;
public class Boletin04 {
    public static void main(String[] args) {
        Semaforo sema1=new Semaforo();
        String valor=sema1.dameCor();
        System.out.println("cor antes de darlle un valor: "+valor);
        sema1.ponCor("verde");
        valor=sema1.dameCor();
        System.out.println("Cor: "+ valor);
    }
}
