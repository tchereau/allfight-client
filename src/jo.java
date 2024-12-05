import org.lwjgl.opengl.GL11;

public class jo {
   protected float gH = 0.0F;

   protected void for(int var1, int var2, int var3, int var4) {
      if (var2 < var1) {
         int var5 = var1;
         var1 = var2;
         var2 = var5;
      }

      a(var1, var3, var2 + 1, var3 + 1, var4);
   }

   protected void do(int var1, int var2, int var3, int var4) {
      if (var3 < var2) {
         int var5 = var2;
         var2 = var3;
         var3 = var5;
      }

      a(var1, var2 + 1, var1 + 1, var3, var4);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      if (var0 < var2) {
         var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if (var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      float var10 = (float)(var4 >> 24 & 255) / 255.0F;
      float var6 = (float)(var4 >> 16 & 255) / 255.0F;
      float var7 = (float)(var4 >> 8 & 255) / 255.0F;
      float var8 = (float)(var4 & 255) / 255.0F;
      c4 var9 = c4.G;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var6, var7, var8, var10);
      var9.if();
      var9.if((double)var0, (double)var3, 0.0D);
      var9.if((double)var2, (double)var3, 0.0D);
      var9.if((double)var2, (double)var1, 0.0D);
      var9.if((double)var0, (double)var1, 0.0D);
      var9.for();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 255) / 255.0F;
      float var8 = (float)(var5 >> 16 & 255) / 255.0F;
      float var9 = (float)(var5 >> 8 & 255) / 255.0F;
      float var10 = (float)(var5 & 255) / 255.0F;
      float var11 = (float)(var6 >> 24 & 255) / 255.0F;
      float var12 = (float)(var6 >> 16 & 255) / 255.0F;
      float var13 = (float)(var6 >> 8 & 255) / 255.0F;
      float var14 = (float)(var6 & 255) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      c4 var15 = c4.G;
      var15.if();
      var15.a(var8, var9, var10, var7);
      var15.if((double)var3, (double)var2, (double)this.gH);
      var15.if((double)var1, (double)var2, (double)this.gH);
      var15.a(var12, var13, var14, var11);
      var15.if((double)var1, (double)var4, (double)this.gH);
      var15.if((double)var3, (double)var4, (double)this.gH);
      var15.for();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void a(jq var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3 - var1.for(var2) / 2, var4, var5);
   }

   public void if(jq var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, var5);
   }

   public void if(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      c4 var9 = c4.G;
      var9.if();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)this.gH, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)this.gH, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)this.gH, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.gH, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.for();
   }

   public void a(int var1, int var2, ajd var3, int var4, int var5) {
      c4 var6 = c4.G;
      var6.if();
      var6.a((double)(var1 + 0), (double)(var2 + var5), (double)this.gH, (double)var3.a(), (double)var3.do());
      var6.a((double)(var1 + var4), (double)(var2 + var5), (double)this.gH, (double)var3.byte(), (double)var3.do());
      var6.a((double)(var1 + var4), (double)(var2 + 0), (double)this.gH, (double)var3.byte(), (double)var3.int());
      var6.a((double)(var1 + 0), (double)(var2 + 0), (double)this.gH, (double)var3.a(), (double)var3.int());
      var6.for();
   }
}
