import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class j5 extends jo {
   private final Minecraft hn;
   private final List hm = new ArrayList();
   private final List hr = new ArrayList();
   private final List hq = new ArrayList();
   private int hp = 0;
   private boolean ho = false;

   public j5(Minecraft var1) {
      this.hn = var1;
   }

   public void R(int var1) {
      if (this.hn.u1.ab != 2) {
         int var2 = this.dl();
         boolean var3 = false;
         int var4 = 0;
         int var5 = this.hq.size();
         float var6 = this.hn.u1.V * 0.9F + 0.1F;
         if (var5 > 0) {
            if (this.dm()) {
               var3 = true;
            }

            float var7 = this.dj();
            int var8 = ajs.a((float)this.dp() / var7);
            GL11.glPushMatrix();
            GL11.glTranslatef(2.0F, 20.0F, 0.0F);
            GL11.glScalef(var7, var7, 1.0F);

            int var9;
            int var11;
            int var14;
            for(var9 = 0; var9 + this.hp < this.hq.size() && var9 < var2; ++var9) {
               k3 var10 = (k3)this.hq.get(var9 + this.hp);
               if (var10 != null) {
                  var11 = var1 - var10.if();
                  if (var11 < 200 || var3) {
                     double var12 = (double)var11 / 200.0D;
                     var12 = 1.0D - var12;
                     var12 *= 10.0D;
                     if (var12 < 0.0D) {
                        var12 = 0.0D;
                     }

                     if (var12 > 1.0D) {
                        var12 = 1.0D;
                     }

                     var12 *= var12;
                     var14 = (int)(255.0D * var12);
                     if (var3) {
                        var14 = 255;
                     }

                     var14 = (int)((float)var14 * var6);
                     ++var4;
                     if (var14 > 3) {
                        byte var15 = 0;
                        int var16 = -var9 * 9;
                        a(var15, var16 - 9, var15 + var8 + 4, var16, var14 / 2 << 24);
                        GL11.glEnable(3042);
                        String var17 = var10.do();
                        if (!this.hn.u1.Z) {
                           var17 = ajm.a(var17);
                        }

                        this.hn.va.a(var17, var15, var16 - 8, 16777215 + (var14 << 24));
                     }
                  }
               }
            }

            if (var3) {
               var9 = this.hn.va.i;
               GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
               int var18 = var5 * var9 + var5;
               var11 = var4 * var9 + var4;
               int var19 = this.hp * var11 / var5;
               int var13 = var11 * var11 / var18;
               if (var18 != var11) {
                  var14 = var19 > 0 ? 170 : 96;
                  int var20 = this.ho ? 13382451 : 3355562;
                  a(0, -var19, 2, -var19 - var13, var20 + (var14 << 24));
                  a(2, -var19, 1, -var19 - var13, 13421772 + (var14 << 24));
               }
            }

            GL11.glPopMatrix();
         }
      }
   }

   public void dn() {
      this.hq.clear();
      this.hr.clear();
      this.hm.clear();
   }

   public void else(String var1) {
      this.a(var1, 0);
   }

   public void a(String var1, int var2) {
      this.a(var1, var2, this.hn.u4.c3(), false);
      this.hn.a().a("[CHAT] " + var1);
   }

   private void a(String var1, int var2, int var3, boolean var4) {
      boolean var5 = this.dm();
      boolean var6 = true;
      if (var2 != 0) {
         this.S(var2);
      }

      Iterator var7 = this.hn.va.do(var1, ajs.new((float)this.dp() / this.dj())).iterator();

      while(var7.hasNext()) {
         String var8 = (String)var7.next();
         if (var5 && this.hp > 0) {
            this.ho = true;
            this.T(1);
         }

         if (!var6) {
            var8 = " " + var8;
         }

         var6 = false;
         this.hq.add(0, new k3(var3, var8, var2));
      }

      while(this.hq.size() > 100) {
         this.hq.remove(this.hq.size() - 1);
      }

      if (!var4) {
         this.hr.add(0, new k3(var3, var1.trim(), var2));

         while(this.hr.size() > 100) {
            this.hr.remove(this.hr.size() - 1);
         }
      }

   }

   public void dr() {
      this.hq.clear();
      this.dk();

      for(int var1 = this.hr.size() - 1; var1 >= 0; --var1) {
         k3 var2 = (k3)this.hr.get(var1);
         this.a(var2.do(), var2.a(), var2.if(), true);
      }

   }

   public List dq() {
      return this.hm;
   }

   public void goto(String var1) {
      if (this.hm.isEmpty() || !((String)this.hm.get(this.hm.size() - 1)).equals(var1)) {
         this.hm.add(var1);
      }

   }

   public void dk() {
      this.hp = 0;
      this.ho = false;
   }

   public void T(int var1) {
      this.hp += var1;
      int var2 = this.hq.size();
      if (this.hp > var2 - this.dl()) {
         this.hp = var2 - this.dl();
      }

      if (this.hp <= 0) {
         this.hp = 0;
         this.ho = false;
      }

   }

   public jn char(int var1, int var2) {
      if (!this.dm()) {
         return null;
      } else {
         i4 var3 = new i4(this.hn.u1, this.hn.vo, this.hn.vn);
         int var4 = var3.do();
         float var5 = this.dj();
         int var6 = var1 / var4 - 3;
         int var7 = var2 / var4 - 25;
         var6 = ajs.new((float)var6 / var5);
         var7 = ajs.new((float)var7 / var5);
         if (var6 >= 0 && var7 >= 0) {
            int var8 = Math.min(this.dl(), this.hq.size());
            if (var6 <= ajs.new((float)this.dp() / this.dj()) && var7 < this.hn.va.i * var8 + var8) {
               int var9 = var7 / (this.hn.va.i + 1) + this.hp;
               return new jn(this.hn.va, (k3)this.hq.get(var9), var6, var7 - (var9 - this.hp) * this.hn.va.i + var9);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public void if(String var1, Object... var2) {
      this.else(aqy.if().a(var1, var2));
   }

   public boolean dm() {
      return this.hn.u8 instanceof j3;
   }

   public void S(int var1) {
      Iterator var2 = this.hq.iterator();

      k3 var3;
      do {
         if (!var2.hasNext()) {
            var2 = this.hr.iterator();

            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (k3)var2.next();
            } while(var3.a() != var1);

            var2.remove();
            return;
         }

         var3 = (k3)var2.next();
      } while(var3.a() != var1);

      var2.remove();
   }

   public int dp() {
      return g(this.hn.u1.aP);
   }

   public int ds() {
      return f(this.dm() ? this.hn.u1.aM : this.hn.u1.aN);
   }

   public float dj() {
      return this.hn.u1.aR;
   }

   public static final int g(float var0) {
      short var1 = 320;
      byte var2 = 40;
      return ajs.new(var0 * (float)(var1 - var2) + (float)var2);
   }

   public static final int f(float var0) {
      short var1 = 180;
      byte var2 = 20;
      return ajs.new(var0 * (float)(var1 - var2) + (float)var2);
   }

   public int dl() {
      return this.ds() / 9;
   }
}
