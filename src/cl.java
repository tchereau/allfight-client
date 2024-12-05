import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class cl {
   private Map if = new HashMap();
   public static cl e = new cl();
   private jq a;
   public static double d;
   public static double c;
   public static double b;
   public c3 void;
   public da long;
   public y6 goto;
   public aig else;
   public aig char;
   public float case;
   public float byte;
   public ke try;
   public double new;
   public double int;
   public double for;
   public static boolean do = false;

   private cl() {
      this.if.put(aeu.class, new bt());
      this.if.put(ae8.class, new bt());
      this.if.put(af3.class, new b0(new fv(), new fv(0.5F), 0.7F));
      this.if.put(af2.class, new by(new fr(), new fs(), 0.7F));
      this.if.put(af7.class, new cr(new f5(), 0.7F));
      this.if.put(af5.class, new b3(new f5(), 0.7F));
      this.if.put(afw.class, new bk(new fc(), new fc(), 0.5F));
      this.if.put(af8.class, new cs(new f6(), 0.3F));
      this.if.put(af4.class, new b2(new fw(), 0.4F));
      this.if.put(aex.class, new bx());
      this.if.put(ae7.class, new cq());
      this.if.put(ae6.class, new cm());
      this.if.put(af0.class, new bu());
      this.if.put(aew.class, new bw());
      this.if.put(aet.class, new bn());
      this.if.put(ae9.class, new cv());
      this.if.put(aes.class, new bj());
      this.if.put(aev.class, new bv(new fm(16), new fm(0), 0.25F));
      this.if.put(ae1.class, new b9());
      this.if.put(aek.class, new bz());
      this.if.put(ae2.class, new ce(new fb(), 0.5F, 6.0F));
      this.if.put(ae3.class, new cf());
      this.if.put(afz.class, new bs(new fj(), 0.7F));
      this.if.put(aep.class, new bo());
      this.if.put(afy.class, new bp());
      this.if.put(aig.class, new b4(new f1(), 0.5F));
      this.if.put(aga.class, new cw());
      this.if.put(afr.class, new cn());
      this.if.put(afs.class, new co());
      this.if.put(afq.class, new bm());
      this.if.put(aiw.class, new cp());
      this.if.put(ah7.class, new b1());
      this.if.put(aih.class, new cc());
      this.if.put(aei.class, new cx());
      this.if.put(aea.class, new ca(abr.cu));
      this.if.put(ad6.class, new ca(abr.aF));
      this.if.put(aeh.class, new ca(abr.b3));
      this.if.put(ad7.class, new ca(abr.ch));
      this.if.put(ad4.class, new ca(abr.av, 16384));
      this.if.put(ad5.class, new ca(abr.bX));
      this.if.put(aef.class, new ca(abr.bn));
      this.if.put(aed.class, new ch(2.0F));
      this.if.put(aeb.class, new ch(0.5F));
      this.if.put(ad3.class, new bl());
      this.if.put(afk.class, new cb());
      this.if.put(aik.class, new cj());
      this.if.put(afa.class, new bq());
      this.if.put(afl.class, new ci());
      this.if.put(afb.class, new br());
      this.if.put(afd.class, new b5());
      this.if.put(afj.class, new b6());
      this.if.put(afm.class, new cu());
      this.if.put(aee.class, new cg());
      this.if.put(afn.class, new b7());
      ModLoader.a(this.if);
      Iterator var1 = this.if.values().iterator();

      while(var1.hasNext()) {
         ck var2 = (ck)var1.next();
         var2.a(this);
      }

   }

   public ck a(Class var1) {
      ck var2 = (ck)this.if.get(var1);
      if (var2 == null && var1 != aiw.class) {
         var2 = this.a(var1.getSuperclass());
         this.if.put(var1, var2);
      }

      return var2;
   }

   public ck a(aiw var1) {
      return this.a(var1.getClass());
   }

   public void a(y6 var1, c3 var2, jq var3, aig var4, aig var5, ke var6, float var7) {
      this.goto = var1;
      this.void = var2;
      this.try = var6;
      this.else = var4;
      this.char = var5;
      this.a = var3;
      if (var4.cg()) {
         int var8 = var1.new(ajs.a(var4.al), ajs.a(var4.ak), ajs.a(var4.aj));
         if (var8 == pa.al.void) {
            int var9 = var1.for(ajs.a(var4.al), ajs.a(var4.ak), ajs.a(var4.aj));
            int var10 = var9 & 3;
            this.case = (float)(var10 * 90 + 180);
            this.byte = 0.0F;
         }
      } else {
         this.case = var4.a2 + (var4.a5 - var4.a2) * var7;
         this.byte = var4.a0 + (var4.a4 - var4.a0) * var7;
      }

      if (var6.bo == 2) {
         this.case += 180.0F;
      }

      this.new = var4.aJ + (var4.al - var4.aJ) * (double)var7;
      this.int = var4.aI + (var4.ak - var4.aI) * (double)var7;
      this.for = var4.aH + (var4.aj - var4.aH) * (double)var7;
   }

   public void a(aiw var1, float var2) {
      if (var1.bl == 0) {
         var1.aJ = var1.al;
         var1.aI = var1.ak;
         var1.aH = var1.aj;
      }

      double var3 = var1.aJ + (var1.al - var1.aJ) * (double)var2;
      double var5 = var1.aI + (var1.ak - var1.aI) * (double)var2;
      double var7 = var1.aH + (var1.aj - var1.aH) * (double)var2;
      float var9 = var1.a2 + (var1.a5 - var1.a2) * var2;
      int var10 = var1.new(var2);
      if (var1.aP()) {
         var10 = 15728880;
      }

      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      q.a(q.a, (float)var11 / 1.0F, (float)var12 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.if(var1, var3 - d, var5 - c, var7 - b, var9, var2);
   }

   public void if(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      ck var10 = null;

      try {
         var10 = this.a(var1);
         if (var10 != null && this.void != null) {
            if (do && !var1.U()) {
               try {
                  this.a(var1, var2, var4, var6, var8, var9);
               } catch (Throwable var17) {
                  throw new ape(aqh.a(var17, "Rendering entity hitbox in world"));
               }
            }

            try {
               var10.do(var1, var2, var4, var6, var8, var9);
            } catch (Throwable var16) {
               throw new ape(aqh.a(var16, "Rendering entity in world"));
            }

            try {
               var10.a(var1, var2, var4, var6, var8, var9);
            } catch (Throwable var15) {
               throw new ape(aqh.a(var15, "Post-rendering entity in world"));
            }
         }

      } catch (Throwable var18) {
         aqh var12 = aqh.a(var18, "Rendering entity in world");
         apu var13 = var12.a("Entity being rendered");
         var1.if(var13);
         apu var14 = var12.a("Renderer details");
         var14.a((String)"Assigned renderer", (Object)var10);
         var14.a((String)"Location", (Object)apu.a(var2, var4, var6));
         var14.a((String)"Rotation", (Object)var8);
         var14.a((String)"Delta", (Object)var9);
         throw new ape(var12);
      }
   }

   private void a(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glDepthMask(false);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      GL11.glDisable(3042);
      GL11.glPushMatrix();
      c4 var10 = c4.G;
      var10.if();
      var10.a(255, 255, 255, 32);
      double var11 = (double)(-var1.aP / 2.0F);
      double var13 = (double)(-var1.aP / 2.0F);
      double var15 = (double)(var1.aP / 2.0F);
      double var17 = (double)(-var1.aP / 2.0F);
      double var19 = (double)(-var1.aP / 2.0F);
      double var21 = (double)(var1.aP / 2.0F);
      double var23 = (double)(var1.aP / 2.0F);
      double var25 = (double)(var1.aP / 2.0F);
      double var27 = (double)var1.aO;
      var10.if(var2 + var11, var4 + var27, var6 + var13);
      var10.if(var2 + var11, var4, var6 + var13);
      var10.if(var2 + var15, var4, var6 + var17);
      var10.if(var2 + var15, var4 + var27, var6 + var17);
      var10.if(var2 + var23, var4 + var27, var6 + var25);
      var10.if(var2 + var23, var4, var6 + var25);
      var10.if(var2 + var19, var4, var6 + var21);
      var10.if(var2 + var19, var4 + var27, var6 + var21);
      var10.if(var2 + var15, var4 + var27, var6 + var17);
      var10.if(var2 + var15, var4, var6 + var17);
      var10.if(var2 + var23, var4, var6 + var25);
      var10.if(var2 + var23, var4 + var27, var6 + var25);
      var10.if(var2 + var19, var4 + var27, var6 + var21);
      var10.if(var2 + var19, var4, var6 + var21);
      var10.if(var2 + var11, var4, var6 + var13);
      var10.if(var2 + var11, var4 + var27, var6 + var13);
      var10.for();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2884);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   public void a(y6 var1) {
      this.goto = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.new;
      double var9 = var3 - this.int;
      double var11 = var5 - this.for;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public jq a() {
      return this.a;
   }

   public void a(ajc var1) {
      Iterator var2 = this.if.values().iterator();

      while(var2.hasNext()) {
         ck var3 = (ck)var2.next();
         var3.a(var1);
      }

   }
}
