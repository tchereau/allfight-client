import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.Dimension;

public class be {
   private int h;
   private int g;
   private int f;
   private int e;
   private int d;
   private final int c;
   private final int b;
   private final int void;
   private final int long;
   private final int goto;
   private final int else;
   private final boolean char;
   private final String case;
   private c5 byte;
   private boolean try;
   private boolean new;
   private boolean int;
   private ByteBuffer for;
   private boolean if;
   public ByteBuffer[] a;
   public Dimension[] do;

   private be(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.case = var1;
      this.f = var2;
      this.e = var3;
      this.d = var4;
      this.c = var5;
      this.b = var7;
      if (qs.j() && if(this.case)) {
         var8 = qs.ac();
      }

      this.long = var8;
      this.goto = var9;
      this.else = var6;
      this.byte = new c5(0, 0, var3, var4);
      if (var4 == 1 && var5 == 1) {
         this.void = 3552;
      } else if (var5 == 1) {
         this.void = 3553;
      } else {
         this.void = 32879;
      }

      this.char = var8 != 9728 && var8 != 9729 || var9 != 9728 && var9 != 9729;
      if (var2 != 2) {
         this.h = GL11.glGenTextures();
         GL11.glBindTexture(this.void, this.h);
         GL11.glTexParameteri(this.void, 10241, var8);
         GL11.glTexParameteri(this.void, 10240, var9);
         if (this.char) {
            this.do(16);
         }

         GL11.glTexParameteri(this.void, 10242, var6);
         GL11.glTexParameteri(this.void, 10243, var6);
      } else {
         this.h = -1;
      }

      this.g = bc.do().if();
   }

   public be(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, BufferedImage var9) {
      this(var1, var2, var3, var4, 1, var5, var6, var7, var8, var9);
   }

   public be(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, BufferedImage var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      if (var10 == null) {
         if (var3 != -1 && var4 != -1) {
            byte[] var11 = new byte[var3 * var4 * var5 * 4];

            for(int var12 = 0; var12 < var11.length; ++var12) {
               var11[var12] = 0;
            }

            this.for = k0.for(var11.length);
            this.for.clear();
            this.for.put(var11);
            this.for.position(0).limit(var11.length);
            if (this.new) {
               this.byte();
            } else {
               this.int = false;
            }
         } else {
            this.try = false;
         }
      } else {
         this.try = true;
         this.a(var10);
         if (var2 != 2) {
            this.byte();
            this.new = false;
         }
      }

   }

   public final c5 int() {
      return this.byte;
   }

   public void a(c5 var1, int var2) {
      if (this.void != 32879) {
         c5 var3 = new c5(0, 0, this.e, this.d);
         var3.a(var1);
         this.for.position(0);

         for(int var4 = var3.if(); var4 < var3.if() + var3.for(); ++var4) {
            int var5 = var4 * this.e * 4;

            for(int var6 = var3.do(); var6 < var3.do() + var3.a(); ++var6) {
               this.for.put(var5 + var6 * 4 + 0, (byte)(var2 >> 24 & 255));
               this.for.put(var5 + var6 * 4 + 1, (byte)(var2 >> 16 & 255));
               this.for.put(var5 + var6 * 4 + 2, (byte)(var2 >> 8 & 255));
               this.for.put(var5 + var6 * 4 + 3, (byte)(var2 >> 0 & 255));
            }
         }

         if (var1.do() == 0 && var1.if() == 0 && var1.a() == this.e && var1.for() == this.d) {
            this.int = false;
         }

         if (this.new) {
            this.byte();
         } else {
            this.int = false;
         }
      }

   }

