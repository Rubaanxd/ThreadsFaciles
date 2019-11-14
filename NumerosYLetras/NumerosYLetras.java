package NumerosYLetras;
/**
 * Cosas lo que hay que poner en el Main
 * 
 *  NumerosYLetras n1 =  new NumerosYLetras(1);
    NumerosYLetras n2 = new NumerosYLetras(2);
    Thread t1 = new Thread(n1);
    Thread t2 = new Thread(n2);

    t1.start();
    t2.start();
 */
/**
 *
 * @author RubaanxD
 */
public class NumerosYLetras implements Runnable{
    private int tipo;

    public NumerosYLetras(int tipo) {
        this.tipo = tipo;
    }

    public NumerosYLetras() {
    }    
    
    @Override
    public void run() {
        while(true){
            switch (tipo){
                case 1:
                    for (int i = 0; i < 31; i++) {
                        System.out.println(i);                        
                    }
                    break;
                case 2:
                    for (char i = 'a'; i <= 'z'; i++) {
                        System.out.println(i);
                    }
                    break;
            }
        }
    }
    
}
