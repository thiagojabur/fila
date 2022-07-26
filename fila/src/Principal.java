
public class Principal {

	public static void main(String[] args) {
		

		Queue fila1 = new Queue();
		fila1.enqueue(new DNode("1", null,null));
		fila1.enqueue(new DNode("2", null,null));
		fila1.dequeue();
	
		System.out.println("Imprimindo os elementos \n" + fila1);

    }

}