   public void a(String var1) {
      BufferedImage var2 = new BufferedImage(this.e, this.d, 2);
      ByteBuffer var3 = this.if();
      byte[] var4 = new byte[this.e * this.d * 4];
      var3.position(0);
      var3.get(var4);

      for(int var5 = 0; var5 < this.e; ++var5) {
         for(int var6 = 0; var6 < this.d; ++var6) {
            int var7 = var6 * this.e * 4 + var5 * 4;
            byte var8 = 0;
            int var9 = var8 | (var4[var7 + 2] & 255) << 0;
            var9 |= (var4[var7 + 1] & 255) << 8;
            var9 |= (var4[var7 + 0] & 255) << 16;
            var9 |= (var4[var7 + 3] & 255) << 24;
            var2.setRGB(var5, var6, var9);
         }
      }

      this.for.position(this.e * this.d * 4);

      try {
         ImageIO.write(var2, "png", new File(Minecraft.hQ(), var1));
      } catch (IOException var10) {
         var10.printStackTrace();
      }

   }

   public void a(int var1, int var2, be var3, boolean var4) {
      if (this.void != 32879) {
         ByteBuffer var5;
         if (this.int) {
            if (!this.if) {
               return;
            }

            var5 = var3.if();
            var5.position(0);
            GL11.glTexSubImage2D(this.void, 0, var1, var2, var3.new(), var3.try(), this.b, 5121, var5);
            if (this.char) {
               if (var3.a == null) {
                  var3.do();
               }

               ByteBuffer[] var13 = var3.a;
               Dimension[] var14 = var3.do;
               if (var13 != null && var14 != null) {
                  this.a(var1, var2, var13, var14);
               }
            }

            return;
         }

         var5 = var3.if();
         this.for.position(0);
         var5.position(0);

         for(int var6 = 0; var6 < var3.try(); ++var6) {
            int var7 = var2 + var6;
            int var8 = var6 * var3.new() * 4;
            int var9 = var7 * this.e * 4;
            if (var4) {
               var7 = var2 + (var3.try() - var6);
            }

            for(int var10 = 0; var10 < var3.new(); ++var10) {
               int var11 = var9 + (var10 + var1) * 4;
               int var12 = var8 + var10 * 4;
               if (var4) {
                  var11 = var1 + var10 * this.e * 4 + var7 * 4;
               }

               this.for.put(var11 + 0, var5.get(var12 + 0));
               this.for.put(var11 + 1, var5.get(var12 + 1));
               this.for.put(var11 + 2, var5.get(var12 + 2));
               this.for.put(var11 + 3, var5.get(var12 + 3));
            }
         }

         this.for.position(this.e * this.d * 4);
         if (this.new) {
            this.byte();
         } else {
            this.int = false;
         }
      }

   }

