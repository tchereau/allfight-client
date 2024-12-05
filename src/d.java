import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class d {
   public String char = null;
   private int case = -1;
   private int byte = -1;
   private int c = -1;
   private int for = -1;
   private int goto = 0;
   private boolean void = false;
   private float b = 1.0F;
   private float[] do;
   public int e;
   public static final int new = 0;
   public static final int long = 1;
   public static final int d = 2;
   public static final int try = 3;
   public static final int int = 4;
   public static final int if = 5;
   public static final int a = 6;
   public static final float[] else = new float[]{1.0F, 0.0F, 0.0F};

   public d(Properties var1, String var2) {
      this.do = else;
      this.e = -1;
      this.char = var1.getProperty("source", var2);
      this.case = this.if(var1.getProperty("startFadeIn"));
      this.byte = this.if(var1.getProperty("endFadeIn"));
      this.c = this.if(var1.getProperty("startFadeOut"));
      this.for = this.if(var1.getProperty("endFadeOut"));
      this.goto = this.do(var1.getProperty("blend"));
      this.void = this.a(var1.getProperty("rotate"), true);
      this.b = this.a(var1.getProperty("speed"), 1.0F);
      this.do = this.a(var1.getProperty("axis"), else);
   }

   private int if(String var1) {
      if (var1 == null) {
         return -1;
      } else {
         String[] var2 = qs.if(var1, ":");
         if (var2.length != 2) {
            qs.for("Invalid time: " + var1);
            return -1;
         } else {
            String var3 = var2[0];
            String var4 = var2[1];
            int var5 = qs.a(var3, -1);
            int var6 = qs.a(var4, -1);
            if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
               var5 -= 6;
               if (var5 < 0) {
                  var5 += 24;
               }

               int var7 = var5 * 1000 + (int)((double)var6 / 60.0D * 1000.0D);
               return var7;
            } else {
               qs.for("Invalid time: " + var1);
               return -1;
            }
         }
      }
   }

   private int do(String var1) {
      if (var1 == null) {
         return 0;
      } else if (var1.equals("add")) {
         return 0;
      } else if (var1.equals("subtract")) {
         return 1;
      } else if (var1.equals("multiply")) {
         return 2;
      } else if (var1.equals("dodge")) {
         return 3;
      } else if (var1.equals("burn")) {
         return 4;
      } else if (var1.equals("screen")) {
         return 5;
      } else if (var1.equals("replace")) {
         return 6;
      } else {
         qs.for("Unknown blend: " + var1);
         return 0;
      }
   }

   private boolean a(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.toLowerCase().equals("true")) {
         return true;
      } else if (var1.toLowerCase().equals("false")) {
         return false;
      } else {
         qs.for("Unknown boolean: " + var1);
         return var2;
      }
   }

   private float a(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = qs.a(var1, Float.MIN_VALUE);
         if (var3 == Float.MIN_VALUE) {
            qs.for("Invalid value: " + var1);
            return var2;
         } else {
            return var3;
         }
      }
   }

   private float[] a(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         String[] var3 = qs.if(var1, " ");
         if (var3.length != 3) {
            qs.for("Invalid axis: " + var1);
            return var2;
         } else {
            float[] var4 = new float[3];

            for(int var5 = 0; var5 < var3.length; ++var5) {
               var4[var5] = qs.a(var3[var5], Float.MIN_VALUE);
               if (var4[var5] == Float.MIN_VALUE) {
                  qs.for("Invalid axis: " + var1);
                  return var2;
               }

               if (var4[var5] < -1.0F || var4[var5] > 1.0F) {
                  qs.for("Invalid axis values: " + var1);
                  return var2;
               }
            }

            float var9 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            if (var9 * var9 + var6 * var6 + var7 * var7 < 1.0E-5F) {
               qs.for("Invalid axis values: " + var1);
               return var2;
            } else {
               float[] var8 = new float[]{var7, var6, -var9};
               return var8;
            }
         }
      }
   }

   public boolean a(String var1) {
      if (this.char == null) {
         qs.for("No source texture: " + var1);
         return false;
      } else if (this.case >= 0 && this.byte >= 0 && this.for >= 0) {
         int var2 = this.if(this.byte - this.case);
         if (this.c < 0) {
            this.c = this.if(this.for - var2);
         }

         int var3 = this.if(this.c - this.byte);
         int var4 = this.if(this.for - this.c);
         int var5 = this.if(this.case - this.for);
         int var6 = var2 + var3 + var4 + var5;
         if (var6 != 24000) {
            qs.for("Invalid fadeIn/fadeOut times, sum is more than 24h");
            return false;
         } else if (this.b < 0.0F) {
            qs.for("Invalid speed: " + this.b);
            return false;
         } else {
            return true;
         }
      } else {
         qs.for("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
         return false;
      }
   }

   private int if(int var1) {
      while(var1 >= 24000) {
         var1 -= 24000;
      }

      while(var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   public void a(int var1, c3 var2, float var3, float var4) {
      float var5 = var4 * this.do(var1);
      var5 = qs.a(var5, 0.0F, 1.0F);
      if (!(var5 < 1.0E-4F)) {
         var2.do(this.e);
         this.a(var5);
         GL11.glPushMatrix();
         if (this.void) {
            GL11.glRotatef(var3 * 360.0F * this.b, this.do[0], this.do[1], this.do[2]);
         }

         c4 var6 = c4.G;
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
         this.a(var6, 4);
         GL11.glPushMatrix();
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         this.a(var6, 1);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         this.a(var6, 0);
         GL11.glPopMatrix();
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         this.a(var6, 5);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         this.a(var6, 2);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         this.a(var6, 3);
         GL11.glPopMatrix();
      }
   }

   private float do(int var1) {
      int var2;
      int var3;
      if (this.a(var1, this.case, this.byte)) {
         var2 = this.if(this.byte - this.case);
         var3 = this.if(var1 - this.case);
         return (float)var3 / (float)var2;
      } else if (this.a(var1, this.byte, this.c)) {
         return 1.0F;
      } else if (this.a(var1, this.c, this.for)) {
         var2 = this.if(this.for - this.c);
         var3 = this.if(var1 - this.c);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }

   private void a(c4 var1, int var2) {
      double var3 = (double)(var2 % 3) / 3.0D;
      double var5 = (double)(var2 / 3) / 2.0D;
      var1.if();
      var1.a(-100.0D, -100.0D, -100.0D, var3, var5);
      var1.a(-100.0D, -100.0D, 100.0D, var3, var5 + 0.5D);
      var1.a(100.0D, -100.0D, 100.0D, var3 + 0.3333333333333333D, var5 + 0.5D);
      var1.a(100.0D, -100.0D, -100.0D, var3 + 0.3333333333333333D, var5);
      var1.for();
   }

   void a(float var1) {
      switch(this.goto) {
      case 0:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
         break;
      case 1:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(775, 0);
         GL11.glColor4f(var1, var1, var1, 1.0F);
         break;
      case 2:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(774, 771);
         GL11.glColor4f(var1, var1, var1, var1);
         break;
      case 3:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(1, 1);
         GL11.glColor4f(var1, var1, var1, 1.0F);
         break;
      case 4:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(0, 769);
         GL11.glColor4f(var1, var1, var1, 1.0F);
         break;
      case 5:
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(1, 769);
         GL11.glColor4f(var1, var1, var1, 1.0F);
         break;
      case 6:
         GL11.glEnable(3008);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      }

      GL11.glEnable(3553);
   }

   public boolean a(int var1) {
      return !this.a(var1, this.for, this.case);
   }

   private boolean a(int var1, int var2, int var3) {
      if (var2 <= var3) {
         return var1 >= var2 && var1 <= var3;
      } else {
         return var1 >= var2 || var1 <= var3;
      }
   }
}
