import java.util.ArrayList;
import java.util.List;

public class nq {
   private final int if;
   private final int a;
   private final List new = new ArrayList();
   private int int = 0;
   private int for = 0;
   private int do = 0;

   public nq(int var1, int var2) {
      this.if = var1;
      this.a = var2;
   }

   public nr a(double var1, double var3, double var5) {
      if (this.a()) {
         return new nr(this, var1, var3, var5);
      } else {
         nr var7;
         if (this.int >= this.new.size()) {
            var7 = new nr(this, var1, var3, var5);
            this.new.add(var7);
         } else {
            var7 = (nr)this.new.get(this.int);
            var7.for(var1, var3, var5);
         }

         ++this.int;
         return var7;
      }
   }

   public void for() {
      if (!this.a()) {
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
   }

   public void do() {
      if (!this.a()) {
         this.int = 0;
         this.new.clear();
      }
   }

   public int if() {
      return this.new.size();
   }

   public int int() {
      return this.int;
   }

   private boolean a() {
      return this.a < 0 || this.if < 0;
   }
}
