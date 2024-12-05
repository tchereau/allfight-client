public class n8 extends n4 {
   public byte l = 0;
   public boolean k = false;

   public void do(aqv var1) {
      super.do(var1);
      var1.a("note", this.l);
   }

   public void a(aqv var1) {
      super.a(var1);
      this.l = var1.else("note");
      if (this.l < 0) {
         this.l = 0;
      }

      if (this.l > 24) {
         this.l = 24;
      }

   }

   public void n() {
      this.l = (byte)((this.l + 1) % 25);
      this.case();
   }

   public void a(y6 var1, int var2, int var3, int var4) {
      if (var1.byte(var2, var3 + 1, var4) == ts.z) {
         ts var5 = var1.byte(var2, var3 - 1, var4);
         byte var6 = 0;
         if (var5 == ts.v) {
            var6 = 1;
         }

         if (var5 == ts.k) {
            var6 = 2;
         }

         if (var5 == ts.i) {
            var6 = 3;
         }

         if (var5 == ts.w) {
            var6 = 4;
         }

         var1.do(var2, var3, var4, pa.ao.void, var6, this.l);
      }
   }
}
