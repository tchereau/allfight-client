import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class ag extends i5 {
   protected i5 iF;
   private int iE = -1;
   private String iI = "";
   private af iG;
   private ke iH;

   public ag(i5 var1, ke var2) {
      this.iF = var1;
      this.iH = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.add(new iy(5, this.hV / 2 - 154, this.hU - 48, var1.a("texturePack.openFolder")));
      this.hT.add(new iy(6, this.hV / 2 + 4, this.hU - 48, var1.a("gui.done")));
      this.hW.uT.char();
      this.iI = (new File(Minecraft.hQ(), "texturepacks")).getAbsolutePath();
      this.iG = new af(this);
      this.iG.a(this.hT, 7, 8);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 5) {
            if (Minecraft.io() == kj.int) {
               try {
                  this.hW.a().a(this.iI);
                  Runtime.getRuntime().exec(new String[]{"/usr/bin/open", this.iI});
                  return;
               } catch (IOException var7) {
                  var7.printStackTrace();
               }
            } else if (Minecraft.io() == kj.new) {
               String var2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", this.iI);

               try {
                  Runtime.getRuntime().exec(var2);
                  return;
               } catch (IOException var6) {
                  var6.printStackTrace();
               }
            }

            boolean var8 = false;

            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop").invoke((Object)null);
               var3.getMethod("browse", URI.class).invoke(var4, (new File(Minecraft.hQ(), "texturepacks")).toURI());
            } catch (Throwable var5) {
               var5.printStackTrace();
               var8 = true;
            }

            if (var8) {
               this.hW.a().a("Opening via system class!");
               Sys.openURL("file://" + this.iI);
            }
         } else if (var1.hv == 6) {
            this.hW.a(this.iF);
         } else {
            this.iG.a(var1);
         }

      }
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
   }

   protected void else(int var1, int var2, int var3) {
      super.else(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      this.iG.a(var1, var2, var3);
      if (this.iE <= 0) {
         this.hW.uT.char();
         this.iE += 20;
      }

      aqy var4 = aqy.if();
      this.a(this.hR, var4.a("texturePack.title"), this.hV / 2, 16, 16777215);
      this.a(this.hR, var4.a("texturePack.folderInfo"), this.hV / 2 - 77, this.hU - 26, 8421504);
      super.if(var1, var2, var3);
   }

   public void dG() {
      super.dG();
      --this.iE;
   }

   // $FF: synthetic method
   static Minecraft c(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft goto(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft new(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft char(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft do(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft void(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft case(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft long(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft try(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft a(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft for(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft b(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static Minecraft else(ag var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static jq if(ag var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq int(ag var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq byte(ag var0) {
      return var0.hR;
   }
}
