import java.util.Random;

public class ql extends qn {
   protected ql(int var1, ts var2) {
      super(var1, var2);
      this.a(false);
      if (var2 == ts.r) {
         this.a(true);
      }

   }

   public boolean a(yy var1, int var2, int var3, int var4) {
      return this.at != ts.r;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      super.new(var1, var2, var3, var4, var5);
      if (var1.new(var2, var3, var4) == this.void) {
         this.n(var1, var2, var3, var4);
      }

   }

   private void n(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      var1.int(var2, var3, var4, this.void - 1, var5, 2);
      var1.if(var2, var3, var4, this.void - 1, this.a(var1));
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      if (this.at == ts.r) {
         int var6 = var5.nextInt(3);
         int var7 = 0;

         while(true) {
            int var8;
            if (var7 >= var6) {
               if (var6 == 0) {
                  var7 = var2;
                  var8 = var4;

                  for(int var9 = 0; var9 < 3; ++var9) {
                     var2 = var7 + var5.nextInt(3) - 1;
                     var4 = var8 + var5.nextInt(3) - 1;
                     if (var1.a(var2, var3 + 1, var4) && this.o(var1, var2, var3, var4)) {
                        var1.int(var2, var3 + 1, var4, pa.bo.void);
                     }
                  }
               }
               break;
            }

            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            var8 = var1.new(var2, var3, var4);
            if (var8 == 0) {
               if (this.o(var1, var2 - 1, var3, var4) || this.o(var1, var2 + 1, var3, var4) || this.o(var1, var2, var3, var4 - 1) || this.o(var1, var2, var3, var4 + 1) || this.o(var1, var2, var3 - 1, var4) || this.o(var1, var2, var3 + 1, var4)) {
                  var1.int(var2, var3, var4, pa.bo.void);
                  return;
               }
            } else if (pa.x[var8].at.void()) {
               return;
            }

            ++var7;
         }
      }

   }

   private boolean o(y6 var1, int var2, int var3, int var4) {
      return var1.byte(var2, var3, var4).byte();
   }
}
