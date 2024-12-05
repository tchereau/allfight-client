import java.util.Random;

public class rq extends r8 {
   public rq(int var1) {
      super(var1, ts.u);
   }

   public n4 if(y6 var1) {
      return new ol();
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         boolean var6 = var1.f(var2, var3, var4);
         int var7 = var1.for(var2, var3, var4);
         boolean var8 = (var7 & 1) != 0;
         if (var6 && !var8) {
            var1.do(var2, var3, var4, var7 | 1, 4);
            var1.if(var2, var3, var4, this.void, this.a(var1));
         } else if (!var6 && var8) {
            var1.do(var2, var3, var4, var7 & -2, 4);
         }
      }

   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      n4 var6 = var1.if(var2, var3, var4);
      if (var6 != null && var6 instanceof ol) {
         ol var7 = (ol)var6;
         var7.aQ(var7.do(var1));
         var1.new(var2, var3, var4, this.void);
      }

   }

   public int a(y6 var1) {
      return 1;
   }

   public boolean a(y6 var1, int var2, int var3, int var4, aek var5, int var6, float var7, float var8, float var9) {
      ol var10 = (ol)var1.if(var2, var3, var4);
      if (var10 != null) {
         var5.a((n4)var10);
      }

      return true;
   }

   public boolean k() {
      return true;
   }

   public int int(y6 var1, int var2, int var3, int var4, int var5) {
      n4 var6 = var1.if(var2, var3, var4);
      return var6 != null && var6 instanceof ol ? ((ol)var6).gE() : 0;
   }

   public void a(y6 var1, int var2, int var3, int var4, aig var5, abp var6) {
      ol var7 = (ol)var1.if(var2, var3, var4);
      if (var6.g()) {
         var7.D(var6.void());
      }

   }
}
