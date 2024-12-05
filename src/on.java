import java.util.List;

public class on extends n4 implements ai7 {
   private static final int[] sJ = new int[]{3};
   private static final int[] sI = new int[]{0, 1, 2};
   private abp[] sO = new abp[4];
   private int sN;
   private int sM;
   private int sL;
   private String sK;

   public String t() {
      return this.s() ? this.sK : "container.brewing";
   }

   public boolean s() {
      return this.sK != null && this.sK.length() > 0;
   }

   public void B(String var1) {
      this.sK = var1;
   }

   public int r() {
      return this.sO.length;
   }

   public void long() {
      if (this.sN > 0) {
         --this.sN;
         if (this.sN == 0) {
            this.gv();
            this.case();
         } else if (!this.gt()) {
            this.sN = 0;
            this.case();
         } else if (this.sL != this.sO[3].new) {
            this.sN = 0;
            this.case();
         }
      } else if (this.gt()) {
         this.sN = 400;
         this.sL = this.sO[3].new;
      }

      int var1 = this.gu();
      if (var1 != this.sM) {
         this.sM = var1;
         this.try.do(this.new, this.int, this.for, var1, 2);
      }

      super.long();
   }

   public int gw() {
      return this.sN;
   }

   private boolean gt() {
      if (this.sO[3] != null && this.sO[3].if > 0) {
         abp var1 = this.sO[3];
         if (!abr.ai[var1.new].e()) {
            return false;
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < 3; ++var3) {
               if (this.sO[var3] != null && this.sO[var3].new == abr.av.A) {
                  int var4 = this.sO[var3].new();
                  int var5 = this.for(var4, var1);
                  if (!abe.try(var4) && abe.try(var5)) {
                     var2 = true;
                     break;
                  }

                  List var6 = abr.av.case(var4);
                  List var7 = abr.av.case(var5);
                  if ((var4 <= 0 || var6 != var7) && (var6 == null || !var6.equals(var7) && var7 != null) && var4 != var5) {
                     var2 = true;
                     break;
                  }
               }
            }

            return var2;
         }
      } else {
         return false;
      }
   }

   private void gv() {
      if (this.gt()) {
         abp var1 = this.sO[3];

         for(int var2 = 0; var2 < 3; ++var2) {
            if (this.sO[var2] != null && this.sO[var2].new == abr.av.A) {
               int var3 = this.sO[var2].new();
               int var4 = this.for(var3, var1);
               List var5 = abr.av.case(var3);
               List var6 = abr.av.case(var4);
               if ((var3 <= 0 || var5 != var6) && (var5 == null || !var5.equals(var6) && var6 != null)) {
                  if (var3 != var4) {
                     this.sO[var2].do(var4);
                  }
               } else if (!abe.try(var3) && abe.try(var4)) {
                  this.sO[var2].do(var4);
               }
            }
         }

         if (abr.ai[var1.new].goto()) {
            this.sO[3] = new abp(abr.ai[var1.new].case());
         } else {
            --this.sO[3].if;
            if (this.sO[3].if <= 0) {
               this.sO[3] = null;
            }
         }

      }
   }

   private int for(int var1, abp var2) {
      if (var2 == null) {
         return var1;
      } else {
         return abr.ai[var2.new].e() ? aas.a(var1, abr.ai[var2.new].a()) : var1;
      }
   }

   public void a(aqv var1) {
      super.a(var1);
      aqm var2 = var1.void("Items");
      this.sO = new abp[this.r()];

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         byte var5 = var4.else("Slot");
         if (var5 >= 0 && var5 < this.sO.length) {
            this.sO[var5] = abp.for(var4);
         }
      }

      this.sN = var1.case("BrewTime");
      if (var1.try("CustomName")) {
         this.sK = var1.new("CustomName");
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      var1.a("BrewTime", (short)this.sN);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.sO.length; ++var3) {
         if (this.sO[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.sO[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
      if (this.s()) {
         var1.a("CustomName", this.sK);
      }

   }

   public abp do(int var1) {
      return var1 >= 0 && var1 < this.sO.length ? this.sO[var1] : null;
   }

   public abp if(int var1, int var2) {
      if (var1 >= 0 && var1 < this.sO.length) {
         abp var3 = this.sO[var1];
         this.sO[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (var1 >= 0 && var1 < this.sO.length) {
         abp var2 = this.sO[var1];
         this.sO[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      if (var1 >= 0 && var1 < this.sO.length) {
         this.sO[var1] = var2;
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
      if (var1 == 3) {
         return abr.ai[var2.new].e();
      } else {
         return var2.new == abr.av.A || var2.new == abr.at.A;
      }
   }

   public void aO(int var1) {
      this.sN = var1;
   }

   public int gu() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         if (this.sO[var2] != null) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }

   public int[] aL(int var1) {
      return var1 == 1 ? sJ : sI;
   }

   public boolean a(int var1, abp var2, int var3) {
      return this.a(var1, var2);
   }

   public boolean if(int var1, abp var2, int var3) {
      return true;
   }
}
