import java.util.ArrayList;
import java.util.List;

class h6 extends ad1 {
   public List S = new ArrayList();

   public h6(aek var1) {
      aen var2 = var1.fR;

      int var3;
      for(var3 = 0; var3 < 5; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.if(new ac9(h7.ew(), var3 * 9 + var4, 9 + var4 * 18, 18 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.if(new ac9(var2, var3, 9 + var3 * 18, 112));
      }

      this.a(0.0F);
   }

   public boolean do(aek var1) {
      return true;
   }

   public void a(float var1) {
      int var2 = this.S.size() / 9 - 5 + 1;
      int var3 = (int)((double)(var1 * (float)var2) + 0.5D);
      if (var3 < 0) {
         var3 = 0;
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            int var6 = var5 + (var4 + var3) * 9;
            if (var6 >= 0 && var6 < this.S.size()) {
               h7.ew().if(var5 + var4 * 9, (abp)this.S.get(var6));
            } else {
               h7.ew().if(var5 + var4 * 9, (abp)null);
            }
         }
      }

   }

   public boolean byte() {
      return this.S.size() > 45;
   }

   protected void a(int var1, int var2, boolean var3, aek var4) {
   }

   public abp if(aek var1, int var2) {
      if (var2 >= this.try.size() - 9 && var2 < this.try.size()) {
         ac9 var3 = (ac9)this.try.get(var2);
         if (var3 != null && var3.do()) {
            var3.a((abp)null);
         }
      }

      return null;
   }

   public boolean a(abp var1, ac9 var2) {
      return var2.if > 90;
   }

   public boolean a(ac9 var1) {
      return var1.int instanceof aen || var1.if > 90 && var1.do <= 162;
   }
}
