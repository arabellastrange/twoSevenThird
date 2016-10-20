package src; 

public class NodeQueue<E> implements QueueADT<E>{
	   protected int size;
	   protected Node<E> top;
	   protected Node<E> front;
	   
	   public NodeQueue(){
		   top = null;
		   size = 0;
	   }
	   
	   public void enqueue(E element){
			   Node<E> v = new Node<E> (element, top);
			   if(size == 0){
				   front = v;
			   }
			   else{
				   top.setNext(v);
			   }
			   top = v;
			   size++;
	   }
	   
	   public E dequeue(){
		   if (isEmpty()){
			   throw new EmptyQueueException("Stack is empty, cannot read from stack");
		   }
		   else{
			   E temp = front.getElement();
			   front = front.getNext();
			   size--;
			   return temp;
		   }
	   }
	   public E front(){ //error here
		   if(isEmpty()){
			   throw new EmptyQueueException("Stack is empty, cannot read from stack");
		   }
		   else{
			   return front.getElement();
		   }
	   }

	   public int size(){
		   return size;
	   }

	   public boolean isEmpty(){
		   return (size == 0);
	   }
}
