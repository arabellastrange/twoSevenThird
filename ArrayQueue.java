package src;

/**
 * This class is for completion in exerise 1C part ii
*/

public class ArrayQueue<E> implements QueueADT<E>
{
   E[] Q;
   int f,r;
   int N;  // array size

   /**
    * Constructor for objects of class ArrayQueue.
    * In assignment 1C part ii no change need be made to this constructor.
    * With this constructor a queue can hold up to 3 (i.e. N-1)items when 
    * using the approach described in lectures.
    */
   public ArrayQueue()
   {
       N=4;
       Q = (E[]) new Object[N]; 
       f=0;
       r=0;
   }
    
   // In exercise 1C part ii complete the methods below using an array implementation 
   
   /** 
     @throws FullQueueException
   */
   public void enqueue(E element){
	   if (size() == N-1 ){
			   throw new FullQueueException("The stack is full, cannot queue");
			   }
	   else{
			   Q[r] = element;
			   r = (r + 1)%N;
			}
   }

   /**
     @throws EmptyQueueException
   */
   public E dequeue(){
	   E e;
	   if (isEmpty()){
		   throw new EmptyQueueException("Stack is empty, cannot read from stack");
	   }
	   else{
		   e = Q[f];
		   f = (f + 1)%N;
	   }
	   return e;

   }
   
   /**
     @throws EmptyQueueException
   */
   public E front(){
	   if(isEmpty()){
		   throw new EmptyQueueException("Stack is empty, cannot read from stack");
	   }
	   else{
		   return Q[f];
	   }
   }

   public int size(){
	   return (N-f+r)%N;
   }

   public boolean isEmpty(){
     return (f==r);
   }  
}
