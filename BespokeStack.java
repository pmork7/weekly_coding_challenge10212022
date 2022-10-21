package weeklycodingchallenge10212022;

import java.util.*;

public class BespokeStack {
   private List<Integer> values = new ArrayList<>();
   
   public BespokeStack() {
      super();
   }
   
   public void push(int value) {
      this.values.add(value);
   }
   
   public int pop() {
      return this.values.remove(values.size() - 1);
   }
   
   public String toString() {
      return values.toString();
   }
}