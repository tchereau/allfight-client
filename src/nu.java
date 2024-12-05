import java.util.ArrayList;
import java.util.List;

public class nu {
   private final int if;
   private final int a;
   private final List new = new ArrayList();
   private int int = 0;
   private int for = 0;
   private int do = 0;

   public nu(int var1, int var2) {
      this.if = var1;
      this.a = var2;
   }

   public nw a(double var1, double var3, double var5, double var7, double var9, double var11) {
      nw var13;
      if (this.int >= this.new.size()) {
         var13 = new nw(var1, var3, var5, var7, var9, var11);
         this.new.add(var13);
      } else {
         var13 = (nw)this.new.get(this.int);
         var13.a(var1, var3, var5, var7, var9, var11);
      }

      ++this.int;
      return var13;
   }

   public void do() {
      if (this.int > this.for) {
         this.for = this.int;
      }

      if (this.do++ == this.if) {
         int var1 = Math.max(this.for, this.new.size() - this.a);

         while(this.new.size() > var1) {
            this.new.remove(var1);
         }

         this.for = 0;
         this.do = 0;
      }

      this.int = 0;
   }

   public void if() {
      this.int = 0;
      this.new.clear();
   }

   public int a() {
      return this.new.size();
   }

   public int for() {
      return this.int;
   }
}
