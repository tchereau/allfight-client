public class adt implements ajg {
   private abp[] S;
   private int R;
   private ad1 T;

   public adt(ad1 var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.S = new abp[var4];
      this.T = var1;
      this.R = var2;
   }

   public int r() {
      return this.S.length;
   }

   public abp do(int var1) {
      return var1 >= this.r() ? null : this.S[var1];
   }

   public abp do(int var1, int var2) {
      if (var1 >= 0 && var1 < this.R) {
         int var3 = var1 + var2 * this.R;
         return this.do(var3);
      } else {
         return null;
      }
   }

   public String t() {
      return "container.crafting";
   }

   public boolean s() {
      return false;
   }

   public abp if(int var1) {
      if (this.S[var1] != null) {
         abp var2 = this.S[var1];
         this.S[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public abp if(int var1, int var2) {
      if (this.S[var1] != null) {
         abp var3;
         if (this.S[var1].if <= var2) {
            var3 = this.S[var1];
            this.S[var1] = null;
            this.T.if((ajg)this);
            return var3;
         } else {
            var3 = this.S[var1].a(var2);
            if (this.S[var1].if == 0) {
               this.S[var1] = null;
            }

            this.T.if((ajg)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.S[var1] = var2;
      this.T.if((ajg)this);
   }

   public int q() {
      return 64;
   }

   public void case() {
   }

   public boolean a(aek var1) {
      return true;
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }
}
