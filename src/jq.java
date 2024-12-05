import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class jq {
   private float[] g = new float[256];
   public int i = 9;
   public Random h = new Random();
   private byte[] f = new byte[65536];
   private int[] e = new int[32];
   private final String d;
   private final c3 c;
   private float b;
   private float void;
   private boolean long;
   private boolean goto;
   private float else;
   private float char;
   private float case;
   private float byte;
   private int try;
   private boolean new = false;
   private boolean int = false;
   private boolean for = false;
   private boolean do = false;
   private boolean if = false;
   public ke j;
   public boolean a = true;

   jq() {
      this.c = null;
      this.d = null;
   }

   public jq(ke var1, String var2, c3 var3, boolean var4) {
      this.j = var1;
      this.d = var2;
      this.c = var3;
      this.long = var4;
      this.try();
      var3.for(var2);

      for(int var5 = 0; var5 < 32; ++var5) {
         int var6 = (var5 >> 3 & 1) * 85;
         int var7 = (var5 >> 2 & 1) * 170 + var6;
         int var8 = (var5 >> 1 & 1) * 170 + var6;
         int var9 = (var5 >> 0 & 1) * 170 + var6;
         if (var5 == 6) {
            var7 += 85;
         }

         if (var1.aj) {
            int var10 = (var7 * 30 + var8 * 59 + var9 * 11) / 100;
            int var11 = (var7 * 30 + var8 * 70) / 100;
            int var12 = (var7 * 30 + var9 * 70) / 100;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         if (var5 >= 16) {
            var7 /= 4;
            var8 /= 4;
            var9 /= 4;
         }

         this.e[var5] = (var7 & 255) << 16 | (var8 & 255) << 8 | var9 & 255;
      }

   }

   public void try() {
      this.if();
      this.do(this.d);
   }

   private void do(String var1) {
      BufferedImage var2;
      try {
         var1 = a(var1);
         var2 = ImageIO.read(a().a(var1));
      } catch (IOException var23) {
         throw new RuntimeException(var23);
      }

      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      int var5 = var3 / 16;
      int var6 = var4 / 16;
      float var7 = (float)var3 / 128.0F;
      int[] var8 = new int[var3 * var4];
      var2.getRGB(0, 0, var3, var4, var8, 0, var3);

      int var10;
      for(int var9 = 0; var9 < 256; ++var9) {
         var10 = var9 % 16;
         int var11 = var9 / 16;
         boolean var12 = false;

         int var25;
         for(var25 = var5 - 1; var25 >= 0; --var25) {
            int var13 = var10 * var5 + var25;
            boolean var14 = true;

            for(int var15 = 0; var15 < var6 && var14; ++var15) {
               int var16 = (var11 * var6 + var15) * var3;
               int var17 = var8[var13 + var16];
               int var18 = var17 >> 24 & 255;
               if (var18 > 16) {
                  var14 = false;
               }
            }

            if (!var14) {
               break;
            }
         }

         if (var9 == 65) {
            var9 = var9;
         }

         if (var9 == 32) {
            if (var5 <= 8) {
               var25 = (int)(2.0F * var7);
            } else {
               var25 = (int)(1.5F * var7);
            }
         }

         this.g[var9] = (float)(var25 + 1) / var7 + 1.0F;
      }

      this.for();
      c3 var10000 = this.c;
      boolean var24 = c3.byte;

      try {
         var10000 = this.c;
         c3.byte = false;
         var10 = this.c.new(this.d);
         this.c.a(var2, var10);
      } finally {
         var10000 = this.c;
         c3.byte = var24;
      }

   }

   private void if() {
      try {
         InputStream var1 = a().a("/font/glyph_sizes.bin");
         var1.read(this.f);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   private float a(int var1, char var2, boolean var3) {
      if (var2 == ' ') {
         return this.g[var2];
      } else {
         return var1 > 0 && !this.long ? this.a(var1 + 32, var3) : this.a(var2, var3);
      }
   }

   private float a(int var1, boolean var2) {
      float var3 = (float)(var1 % 16 * 8);
      float var4 = (float)(var1 / 16 * 8);
      float var5 = var2 ? 1.0F : 0.0F;
      this.c.for(this.d);
      float var6 = this.g[var1] - 0.01F;
      GL11.glBegin(5);
      GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.b + var5, this.void, 0.0F);
      GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.b - var5, this.void + 7.99F, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.b + var6 + var5, this.void, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.b + var6 - var5, this.void + 7.99F, 0.0F);
      GL11.glEnd();
      return this.g[var1];
   }

   private void a(int var1) {
      String var2 = String.format("/font/glyph_%02X.png", var1);
      this.c.for(var2);
   }

   private float a(char var1, boolean var2) {
      if (this.f[var1] == 0) {
         return 0.0F;
      } else {
         int var3 = var1 / 256;
         this.a(var3);
         int var4 = this.f[var1] >>> 4;
         int var5 = this.f[var1] & 15;
         float var6 = (float)var4;
         float var7 = (float)(var5 + 1);
         float var8 = (float)(var1 % 16 * 16) + var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         float var10 = var7 - var6 - 0.02F;
         float var11 = var2 ? 1.0F : 0.0F;
         GL11.glBegin(5);
         GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.b + var11, this.void, 0.0F);
         GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.b - var11, this.void + 7.99F, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.b + var10 / 2.0F + var11, this.void, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.b + var10 / 2.0F - var11, this.void + 7.99F, 0.0F);
         GL11.glEnd();
         return (var7 - var6) / 2.0F + 1.0F;
      }
   }

   public int a(String var1, int var2, int var3, int var4) {
      return this.if(var1, var2, var3, var4, true);
   }

   public int if(String var1, int var2, int var3, int var4) {
      return !this.a ? 0 : this.if(var1, var2, var3, var4, false);
   }

   public int if(String var1, int var2, int var3, int var4, boolean var5) {
      this.int();
      if (this.goto) {
         var1 = this.int(var1);
      }

      int var6;
      if (var5) {
         var6 = this.a(var1, var2 + 1, var3 + 1, var4, true);
         var6 = Math.max(var6, this.a(var1, var2, var3, var4, false));
      } else {
         var6 = this.a(var1, var2, var3, var4, false);
      }

      return var6;
   }

   private String int(String var1) {
      if (var1 != null && Bidi.requiresBidi(var1.toCharArray(), 0, var1.length())) {
         Bidi var2 = new Bidi(var1, -2);
         byte[] var3 = new byte[var2.getRunCount()];
         String[] var4 = new String[var3.length];

         int var5;
         for(int var6 = 0; var6 < var3.length; ++var6) {
            int var7 = var2.getRunStart(var6);
            var5 = var2.getRunLimit(var6);
            int var8 = var2.getRunLevel(var6);
            String var9 = var1.substring(var7, var5);
            var3[var6] = (byte)var8;
            var4[var6] = var9;
         }

         String[] var11 = (String[])((String[])var4.clone());
         Bidi.reorderVisually(var3, 0, var4, 0, var3.length);
         StringBuilder var12 = new StringBuilder();

         for(var5 = 0; var5 < var4.length; ++var5) {
            byte var13 = var3[var5];

            int var14;
            for(var14 = 0; var14 < var11.length; ++var14) {
               if (var11[var14].equals(var4[var5])) {
                  var13 = var3[var14];
                  break;
               }
            }

            if ((var13 & 1) == 0) {
               var12.append(var4[var5]);
            } else {
               for(var14 = var4[var5].length() - 1; var14 >= 0; --var14) {
                  char var10 = var4[var5].charAt(var14);
                  if (var10 == '(') {
                     var10 = ')';
                  } else if (var10 == ')') {
                     var10 = '(';
                  }

                  var12.append(var10);
               }
            }
         }

         return var12.toString();
      } else {
         return var1;
      }
   }

   private void int() {
      this.new = false;
      this.int = false;
      this.for = false;
      this.do = false;
      this.if = false;
   }

   private void a(String var1, boolean var2) {
      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         int var5;
         int var6;
         if (var4 == 167 && var3 + 1 < var1.length()) {
            var5 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var3 + 1));
            if (var5 < 16) {
               this.new = false;
               this.int = false;
               this.if = false;
               this.do = false;
               this.for = false;
               if (var5 < 0 || var5 > 15) {
                  var5 = 15;
               }

               if (var2) {
                  var5 += 16;
               }

               var6 = this.e[var5];
               this.try = var6;
               GL11.glColor4f((float)(var6 >> 16) / 255.0F, (float)(var6 >> 8 & 255) / 255.0F, (float)(var6 & 255) / 255.0F, this.byte);
            } else if (var5 == 16) {
               this.new = true;
            } else if (var5 == 17) {
               this.int = true;
            } else if (var5 == 18) {
               this.if = true;
            } else if (var5 == 19) {
               this.do = true;
            } else if (var5 == 20) {
               this.for = true;
            } else if (var5 == 21) {
               this.new = false;
               this.int = false;
               this.if = false;
               this.do = false;
               this.for = false;
               GL11.glColor4f(this.else, this.char, this.case, this.byte);
            }

            ++var3;
         } else {
            var5 = apc.if.indexOf(var4);
            if (this.new && var5 > 0) {
               do {
                  var6 = this.h.nextInt(apc.if.length());
               } while((int)this.g[var5 + 32] != (int)this.g[var6 + 32]);

               var5 = var6;
            }

            float var7 = this.long ? 0.5F : 1.0F;
            boolean var8 = (var5 <= 0 || this.long) && var2;
            if (var8) {
               this.b -= var7;
               this.void -= var7;
            }

            float var9 = this.a(var5, var4, this.for);
            if (var8) {
               this.b += var7;
               this.void += var7;
            }

            if (this.int) {
               this.b += var7;
               if (var8) {
                  this.b -= var7;
                  this.void -= var7;
               }

               this.a(var5, var4, this.for);
               this.b -= var7;
               if (var8) {
                  this.b += var7;
                  this.void += var7;
               }

               ++var9;
            }

            c4 var10;
            if (this.if) {
               var10 = c4.G;
               GL11.glDisable(3553);
               var10.if();
               var10.if((double)this.b, (double)(this.void + (float)(this.i / 2)), 0.0D);
               var10.if((double)(this.b + var9), (double)(this.void + (float)(this.i / 2)), 0.0D);
               var10.if((double)(this.b + var9), (double)(this.void + (float)(this.i / 2) - 1.0F), 0.0D);
               var10.if((double)this.b, (double)(this.void + (float)(this.i / 2) - 1.0F), 0.0D);
               var10.for();
               GL11.glEnable(3553);
            }

            if (this.do) {
               var10 = c4.G;
               GL11.glDisable(3553);
               var10.if();
               int var11 = this.do ? -1 : 0;
               var10.if((double)(this.b + (float)var11), (double)(this.void + (float)this.i), 0.0D);
               var10.if((double)(this.b + var9), (double)(this.void + (float)this.i), 0.0D);
               var10.if((double)(this.b + var9), (double)(this.void + (float)this.i - 1.0F), 0.0D);
               var10.if((double)(this.b + (float)var11), (double)(this.void + (float)this.i - 1.0F), 0.0D);
               var10.for();
               GL11.glEnable(3553);
            }

            this.b += var9;
         }
      }

   }

   private int a(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.goto) {
         var1 = this.int(var1);
         int var7 = this.for(var1);
         var2 = var2 + var4 - var7;
      }

      return this.a(var1, var2, var3, var5, var6);
   }

   private int a(String var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == null) {
         return 0;
      } else {
         if ((var4 & -67108864) == 0) {
            var4 |= -16777216;
         }

         if (var5) {
            var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
         }

         this.else = (float)(var4 >> 16 & 255) / 255.0F;
         this.char = (float)(var4 >> 8 & 255) / 255.0F;
         this.case = (float)(var4 & 255) / 255.0F;
         this.byte = (float)(var4 >> 24 & 255) / 255.0F;
         GL11.glColor4f(this.else, this.char, this.case, this.byte);
         this.b = (float)var2;
         this.void = (float)var3;
         this.a(var1, var5);
         return (int)this.b;
      }
   }

   public int for(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         float var2 = 0.0F;
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            float var6 = this.if(var5);
            if (var6 < 0.0F && var4 < var1.length() - 1) {
               ++var4;
               var5 = var1.charAt(var4);
               if (var5 != 'l' && var5 != 'L') {
                  if (var5 == 'r' || var5 == 'R') {
                     var3 = false;
                  }
               } else {
                  var3 = true;
               }

               var6 = 0.0F;
            }

            var2 += var6;
            if (var3) {
               ++var2;
            }
         }

         return (int)var2;
      }
   }

   public int for(char var1) {
      return Math.round(this.if(var1));
   }

   private float if(char var1) {
      if (var1 == 167) {
         return -1.0F;
      } else if (var1 == ' ') {
         return this.g[32];
      } else {
         int var2 = apc.if.indexOf(var1);
         if (var2 >= 0 && !this.long) {
            return this.g[var2 + 32];
         } else if (this.f[var1] != 0) {
            int var3 = this.f[var1] >>> 4;
            int var4 = this.f[var1] & 15;
            if (var4 > 7) {
               var4 = 15;
               var3 = 0;
            }

            ++var4;
            return (float)((var4 - var3) / 2 + 1);
         } else {
            return 0.0F;
         }
      }
   }

   public String a(String var1, int var2) {
      return this.a(var1, var2, false);
   }

   public String a(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      float var5 = 0.0F;
      int var6 = var3 ? var1.length() - 1 : 0;
      int var7 = var3 ? -1 : 1;
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var6; var10 >= 0 && var10 < var1.length() && var5 < (float)var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         float var12 = this.if(var11);
         if (var8) {
            var8 = false;
            if (var11 != 'l' && var11 != 'L') {
               if (var11 == 'r' || var11 == 'R') {
                  var9 = false;
               }
            } else {
               var9 = true;
            }
         } else if (var12 < 0.0F) {
            var8 = true;
         } else {
            var5 += var12;
            if (var9) {
               ++var5;
            }
         }

         if (var5 > (float)var2) {
            break;
         }

         if (var3) {
            var4.insert(0, var11);
         } else {
            var4.append(var11);
         }
      }

      return var4.toString();
   }

   private String if(String var1) {
      while(var1 != null && var1.endsWith("\n")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      return var1;
   }

   public void a(String var1, int var2, int var3, int var4, int var5) {
      this.int();
      this.try = var5;
      var1 = this.if(var1);
      this.do(var1, var2, var3, var4, false);
   }

   private void do(String var1, int var2, int var3, int var4, boolean var5) {
      List var6 = this.do(var1, var4);

      for(Iterator var7 = var6.iterator(); var7.hasNext(); var3 += this.i) {
         String var8 = (String)var7.next();
         this.a(var8, var2, var3, var4, this.try, var5);
      }

   }

   public int for(String var1, int var2) {
      return this.i * this.do(var1, var2).size();
   }

   public void a(boolean var1) {
      this.long = var1;
   }

   public boolean do() {
      return this.long;
   }

   public void if(boolean var1) {
      this.goto = var1;
   }

   public List do(String var1, int var2) {
      return Arrays.asList(this.if(var1, var2).split("\n"));
   }

   String if(String var1, int var2) {
      int var3 = this.int(var1, var2);
      if (var1.length() <= var3) {
         return var1;
      } else {
         String var4 = var1.substring(0, var3);
         char var5 = var1.charAt(var3);
         boolean var6 = var5 == ' ' || var5 == '\n';
         String var7 = new(var4) + var1.substring(var3 + (var6 ? 1 : 0));
         return var4 + "\n" + this.if(var7, var2);
      }
   }

   private int int(String var1, int var2) {
      int var3 = var1.length();
      float var4 = 0.0F;
      int var5 = 0;
      int var6 = -1;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case '\n':
            --var5;
            break;
         case ' ':
            var6 = var5;
         default:
            var4 += this.if(var8);
            if (var7) {
               ++var4;
            }
            break;
         case '§':
            if (var5 < var3 - 1) {
               ++var5;
               char var9 = var1.charAt(var5);
               if (var9 != 'l' && var9 != 'L') {
                  if (var9 == 'r' || var9 == 'R' || do(var9)) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
         }

         if (var8 == '\n') {
            ++var5;
            var6 = var5;
            break;
         }

         if (var4 > (float)var2) {
            break;
         }
      }

      return var5 != var3 && var6 != -1 && var6 < var5 ? var6 : var5;
   }

   private static boolean do(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'f' || var0 >= 'A' && var0 <= 'F';
   }

   private static boolean a(char var0) {
      return var0 >= 'k' && var0 <= 'o' || var0 >= 'K' && var0 <= 'O' || var0 == 'r' || var0 == 'R';
   }

   private static String new(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if (var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if (do(var4)) {
               var1 = "§" + var4;
            } else if (a(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   public boolean new() {
      return this.goto;
   }

   private void for() {
      String var1 = a(this.d);
      String var2 = ".png";
      if (var1.endsWith(var2)) {
         String var3 = var1.substring(0, var1.length() - var2.length()) + ".properties";

         try {
            InputStream var4 = a().a(var3);
            if (var4 == null) {
               return;
            }

            qs.do("Loading " + var3);
            Properties var5 = new Properties();
            var5.load(var4);
            Set var6 = var5.keySet();
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               String var8 = (String)var7.next();
               String var9 = "width.";
               if (var8.startsWith(var9)) {
                  String var10 = var8.substring(var9.length());
                  int var11 = qs.a(var10, -1);
                  if (var11 >= 0 && var11 < this.g.length) {
                     String var12 = var5.getProperty(var8);
                     float var13 = qs.a(var12, -1.0F);
                     if (var13 >= 0.0F) {
                        this.g[var11] = var13;
                     }
                  }
               }
            }
         } catch (FileNotFoundException var14) {
         } catch (IOException var15) {
            var15.printStackTrace();
         }

      }
   }

   private static String a(String var0) {
      if (!qs.ad()) {
         return var0;
      } else if (var0 == null) {
         return var0;
      } else {
         String var1 = ".png";
         if (!var0.endsWith(var1)) {
            return var0;
         } else {
            String var2 = var0.substring(0, var0.length() - var1.length());
            String var3 = var2 + "_hd" + var1;
            return a().if(var3, true) ? var3 : var0;
         }
      }
   }

   private static aj a() {
      return qs.ad() ? qs.T().uT.int() : (aj)qs.T().uT.if().get(0);
   }
}
