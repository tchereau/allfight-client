import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class c7 implements db {
   private int[] if;
   private int a;
   private int do;

   public BufferedImage a(BufferedImage var1) {
      if (var1 == null) {
         return null;
      } else {
         this.a = 64;
         this.do = 32;

         for(BufferedImage var2 = var1; this.a < var2.getWidth() || this.do < var2.getHeight(); this.do *= 2) {
            this.a *= 2;
         }

         BufferedImage var3 = new BufferedImage(this.a, this.do, 2);
         Graphics var4 = var3.getGraphics();
         var4.drawImage(var1, 0, 0, (ImageObserver)null);
         var4.dispose();
         this.if = ((DataBufferInt)var3.getRaster().getDataBuffer()).getData();
         int var5 = this.a;
         int var6 = this.do;
         this.a(0, 0, var5 / 2, var6 / 2);
         this.if(var5 / 2, 0, var5, var6);
         this.a(0, var6 / 2, var5, var6);
         boolean var7 = false;

         int var8;
         int var9;
         int var10;
         for(var8 = var5 / 2; var8 < var5; ++var8) {
            for(var9 = 0; var9 < var6 / 2; ++var9) {
               var10 = this.if[var8 + var9 * var5];
               if ((var10 >> 24 & 255) < 128) {
                  var7 = true;
               }
            }
         }

         if (!var7) {
            for(var8 = var5 / 2; var8 < var5; ++var8) {
               for(var9 = 0; var9 < var6 / 2; ++var9) {
                  var10 = this.if[var8 + var9 * var5];
                  if ((var10 >> 24 & 255) < 128) {
                     boolean var11 = true;
                  }
               }
            }
         }

         return var3;
      }
   }

   private void if(int var1, int var2, int var3, int var4) {
      if (!this.do(var1, var2, var3, var4)) {
         for(int var5 = var1; var5 < var3; ++var5) {
            for(int var6 = var2; var6 < var4; ++var6) {
               int[] var10000 = this.if;
               int var10001 = var5 + var6 * this.a;
               var10000[var10001] &= 16777215;
            }
         }
      }

   }

   private void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 < var3; ++var5) {
         for(int var6 = var2; var6 < var4; ++var6) {
            int[] var10000 = this.if;
            int var10001 = var5 + var6 * this.a;
            var10000[var10001] |= -16777216;
         }
      }

   }

   private boolean do(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 < var3; ++var5) {
         for(int var6 = var2; var6 < var4; ++var6) {
            int var7 = this.if[var5 + var6 * this.a];
            if ((var7 >> 24 & 255) < 128) {
               return true;
            }
         }
      }

      return false;
   }
}
