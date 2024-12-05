import java.util.List;
import java.util.Random;

public class nz extends pa {
   private ajd cx = null;

   public nz(int var1) {
      super(var1, ts.byte);
      this.a((o6)N);
      this.if(0.5F);
   }

   public void a(ajd var1) {
      this.cx = var1;
   }

   public void r() {
      this.cx = null;
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.do(var1, var2, var3, var4, var5, var6);
      int var7 = api.if[byte(var6)];
      var2 += api.a[var7];
      var3 += api.int[var7];
      var4 += api.for[var7];
      int var8 = var1.new(var2, var3, var4);
      if (var8 == pa.bZ.void || var8 == pa.af.void) {
         var6 = var1.for(var2, var3, var4);
         if (n0.char(var6)) {
            pa.x[var8].a(var1, var2, var3, var4, var6, 0);
            var1.o(var2, var3, var4);
         }
      }

   }

   public ajd if(int var1, int var2) {
      int var3 = byte(var2);
      if (var1 == var3) {
         if (this.cx != null) {
            return this.cx;
         } else {
            return (var2 & 8) != 0 ? n0.if("piston_top_sticky") : n0.if("piston_top");
         }
      } else {
         return var3 < 6 && var1 == api.if[var3] ? n0.if("piston_top") : n0.if("piston_side");
      }
   }

   public void a(ajc var1) {
   }

   public int new() {
      return 17;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean for(y6 var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(y6 var1, int var2, int var3, int var4, nw var5, List var6, aiw var7) {
      int var8 = var1.for(var2, var3, var4);
      switch(byte(var8)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
         this.a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void int(yy var1, int var2, int var3, int var4) {
      int var5 = var1.for(var2, var3, var4);
      switch(byte(var5)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      int var6 = byte(var1.for(var2, var3, var4));
      int var7 = var1.new(var2 - api.a[var6], var3 - api.int[var6], var4 - api.for[var6]);
      if (var7 != pa.bZ.void && var7 != pa.af.void) {
         var1.o(var2, var3, var4);
      } else {
         pa.x[var7].new(var1, var2 - api.a[var6], var3 - api.int[var6], var4 - api.for[var6], var5);
      }

   }

   public static int byte(int var0) {
      return var0 & 7;
   }

   public int do(y6 var1, int var2, int var3, int var4) {
      return 0;
   }
}
