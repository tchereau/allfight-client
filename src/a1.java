import org.lwjgl.opengl.GL11;

public class a1 extends ay {
   public static a1 do;
   private fo int = new fo(0, 0, 64, 32);
   private fo for = new fo(0, 0, 64, 64);

   public void a(n6 var1, double var2, double var4, double var6, float var8) {
      this.a((float)var2, (float)var4, (float)var6, var1.try() & 7, (float)(var1.k() * 360) / 16.0F, var1.l(), var1.j());
   }

   public void a(az var1) {
      super.a(var1);
      do = this;
   }

   public void a(float var1, float var2, float var3, int var4, float var5, int var6, String var7) {
      fo var8 = this.int;
      switch(var6) {
      case 0:
      default:
         this.a("/mob/skeleton.png");
         break;
      case 1:
         this.a("/mob/skeleton_wither.png");
         break;
      case 2:
         this.a("/mob/zombie.png");
         var8 = this.for;
         break;
      case 3:
         if (var7 != null && var7.length() > 0) {
            String var9 = "http://allfightpvp.net/Download/ModifPlayer/Skins/skin.php?Pseudo=" + ajm.a(var7);
            if (!do.a.char.int(var9)) {
               do.a.char.a((String)var9, (db)(new c7()));
            }

            this.a(var9, "/mob/charall.png");
         } else {
            this.a("/mob/charall.png");
         }
         break;
      case 4:
         this.a("/mob/creeper.png");
      }

      GL11.glPushMatrix();
      GL11.glDisable(2884);
      if (var4 != 1) {
         switch(var4) {
         case 2:
            GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.74F);
            break;
         case 3:
            GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.26F);
            var5 = 180.0F;
            break;
         case 4:
            GL11.glTranslatef(var1 + 0.74F, var2 + 0.25F, var3 + 0.5F);
            var5 = 270.0F;
            break;
         case 5:
         default:
            GL11.glTranslatef(var1 + 0.26F, var2 + 0.25F, var3 + 0.5F);
            var5 = 90.0F;
         }
      } else {
         GL11.glTranslatef(var1 + 0.5F, var2, var3 + 0.5F);
      }

      float var10 = 0.0625F;
      GL11.glEnable(32826);
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      var8.a((aiw)null, 0.0F, 0.0F, 0.0F, var5, 0.0F, var10);
      GL11.glPopMatrix();
   }

   public void a(n4 var1, double var2, double var4, double var6, float var8) {
      this.a((n6)var1, var2, var4, var6, var8);
   }
}
