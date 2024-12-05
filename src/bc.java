import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class bc {
   private static bc if;
   private int a = 0;
   private final HashMap for = new HashMap();
   private final HashMap do = new HashMap();

   public static void a() {
      if = new bc();
   }

   public static bc do() {
      return if;
   }

   public int if() {
      return this.a++;
   }

   public void a(String var1, be var2) {
      this.do.put(var1, var2.a());
      if (!this.for.containsKey(var2.a())) {
         this.for.put(var2.a(), var2);
      }

   }

   public void a(be var1) {
      if (this.for.containsValue(var1)) {
         Minecraft.ih().a().if("TextureManager.registerTexture called, but this texture has already been registered. ignoring.");
      } else {
         this.for.put(var1.a(), var1);
      }

   }

   public bg do(String var1) {
      int var2 = Minecraft.h0();
      return new bg(var1, var2, var2, true);
   }

   public List if(String var1) {
      return this.a(this.a(var1), var1, (bh)null);
   }

   public List a(String var1, String var2, bh var3) {
      ArrayList var4 = new ArrayList();
      aj var5 = Minecraft.ih().uT.int();

      try {
         BufferedImage var6 = ImageIO.read(var5.a("/" + var2));
         int var7 = var6.getHeight();
         int var8 = var6.getWidth();
         String var9 = var1;
         int var10 = var6.getWidth();
         int var11 = var6.getHeight();
         boolean var12 = var11 > var10 && var11 / var10 * var10 == var11;
         if (!var12 && !this.a(var2, var5)) {
            if (var8 == var7) {
               var4.add(this.a(var1, 2, var8, var7, 10496, 6408, 9728, 9728, false, var6));
            } else {
               Minecraft.ih().a().if("TextureManager.createTexture: Skipping " + var2 + " because of broken aspect ratio and not animation");
            }
         } else {
            int var13 = var8;
            int var14 = var8;
            int var15 = var7 / var8;

            for(int var16 = 0; var16 < var15; ++var16) {
               be var17 = this.a(var9, 2, var13, var14, 10496, 6408, 9728, 9728, false, var6.getSubimage(0, var14 * var16, var13, var14));
               var4.add(var17);
            }
         }

         return var4;
      } catch (FileNotFoundException var18) {
         Minecraft.ih().a().if("TextureManager.createTexture called for file " + var2 + ", but that file does not exist. Ignoring.");
      } catch (IOException var19) {
         Minecraft.ih().a().if("TextureManager.createTexture encountered an IOException when trying to read file " + var2 + ". Ignoring.");
      }

      return var4;
   }

   private String a(String var1) {
      if (!var1.startsWith("ctm/") && !var1.startsWith("mods/")) {
         File var2 = new File(var1);
         return var2.getName().substring(0, var2.getName().lastIndexOf(46));
      } else {
         return var1.substring(0, var1.lastIndexOf(46));
      }
   }

   private boolean a(String var1, aj var2) {
      String var3 = "/" + var1.substring(0, var1.lastIndexOf(46)) + ".txt";
      boolean var4 = var2.if("/" + var1, false);
      return Minecraft.ih().uT.int().if(var3, !var4);
   }

   public be a(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, BufferedImage var10) {
      be var11 = new be(var1, var2, var3, var4, var5, var6, var7, var8, var10);
      this.a(var11);
      return var11;
   }

   public be a(String var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, 10496, var5, 9728, 9728, false, (BufferedImage)null);
   }
}
