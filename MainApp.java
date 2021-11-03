package basic.dev;

public class MainApp {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	BST Node = new BST();
	
	Node.insert(42);
	Node.insert(23);
	Node.insert(74);
	Node.insert(11);
	Node.insert(65);
	Node.insert(58);
	Node.insert(94);
	Node.insert(36);
	Node.insert(87);
	Node.insert(99);
	
	System.out.println("RNL: ");
	Node.printRNL(Node.Root);
	System.out.println("\n");
	System.out.println("LNR: ");
	Node.printLNR(Node.Root);
	System.out.println("\n");
	System.out.println("NRL: ");
	Node.printNRL(Node.Root);
	System.out.println("\n");
	System.out.println("RLN: ");
	Node.printRLN(Node.Root);
	System.out.println("\n");
	System.out.println("LRN: ");
	Node.printLRN(Node.Root);
	System.out.println("\n");
	System.out.println("NLR: ");
	Node.printNLR(Node.Root);
	}
}