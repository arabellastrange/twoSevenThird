package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtendArrayTestTest {

	@Test
	public void enqueueTest() {
		QueueADT<String> q = new  ExtendArray<>();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.enqueue("F");
		assertEquals(6, q.size());
	}

}
