import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public abstract class an implements aj {
   private final String new;
   private final String int;
   protected final File if;
   protected String a;
   protected String byte;
   private final aj for;
   protected BufferedImage try;
   private int do = -1;

   protected an(String var1, File var2, String var3, aj var4) {
      this.new = var1;
      this.int = var3;
      this.if = var2;
      this.for = var4;
      this.try();
      this.new();
   }

   private static String if(String var0) {
      if (var0 != null && var0.length() > 34) {
         var0 = var0.substring(0, 34);
      }

      return var0;
   }

   private void try() {
      InputStream var1 = null;

      try {
         var1 = this.a("/pack.png", false);
         this.try = ImageIO.read(var1);
      } catch (IOException var11) {
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var10) {
         }

      }

   }

   protected void new() {
      InputStream var1 = null;
      BufferedReader var2 = null;

      try {
         var1 = this.for("/pack.txt");
         var2 = new BufferedReader(new InputStreamReader(var1));
         this.a = if(var2.readLine());
         this.byte = if(var2.readLine());
      } catch (IOException var12) {
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }

            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var11) {
         }

      }

   }

   public InputStream a(String var1, boolean var2) {
      try {
         return this.for(var1);
      } catch (IOException var4) {
         if (this.for != null && var2) {
            return this.for.a(var1, true);
         } else {
            throw var4;
         }
      }
   }

   public InputStream a(String var1) {
      return this.a(var1, true);
   }

   protected abstract InputStream for(String var1);

   public void a(c3 var1) {
      if (this.try != null && this.do != -1) {
         var1.if(this.do);
      }

   }

   public void if(c3 var1) {
      if (this.try != null) {
         if (this.do == -1) {
            this.do = var1.if(this.try);
         }

         GL11.glBindTexture(3553, this.do);
         var1.do();
      } else {
         var1.for("/gui/unknown_pack.png");
      }

   }

   public boolean if(String var1, boolean var2) {
      boolean var3 = this.do(var1);
      return !var3 && var2 && this.for != null ? this.for.if(var1, var2) : var3;
   }

   public abstract boolean do(String var1);

   public String for() {
      return this.new;
   }

   public String do() {
      return this.int;
   }

   public String if() {
      return this.a;
   }

   public String a() {
      return this.byte;
   }
}
