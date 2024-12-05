import org.lwjgl.opengl.GL11;

public abstract class ck {
   protected cl a;
   private fx if = new f1();
   protected c2 int = new c2();
   protected float for = 0.0F;
   protected float do = 1.0F;

   public abstract void do(aiw var1, double var2, double var4, double var6, float var8, float var9);

   protected void a(String var1) {
      this.a.void.for(var1);
   }

   protected boolean a(String var1, String var2) {
      c3 var3 = this.a.void;
      int var4 = var3.a(var1, var2);
      if (var4 >= 0) {
         GL11.glBindTexture(3553, var4);
         var3.do();
         return true;
      } else {
         return false;
      }
   }

   private void a(aiw var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      ajd var9 = pa.bo.o(0);
      ajd var10 = pa.bo.o(1);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var11 = var1.aP * 1.4F;
      GL11.glScalef(var11, var11, var11);
      this.a("/terrain.png");
      c4 var12 = c4.G;
      float var13 = 0.5F;
      float var14 = 0.0F;
      float var15 = var1.aO / var11;
      float var16 = (float)(var1.ak - var1.aZ.a);
      GL11.glRotatef(-this.a.case, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)((int)var15) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 0.0F;
      int var18 = 0;
      var12.if();

      while(var15 > 0.0F) {
         ajd var19;
         if (var18 % 2 == 0) {
            var19 = var9;
         } else {
            var19 = var10;
         }

         float var20 = var19.a();
         float var21 = var19.int();
         float var22 = var19.byte();
         float var23 = var19.do();
         if (var18 / 2 % 2 == 0) {
            float var24 = var22;
            var22 = var20;
            var20 = var24;
         }

         var12.a((double)(var13 - var14), (double)(0.0F - var16), (double)var17, (double)var22, (double)var23);
         var12.a((double)(-var13 - var14), (double)(0.0F - var16), (double)var17, (double)var20, (double)var23);
         var12.a((double)(-var13 - var14), (double)(1.4F - var16), (double)var17, (double)var20, (double)var21);
         var12.a((double)(var13 - var14), (double)(1.4F - var16), (double)var17, (double)var22, (double)var21);
         var15 -= 0.45F;
         var16 -= 0.45F;
         var13 *= 0.9F;
         var17 += 0.03F;
         ++var18;
      }

      var12.for();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void if(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      this.a.void.for("%clamp%/misc/shadow.png");
      y6 var10 = this.if();
      GL11.glDepthMask(false);
      float var11 = this.for;
      if (var1 instanceof aig) {
         aig var12 = (aig)var1;
         var11 *= var12.bA();
         if (var12.bG()) {
            var11 *= 0.5F;
         }
      }

      double var35 = var1.aJ + (var1.al - var1.aJ) * (double)var9;
      double var14 = var1.aI + (var1.ak - var1.aI) * (double)var9 + (double)var1.aH();
      double var16 = var1.aH + (var1.aj - var1.aH) * (double)var9;
      int var18 = ajs.a(var35 - (double)var11);
      int var19 = ajs.a(var35 + (double)var11);
      int var20 = ajs.a(var14 - (double)var11);
      int var21 = ajs.a(var14);
      int var22 = ajs.a(var16 - (double)var11);
      int var23 = ajs.a(var16 + (double)var11);
      double var24 = var2 - var35;
      double var26 = var4 - var14;
      double var28 = var6 - var16;
      c4 var30 = c4.G;
      var30.if();

      for(int var31 = var18; var31 <= var19; ++var31) {
         for(int var32 = var20; var32 <= var21; ++var32) {
            for(int var33 = var22; var33 <= var23; ++var33) {
               int var34 = var10.new(var31, var32 - 1, var33);
               if (var34 > 0 && var10.h(var31, var32, var33) > 3) {
                  this.a(pa.x[var34], var2, var4 + (double)var1.aH(), var6, var31, var32, var33, var8, var11, var24, var26 + (double)var1.aH(), var28);
               }
            }
         }
      }

      var30.for();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private y6 if() {
      return this.a.goto;
   }

   private void a(pa var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      c4 var19 = c4.G;
      if (var1.if()) {
         double var20 = ((double)var11 - (var4 - ((double)var9 + var15)) / 2.0D) * 0.5D * (double)this.if().int(var8, var9, var10);
         if (!(var20 < 0.0D)) {
            if (var20 > 1.0D) {
               var20 = 1.0D;
            }

            var19.a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = (double)var8 + var1.j() + var13;
            double var24 = (double)var8 + var1.l() + var13;
            double var26 = (double)var9 + var1.m() + var15 + 0.015625D;
            double var28 = (double)var10 + var1.o() + var17;
            double var30 = (double)var10 + var1.q() + var17;
            float var32 = (float)((var2 - var22) / 2.0D / (double)var12 + 0.5D);
            float var33 = (float)((var2 - var24) / 2.0D / (double)var12 + 0.5D);
            float var34 = (float)((var6 - var28) / 2.0D / (double)var12 + 0.5D);
            float var35 = (float)((var6 - var30) / 2.0D / (double)var12 + 0.5D);
            var19.a(var22, var26, var28, (double)var32, (double)var34);
            var19.a(var22, var26, var30, (double)var32, (double)var35);
            var19.a(var24, var26, var30, (double)var33, (double)var35);
            var19.a(var24, var26, var28, (double)var33, (double)var34);
         }
      }
   }

   public static void a(nw var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      c4 var7 = c4.G;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.if();
      var7.a(var1, var3, var5);
      var7.do(0.0F, 0.0F, -1.0F);
      var7.if(var0.if, var0.int, var0.try);
      var7.if(var0.new, var0.int, var0.try);
      var7.if(var0.new, var0.a, var0.try);
      var7.if(var0.if, var0.a, var0.try);
      var7.do(0.0F, 0.0F, 1.0F);
      var7.if(var0.if, var0.a, var0.for);
      var7.if(var0.new, var0.a, var0.for);
      var7.if(var0.new, var0.int, var0.for);
      var7.if(var0.if, var0.int, var0.for);
      var7.do(0.0F, -1.0F, 0.0F);
      var7.if(var0.if, var0.a, var0.try);
      var7.if(var0.new, var0.a, var0.try);
      var7.if(var0.new, var0.a, var0.for);
      var7.if(var0.if, var0.a, var0.for);
      var7.do(0.0F, 1.0F, 0.0F);
      var7.if(var0.if, var0.int, var0.for);
      var7.if(var0.new, var0.int, var0.for);
      var7.if(var0.new, var0.int, var0.try);
      var7.if(var0.if, var0.int, var0.try);
      var7.do(-1.0F, 0.0F, 0.0F);
      var7.if(var0.if, var0.a, var0.for);
      var7.if(var0.if, var0.int, var0.for);
      var7.if(var0.if, var0.int, var0.try);
      var7.if(var0.if, var0.a, var0.try);
      var7.do(1.0F, 0.0F, 0.0F);
      var7.if(var0.new, var0.a, var0.try);
      var7.if(var0.new, var0.int, var0.try);
      var7.if(var0.new, var0.int, var0.for);
      var7.if(var0.new, var0.a, var0.for);
      var7.a(0.0D, 0.0D, 0.0D);
      var7.for();
      GL11.glEnable(3553);
   }

   public static void a(nw var0) {
      c4 var1 = c4.G;
      var1.if();
      var1.if(var0.if, var0.int, var0.try);
      var1.if(var0.new, var0.int, var0.try);
      var1.if(var0.new, var0.a, var0.try);
      var1.if(var0.if, var0.a, var0.try);
      var1.if(var0.if, var0.a, var0.for);
      var1.if(var0.new, var0.a, var0.for);
      var1.if(var0.new, var0.int, var0.for);
      var1.if(var0.if, var0.int, var0.for);
      var1.if(var0.if, var0.a, var0.try);
      var1.if(var0.new, var0.a, var0.try);
      var1.if(var0.new, var0.a, var0.for);
      var1.if(var0.if, var0.a, var0.for);
      var1.if(var0.if, var0.int, var0.for);
      var1.if(var0.new, var0.int, var0.for);
      var1.if(var0.new, var0.int, var0.try);
      var1.if(var0.if, var0.int, var0.try);
      var1.if(var0.if, var0.a, var0.for);
      var1.if(var0.if, var0.int, var0.for);
      var1.if(var0.if, var0.int, var0.try);
      var1.if(var0.if, var0.a, var0.try);
      var1.if(var0.new, var0.a, var0.try);
      var1.if(var0.new, var0.int, var0.try);
      var1.if(var0.new, var0.int, var0.for);
      var1.if(var0.new, var0.a, var0.for);
      var1.for();
   }

   public void a(cl var1) {
      this.a = var1;
   }

   public void a(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.a.try.ag && this.for > 0.0F && !var1.U()) {
         double var10 = this.a.a(var1.al, var1.ak, var1.aj);
         float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.do);
         if (var12 > 0.0F) {
            this.if(var1, var2, var4, var6, var12, var9);
         }
      }

      if (var1.aj()) {
         this.a(var1, var2, var4, var6, var9);
      }

   }

   public jq a() {
      return this.a.a();
   }

   public void a(ajc var1) {
   }
}
