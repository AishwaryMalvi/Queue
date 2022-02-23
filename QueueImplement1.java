package Queue;

import java.util.NoSuchElementException;

public class QueueImplement1 {
		private Listnode front;
		private Listnode rear;
		private int length;
		
		private class Listnode {
			private int data;
			private Listnode next;
			
		    public Listnode(int data) {
		    	this.data = data;
		    }
		}
		
		public int length() {
			return length;
		}
		public boolean isEmpty() {
			return length == 0;
		}
		public QueueImplement1() {
			this.front = null;
			this.rear = null;
			this.length = 0;
		}
		public void enQueue(int data) {
			Listnode temp = new Listnode(data);
			if(isEmpty()) {
				front = temp;
			}
			else {
				rear.next = temp;
			}
			rear = temp;
			length++;
		}
		public int deQueue() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			int result = front.data;
			front = front.next;
			if(front == null) {
				rear = null;
			}
			length--;
			return result;
		}
		public int first() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			return front.data;
		}
		public int last() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			return rear.data;
		}
		public void display() {
			if (isEmpty()) {
				return;
			}
			Listnode current = front;
			while(current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.print("null");
		}
	public static void main(String[] args) {
		QueueImplement1 queue = new QueueImplement1();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.display();
		queue.deQueue();
		queue.deQueue();
		System.out.println();
		queue.display();
		System.out.println();
		System.out.println(queue.first());
		System.out.println(queue.last());

	}

}
