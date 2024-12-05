public class x2 extends yj {
   protected w2 A;

   public x2(yn var1) {
      super(var1);
      this.A = new wl(pa.bG.void);
   }

   protected void if() {
      this.a();
      if (this.x.nextInt(5) == 0) {
         int var1 = this.w + this.x.nextInt(16) + 8;
         int var2 = this.v + this.x.nextInt(16) + 8;
         int var3 = this.z.case(var1, var2);
         if (var3 > 0) {
         }

         this.A.a(this.z, this.x, var1, var3, var2);
      }

      if (this.w == 0 && this.v == 0) {
         afr var4 = new afr(this.z);
         var4.if(0.0D, 128.0D, 0.0D, this.x.nextFloat() * 360.0F, 0.0F);
         this.z.new(var4);
      }

   }
}
