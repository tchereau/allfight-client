import net.minecraft.client.Minecraft;

public class dp extends aek {
   private boolean gc = false;
   private int gb;
   private double gh;
   private double gg;
   private double gf;
   private double ge;
   private double gd;

   public dp(y6 var1, String var2) {
      super(var1);
      this.fJ = var2;
      this.aQ = 0.0F;
      this.aF = 0.0F;
      if (var2 != null && var2.length() > 0) {
         this.af = "http://allfightpvp.net/Download/ModifPlayer/Skins/skin.php?Pseudo=" + ajm.a(var2);
      }

      this.aE = true;
      this.fB = 0.25F;
      this.au = 10.0D;
   }

   protected void cs() {
      this.aQ = 0.0F;
   }

   public boolean a(ai4 var1, int var2) {
      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.gh = var1;
      this.gg = var3;
      this.gf = var5;
      this.ge = (double)var7;
      this.gd = (double)var8;
      this.gb = var9;
   }

   public void aN() {
      this.ae = "http://allfightpvp.net/Download/ModifPlayer/Capes/" + ajm.a(this.fJ) + ".png";
   }

   public void aC() {
      this.fB = 0.0F;
      super.aC();
      this.ey = this.ex;
      double var1 = this.al - this.ao;
      double var3 = this.aj - this.am;
      float var5 = ajs.int(var1 * var1 + var3 * var3) * 4.0F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.ex += (var5 - this.ex) * 0.4F;
      this.ew += this.ex;
      if (!this.gc && this.V() && this.fR.V[this.fR.aa] != null) {
         abp var6 = this.fR.V[this.fR.aa];
         this.do(this.fR.V[this.fR.aa], abr.ai[var6.new].a(var6));
         this.gc = true;
      } else if (this.gc && !this.V()) {
         this.cC();
         this.gc = false;
      }

   }

   public float aH() {
      return 0.0F;
   }

   public void bU() {
      super.cl();
      if (this.gb > 0) {
         double var1 = this.al + (this.gh - this.al) / (double)this.gb;
         double var3 = this.ak + (this.gg - this.ak) / (double)this.gb;
         double var5 = this.aj + (this.gf - this.aj) / (double)this.gb;

         double var7;
         for(var7 = this.ge - (double)this.a5; var7 < -180.0D; var7 += 360.0D) {
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.a5 = (float)((double)this.a5 + var7 / (double)this.gb);
         this.a4 = (float)((double)this.a4 + (this.gd - (double)this.a4) / (double)this.gb);
         --this.gb;
         this.try(var1, var3, var5);
         this.do(this.a5, this.a4);
      }

      this.fL = this.fK;
      float var9 = ajs.int(this.ai * this.ai + this.ag * this.ag);
      float var2 = (float)Math.atan(-this.ah * 0.20000000298023224D) * 15.0F;
      if (var9 > 0.1F) {
         var9 = 0.1F;
      }

      if (!this.aY || this.cd() <= 0) {
         var9 = 0.0F;
      }

      if (this.aY || this.cd() <= 0) {
         var2 = 0.0F;
      }

      this.fK += (var9 - this.fK) * 0.4F;
      this.eD += (var2 - this.eD) * 0.8F;
   }

   public void do(int var1, abp var2) {
      if (var1 == 0) {
         this.fR.V[this.fR.aa] = var2;
      } else {
         this.fR.U[var1 - 1] = var2;
      }

   }

   public float af() {
      return 1.82F;
   }

   public void a(String var1) {
      Minecraft.ih().u4.c5().else(var1);
   }

   public boolean a(int var1, String var2) {
      return false;
   }

   public apg for() {
      return new apg(ajs.a(this.al + 0.5D), ajs.a(this.ak + 0.5D), ajs.a(this.aj + 0.5D));
   }
}
