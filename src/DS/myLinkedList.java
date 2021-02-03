package DS;

//Create the below linked list:
//myLinkedList = {
//head: {
//  value: 10
//  next: {
//    value: 5
//    next: {
//      value: 16
//      next: null
//    }
//  }
//}
//};

public class myLinkedList {

	Node hnod;
	Node tnod;
	int length = 0;
	public myLinkedList(String data) {
		this.hnod = new Node();
		this.hnod.data = data;
		this.hnod.next = null;
		this.tnod = this.hnod;
		this.length++;
	}
	
	public void append(String data) {
		Node nwNode = new Node();
		nwNode.data = data;
		nwNode.next = null;
		this.tnod.next = nwNode;
		this.tnod = nwNode;
		this.length++;
	}
	
	public void prepend(String data) {
		Node nwNode = new Node();
		nwNode.data = data;
		nwNode.next = this.hnod;
		this.hnod = nwNode;
	}
	
	public static void main(String[] args) {
		myLinkedList mylist =  new myLinkedList("10");
mylist.append("5");
mylist.append("16");
mylist.prepend("1");
mylist.prepend("4");

		System.out.println(mylist);
	}

	@Override
	public String toString() {
		return "myLinkedList [hnod=" + hnod + ", tnod=" + tnod + ", length=" + length + "]";
	}

	
	
	
}

class Node {
	String data;
	Object next;
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	
	
	
}