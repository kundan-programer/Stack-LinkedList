import java.util.Scanner;

class stack1 {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node top = null;

  void push(Scanner sc) {
    System.out.print("Enter Data: ");
    int data = sc.nextInt();

    Node ob = new Node(data);

    if (top == null) {
      top = ob;
    }

    else {
      ob.next = top;
      top = ob;
    }
  }

  void pop() {
    if (top == null) {
      System.out.print("Stack is empty");
    }

    else {

      top = top.next;
    }

  }

  void display() {
    Node temp = top;

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}

public class Stack_LL {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    stack s = new stack();
    int l;
    do {

      System.out.println("Press 1 to push: ");
      System.out.println("Press 2 to pop: ");
      System.out.println("Press 3 to display: ");
      System.out.println();
      System.out.print("Enter your chice: ");
      int c = sc.nextInt();

      switch (c) {
        case 1:
          s.push();
          break;

        case 2:
          s.pop();
          break;

        case 3:
          s.display();
          break;
      }
      System.out.print("\nEnter 0 to go back to the main menu: ");
      l = sc.nextInt();
      System.out.println();
    }

    while (l == 0);
    System.out.print("Exit sucessfully");
  }
}
