public class ajh implements ajg {
   private String sY;
   private ajg sX;
   private ajg sZ;

   public ajh(String var1, ajg var2, ajg var3) {
      this.sY = var1;
      if (var2 == null) {
         var2 = var3;
      }

      if (var3 == null) {
         var3 = var2;
      }

      this.sX = var2;
      this.sZ = var3;
   }

   public int r() {
      return this.sX.r() + this.sZ.r();
   }

   public boolean if(ajg var1) {
      return this.sX == var1 || this.sZ == var1;
   }

   public String t() {
      if (this.sX.s()) {
         return this.sX.t();
      } else {
         return this.sZ.s() ? this.sZ.t() : this.sY;
      }
   }

   public boolean s() {
      return this.sX.s() || this.sZ.s();
   }

   public abp do(int var1) {
      return var1 >= this.sX.r() ? this.sZ.do(var1 - this.sX.r()) : this.sX.do(var1);
   }

   public abp if(int var1, int var2) {
      return var1 >= this.sX.r() ? this.sZ.if(var1 - this.sX.r(), var2) : this.sX.if(var1, var2);
   }

   public abp if(int var1) {
      return var1 >= this.sX.r() ? this.sZ.if(var1 - this.sX.r()) : this.sX.if(var1);
   }

   public void if(int var1, abp var2) {
      if (var1 >= this.sX.r()) {
         this.sZ.if(var1 - this.sX.r(), var2);
      } else {
         this.sX.if(var1, var2);
      }

   }

   public int q() {
      return this.sX.q();
   }

   public void case() {
      this.sX.case();
      this.sZ.case();
   }

   public boolean a(aek var1) {
      return this.sX.a(var1) && this.sZ.a(var1);
   }

   public void p() {
      this.sX.p();
      this.sZ.p();
   }

   public void u() {
      this.sX.u();
      this.sZ.u();
   }

   public boolean a(int var1, abp var2) {
      return true;
   }
}
