import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class c3 {
   private HashMap void = new HashMap();
   private HashMap long = new HashMap();
   private ajy goto = new ajy();
   private IntBuffer else = k0.do(4194304);
   private Map char = new HashMap();
   private ke case;
   public ai try;
   private BufferedImage new = new BufferedImage(64, 64, 2);
   public final bb int;
   public final bb for;
   public int if;
   public static boolean byte = true;
   public static Logger do = Logger.getAnonymousLogger();
   private boolean a = false;

   public c3(ai var1, ke var2) {
      if (qs.new()) {
         int var3 = qs.aw();
         qs.for("FSAA Samples: " + var3);

         try {
            Display.destroy();
            Display.create((new PixelFormat()).withDepthBits(24).withSamples(var3));
         } catch (LWJGLException var9) {
            qs.for("Error setting FSAA: " + var3 + "x");
            var9.printStackTrace();

            try {
               Display.create((new PixelFormat()).withDepthBits(24));
            } catch (LWJGLException var8) {
               var8.printStackTrace();

               try {
                  Display.create();
               } catch (LWJGLException var7) {
                  var7.printStackTrace();
               }
            }
         }
      }

      this.try = var1;
      this.case = var2;
      Graphics var10 = this.new.getGraphics();
      var10.setColor(Color.WHITE);
      var10.fillRect(0, 0, 64, 64);
      var10.setColor(Color.BLACK);
      int var4 = 10;
      int var5 = 0;

      while(var4 < 64) {
         String var6 = var5++ % 2 == 0 ? "missing" : "texture";
         var10.drawString(var6, 1, var4);
         var4 += var10.getFont().getSize();
         if (var5 % 2 == 0) {
            var4 += 5;
         }
      }

      var10.dispose();
      this.int = new bb(0, "terrain", "textures/blocks/", this.new);
      this.for = new bb(1, "items", "textures/items/", this.new);
   }

   public int[] if(String var1) {
      aj var2 = this.try.int();
      int[] var3 = (int[])((int[])((int[])this.long.get(var1)));
      if (var3 != null) {
         return var3;
      } else {
         int[] var4;
         try {
            InputStream var5 = var2.a(var1);
            if (var5 == null) {
               var4 = this.a(this.new);
            } else {
               var4 = this.a(this.a(var5));
            }

            this.long.put(var1, var4);
            return var4;
         } catch (IOException var6) {
            var6.printStackTrace();
            var4 = this.a(this.new);
            this.long.put(var1, var4);
            return var4;
         }
      }
   }

   private int[] a(BufferedImage var1) {
      return this.a(var1, new int[var1.getWidth() * var1.getHeight()]);
   }

   private int[] a(BufferedImage var1, int[] var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      var1.getRGB(0, 0, var3, var4, var2, 0, var3);
      return var2;
   }

   public void for(String var1) {
      this.do(this.new(var1));
   }

   public void do(int var1) {
      if (var1 != this.if) {
         GL11.glBindTexture(3553, var1);
         this.if = var1;
      }

   }

   public void do() {
      this.if = -1;
   }

   public int new(String var1) {
      if (qs.w()) {
         var1 = c.a(var1);
      }

      if (var1.equals("/terrain.png")) {
         this.int.if().if(0);
         return this.int.if().for();
      } else if (var1.equals("/gui/items.png")) {
         this.for.if().if(0);
         return this.for.if().for();
      } else {
         Integer var2 = (Integer)this.void.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            String var3 = var1;

            try {
               vf.do(vf.q, var1);
               int var4 = k0.do();
               boolean var9 = var1.startsWith("%blur%");
               if (var9) {
                  var1 = var1.substring(6);
               }

               boolean var6 = var1.startsWith("%clamp%");
               if (var6) {
                  var1 = var1.substring(7);
               }

               InputStream var7 = this.try.int().a(var1);
               if (var7 == null) {
                  this.a(this.new, var4, var9, var6);
               } else {
                  this.a(this.a(var7), var4, var9, var6);
               }

               this.void.put(var3, var4);
               vf.do(vf.i, var1, this.try.int());
               return var4;
            } catch (Exception var8) {
               var8.printStackTrace();
               int var5 = k0.do();
               this.a(this.new, var5);
               this.void.put(var1, var5);
               return var5;
            }
         }
      }
   }

   public int if(BufferedImage var1) {
      int var2 = k0.do();
      this.a(var1, var2);
      this.goto.a(var2, var1);
      return var2;
   }

   public void a(BufferedImage var1, int var2) {
      this.a(var1, var2, false, false);
   }

   public void a(BufferedImage var1, int var2, boolean var3, boolean var4) {
      this.do(var2);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      if (var3) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if (var4) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var5 = var1.getWidth();
      int var6 = var1.getHeight();
      int[] var7 = new int[var5 * var6];
      var1.getRGB(0, 0, var5, var6, var7, 0, var5);
      if (this.case != null && this.case.aj) {
         var7 = this.if(var7);
      }

      this.a(var7);
      this.for(var7.length);
      this.else.clear();
      this.else.put(var7);
      this.else.position(0).limit(var7.length);
      GL11.glTexImage2D(3553, 0, 6408, var5, var6, 0, 32993, 33639, this.else);
   }

   private int[] if(int[] var1) {
      int[] var2 = new int[var1.length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         int var4 = var1[var3] >> 24 & 255;
         int var5 = var1[var3] >> 16 & 255;
         int var6 = var1[var3] >> 8 & 255;
         int var7 = var1[var3] & 255;
         int var8 = (var5 * 30 + var6 * 59 + var7 * 11) / 100;
         int var9 = (var5 * 30 + var6 * 70) / 100;
         int var10 = (var5 * 30 + var7 * 70) / 100;
         var2[var3] = var4 << 24 | var8 << 16 | var9 << 8 | var10;
      }

      return var2;
   }

   public void a(int[] var1, int var2, int var3, int var4) {
      this.do(var4);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      if (this.case != null && this.case.aj) {
         var1 = this.if(var1);
      }

      this.for(var1.length);
      this.else.clear();
      this.else.put(var1);
      this.else.position(0).limit(var1.length);
      GL11.glTexSubImage2D(3553, 0, 0, 0, var2, var3, 32993, 33639, this.else);
   }

   public void if(int var1) {
      this.goto.try(var1);
      GL11.glDeleteTextures(var1);
   }

   public int a(String var1, String var2) {
      dd var3 = (dd)this.char.get(var1);
      if (var3 != null && var3.if != null && !var3.do) {
         if (var3.for < 0) {
            var3.for = this.if(var3.if);
         } else {
            this.a(var3.if, var3.for);
         }

         var3.do = true;
      }

      return var3 != null && var3.for >= 0 ? var3.for : (var2 == null ? -1 : this.new(var2));
   }

   public boolean int(String var1) {
      return this.char.containsKey(var1);
   }

   public dd a(String var1, db var2) {
      if (var1 != null && var1.length() > 0 && Character.isDigit(var1.charAt(0))) {
         return null;
      } else {
         dd var3 = (dd)this.char.get(var1);
         if (var3 == null) {
            this.char.put(var1, new dd(var1, var2));
         } else {
            ++var3.a;
         }

         return var3;
      }
   }

   public void a(String var1) {
      dd var2 = (dd)this.char.get(var1);
      if (var2 != null) {
         --var2.a;
         if (var2.a == 0) {
            if (var2.for >= 0) {
               this.if(var2.for);
            }

            this.char.remove(var1);
         }
      }

   }

   public void int() {
      this.if();
      this.int.for();
      this.for.for();
      o.do();
   }

   public void new() {
      o.if();
      qs.a(System.currentTimeMillis());
      ajt.for();
      aj var1 = this.try.int();
      this.a();
      Iterator var2 = this.goto.a().iterator();

      BufferedImage var3;
      while(var2.hasNext()) {
         int var4 = (Integer)var2.next();
         var3 = (BufferedImage)this.goto.for(var4);
         this.a(var3, var4);
      }

      dd var14;
      for(var2 = this.char.values().iterator(); var2.hasNext(); var14.do = false) {
         var14 = (dd)var2.next();
      }

      var2 = this.void.keySet().iterator();

      String var5;
      while(var2.hasNext()) {
         var5 = (String)var2.next();

         try {
            int var6 = (Integer)this.void.get(var5);
            boolean var7 = var5.startsWith("%blur%");
            if (var7) {
               var5 = var5.substring(6);
            }

            boolean var8 = var5.startsWith("%clamp%");
            if (var8) {
               var5 = var5.substring(7);
            }

            BufferedImage var9 = this.a(var1.a(var5));
            this.a(var9, var6, var7, var8);
         } catch (FileNotFoundException var12) {
         } catch (Exception var13) {
            if (!"input == null!".equals(var13.getMessage())) {
               var13.printStackTrace();
            }
         }
      }

      var2 = this.long.keySet().iterator();

      while(var2.hasNext()) {
         var5 = (String)var2.next();

         try {
            var3 = this.a(var1.a(var5));
            this.a(var3, (int[])((int[])((int[])this.long.get(var5))));
         } catch (FileNotFoundException var10) {
         } catch (Exception var11) {
            if (!"input == null!".equals(var11.getMessage())) {
               var11.printStackTrace();
            }
         }
      }

      Minecraft.ih().va.try();
      Minecraft.ih().u9.try();
      o.a(this);
      ad8.a(this);
      js.a(this);
      c.a();
      this.int();
   }

   private BufferedImage a(InputStream var1) throws IOException {
      BufferedImage var2 = ImageIO.read(var1);
      var1.close();
      return var2;
   }

   public void a() {
      this.int.a();
      this.for.a();
      ct.a(this);
      r.a(this);
      e.if(this);
   }

   public ajd a(int var1) {
      switch(var1) {
      case 0:
         return this.int.do();
      case 1:
      default:
         return this.for.do();
      }
   }

   protected BufferedImage do(String var1) throws IOException {
      InputStream var2 = this.try.int().a(var1);
      if (var2 == null) {
         return null;
      } else {
         BufferedImage var3 = ImageIO.read(var2);
         var2.close();
         return var3;
      }
   }

   public ai for() {
      return this.try;
   }

   public void if() {
      if (!this.a) {
         Minecraft var1 = qs.T();
         if (var1 != null) {
            this.a = true;
            ad8.a(this);
            js.a(this);
            o.a(this);
         }
      }

   }

   public void for(int var1) {
      if (this.else == null || this.else.capacity() < var1) {
         var1 = ct.for(var1);
         this.else = k0.do(var1);
      }

   }

   private void a(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         int var3 = var1[var2] >> 24 & 255;
         if (var3 == 0) {
            var1[var2] = 0;
         }
      }

   }
}
