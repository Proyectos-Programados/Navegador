package listas;

/**
 *
 * @author Juan Pablo Cubero
 * 
 * This is a list to store the already processed URLs
 * 
 */
public class ListaCircular {
    
    class Nodo {
        String info;
        Nodo ant,sig;
    }
    
    private Nodo head;
    
    public ListaCircular () {
        head=null;
    }
              
    /*
    * Method to insert a Node in the first position
    */
    public void insertarPrimero(String x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (head==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            head=nuevo;
        } else {
            Nodo tail=head.ant;
            nuevo.sig=head;
            nuevo.ant=tail;
            head.ant=nuevo;
            tail.sig=nuevo;
            head=nuevo;
        }
    }
    
    /*
    * Boolean method to check if the list is empty
    */    
    public boolean vacia ()
    {
        if (head == null)
            return true;
        else
            return false;
    }
    
    /*
    * Printing method
    */
    
    public void imprimir ()
    {
        if (!vacia()) {
            Nodo reco=head;
            do {
                System.out.print (reco.info + "\n");                
                reco = reco.sig;                
            } while (reco!=head);
            System.out.println();
        }    
    }
    
    /*
    * Method to calculate how many elements does this list have
    */
    public int cantidad ()
    {
        int cant = 0;
        if (!vacia()) {
            Nodo reco=head;
            do {
                cant++;
                reco = reco.sig;                
            } while (reco!=head);
        }    
        return cant;
    }
    
    /*
    * Important method! Used to erase node on the list by their index position
    */
    
    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                if (cantidad()==1) {
                    head=null;
                } else {
                    Nodo ultimo=head.ant;    
                    head = head.sig;
                    ultimo.sig=head;
                    head.ant=ultimo;
                } 
            } else {
                Nodo reco = head;
                for (int f = 1 ; f <= pos - 1 ; f++)
                    reco = reco.sig;
                Nodo anterior = reco.ant;
                reco=reco.sig;
                anterior.sig=reco;
                reco.ant=anterior;
            }
        }
    }    
    /*
    * Initialazing all the forementioned methods
    */
    public static void main(String[] ar) {
        ListaCircular lc=new ListaCircular();
        lc.insertarPrimero("http://google.com");
        lc.insertarPrimero("http://nacion.com");
        lc.insertarPrimero("http://amazon.com");
        lc.insertarPrimero("https://es.wikipedia.org/wiki");
        System.out.println("4 nodos principales");
        lc.imprimir();
        System.out.println("Cantidad de nodos:"+lc.cantidad());              
    }
}   

