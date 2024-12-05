import java.util.List;

public class ajb implements ajg {
   private String sQ;
   private int sP;
   private abp[] sT;
   private List sS;
   private boolean sR;

   public ajb(String var1, boolean var2, int var3) {
      this.sQ = var1;
      this.sR = var2;
      this.sP = var3;
      this.sT = new abp[var3];
   }

   public abp do(int var1) {
      return this.sT[var1];
   }

   public abp if(int var1, int var2) {
      if (this.sT[var1] != null) {
         abp var3;
         if (this.sT[var1].if <= var2) {
            var3 = this.sT[var1];
            this.sT[var1] = null;
            this.case();
            return var3;
         } else {
            var3 = this.sT[var1].a(var2);
            if (this.sT[var1].if == 0) {
               this.sT[var1] = null;
            }

            this.case();
            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.sT[var1] != null) {
         abp var2 = this.sT[var1];
         this.sT[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.sT[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

      this.case();
   }

   public int r() {
      return this.sP;
   }

   public String t() {
      return this.sQ;
   }

   public boolean s() {
      return this.sR;
   }

   public int q() {
      return 64;
   }

   public void case() {
      if (this.sS != null) {
         for(int var1 = 0; var1 < this.sS.size(); ++var1) {
            ((ajf)this.sS.get(var1)).a(this);
         }
      }

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
