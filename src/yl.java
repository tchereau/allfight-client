import java.util.ArrayList;
import java.util.List;

public class yl {
   private final yi if;
   private long a = 0L;
   private ajv for = new ajv();
   private List do = new ArrayList();

   public yl(yi var1) {
      this.if = var1;
   }

   public yk do(int var1, int var2) {
      var1 >>= 4;
      var2 >>= 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      yk var5 = (yk)this.for.int(var3);
      if (var5 == null) {
         var5 = new yk(this, var1, var2);
         this.for.a(var3, var5);
         this.do.add(var5);
      }

      var5.for = System.currentTimeMillis();
      return var5;
   }

   public yn a(int var1, int var2) {
      return this.do(var1, var2).a(var1, var2);
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.a;
      if (var3 > 7500L || var3 < 0L) {
         this.a = var1;

         for(int var5 = 0; var5 < this.do.size(); ++var5) {
            yk var6 = (yk)this.do.get(var5);
            long var7 = var1 - var6.for;
            if (var7 > 30000L || var7 < 0L) {
               this.do.remove(var5--);
               long var9 = (long)var6.new & 4294967295L | ((long)var6.int & 4294967295L) << 32;
               this.for.new(var9);
            }
         }
      }

   }

   public yn[] if(int var1, int var2) {
      return this.do(var1, var2).try;
   }

   // $FF: synthetic method
   static yi a(yl var0) {
      return var0.if;
   }
}
