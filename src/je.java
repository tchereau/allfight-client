import java.awt.image.BufferedImage;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class je {
   private int[] if = new int[16384];
   private int a;
   private ke for;
   private jq do;

   public je(jq var1, ke var2, c3 var3) {
      this.for = var2;
      this.do = var1;
      this.a = var3.if(new BufferedImage(128, 128, 2));

      for(int var4 = 0; var4 < 16384; ++var4) {
         this.if[var4] = 0;
      }

   }

   public void a(aek var1, c3 var2, s3 var3) {
      for(int var4 = 0; var4 < 16384; ++var4) {
         byte var5 = var3.byte[var4];
         if (var5 / 4 == 0) {
            this.if[var4] = (var4 + var4 / 128 & 1) * 8 + 16 << 24;
         } else {
            int var6 = tq.d[var5 / 4].if;
            int var7 = var5 & 3;
            short var8 = 220;
            if (var7 == 2) {
               var8 = 255;
            }

            if (var7 == 0) {
               var8 = 180;
            }

            int var9 = (var6 >> 16 & 255) * var8 / 255;
            int var10 = (var6 >> 8 & 255) * var8 / 255;
            int var11 = (var6 & 255) * var8 / 255;
            if (this.for.aj) {
               int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
               int var13 = (var9 * 30 + var10 * 70) / 100;
               int var14 = (var9 * 30 + var11 * 70) / 100;
               var9 = var12;
               var10 = var13;
               var11 = var14;
            }

            this.if[var4] = -16777216 | var9 << 16 | var10 << 8 | var11;
         }
      }

      var2.a(this.if, 128, 128, this.a);
      byte var15 = 0;
      byte var16 = 0;
      c4 var17 = c4.G;
      float var18 = 0.0F;
      GL11.glBindTexture(3553, this.a);
      GL11.glEnable(3042);
      GL11.glBlendFunc(1, 771);
      GL11.glDisable(3008);
      var17.if();
      var17.a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 0.0D, 1.0D);
      var17.a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 1.0D, 1.0D);
      var17.a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 1.0D, 0.0D);
      var17.a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 0.0D, 0.0D);
      var17.for();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      var2.do();
      var2.for("/misc/mapicons.png");
      int var19 = 0;

      for(Iterator var20 = var3.new.values().iterator(); var20.hasNext(); ++var19) {
         s1 var21 = (s1)var20.next();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var15 + (float)var21.a / 2.0F + 64.0F, (float)var16 + (float)var21.int / 2.0F + 64.0F, -0.02F);
         GL11.glRotatef((float)(var21.for * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
         GL11.glScalef(4.0F, 4.0F, 3.0F);
         GL11.glTranslatef(-0.125F, 0.125F, 0.0F);
         float var22 = (float)(var21.if % 4 + 0) / 4.0F;
         float var23 = (float)(var21.if / 4 + 0) / 4.0F;
         float var24 = (float)(var21.if % 4 + 1) / 4.0F;
         float var25 = (float)(var21.if / 4 + 1) / 4.0F;
         var17.if();
         var17.a(-1.0D, 1.0D, (double)((float)var19 * 0.001F), (double)var22, (double)var23);
         var17.a(1.0D, 1.0D, (double)((float)var19 * 0.001F), (double)var24, (double)var23);
         var17.a(1.0D, -1.0D, (double)((float)var19 * 0.001F), (double)var24, (double)var25);
         var17.a(-1.0D, -1.0D, (double)((float)var19 * 0.001F), (double)var22, (double)var25);
         var17.for();
         GL11.glPopMatrix();
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }
}
