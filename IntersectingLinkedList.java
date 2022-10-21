package weeklycodingchallenge10212022;

public class IntersectingLinkedList {
   static class Node {
      private int value;
      private Node next;
      
      public Node(int value) {
         this.value = value;
      }
      
      public int getValue() {
         return this.value;
      }
      
      public Node getNext() {
         return this.next;
      }
      
      public String toString() {
         return String.format("{value=%d, next=%d",this.value, this.next.value);
      }
      
      public int findIntersectingNode() {
         return -1;
      }
   }
   
   public static void main(String[] args) {
      
   }
}