package listacircular;

/**
 *
 * @author afonso
 */
public class ListaCircular {
    
    private No first;
    private No last;  
    private int size = 0;

    public No Buscar(Object valor){
      No aux = this.first;      
      while(aux.getNext() != this.first){
         if(valor.equals(aux.getData())){
            return aux;
         }
         aux = aux.getNext();
      }
        System.out.println("Elemento não existente");
      return null;
    }
    
    public void insereInicio(Object data) {
        No aux = new No(data, null, null);
        if(this.first == null) {
            aux.setNext(aux);
            aux.setPrev(aux);
            this.first = aux;
            this.last = this.first;
        } else {
            aux.setPrev(this.last);
            this.last.setNext(aux);
            this.first.setPrev(aux);
            aux.setNext(this.first);
            this.first = aux;
        }
        size++;
    }
    
    public void insereFinal(Object data) {
        No aux = new No(data, null, null);
        if(this.first == null) {
            aux.setNext(aux);
            aux.setPrev(aux);
            this.first = aux;
            this.last = this.first;
        } else {
            aux.setPrev(this.last);
            this.last.setNext(aux);
            this.first.setPrev(aux);
            aux.setNext(this.first);
            this.last = aux;
        }
        size++;
    }
    
    public No remove(Object data) {
        if(this.first == this.last) {
            No aux = this.first;
            this.first = null;
            this.last = null;
            return aux;
        }
        No aux = Buscar(data);
        No p = aux.getPrev();
        No n = aux.getNext();
        
        p.setNext(n);
        n.setPrev(p);
        
        return aux;
    }
  
    
}
