package Contador;
/**
 * Cosas lo que hay que poner en el Main
 * 
    *  Contador c1 = new Contador(50, "Contaddor 1");
       Contador c2 = new Contador(10, "Contaddor 2");
       Contador c3 = new Contador(70, "Contaddor 3");
       Contador c4 = new Contador(100, "Contaddor 4");
       Thread t1 = new Thread(c1);
       Thread t2 = new Thread(c2);
       Thread t3 = new Thread(c3);      
       Thread t4 = new Thread(c4);
       t1.start();
       t2.start();
       t3.start();
       t4.start();

       try {
           t1.join();
           t2.join();
           t3.join();
           t4.join();
       } catch (InterruptedException ex) {
           System.out.println(ex.getMessage());
       }
       System.out.println("Fin del Programa");
 */


/**
 *
 * @author RubaanxD
 */
public class Contador implements Runnable{
    private int contador,limite;
    private String nombre;

    public Contador(int limite, String nombre) {
        this.contador = 0;
        this.limite = limite;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while(contador <= limite){
            System.out.println("Hilo "+nombre+" : "+contador);
            contador++;
        }
        System.out.println("Hilo "+nombre+" ya ha acabado");
    }
    
    
}
