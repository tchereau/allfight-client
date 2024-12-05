public class adi implements ajg {
   private final zn N;
   private abp[] M = new abp[3];
   private final aek Q;
   private zm P;
   private int O;

   public adi(aek var1, zn var2) {
      this.Q = var1;
      this.N = var2;
   }

   public int r() {
      return this.M.length;
   }

   public abp do(int var1) {
      return this.M[var1];
   }

   public abp if(int var1, int var2) {
      if (this.M[var1] != null) {
         abp var3;
         if (var1 == 2) {
            var3 = this.M[var1];
            this.M[var1] = null;
            return var3;
         } else if (this.M[var1].if <= var2) {
            var3 = this.M[var1];
            this.M[var1] = null;
            if (this.try(var1)) {
               this.F();
            }

            return var3;
         } else {
            var3 = this.M[var1].a(var2);
            if (this.M[var1].if == 0) {
               this.M[var1] = null;
            }

            if (this.try(var1)) {
               this.F();
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   private boolean try(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public abp if(int var1) {
      if (this.M[var1] != null) {
         abp var2 = this.M[var1];
         this.M[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.M[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

      if (this.try(var1)) {
         this.F();
      }

   }

   public String t() {
      return "mob.villager";
   }

   public boolean s() {
      return false;
   }

   public int q() {
      return 64;
   }

   public boolean a(aek var1) {
      return this.N.fJ() == var1;
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }

   public void case() {
      this.F();
   }

   public void F() {
      this.P = null;
      abp var1 = this.M[0];
      abp var2 = this.M[1];
      if (var1 == null) {
         var1 = var2;
         var2 = null;
      }

      if (var1 == null) {
         this.if(2, (abp)null);
      } else {
         zl var3 = this.N.char(this.Q);
         if (var3 != null) {
            zm var4 = var3.a(var1, var2, this.O);
            if (var4 != null && !var4.new()) {
               this.P = var4;
               this.if(2, var4.if().n());
            } else if (var2 != null) {
               var4 = var3.a(var2, var1, this.O);
               if (var4 != null && !var4.new()) {
                  this.P = var4;
                  this.if(2, var4.if().n());
               } else {
                  this.if(2, (abp)null);
               }
            } else {
               this.if(2, (abp)null);
            }
         }
      }

   }

   public zm E() {
      return this.P;
   }

   public void byte(int var1) {
      this.O = var1;
      this.F();
   }
}
