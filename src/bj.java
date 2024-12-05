public class bj extends cd {
   private f1 Q;
   private ff P;
   protected f1 N;
   protected f1 M;
   protected f1 L;
   protected f1 R;
   private int O = 1;

   public bj() {
      super(new fb(), 0.5F, 1.0F);
      this.Q = this.G;
      this.P = new ff();
   }

   protected void int() {
      this.J = new fb(1.0F, true);
      this.I = new fb(0.5F, true);
      this.N = this.J;
      this.M = this.I;
      this.L = new ff(1.0F, 0.0F, true);
      this.R = new ff(0.5F, 0.0F, true);
   }

   protected int a(aes var1, int var2, float var3) {
      this.a(var1);
      return super.do(var1, var2, var3);
   }

   public void a(aes var1, double var2, double var4, double var6, float var8, float var9) {
      this.a(var1);
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected void a(aes var1, float var2) {
      this.a(var1);
      super.do(var1, var2);
   }

   private void a(aes var1) {
      if (var1.e1()) {
         if (this.O != this.P.int()) {
            this.P = new ff();
            this.O = this.P.int();
            this.L = new ff(1.0F, 0.0F, true);
            this.R = new ff(0.5F, 0.0F, true);
         }

         this.l = this.P;
         this.J = this.L;
         this.I = this.R;
      } else {
         this.l = this.Q;
         this.J = this.N;
         this.I = this.M;
      }

      this.G = (f1)this.l;
   }

   protected void a(aes var1, float var2, float var3, float var4) {
      if (var1.e2()) {
         var3 += (float)(Math.cos((double)var1.bl * 3.25D) * 3.141592653589793D * 0.25D);
      }

      super.a(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   protected void do(aig var1, float var2) {
      this.a((aes)var1, var2);
   }
}