   public void a(BufferedImage var1) {
      if (this.void != 32879) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if (var2 <= this.e && var3 <= this.d) {
            int[] var4 = new int[]{3, 0, 1, 2};
            int[] var5 = new int[]{3, 2, 1, 0};
            int[] var6 = this.b == 32993 ? var5 : var4;
            int[] var7 = new int[this.e * this.d];
            int var8 = var1.getTransparency();
            var1.getRGB(0, 0, this.e, this.d, var7, 0, var2);
            byte[] var9 = new byte[this.e * this.d * 4];

            for(int var10 = 0; var10 < this.d; ++var10) {
               for(int var11 = 0; var11 < this.e; ++var11) {
                  int var12 = var10 * this.e + var11;
                  int var13 = var12 * 4;
                  var9[var13 + var6[0]] = (byte)(var7[var12] >> 24 & 255);
                  var9[var13 + var6[1]] = (byte)(var7[var12] >> 16 & 255);
                  var9[var13 + var6[2]] = (byte)(var7[var12] >> 8 & 255);
                  var9[var13 + var6[3]] = (byte)(var7[var12] >> 0 & 255);
               }
            }

            this.for = k0.for(var9.length);
            this.for.clear();
            this.for.put(var9);
            this.for.limit(var9.length);
            if (this.new) {
               this.byte();
            } else {
               this.int = false;
            }
         } else {
            Minecraft.ih().a().if("transferFromImage called with a BufferedImage with dimensions (" + var2 + ", " + var3 + ") larger than the Texture dimensions (" + this.e + ", " + this.d + "). Ignoring.");
         }
      }

   }

   public int a() {
      return this.g;
   }

   public int for() {
      return this.h;
   }

   public int new() {
      return this.e;
   }

   public int try() {
      return this.d;
   }

   public String case() {
      return this.case;
   }

   public void if(int var1) {
      if (this.c == 1) {
         GL11.glEnable(3553);
      } else {
         GL11.glEnable(32879);
      }

      q.a(q.if + var1);
      GL11.glBindTexture(this.void, this.h);
      if (!this.int) {
         this.byte();
      }

   }

   public void byte() {
      this.for.clear();
      if (this.d != 1 && this.c != 1) {
         GL12.glTexImage3D(this.void, 0, this.b, this.e, this.d, this.c, 0, this.b, 5121, this.for);
      } else if (this.d != 1) {
         GL11.glTexImage2D(this.void, 0, this.b, this.e, this.d, 0, this.b, 5121, this.for);
         if (this.char) {
            this.a(true);
         }
      } else {
         GL11.glTexImage1D(this.void, 0, this.b, this.e, 0, this.b, 5121, this.for);
      }

      this.int = true;
   }

   public ByteBuffer if() {
      return this.for;
   }

   public void do() {
      this.a(false);
   }

   private void a(boolean var1) {
      if (this.a == null) {
         this.a(this.e, this.d);
      }

      ByteBuffer var2 = this.for;
      int var3 = this.e;
      boolean var4 = true;

      for(int var5 = 0; var5 < this.a.length; ++var5) {
         ByteBuffer var6 = this.a[var5];
         int var7 = var5 + 1;
         Dimension var8 = this.do[var5];
         int var9 = var8.getWidth();
         int var10 = var8.getHeight();
         if (var4) {
            var6.clear();
            var2.clear();
            int var11 = 0;

            while(true) {
               if (var11 >= var9) {
                  var6.clear();
                  var2.clear();
                  break;
               }

               for(int var12 = 0; var12 < var10; ++var12) {
                  int var13 = var2.getInt((var11 * 2 + 0 + (var12 * 2 + 0) * var3) * 4);
                  int var14 = var2.getInt((var11 * 2 + 1 + (var12 * 2 + 0) * var3) * 4);
                  int var15 = var2.getInt((var11 * 2 + 1 + (var12 * 2 + 1) * var3) * 4);
                  int var16 = var2.getInt((var11 * 2 + 0 + (var12 * 2 + 1) * var3) * 4);
                  int var17 = this.a(var13, var14, var15, var16);
                  var6.putInt((var11 + var12 * var9) * 4, var17);
               }

               ++var11;
            }
         }

         if (var1) {
            GL11.glTexImage2D(this.void, var7, this.b, var9, var10, 0, this.b, 5121, var6);
         }

         var2 = var6;
         var3 = var9;
         if (var9 <= 1 || var10 <= 1) {
            var4 = false;
         }
      }

   }

   private void a(int var1, int var2, ByteBuffer[] var3, Dimension[] var4) {
      int var5 = var1 / 2;
      int var6 = var2 / 2;

      for(int var7 = 0; var7 < var3.length; ++var7) {
         ByteBuffer var8 = var3[var7];
         int var9 = var7 + 1;
         Dimension var10 = var4[var7];
         int var11 = var10.getWidth();
         int var12 = var10.getHeight();
         var8.clear();
         GL11.glTexSubImage2D(this.void, var9, var5, var6, var11, var12, this.b, 5121, var8);
         var5 /= 2;
         var6 /= 2;
      }

   }

   private int a(int var1, int var2, int var3, int var4) {
      int var5 = this.if(var1, var2);
      int var6 = this.if(var3, var4);
      int var7 = this.if(var5, var6);
      return var7;
   }

   private int if(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      int var5 = (var3 + var4) / 2;
      if (var3 == 0 && var4 == 0) {
         var3 = 1;
         var4 = 1;
      } else {
         if (var3 == 0) {
            var1 = var2;
            var5 /= 2;
         }

         if (var4 == 0) {
            var2 = var1;
            var5 /= 2;
         }
      }

      int var6 = (var1 >> 16 & 255) * var3;
      int var7 = (var1 >> 8 & 255) * var3;
      int var8 = (var1 & 255) * var3;
      int var9 = (var2 >> 16 & 255) * var4;
      int var10 = (var2 >> 8 & 255) * var4;
      int var11 = (var2 & 255) * var4;
      int var12 = (var6 + var9) / (var3 + var4);
      int var13 = (var7 + var10) / (var3 + var4);
      int var14 = (var8 + var11) / (var3 + var4);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   private int do(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   private void a(int var1, int var2) {
      var1 = ct.for(var1);
      var2 = ct.for(var2);
      int var3 = var1 * var2 * 4;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      int var6 = var1;
      int var7 = var2;

      while(true) {
         var6 /= 2;
         var7 /= 2;
         if (var6 <= 0 && var7 <= 0) {
            this.a = (ByteBuffer[])((ByteBuffer[])var4.toArray(new ByteBuffer[var4.size()]));
            this.do = (Dimension[])((Dimension[])var5.toArray(new Dimension[var5.size()]));
            return;
         }

         if (var6 <= 0) {
            var6 = 1;
         }

         if (var7 <= 0) {
            var7 = 1;
         }

         int var8 = var6 * var7 * 4;
         ByteBuffer var9 = k0.for(var8);
         var4.add(var9);
         Dimension var10 = new Dimension(var6, var7);
         var5.add(var10);
      }
   }

   private int a(int var1) {
      int var2;
      for(var2 = 0; var1 > 0; ++var2) {
         var1 /= 2;
      }

      return var2 - 1;
   }

   public static boolean if(String var0) {
      return var0.equals("terrain");
   }

   public void for(int var1) {
      if (this.void == 3553) {
         int var2 = ct.for(var1);
         int var3 = Math.max(this.e, this.d);

         for(int var4 = ct.for(var3); var4 < var2; var4 *= 2) {
            this.else();
         }

      }
   }

   private void else() {
      int var1 = this.e;
      int var2 = this.d;
      byte[] var3 = new byte[this.e * this.d * 4];
      this.for.position(0);
      this.for.get(var3);
      this.e *= 2;
      this.d *= 2;
      this.byte = new c5(0, 0, this.e, this.d);
      this.for = k0.for(this.e * this.d * 4);
      this.a(var3, var1, this.for, this.e);
   }

   private void a(byte[] var1, int var2, ByteBuffer var3, int var4) {
      int var5 = var4 / var2;
      byte[] var6 = new byte[4];
      int var7 = var4 * var4;
      var3.clear();
      if (var5 > 1) {
         for(int var8 = 0; var8 < var2; ++var8) {
            int var9 = var8 * var2;
            int var10 = var8 * var5;
            int var11 = var10 * var4;

            for(int var12 = 0; var12 < var2; ++var12) {
               int var13 = (var12 + var9) * 4;
               var6[0] = var1[var13];
               var6[1] = var1[var13 + 1];
               var6[2] = var1[var13 + 2];
               var6[3] = var1[var13 + 3];
               int var14 = var12 * var5;
               int var15 = var14 + var11;

               for(int var16 = 0; var16 < var5; ++var16) {
                  int var17 = var15 + var16 * var4;
                  var3.position(var17 * 4);

                  for(int var18 = 0; var18 < var5; ++var18) {
                     var3.put(var6);
                  }
               }
            }
         }
      }

      var3.position(0).limit(var4 * var4 * 4);
   }

   public void do(int var1) {
      if (this.char) {
         if (GLContext.getCapabilities().OpenGL12) {
            GL11.glTexParameteri(3553, 33084, 0);
            int var2 = qs.try();
            if (var2 >= 4) {
               int var3 = Math.min(this.e, this.d);
               var2 = this.a(var3);
               if (var1 > 1) {
                  int var4 = ct.do(var1);
                  var2 -= var4;
               }

               if (var2 < 0) {
                  var2 = 0;
               }
            }

            GL11.glTexParameteri(3553, 33085, var2);
         }

      }
   }

   public void if(boolean var1) {
      this.if = var1;
   }

   public boolean char() {
      return this.if;
   }
}
