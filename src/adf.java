public class adf extends ajb {
   private of sV;

   public adf() {
      super("container.enderchest", false, 27);
   }

   public void a(of var1) {
      this.sV = var1;
   }

   public void do(aqm var1) {
      int var2;
      for(var2 = 0; var2 < this.r(); ++var2) {
         this.if(var2, (abp)null);
      }

      for(var2 = 0; var2 < var1.for(); ++var2) {
         aqv var3 = (aqv)var1.a(var2);
         int var4 = var3.else("Slot") & 255;
         if (var4 >= 0 && var4 < this.r()) {
            this.if(var4, abp.for(var3));
         }
      }

   }

   public aqm gx() {
      aqm var1 = new aqm("EnderItems");

      for(int var2 = 0; var2 < this.r(); ++var2) {
         abp var3 = this.do(var2);
         if (var3 != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var2);
            var3.if(var4);
            var1.a((aqd)var4);
         }
      }

      return var1;
   }

   public boolean a(aek var1) {
      return this.sV != null && !this.sV.else(var1) ? false : super.a(var1);
   }

   public void p() {
      if (this.sV != null) {
         this.sV.gz();
      }

      super.p();
   }

   public void u() {
      if (this.sV != null) {
         this.sV.gy();
      }

      super.u();
      this.sV = null;
   }

   public boolean a(int var1, abp var2) {
      return true;
   }
}
