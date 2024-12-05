import java.util.Random;

final class amz extends ara {
   private boolean int = true;

   protected abp if(arc var1, abp var2) {
      aq6 var3 = rh.B(var1.byte());
      y6 var4 = var1.for();
      int var5 = var1.case() + var3.a();
      int var6 = var1.new() + var3.for();
      int var7 = var1.int() + var3.if();
      if (var4.a(var5, var6, var7)) {
         var4.int(var5, var6, var7, pa.bo.void);
         if (var2.a(1, (Random)var4.o)) {
            var2.if = 0;
         }
      } else if (var4.new(var5, var6, var7) == pa.bz.void) {
         pa.bz.a((y6)var4, var5, var6, var7, 1);
         var4.o(var5, var6, var7);
      } else {
         this.int = false;
      }

      return var2;
   }

   protected void a(arc var1) {
      if (this.int) {
         var1.for().for(1000, var1.case(), var1.new(), var1.int(), 0);
      } else {
         var1.for().for(1001, var1.case(), var1.new(), var1.int(), 0);
      }

   }
}
