public class Main {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> lista1 = new DoubleLinkedList<Integer>();
		lista1.addFirst( 3 );
		lista1.addLast( 4 );
		lista1.addLast( 5 );
		lista1.addLast( 6 );
		lista1.addLast( 7 );
		lista1.addLast( 8 );
		lista1.addFirst( 11 );
		lista1.addAt(33, 3);
		lista1.deleteFirst();
		lista1.deleteLast();
		lista1.deleteAt(4);
		System.out.println("existe elemento? " + lista1.search(33));
		System.out.print(lista1.toString());
	}

}
