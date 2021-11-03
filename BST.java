package basic.dev;

public class BST {
public Node Root;

public BST() {
	Root = null;
}

public void insert(int x) {
	Root = insertBST(Root, x);
}

public Node insertBST(Node Root, int x) {
	if(Root == null) {
		Node p = new Node(x);
		p.left = p.right = null;
		Root = p;
	}
	else {
		if(x < Root.nd) {
			Root.left =  insertBST(Root.left, x);
		}
		else {
			if(x > Root.nd) {
				Root.right = insertBST(Root.right,x);
			}
			else {
				System.out.println("Nut nay da ton tai");
			}
		}
	}
	return Root;		
}

public void print(Node Root) {
	if (Root != null) {
		Root.printNut();
	}
}
//RNL
public void printRNL(Node Root) {
	if (Root != null) {
		printRNL(Root.right);
		Root.printNut();
		printRNL(Root.left);
	}
}
//LNR
public void printLNR(Node Root) {
	if (Root != null) {
		printLNR(Root.left);
		Root.printNut();
		printLNR(Root.right);
	}
}
//NRL
public void printNRL(Node Root) {
	if (Root != null) {
		Root.printNut();
		printNRL(Root.right);
		printNRL(Root.left);
	}
}
//RLN
public void printRLN(Node Root) {
	if (Root != null) {
		printRLN(Root.right);
		printRLN(Root.left);
		Root.printNut();
	}
}
//LRN
public void printLRN(Node Root) {
	if (Root != null) {
		printLRN(Root.left);
		printLRN(Root.right);
		Root.printNut();
	}
}
//NLR
public void printNLR(Node Root) {
	if (Root != null) {
		Root.printNut();
		printNLR(Root.left);
		printNLR(Root.right);
	}
}
}