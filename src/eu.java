import net.minecraft.client.Minecraft;

public class eu extends dq {
   public e5 gF;
   private double gG;
   private double gE;
   private double gD;
   private double gC;
   private float gA;
   private float gy;
   private boolean gx = false;
   private boolean gw = false;
   private boolean gv = false;
   private int gB = 0;
   private boolean gz = false;

   public eu(Minecraft var1, y6 var2, j7 var3, e5 var4) {
      super(var1, var2, var3, 0);
      this.gF = var4;
   }

   public boolean a(ai4 var1, int var2) {
      return false;
   }

   public void q(int var1) {
   }

   public void aC() {
      if (this.ap.p(ajs.a(this.al), 0, ajs.a(this.aj))) {
         super.aC();
         this.cY();
      }
   }

   public void cY() {
      boolean var1 = this.S();
      if (var1 != this.gv) {
         if (var1) {
            this.gF.for((an7)(new an3(this, 4)));
         } else {
            this.gF.for((an7)(new an3(this, 5)));
         }

         this.gv = var1;
      }

      boolean var2 = this.Q();
      if (var2 != this.gw) {
         if (var2) {
            this.gF.for((an7)(new an3(this, 1)));
         } else {
            this.gF.for((an7)(new an3(this, 2)));
         }

         this.gw = var2;
      }

      double var3 = this.al - this.gG;
      double var5 = this.aZ.a - this.gE;
      double var7 = this.aj - this.gC;
      double var9 = (double)(this.a5 - this.gA);
      double var11 = (double)(this.a4 - this.gy);
      boolean var13 = var3 * var3 + var5 * var5 + var7 * var7 > 9.0E-4D || this.gB >= 20;
      boolean var14 = var9 != 0.0D || var11 != 0.0D;
      if (this.ar != null) {
         this.gF.for((an7)(new an9(this.ai, -999.0D, -999.0D, this.ag, this.a5, this.a4, this.aY)));
         var13 = false;
      } else if (var13 && var14) {
         this.gF.for((an7)(new an9(this.al, this.aZ.a, this.ak, this.aj, this.a5, this.a4, this.aY)));
      } else if (var13) {
         this.gF.for((an7)(new aoa(this.al, this.aZ.a, this.ak, this.aj, this.aY)));
      } else if (var14) {
         this.gF.for((an7)(new an8(this.a5, this.a4, this.aY)));
      } else {
         this.gF.for((an7)(new aob(this.aY)));
      }

      ++this.gB;
      this.gx = this.aY;
      if (var13) {
         this.gG = this.al;
         this.gE = this.aZ.a;
         this.gD = this.ak;
         this.gC = this.aj;
         this.gB = 0;
      }

      if (var14) {
         this.gA = this.a5;
         this.gy = this.a4;
      }

   }

   public afk f(boolean var1) {
      int var2 = var1 ? 3 : 4;
      this.gF.for((an7)(new an4(var2, 0, 0, 0, 0)));
      return null;
   }

   protected void if(afk var1) {
   }

   public void try(String var1) {
      this.gF.for((an7)(new apf(var1)));
   }

   public void b5() {
      super.b5();
      this.gF.for((an7)(new apl(this, 1)));
   }

   public void cK() {
      this.gF.for((an7)(new apb(1)));
   }

   protected void for(ai4 var1, int var2) {
      if (!this.ac()) {
         this.t(this.cd() - var2);
      }
   }

   public void cv() {
      this.gF.for((an7)(new ao0(this.fP.new)));
      this.cX();
   }

   public void cX() {
      this.fR.if((abp)null);
      super.cv();
   }

   public void H(int var1) {
      if (this.gz) {
         super.H(var1);
      } else {
         this.t(var1);
         this.gz = true;
      }

   }

   public void a(akf var1, int var2) {
      if (var1 != null) {
         if (var1.int) {
            super.a(var1, var2);
         }

      }
   }

   public void if(akf var1, int var2) {
      if (var1 != null) {
         if (!var1.int) {
            super.a(var1, var2);
         }

      }
   }

   public void cF() {
      this.gF.for((an7)(new an5(this.fY)));
   }

   public boolean cM() {
      return true;
   }
}
