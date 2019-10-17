package dataStructures;

public class NodeDoubleLinked<T> {

	public T content;
	
	public NodeDoubleLinked next;
	public NodeDoubleLinked prev;
	
	public <T> NodeDoubleLinked(T obj) {
		//content = obj;
		next = null;
		prev = null;
	}
	
	
	
}
