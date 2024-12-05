public class py extends n4 {
   private abp th;

   public void a(aqv var1) {
      super.a(var1);
      if (var1.try("RecordItem")) {
         this.d(abp.for(var1.char("RecordItem")));
      } else if (var1.goto("Record") > 0) {
         this.d(new abp(var1.goto("Record"), 1, 0));
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      if (this.gD() != null) {
         var1.a("RecordItem", this.gD().if(new aqv()));
         var1.a("Record", this.gD().new);
      }

   }

   public abp gD() {
      return this.th;
   }

   public void d(abp var1) {
      this.th = var1;
      this.case();
   }
}
