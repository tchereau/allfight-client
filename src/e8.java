public class e8 {
   private fi[] if;
   private fu[] a;
   public final float case;
   public final float byte;
   public final float try;
   public final float new;
   public final float int;
   public final float for;
   public String do;

   public e8(e7 var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.case = var4;
      this.byte = var5;
      this.try = var6;
      this.new = var4 + (float)var7;
      this.int = var5 + (float)var8;
      this.for = var6 + (float)var9;
      this.if = new fi[8];
      this.a = new fu[6];
      float var11 = var4 + (float)var7;
      float var12 = var5 + (float)var8;
      float var13 = var6 + (float)var9;
      var4 -= var10;
      var5 -= var10;
      var6 -= var10;
      var11 += var10;
      var12 += var10;
      var13 += var10;
      if (var1.void) {
         float var14 = var11;
         var11 = var4;
         var4 = var14;
      }

      fi var23 = new fi(var4, var5, var6, 0.0F, 0.0F);
      fi var15 = new fi(var11, var5, var6, 0.0F, 8.0F);
      fi var16 = new fi(var11, var12, var6, 8.0F, 8.0F);
      fi var17 = new fi(var4, var12, var6, 8.0F, 0.0F);
      fi var18 = new fi(var4, var5, var13, 0.0F, 0.0F);
      fi var19 = new fi(var11, var5, var13, 0.0F, 8.0F);
      fi var20 = new fi(var11, var12, var13, 8.0F, 8.0F);
      fi var21 = new fi(var4, var12, var13, 8.0F, 0.0F);
      this.if[0] = var23;
      this.if[1] = var15;
      this.if[2] = var16;
      this.if[3] = var17;
      this.if[4] = var18;
      this.if[5] = var19;
      this.if[6] = var20;
      this.if[7] = var21;
      this.a[0] = new fu(new fi[]{var19, var15, var16, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.i, var1.h);
      this.a[1] = new fu(new fi[]{var23, var18, var21, var17}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.i, var1.h);
      this.a[2] = new fu(new fi[]{var19, var18, var23, var15}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.i, var1.h);
      this.a[3] = new fu(new fi[]{var16, var17, var21, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.i, var1.h);
      this.a[4] = new fu(new fi[]{var15, var23, var17, var16}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.i, var1.h);
      this.a[5] = new fu(new fi[]{var18, var19, var20, var21}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.i, var1.h);
      if (var1.void) {
         for(int var22 = 0; var22 < this.a.length; ++var22) {
            this.a[var22].a();
         }
      }

   }

   public void a(c4 var1, float var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3].a(var1, var2);
      }

   }

   public e8 a(String var1) {
      this.do = var1;
      return this;
   }
}
