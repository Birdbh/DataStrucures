class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution
{
    int getMiddle(Node head)
    {
         Node temp = head;
         int i = 0;
         while (temp != null){
             i++;
             temp=temp.next;
         }
         int j=(i/2);
         for(int v = 0; v < j; v++){
             head=head.next;
         }
         return head.data;
    }
}