
class Node {
  int data;
  Node? nextNode;

  Node(int data):
      this.data = data;

  Node? get next {
    return nextNode;
  }

  void set next(Node next){
      this.nextNode = next;
  }
}

void append(Node? head, int data) {
  if(head == null) {
    return;
  }

  Node? currNode = head;

  bool last = false;
  print("Entered");
  while(last != true) {
      currNode = currNode.next;
      if(currNode == null) {
        last = true;
      }
  }
  currNode.next = new Node(data);

}

main() {
  Node head = Node(8);
  append(head, 7);
  print(head.next.data);
}