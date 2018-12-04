package listacircular;

/**
 *
 * @author afonso
 */
public class No {
    
    private No prev;      
   private No next;
   private Object data;      

    No(Object data, No next, No prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
        
    }
   
   public void setData(Object data) {
      this.data = data;
   }
   
   public Object getData() {
      return data;
   }
   
   public void setPrev(No prev) {
      this.prev = prev;
   }
   
   public No getPrev() {
      return prev;
   }
   
   public void setNext(No next) {
      this.next = next;
   }
   
   public No getNext() {
      return next;
   }
    
}
