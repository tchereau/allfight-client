import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class il extends i5 {
   protected static cb oS = new cb();
   protected int oR = 176;
   protected int oQ = 166;
   public ad1 oP;
   protected int oO;
   protected int oN;
   private ac9 oI;
   private ac9 oG = null;
   private boolean oE = false;
   private abp oC = null;
   private int oA = 0;
   private int oy = 0;
   private ac9 ow = null;
   private long ou = 0L;
   private abp os = null;
   private ac9 oM = null;
   private long oK = 0L;
   protected final Set oL = new HashSet();
   protected boolean oJ;
   private int oH = 0;
   private int oF = 0;
   private boolean oD = false;
   private int oB;
   private long oz = 0L;
   private ac9 ox = null;
   private int ov = 0;
   private boolean ot;
   private abp or = null;

   public il(ad1 var1) {
      this.oP = var1;
      this.oD = true;
   }

   public void dA() {
      super.dA();
      this.hW.vk.fP = this.oP;
      this.oO = (this.hV - this.oR) / 2;
      this.oN = (this.hU - this.oQ) / 2;
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      int var4 = this.oO;
      int var5 = this.oN;
      this.for(var3, var1, var2);
      GL11.glDisable(32826);
      k1.do();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      super.if(var1, var2, var3);
      k1.a();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(32826);
      this.oI = null;
      short var6 = 240;
      short var7 = 240;
      q.a(q.a, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

      int var9;
      for(int var13 = 0; var13 < this.oP.try.size(); ++var13) {
         ac9 var15 = (ac9)this.oP.try.get(var13);
         this.a(var15);
         if (this.a(var15, var1, var2)) {
            this.oI = var15;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var8 = var15.do;
            var9 = var15.if;
            this.a(var8, var9, var8 + 16, var9 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      this.f(var1, var2);
      aen var14 = this.hW.vk.fR;
      abp var16 = this.oC == null ? var14.M() : this.oC;
      if (var16 != null) {
         byte var17 = 8;
         var9 = this.oC == null ? 8 : 16;
         String var10 = null;
         if (this.oC != null && this.oE) {
            var16 = var16.n();
            var16.if = ajs.a((float)var16.if / 2.0F);
         } else if (this.oJ && this.oL.size() > 1) {
            var16 = var16.n();
            var16.if = this.oB;
            if (var16.if == 0) {
               var10 = "" + aqj.b + "0";
            }
         }

         this.a(var16, var1 - var4 - var17, var2 - var5 - var9, var10);
      }

      if (this.os != null) {
         float var18 = (float)(Minecraft.h1() - this.ou) / 100.0F;
         if (var18 >= 1.0F) {
            var18 = 1.0F;
            this.os = null;
         }

         var9 = this.ow.do - this.oA;
         int var20 = this.ow.if - this.oy;
         int var11 = this.oA + (int)((float)var9 * var18);
         int var12 = this.oy + (int)((float)var20 * var18);
         this.a(this.os, var11, var12, (String)null);
      }

      GL11.glPopMatrix();
      if (var14.M() == null && this.oI != null && this.oI.do()) {
         abp var19 = this.oI.for();
         this.a(var19, var1, var2);
      }

      GL11.glEnable(2896);
      GL11.glEnable(2929);
      k1.if();
   }

   private void a(abp var1, int var2, int var3, String var4) {
      GL11.glTranslatef(0.0F, 0.0F, 32.0F);
      this.gH = 200.0F;
      oS.c = 200.0F;
      oS.a(this.hR, this.hW.vb, var1, var2, var3);
      oS.a(this.hR, this.hW.vb, var1, var2, var3 - (this.oC == null ? 0 : 8), var4);
      this.gH = 0.0F;
      oS.c = 0.0F;
   }

   protected void a(abp var1, int var2, int var3) {
      List var4 = var1.a(this.hW.vk, this.hW.u1.O);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         if (var5 == 0) {
            var4.set(var5, "§" + Integer.toHexString(var1.goto().new) + (String)var4.get(var5));
         } else {
            var4.set(var5, aqj.i + (String)var4.get(var5));
         }
      }

      this.a(var4, var2, var3);
   }

   protected void do(String var1, int var2, int var3) {
      this.a(Arrays.asList(var1), var2, var3);
   }

   protected void a(List var1, int var2, int var3) {
      if (!var1.isEmpty()) {
         GL11.glDisable(32826);
         k1.do();
         GL11.glDisable(2896);
         GL11.glDisable(2929);
         int var4 = 0;
         Iterator var5 = var1.iterator();

         while(var5.hasNext()) {
            String var6 = (String)var5.next();
            int var7 = this.hR.for(var6);
            if (var7 > var4) {
               var4 = var7;
            }
         }

         int var14 = var2 + 12;
         int var15 = var3 - 12;
         int var8 = 8;
         if (var1.size() > 1) {
            var8 += 2 + (var1.size() - 1) * 10;
         }

         if (var14 + var4 > this.hV) {
            var14 -= 28 + var4;
         }

         if (var15 + var8 + 6 > this.hU) {
            var15 = this.hU - var8 - 6;
         }

         this.gH = 300.0F;
         oS.c = 300.0F;
         int var9 = -267386864;
         this.a(var14 - 3, var15 - 4, var14 + var4 + 3, var15 - 3, var9, var9);
         this.a(var14 - 3, var15 + var8 + 3, var14 + var4 + 3, var15 + var8 + 4, var9, var9);
         this.a(var14 - 3, var15 - 3, var14 + var4 + 3, var15 + var8 + 3, var9, var9);
         this.a(var14 - 4, var15 - 3, var14 - 3, var15 + var8 + 3, var9, var9);
         this.a(var14 + var4 + 3, var15 - 3, var14 + var4 + 4, var15 + var8 + 3, var9, var9);
         int var10 = 1347420415;
         int var11 = (var10 & 16711422) >> 1 | var10 & -16777216;
         this.a(var14 - 3, var15 - 3 + 1, var14 - 3 + 1, var15 + var8 + 3 - 1, var10, var11);
         this.a(var14 + var4 + 2, var15 - 3 + 1, var14 + var4 + 3, var15 + var8 + 3 - 1, var10, var11);
         this.a(var14 - 3, var15 - 3, var14 + var4 + 3, var15 - 3 + 1, var10, var10);
         this.a(var14 - 3, var15 + var8 + 2, var14 + var4 + 3, var15 + var8 + 3, var11, var11);

         for(int var12 = 0; var12 < var1.size(); ++var12) {
            String var13 = (String)var1.get(var12);
            this.hR.a(var13, var14, var15, -1);
            if (var12 == 0) {
               var15 += 2;
            }

            var15 += 10;
         }

         this.gH = 0.0F;
         oS.c = 0.0F;
         GL11.glEnable(2896);
         GL11.glEnable(2929);
         k1.if();
         GL11.glEnable(32826);
      }
   }

   protected void f(int var1, int var2) {
   }

   protected abstract void for(float var1, int var2, int var3);

   private void a(ac9 var1) {
      int var2 = var1.do;
      int var3 = var1.if;
      abp var4 = var1.for();
      boolean var5 = false;
      boolean var6 = var1 == this.oG && this.oC != null && !this.oE;
      abp var7 = this.hW.vk.fR.M();
      String var8 = null;
      if (var1 == this.oG && this.oC != null && this.oE && var4 != null) {
         var4 = var4.n();
         var4.if /= 2;
      } else if (this.oJ && this.oL.contains(var1) && var7 != null) {
         if (this.oL.size() == 1) {
            return;
         }

         if (ad1.a(var1, var7, true) && this.oP.a(var1)) {
            var4 = var7.n();
            var5 = true;
            ad1.a(this.oL, this.oH, var4, var1.for() == null ? 0 : var1.for().if);
            if (var4.if > var4.h()) {
               var8 = aqj.b + "" + var4.h();
               var4.if = var4.h();
            }

            if (var4.if > var1.int()) {
               var8 = aqj.b + "" + var1.int();
               var4.if = var1.int();
            }
         } else {
            this.oL.remove(var1);
            this.es();
         }
      }

      this.gH = 100.0F;
      oS.c = 100.0F;
      if (var4 == null) {
         ajd var9 = var1.a();
         if (var9 != null) {
            GL11.glDisable(2896);
            this.hW.vb.for("/gui/items.png");
            this.a(var2, var3, var9, 16, 16);
            GL11.glEnable(2896);
            var6 = true;
         }
      }

      if (!var6) {
         if (var5) {
            a(var2, var3, var2 + 16, var3 + 16, -2130706433);
         }

         GL11.glEnable(2929);
         oS.a(this.hR, this.hW.vb, var4, var2, var3);
         oS.a(this.hR, this.hW.vb, var4, var2, var3, var8);
      }

      oS.c = 0.0F;
      this.gH = 0.0F;
   }

   private void es() {
      abp var1 = this.hW.vk.fR.M();
      if (var1 != null && this.oJ) {
         this.oB = var1.if;

         abp var4;
         int var5;
         for(Iterator var2 = this.oL.iterator(); var2.hasNext(); this.oB -= var4.if - var5) {
            ac9 var3 = (ac9)var2.next();
            var4 = var1.n();
            var5 = var3.for() == null ? 0 : var3.for().if;
            ad1.a(this.oL, this.oH, var4, var5);
            if (var4.if > var4.h()) {
               var4.if = var4.h();
            }

            if (var4.if > var3.int()) {
               var4.if = var3.int();
            }
         }

      }
   }

   private ac9 g(int var1, int var2) {
      for(int var3 = 0; var3 < this.oP.try.size(); ++var3) {
         ac9 var4 = (ac9)this.oP.try.get(var3);
         if (this.a(var4, var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      boolean var4 = var3 == this.hW.u1.ay.int + 100;
      ac9 var5 = this.g(var1, var2);
      long var6 = Minecraft.h1();
      this.ot = this.ox == var5 && var6 - this.oz < 250L && this.ov == var3;
      this.oD = false;
      if (var3 == 0 || var3 == 1 || var4) {
         int var8 = this.oO;
         int var9 = this.oN;
         boolean var10 = var1 < var8 || var2 < var9 || var1 >= var8 + this.oR || var2 >= var9 + this.oQ;
         int var11 = -1;
         if (var5 != null) {
            var11 = var5.for;
         }

         if (var10) {
            var11 = -999;
         }

         if (this.hW.u1.aV && var10 && this.hW.vk.fR.M() == null) {
            this.hW.a((i5)null);
            return;
         }

         if (var11 != -1) {
            if (this.hW.u1.aV) {
               if (var5 != null && var5.do()) {
                  this.oG = var5;
                  this.oC = null;
                  this.oE = var3 == 1;
               } else {
                  this.oG = null;
               }
            } else if (!this.oJ) {
               if (this.hW.vk.fR.M() == null) {
                  if (var3 == this.hW.u1.ay.int + 100) {
                     this.a(var5, var11, var3, 3);
                  } else {
                     boolean var12 = var11 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                     byte var13 = 0;
                     if (var12) {
                        this.or = var5 != null && var5.do() ? var5.for() : null;
                        var13 = 1;
                     } else if (var11 == -999) {
                        var13 = 4;
                     }

                     this.a(var5, var11, var3, var13);
                  }

                  this.oD = true;
               } else {
                  this.oJ = true;
                  this.oF = var3;
                  this.oL.clear();
                  if (var3 == 0) {
                     this.oH = 0;
                  } else if (var3 == 1) {
                     this.oH = 1;
                  }
               }
            }
         }
      }

      this.ox = var5;
      this.oz = var6;
      this.ov = var3;
   }

   protected void a(int var1, int var2, int var3, long var4) {
      ac9 var6 = this.g(var1, var2);
      abp var7 = this.hW.vk.fR.M();
      if (this.oG != null && this.hW.u1.aV) {
         if (var3 == 0 || var3 == 1) {
            if (this.oC == null) {
               if (var6 != this.oG) {
                  this.oC = this.oG.for().n();
               }
            } else if (this.oC.if > 1 && var6 != null && ad1.a(var6, this.oC, false)) {
               long var8 = Minecraft.h1();
               if (this.oM == var6) {
                  if (var8 - this.oK > 500L) {
                     this.a(this.oG, this.oG.for, 0, 0);
                     this.a(var6, var6.for, 1, 0);
                     this.a(this.oG, this.oG.for, 0, 0);
                     this.oK = var8 + 750L;
                     --this.oC.if;
                  }
               } else {
                  this.oM = var6;
                  this.oK = var8;
               }
            }
         }
      } else if (this.oJ && var6 != null && var7 != null && var7.if > this.oL.size() && ad1.a(var6, var7, true) && var6.if(var7) && this.oP.a(var6)) {
         this.oL.add(var6);
         this.es();
      }

   }

   protected void else(int var1, int var2, int var3) {
      ac9 var4 = this.g(var1, var2);
      int var5 = this.oO;
      int var6 = this.oN;
      boolean var7 = var1 < var5 || var2 < var6 || var1 >= var5 + this.oR || var2 >= var6 + this.oQ;
      int var8 = -1;
      if (var4 != null) {
         var8 = var4.for;
      }

      if (var7) {
         var8 = -999;
      }

      ac9 var10;
      Iterator var11;
      if (this.ot && var4 != null && var3 == 0 && this.oP.a((abp)null, var4)) {
         if (dE()) {
            if (var4 != null && var4.int != null && this.or != null) {
               var11 = this.oP.try.iterator();

               while(var11.hasNext()) {
                  var10 = (ac9)var11.next();
                  if (var10 != null && var10.a((aek)this.hW.vk) && var10.do() && var10.int == var4.int && ad1.a(var10, this.or, true)) {
                     this.a(var10, var10.for, var3, 1);
                  }
               }
            }
         } else {
            this.a(var4, var8, var3, 6);
         }

         this.ot = false;
         this.oz = 0L;
      } else {
         if (this.oJ && this.oF != var3) {
            this.oJ = false;
            this.oL.clear();
            this.oD = true;
            return;
         }

         if (this.oD) {
            this.oD = false;
            return;
         }

         boolean var9;
         if (this.oG != null && this.hW.u1.aV) {
            if (var3 == 0 || var3 == 1) {
               if (this.oC == null && var4 != this.oG) {
                  this.oC = this.oG.for();
               }

               var9 = ad1.a(var4, this.oC, false);
               if (var8 != -1 && this.oC != null && var9) {
                  this.a(this.oG, this.oG.for, var3, 0);
                  this.a(var4, var8, 0, 0);
                  if (this.hW.vk.fR.M() != null) {
                     this.a(this.oG, this.oG.for, var3, 0);
                     this.oA = var1 - var5;
                     this.oy = var2 - var6;
                     this.ow = this.oG;
                     this.os = this.oC;
                     this.ou = Minecraft.h1();
                  } else {
                     this.os = null;
                  }
               } else if (this.oC != null) {
                  this.oA = var1 - var5;
                  this.oy = var2 - var6;
                  this.ow = this.oG;
                  this.os = this.oC;
                  this.ou = Minecraft.h1();
               }

               this.oC = null;
               this.oG = null;
            }
         } else if (this.oJ && !this.oL.isEmpty()) {
            this.a((ac9)null, -999, ad1.if(0, this.oH), 5);
            var11 = this.oL.iterator();

            while(var11.hasNext()) {
               var10 = (ac9)var11.next();
               this.a(var10, var10.for, ad1.if(1, this.oH), 5);
            }

            this.a((ac9)null, -999, ad1.if(2, this.oH), 5);
         } else if (this.hW.vk.fR.M() != null) {
            if (var3 == this.hW.u1.ay.int + 100) {
               this.a(var4, var8, var3, 3);
            } else {
               var9 = var8 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
               if (var9) {
                  this.or = var4 != null && var4.do() ? var4.for() : null;
               }

               this.a(var4, var8, var3, var9 ? 1 : 0);
            }
         }
      }

      if (this.hW.vk.fR.M() == null) {
         this.oz = 0L;
      }

      this.oJ = false;
   }

   private boolean a(ac9 var1, int var2, int var3) {
      return this.do(var1.do, var1.if, 16, 16, var2, var3);
   }

   protected boolean do(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.oO;
      int var8 = this.oN;
      var5 -= var7;
      var6 -= var8;
      return var5 >= var1 - 1 && var5 < var1 + var3 + 1 && var6 >= var2 - 1 && var6 < var2 + var4 + 1;
   }

   protected void a(ac9 var1, int var2, int var3, int var4) {
      if (var1 != null) {
         var2 = var1.for;
      }

      this.hW.vp.a(this.oP.new, var2, var3, var4, this.hW.vk);
   }

   protected void if(char var1, int var2) {
      if (var2 == 1 || var2 == this.hW.u1.aF.int) {
         this.hW.vk.cv();
      }

      this.af(var2);
      if (this.oI != null && this.oI.do()) {
         if (var2 == this.hW.u1.ay.int) {
            this.a(this.oI, this.oI.for, 0, 3);
         } else if (var2 == this.hW.u1.aE.int) {
            this.a(this.oI, this.oI.for, dC() ? 1 : 0, 4);
         }
      }

   }

   protected boolean af(int var1) {
      if (this.hW.vk.fR.M() == null && this.oI != null) {
         for(int var2 = 0; var2 < 9; ++var2) {
            if (var1 == 2 + var2) {
               this.a(this.oI, this.oI.for, var2, 2);
               return true;
            }
         }
      }

      return false;
   }

   public void dF() {
      if (this.hW.vk != null) {
         this.oP.if((aek)this.hW.vk);
      }
   }

   public boolean dy() {
      return false;
   }

   public void dG() {
      super.dG();
      if (!this.hW.vk.aA() || this.hW.vk.aR) {
         this.hW.vk.cv();
      }

   }
}
