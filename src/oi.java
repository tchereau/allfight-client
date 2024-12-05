import java.util.Random;

public class oi extends n4 implements ajg {
   private abp[] n = new abp[9];
   private Random p = new Random();
   protected String o;

   public int r() {
      return 9;
   }

   public abp do(int var1) {
      return this.n[var1];
   }

   public abp if(int var1, int var2) {
      if (this.n[var1] != null) {
         abp var3;
         if (this.n[var1].if <= var2) {
            var3 = this.n[var1];
            this.n[var1] = null;
            this.case();
            return var3;
         } else {
            var3 = this.n[var1].a(var2);
            if (this.n[var1].if == 0) {
               this.n[var1] = null;
            }

            this.case();
            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.n[var1] != null) {
         abp var2 = this.n[var1];
         this.n[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public int v() {
      int var1 = -1;
      int var2 = 1;

      for(int var3 = 0; var3 < this.n.length; ++var3) {
         if (this.n[var3] != null && this.p.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      return var1;
   }

   public void if(int var1, abp var2) {
      this.n[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

      this.case();
   }

   public int a(abp var1) {
      for(int var2 = 0; var2 < this.n.length; ++var2) {
         if (this.n[var2] == null || this.n[var2].new == 0) {
            this.if(var2, var1);
            return var2;
         }
      }

      return -1;
   }

   public String t() {
      return this.s() ? this.o : "container.dispenser";
   }

   public void if(String var1) {
      this.o = var1;
   }

   public boolean s() {
      return this.o != null;
   }

   public void a(aqv var1) {
      super.a(var1);
      aqm var2 = var1.void("Items");
      this.n = new abp[this.r()];

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         int var5 = var4.else("Slot") & 255;
         if (var5 >= 0 && var5 < this.n.length) {
            this.n[var5] = abp.for(var4);
         }
      }

      if (var1.try("CustomName")) {
         this.o = var1.new("CustomName");
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.n.length; ++var3) {
         if (this.n[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.n[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
      if (this.s()) {
         var1.a("CustomName", this.o);
      }

   }

   public int q() {
      return 64;
   }

   public boolean a(aek var1) {
      if (this.try.if(this.new, this.int, this.for) != this) {
         return false;
      } else {
         return !(var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) > 64.0D);
      }
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }
}
