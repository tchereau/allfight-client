import java.awt.Desktop;
import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class jb extends i5 {
   private int mj = 0;
   private int mi = 0;

   public void dA() {
      this.mj = 0;
      this.hT.clear();
      byte var1 = -16;
      this.hT.add(new j6(1, this.hV / 2, this.hU / 4 + 158 + var1, aqz.if("Sauvegarder puis quitter")));
      if (!this.hW.hT()) {
         ((j6)this.hT.get(0)).hw = aqz.if("menu.disconnect");
      }

      if (x.ix) {
         this.hT.add(new j6(4, this.hV / 2 - 160, this.hU / 4 + 158 + var1, 122, 20, "Retour au Jeu"));
         this.hT.add(new j6(0, this.hV / 2 + 100, this.hU / 4 + 120 + var1, 98, 20, aqz.if("menu.options")));
         this.hT.add(new j6(8, this.hV / 2 - 200, this.hU / 4 + 48 + var1, 98, 20, "Accéder au site"));
         this.hT.add(new j6(14, this.hV / 2 - 100, this.hU / 4 + 48 + var1, 98, 20, "§c Indisponible §c"));
         this.hT.add(new j6(7, this.hV / 2 - 100, this.hU / 4 + 72 + var1, 98, 20, aqz.if("§3 TeamSpeak §f")));
         this.hT.add(new j6(5, this.hV / 2 + 100, this.hU / 4 + 48 + var1, 98, 20, aqz.if("Succès")));
         this.hT.add(new j6(6, this.hV / 2 + 100, this.hU / 4 + 72 + var1, 98, 20, aqz.if("Statistiques")));
         this.hT.add(new j6(15, this.hV / 2 - 200, this.hU / 4 + 72 + var1, 98, 20, aqz.if("§c Indisponible §c")));
         this.hT.add(new j6(13, this.hV / 2 - 200, this.hU / 4 + 96 + var1, 98, 20, "§9 Carte §9"));
         this.hT.add(new j6(12, this.hV / 2 - 100, this.hU / 4 + 96 + var1, 98, 20, "§a Support §a"));
      } else {
         this.hT.add(new j6(4, this.hV / 2 - 160, this.hU / 4 + 158 + var1, 122, 20, "Retour au Jeu"));
         this.hT.add(new j6(0, this.hV / 2 + 100, this.hU / 4 + 120 + var1, 98, 20, aqz.if("menu.options")));
         this.hT.add(new j6(8, this.hV / 2 - 200, this.hU / 4 + 48 + var1, 98, 20, "Accéder au site"));
         this.hT.add(new j6(9, this.hV / 2 - 100, this.hU / 4 + 48 + var1, 98, 20, "Accéder au Wiki"));
         this.hT.add(new j6(7, this.hV / 2 - 100, this.hU / 4 + 72 + var1, 98, 20, aqz.if("§3 TeamSpeak §f")));
         this.hT.add(new j6(5, this.hV / 2 + 100, this.hU / 4 + 48 + var1, 98, 20, aqz.if("Succès")));
         this.hT.add(new j6(6, this.hV / 2 + 100, this.hU / 4 + 72 + var1, 98, 20, aqz.if("Statistiques")));
         this.hT.add(new j6(10, this.hV / 2 - 200, this.hU / 4 + 72 + var1, 98, 20, aqz.if("§c Boutique §c")));
         this.hT.add(new j6(12, this.hV / 2 - 200, this.hU / 4 + 96 + var1, 98, 20, "§9 Vote §9"));
         this.hT.add(new j6(12, this.hV / 2 - 100, this.hU / 4 + 96 + var1, 98, 20, "§a Support §a"));
      }

   }

   protected void a(j6 var1) {
      Desktop var2;
      URI var3;
      switch(var1.hv) {
      case 0:
         this.hW.a((i5)(new jd(this, this.hW.u1)));
         break;
      case 1:
         var1.hu = false;
         this.hW.uP.a(aka.l, 1);
         this.hW.vm.u();
         this.hW.a((ex)null);
         this.hW.a((i5)(new x()));
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.hW.a((i5)null);
         this.hW.ik();
         this.hW.uX.do();
         break;
      case 5:
         this.hW.a((i5)(new it(this.hW.uP)));
         break;
      case 6:
         this.hW.a((i5)(new is(this, this.hW.uP)));
         break;
      case 7:
         var2 = null;

         try {
            var3 = new URI("ts3server://ts.allfightpvp.com");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var9) {
         }
         break;
      case 8:
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var8) {
         }
         break;
      case 9:
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com/?page_id=377");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var7) {
         }
         break;
      case 10:
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com/boutique");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var6) {
         }
         break;
      case 11:
         this.hW.vk.try("/spawn");
         this.hW.a((i5)null);
         this.hW.ik();
         break;
      case 12:
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com/support");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var5) {
         }
         break;
      case 13:
         var2 = null;

         try {
            var3 = new URI("http://allfightpvp.com/hardcore/carte.php");
            if (Desktop.isDesktopSupported()) {
               var2 = Desktop.getDesktop();
               var2.browse(var3);
            }
         } catch (Exception var4) {
         }
      }

   }

   public void dG() {
      super.dG();
      ++this.mi;
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.hV / 2 - 150), 70.0F, 0.0F);
      GL11.glRotatef(-4.0F, 0.0F, 0.0F, 1.0F);
      float var4 = 1.8F - ajs.do(ajs.try((float)(Minecraft.h1() % 1000L) / 1000.0F * 3.141593F * 2.0F) * 0.1F);
      var4 = var4 * 90.0F / (float)(this.hR.for("AllFight !") + 32);
      GL11.glScalef(var4, var4, var4);
      this.if(this.hR, "AllFight !", 0, -8, 66116160);
      GL11.glPopMatrix();
      this.a(this.hR, "- Menu AllFight -", this.hV / 2, 40, 34004);
      if (x.ix) {
         this.a(this.hR, "Vous êtes actuellement sur le serveur §cHardcore§c.", this.hV / 2, 80, 60000);
      } else if (!this.hW.hT()) {
         this.a(this.hR, "Vous êtes actuellement sur le serveur Factions.", this.hV / 2, 80, 60000);
      } else {
         this.a(this.hR, "Vous êtes actuellement sur le mode Solo.", this.hV / 2, 80, 60000);
      }

      a(this.hW, this.hV / 2 + 50, this.hU / 4 + 142, 60, 200.0F, 0.0F);
      super.if(var1, var2, var3);
   }

   public static void a(Minecraft var0, int var1, int var2, int var3, float var4, float var5) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var1, (float)var2, 50.0F);
      GL11.glScalef((float)(-var3), (float)var3, (float)var3);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = var0.vk.eH;
      float var7 = var0.vk.a5;
      float var8 = var0.vk.a4;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      k1.if();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var0.vk.eH = (float)Math.atan((double)(var4 / 40.0F)) * 20.0F;
      var0.vk.a5 = (float)Math.atan((double)(var4 / 40.0F)) * 40.0F;
      var0.vk.a4 = -((float)Math.atan((double)(var5 / 40.0F))) * 20.0F;
      var0.vk.fA = var0.vk.a5;
      GL11.glTranslatef(0.0F, var0.vk.aQ, 0.0F);
      cl.e.case = 180.0F;
      cl.e.if(var0.vk, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      var0.vk.eH = var6;
      var0.vk.a5 = var7;
      var0.vk.a4 = var8;
      GL11.glPopMatrix();
      k1.do();
      GL11.glDisable(32826);
      q.a(q.a);
      GL11.glDisable(3553);
      q.a(q.if);
   }
}
