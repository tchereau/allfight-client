import org.lwjgl.opengl.GL11;

public class b1 extends ck {
   public void a(ah7 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      this.a("/art/kz.png");
      ah6 var10 = var1.r2;
      float var11 = 0.0625F;
      GL11.glScalef(var11, var11, var11);
      this.a(var1, var10.int, var10.for, var10.do, var10.if);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   private void a(ah7 var1, int var2, int var3, int var4, int var5) {
      float var6 = (float)(-var2) / 2.0F;
      float var7 = (float)(-var3) / 2.0F;
      float var8 = 0.5F;
      float var9 = 0.75F;
      float var10 = 0.8125F;
      float var11 = 0.0F;
      float var12 = 0.0625F;
      float var13 = 0.75F;
      float var14 = 0.8125F;
      float var15 = 0.001953125F;
      float var16 = 0.001953125F;
      float var17 = 0.7519531F;
      float var18 = 0.7519531F;
      float var19 = 0.0F;
      float var20 = 0.0625F;

      for(int var21 = 0; var21 < var2 / 16; ++var21) {
         for(int var22 = 0; var22 < var3 / 16; ++var22) {
            float var23 = var6 + (float)((var21 + 1) * 16);
            float var24 = var6 + (float)(var21 * 16);
            float var25 = var7 + (float)((var22 + 1) * 16);
            float var26 = var7 + (float)(var22 * 16);
            this.a(var1, (var23 + var24) / 2.0F, (var25 + var26) / 2.0F);
            float var27 = (float)(var4 + var2 - var21 * 16) / 256.0F;
            float var28 = (float)(var4 + var2 - (var21 + 1) * 16) / 256.0F;
            float var29 = (float)(var5 + var3 - var22 * 16) / 256.0F;
            float var30 = (float)(var5 + var3 - (var22 + 1) * 16) / 256.0F;
            c4 var31 = c4.G;
            var31.if();
            var31.do(0.0F, 0.0F, -1.0F);
            var31.a((double)var23, (double)var26, (double)(-var8), (double)var28, (double)var29);
            var31.a((double)var24, (double)var26, (double)(-var8), (double)var27, (double)var29);
            var31.a((double)var24, (double)var25, (double)(-var8), (double)var27, (double)var30);
            var31.a((double)var23, (double)var25, (double)(-var8), (double)var28, (double)var30);
            var31.do(0.0F, 0.0F, 1.0F);
            var31.a((double)var23, (double)var25, (double)var8, (double)var9, (double)var11);
            var31.a((double)var24, (double)var25, (double)var8, (double)var10, (double)var11);
            var31.a((double)var24, (double)var26, (double)var8, (double)var10, (double)var12);
            var31.a((double)var23, (double)var26, (double)var8, (double)var9, (double)var12);
            var31.do(0.0F, 1.0F, 0.0F);
            var31.a((double)var23, (double)var25, (double)(-var8), (double)var13, (double)var15);
            var31.a((double)var24, (double)var25, (double)(-var8), (double)var14, (double)var15);
            var31.a((double)var24, (double)var25, (double)var8, (double)var14, (double)var16);
            var31.a((double)var23, (double)var25, (double)var8, (double)var13, (double)var16);
            var31.do(0.0F, -1.0F, 0.0F);
            var31.a((double)var23, (double)var26, (double)var8, (double)var13, (double)var15);
            var31.a((double)var24, (double)var26, (double)var8, (double)var14, (double)var15);
            var31.a((double)var24, (double)var26, (double)(-var8), (double)var14, (double)var16);
            var31.a((double)var23, (double)var26, (double)(-var8), (double)var13, (double)var16);
            var31.do(-1.0F, 0.0F, 0.0F);
            var31.a((double)var23, (double)var25, (double)var8, (double)var18, (double)var19);
            var31.a((double)var23, (double)var26, (double)var8, (double)var18, (double)var20);
            var31.a((double)var23, (double)var26, (double)(-var8), (double)var17, (double)var20);
            var31.a((double)var23, (double)var25, (double)(-var8), (double)var17, (double)var19);
            var31.do(1.0F, 0.0F, 0.0F);
            var31.a((double)var24, (double)var25, (double)(-var8), (double)var18, (double)var19);
            var31.a((double)var24, (double)var26, (double)(-var8), (double)var18, (double)var20);
            var31.a((double)var24, (double)var26, (double)var8, (double)var17, (double)var20);
            var31.a((double)var24, (double)var25, (double)var8, (double)var17, (double)var19);
            var31.for();
         }
      }

   }

   private void a(ah7 var1, float var2, float var3) {
      int var4 = ajs.a(var1.al);
      int var5 = ajs.a(var1.ak + (double)(var3 / 16.0F));
      int var6 = ajs.a(var1.aj);
      if (var1.rY == 2) {
         var4 = ajs.a(var1.al + (double)(var2 / 16.0F));
      }

      if (var1.rY == 1) {
         var6 = ajs.a(var1.aj - (double)(var2 / 16.0F));
      }

      if (var1.rY == 0) {
         var4 = ajs.a(var1.al - (double)(var2 / 16.0F));
      }

      if (var1.rY == 3) {
         var6 = ajs.a(var1.aj + (double)(var2 / 16.0F));
      }

      int var7 = this.a.goto.do(var4, var5, var6, 0);
      int var8 = var7 % 65536;
      int var9 = var7 / 65536;
      q.a(q.a, (float)var8, (float)var9);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
   }
}
