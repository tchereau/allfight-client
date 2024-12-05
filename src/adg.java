public class adg extends ac9 {
   private final adi b;
   private aek void;
   private int d;
   private final zn c;

   public adg(aek var1, zn var2, adi var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.void = var1;
      this.c = var2;
      this.b = var3;
   }

   public boolean if(abp var1) {
      return false;
   }

   public abp a(int var1) {
      if (this.do()) {
         this.d += Math.min(var1, this.for().if);
      }

      return super.a(var1);
   }

   protected void a(abp var1, int var2) {
      this.d += var2;
      this.do(var1);
   }

   protected void do(abp var1) {
      var1.if(this.void.ap, this.void, this.d);
      this.d = 0;
   }

   public void a(aek var1, abp var2) {
      this.do(var2);
      zm var3 = this.b.E();
      if (var3 != null) {
         abp var4 = this.b.do(0);
         abp var5 = this.b.do(1);
         if (this.a(var3, var4, var5) || this.a(var3, var5, var4)) {
            if (var4 != null && var4.if <= 0) {
               var4 = null;
            }

            if (var5 != null && var5.if <= 0) {
               var5 = null;
            }

            this.b.if(0, var4);
            this.b.if(1, var5);
            this.c.a(var3);
         }
      }

   }

   private boolean a(zm var1, abp var2, abp var3) {
      abp var4 = var1.byte();
      abp var5 = var1.for();
      if (var2 != null && var2.new == var4.new) {
         if (var5 != null && var3 != null && var5.new == var3.new) {
            var2.if -= var4.if;
            var3.if -= var5.if;
            return true;
         }

         if (var5 == null && var3 == null) {
            var2.if -= var4.if;
            return true;
         }
      }

      return false;
   }
}
