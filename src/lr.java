import java.util.List;

final class lr extends le {
   // $FF: synthetic field
   final int do;

   lr(int var1) {
      this.do = var1;
   }

   public boolean if(List var1) {
      return var1.size() > this.do;
   }

   public String a() {
      return Integer.toString(this.do);
   }

   public l6 a(List var1) {
      return (l6)var1.get(this.do);
   }

   public String toString() {
      return "an element at index [" + this.do + "]";
   }

   // $FF: synthetic method
   public Object do(Object var1) {
      return this.a((List)var1);
   }
}
