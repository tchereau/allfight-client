import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class gw extends i5 {
   private int iW = 0;
   private List iV;
   private int iY = 0;
   private float iX = 0.5F;

   public void dG() {
      ++this.iW;
      float var1 = (float)(this.iY + this.hU + this.hU + 24) / this.iX;
      if ((float)this.iW > var1) {
         this.dH();
      }

   }

   protected void if(char var1, int var2) {
      if (var2 == 1) {
         this.dH();
      }

   }

   private void dH() {
      this.hW.vk.gF.for((an7)(new apb(1)));
      this.hW.a((i5)null);
   }

   public boolean dy() {
      return true;
   }

   public void dA() {
      if (this.iV == null) {
         this.iV = new ArrayList();

         try {
            String var1 = "";
            String var2 = "" + aqj.void + aqj.goto + aqj.f + aqj.e;
            short var3 = 274;
            BufferedReader var4 = new BufferedReader(new InputStreamReader(gw.class.getResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));
            Random var5 = new Random(8124371L);

            int var6;
            while((var1 = var4.readLine()) != null) {
               String var7;
               String var8;
               for(var1 = var1.replaceAll("PLAYERNAME", this.hW.vg.if); var1.contains(var2); var1 = var7 + aqj.void + aqj.goto + "XXXXXXXX".substring(0, var5.nextInt(4) + 3) + var8) {
                  var6 = var1.indexOf(var2);
                  var7 = var1.substring(0, var6);
                  var8 = var1.substring(var6 + var2.length());
               }

               this.iV.addAll(this.hW.va.do(var1, var3));
               this.iV.add("");
            }

            for(var6 = 0; var6 < 8; ++var6) {
               this.iV.add("");
            }

            var4 = new BufferedReader(new InputStreamReader(gw.class.getResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8")));

            while((var1 = var4.readLine()) != null) {
               var1 = var1.replaceAll("PLAYERNAME", this.hW.vg.if);
               var1 = var1.replaceAll("\t", "    ");
               this.iV.addAll(this.hW.va.do(var1, var3));
               this.iV.add("");
            }

            this.iY = this.iV.size() * 12;
         } catch (Exception var9) {
            var9.printStackTrace();
         }

      }
   }

   private void int(int var1, int var2, float var3) {
      c4 var4 = c4.G;
      this.hW.vb.for("%blur%/gui/background.png");
      var4.if();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = this.hV;
      float var6 = 0.0F - ((float)this.iW + var3) * 0.5F * this.iX;
      float var7 = (float)this.hU - ((float)this.iW + var3) * 0.5F * this.iX;
      float var8 = 0.015625F;
      float var9 = ((float)this.iW + var3 - 0.0F) * 0.02F;
      float var10 = (float)(this.iY + this.hU + this.hU + 24) / this.iX;
      float var11 = (var10 - 20.0F - ((float)this.iW + var3)) * 0.005F;
      if (var11 < var9) {
         var9 = var11;
      }

      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= var9;
      var9 = var9 * 96.0F / 255.0F;
      var4.a(var9, var9, var9);
      var4.a(0.0D, (double)this.hU, (double)this.gH, 0.0D, (double)(var6 * var8));
      var4.a((double)var5, (double)this.hU, (double)this.gH, (double)((float)var5 * var8), (double)(var6 * var8));
      var4.a((double)var5, 0.0D, (double)this.gH, (double)((float)var5 * var8), (double)(var7 * var8));
      var4.a(0.0D, 0.0D, (double)this.gH, 0.0D, (double)(var7 * var8));
      var4.for();
   }

   public void if(int var1, int var2, float var3) {
      this.int(var1, var2, var3);
      c4 var4 = c4.G;
      short var5 = 274;
      int var6 = this.hV / 2 - var5 / 2;
      int var7 = this.hU + 50;
      float var8 = -((float)this.iW + var3) * this.iX;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, var8, 0.0F);
      this.hW.vb.for("/title/mclogo.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.if(var6, var7, 0, 0, 155, 44);
      this.if(var6 + 155, var7, 0, 45, 155, 44);
      var4.a(16777215);
      int var9 = var7 + 200;

      int var10;
      for(var10 = 0; var10 < this.iV.size(); ++var10) {
         if (var10 == this.iV.size() - 1) {
            float var11 = (float)var9 + var8 - (float)(this.hU / 2 - 6);
            if (var11 < 0.0F) {
               GL11.glTranslatef(0.0F, -var11, 0.0F);
            }
         }

         if ((float)var9 + var8 + 12.0F + 8.0F > 0.0F && (float)var9 + var8 < (float)this.hU) {
            String var12 = (String)this.iV.get(var10);
            if (var12.startsWith("[C]")) {
               this.hR.a(var12.substring(3), var6 + (var5 - this.hR.for(var12.substring(3))) / 2, var9, 16777215);
            } else {
               this.hR.h.setSeed((long)var10 * 4238972211L + (long)(this.iW / 4));
               this.hR.a(var12, var6, var9, 16777215);
            }
         }

         var9 += 12;
      }

      GL11.glPopMatrix();
      this.hW.vb.for("%blur%/misc/vignette.png");
      GL11.glEnable(3042);
      GL11.glBlendFunc(0, 769);
      var4.if();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      var10 = this.hV;
      int var13 = this.hU;
      var4.a(0.0D, (double)var13, (double)this.gH, 0.0D, 1.0D);
      var4.a((double)var10, (double)var13, (double)this.gH, 1.0D, 1.0D);
      var4.a((double)var10, 0.0D, (double)this.gH, 1.0D, 0.0D);
      var4.a(0.0D, 0.0D, (double)this.gH, 0.0D, 0.0D);
      var4.for();
      GL11.glDisable(3042);
      super.if(var1, var2, var3);
   }
}
