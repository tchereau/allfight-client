import java.util.Random;

public class qt extends qz {
   public qt(int var1) {
      super(var1, "ice", ts.e, false);
      this.aq = 0.98F;
      this.a(true);
      this.a(acn.d);
   }

   public int b() {
      return 1;
   }

   public boolean int(yy var1, int var2, int var3, int var4, int var5) {
      return super.int(var1, var2, var3, var4, 1 - var5);
   }

   public void a(y6 var1, aek var2, int var3, int var4, int var5, int var6) {
      var2.a((akf)aka.void[this.void], 1);
      var2.d(0.025F);
      if (this.d() && z1.for(var2)) {
         abp var9 = this.int(var6);
         if (var9 != null) {
            this.a(var1, var3, var4, var5, var9);
         }
      } else {
         if (var1.n.int) {
            var1.o(var3, var4, var5);
            return;
         }

         int var7 = z1.a((aig)var2);
         this.a(var1, var3, var4, var5, var6, var7);
         ts var8 = var1.byte(var3, var4 - 1, var5);
         if (var8.void() || var8.case()) {
            var1.int(var3, var4, var5, pa.bb.void);
         }
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (var1.for(yw.a, var2, var3, var4) > 11 - pa.t[this.void]) {
         if (var1.n.int) {
            var1.o(var2, var3, var4);
            return;
         }

         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.int(var2, var3, var4, pa.ba.void);
      }

   }

   public int case() {
      return 0;
   }
}
