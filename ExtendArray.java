package src;

public class ExtendArray<E> implements QueueADT<E> {
	   E[] Q;
	   E[] M;
	   int f,r;
	   int N;  // array size

	   /**
	    * Constructor for objects of class ArrayQueue.
	    * In assignment 1C part ii no change need be made to this constructor.
	    * With this constructor a queue can hold up to 3 (i.e. N-1)items when 
	    * using the approach described in lectures.
	    */
	   public ExtendArray()
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
		   if (size() == Q.length - 1){
					int L = 2*N;
				   	M = (E[]) new Object[L];
				   	for(int i = 0; i < Q.length; i++){
				   		M[i] = Q[i];
				   		f = (f+1)%Q.length;
				   		Q = M;
				   	}
			}
		    Q[r] = element;
		    r = (r + 1)%Q.length;
		    System.out.println(size());
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
			   f = (f + 1)%Q.length;
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
		   return (Q.length-f+r)%Q.length;
	   }

	   public boolean isEmpty(){
	     return (f==r);
	   }  
	}
