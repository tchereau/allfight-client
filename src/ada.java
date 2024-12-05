public class ada extends ac9 {
   private final ajg try;
   private aek new;
   private int byte;

   public ada(aek var1, ajg var2, ajg var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.new = var1;
      this.try = var2;
   }

   public boolean if(abp var1) {
      return false;
   }

   public abp a(int var1) {
      if (this.do()) {
         this.byte += Math.min(var1, this.for().if);
      }

      return super.a(var1);
   }

   protected void a(abp var1, int var2) {
      this.byte += var2;
      this.do(var1);
   }

   protected void do(abp var1) {
      var1.if(this.new.ap, this.new, this.byte);
      this.byte = 0;
      if (var1.new == pa.cu.void) {
         this.new.a((akf)akk.l, 1);
      } else if (var1.new == abr.B.A) {
         this.new.a((akf)akk.k, 1);
      } else if (var1.new == pa.cr.void) {
         this.new.a((akf)akk.j, 1);
      } else if (var1.new == abr.aQ.A) {
         this.new.a((akf)akk.h, 1);
      } else if (var1.new == abr.aC.A) {
         this.new.a((akf)akk.g, 1);
      } else if (var1.new == abr.a7.A) {
         this.new.a((akf)akk.f, 1);
      } else if (var1.new == abr.t.A) {
         this.new.a((akf)akk.e, 1);
      } else if (var1.new == abr.G.A) {
         this.new.a((akf)akk.long, 1);
      } else if (var1.new == pa.bQ.void) {
         this.new.a((akf)akk.char, 1);
      } else if (var1.new == pa.bx.void) {
         this.new.a((akf)akk.new, 1);
      }

   }

   public void a(aek var1, abp var2) {
      this.do(var2);
      ModLoader.a(this.new, var2, this.try);

      for(int var3 = 0; var3 < this.try.r(); ++var3) {
         abp var4 = this.try.do(var3);
         if (var4 != null) {
            this.try.if(var3, 1);
            if (var4.d().goto()) {
               abp var5 = new abp(var4.d().case());
               if (!var4.d().new(var4) || !this.new.fR.new(var5)) {
                  if (this.try.do(var3) == null) {
                     this.try.if(var3, var5);
                  } else {
                     this.new.else(var5);
                  }
               }
            }
         }
      }

   }
}
