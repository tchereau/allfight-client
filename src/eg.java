public class eg extends d7 {
   private int cc = 160;
   private boolean ch;
   private boolean cg;
   private final d6 cf;
   private float ce;
   private float cd;
   private float cb;
   private boolean ca;

   public eg(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, d6 var14) {
      super(var1, var2, var4, var6);
      this.ai = var8;
      this.ah = var10;
      this.ag = var12;
      this.cf = var14;
      this.bv *= 0.75F;
      this.bw = 48 + this.bm.nextInt(12);
      this.aE = false;
   }

   public void try(boolean var1) {
      this.ch = var1;
   }

   public void new(boolean var1) {
      this.cg = var1;
   }

   public void k(int var1) {
      float var2 = (float)((var1 & 16711680) >> 16) / 255.0F;
      float var3 = (float)((var1 & '\uff00') >> 8) / 255.0F;
      float var4 = (float)((var1 & 255) >> 0) / 255.0F;
      float var5 = 1.0F;
      this.if(var2 * var5, var3 * var5, var4 * var5);
   }

   public void j(int var1) {
      this.ce = (float)((var1 & 16711680) >> 16) / 255.0F;
      this.cd = (float)((var1 & '\uff00') >> 8) / 255.0F;
      this.cb = (float)((var1 & 255) >> 0) / 255.0F;
      this.ca = true;
   }

   public nw aL() {
      return null;
   }

   public boolean ax() {
      return false;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (!this.cg || this.bx < this.bw / 3 || (this.bx + this.bw) / 3 % 2 == 0) {
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public void aC() {
      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      if (this.bx++ >= this.bw) {
         this.az();
      }

      if (this.bx > this.bw / 2) {
         this.case(1.0F - ((float)this.bx - (float)(this.bw / 2)) / (float)this.bw);
         if (this.ca) {
            this.bs += (this.ce - this.bs) * 0.2F;
            this.br += (this.cd - this.br) * 0.2F;
            this.bq += (this.cb - this.bq) * 0.2F;
         }
      }

      this.g(this.cc + (7 - this.bx * 8 / this.bw));
      this.ah -= 0.004D;
      this.do(this.ai, this.ah, this.ag);
      this.ai *= 0.9100000262260437D;
      this.ah *= 0.9100000262260437D;
      this.ag *= 0.9100000262260437D;
      if (this.aY) {
         this.ai *= 0.699999988079071D;
         this.ag *= 0.699999988079071D;
      }

      if (this.ch && this.bx < this.bw / 2 && (this.bx + this.bw) % 2 == 0) {
         eg var1 = new eg(this.ap, this.al, this.ak, this.aj, 0.0D, 0.0D, 0.0D, this.cf);
         var1.if(this.bs, this.br, this.bq);
         var1.bx = var1.bw / 2;
         if (this.ca) {
            var1.ca = true;
            var1.ce = this.ce;
            var1.cd = this.cd;
            var1.cb = this.cb;
         }

         var1.cg = this.cg;
         this.cf.a((d7)var1);
      }

   }

   public int new(float var1) {
      return 15728880;
   }

   public float int(float var1) {
      return 1.0F;
   }
}
