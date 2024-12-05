public class af5 extends af7 {
   public af5(y6 var1) {
      super(var1);
      this.ft = "/mob/redcow.png";
      this.if(0.9F, 1.3F);
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && var2.new == abr.a8.A && this.fr() >= 0) {
         if (var2.if == 1) {
            var1.fR.if(var1.fR.aa, new abp(abr.a6));
            return true;
         }

         if (var1.fR.new(new abp(abr.a6)) && !var1.fY.new) {
            var1.fR.if(var1.fR.aa, 1);
            return true;
         }
      }

      if (var2 != null && var2.new == abr.aX.A && this.fr() >= 0) {
         this.az();
         this.ap.a("largeexplode", this.al, this.ak + (double)(this.aO / 2.0F), this.aj, 0.0D, 0.0D, 0.0D);
         if (!this.ap.goto) {
            af7 var3 = new af7(this.ap);
            var3.if(this.al, this.ak, this.aj, this.a5, this.a4);
            var3.t(this.cd());
            var3.eH = this.eH;
            this.ap.new(var3);

            for(int var4 = 0; var4 < 5; ++var4) {
               this.ap.new(new afk(this.ap, this.al, this.ak + (double)this.aO, this.aj, new abp(pa.bL)));
            }
         }

         return true;
      } else {
         return super.for(var1);
      }
   }

   public af5 int(aiy var1) {
      return new af5(this.ap);
   }

   // $FF: synthetic method
   public af7 for(aiy var1) {
      return this.int(var1);
   }

   // $FF: synthetic method
   public aiy a(aiy var1) {
      return this.int(var1);
   }
}
