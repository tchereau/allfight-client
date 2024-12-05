public class fu {
   public fi[] if;
   public int a;
   private boolean do;

   public fu(fi[] var1) {
      this.a = 0;
      this.do = false;
      this.if = var1;
      this.a = var1.length;
   }

   public fu(fi[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].a((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].a((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].a((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].a((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void a() {
      fi[] var1 = new fi[this.if.length];

      for(int var2 = 0; var2 < this.if.length; ++var2) {
         var1[var2] = this.if[this.if.length - var2 - 1];
      }

      this.if = var1;
   }

   public void a(c4 var1, float var2) {
      nr var3 = this.if[1].if.do(this.if[0].if);
      nr var4 = this.if[1].if.do(this.if[2].if);
      nr var5 = var4.if(var3).if();
      var1.if();
      if (this.do) {
         var1.do(-((float)var5.int), -((float)var5.for), -((float)var5.do));
      } else {
         var1.do((float)var5.int, (float)var5.for, (float)var5.do);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         fi var7 = this.if[var6];
         var1.a((double)((float)var7.if.int * var2), (double)((float)var7.if.for * var2), (double)((float)var7.if.do * var2), (double)var7.a, (double)var7.do);
      }

      var1.for();
   }
}
