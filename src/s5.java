public class s5 {
   private final s6[] if;
   private int a;
   private int do;

   public s5(s6[] var1) {
      this.if = var1;
      this.do = var1.length;
   }

   public void if() {
      ++this.a;
   }

   public boolean int() {
      return this.a >= this.do;
   }

   public s6 do() {
      return this.do > 0 ? this.if[this.do - 1] : null;
   }

   public s6 a(int var1) {
      return this.if[var1];
   }

   public int a() {
      return this.do;
   }

   public void do(int var1) {
      this.do = var1;
   }

   public int for() {
      return this.a;
   }

   public void if(int var1) {
      this.a = var1;
   }

   public nr a(aiw var1, int var2) {
      double var3 = (double)this.if[var2].char + (double)((int)(var1.aP + 1.0F)) * 0.5D;
      double var5 = (double)this.if[var2].case;
      double var7 = (double)this.if[var2].byte + (double)((int)(var1.aP + 1.0F)) * 0.5D;
      return var1.ap.do().a(var3, var5, var7);
   }

   public nr a(aiw var1) {
      return this.a(var1, this.a);
   }

   public boolean a(s5 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.if.length != this.if.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.if.length; ++var2) {
            if (this.if[var2].char != var1.if[var2].char || this.if[var2].case != var1.if[var2].case || this.if[var2].byte != var1.if[var2].byte) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean a(nr var1) {
      s6 var2 = this.do();
      if (var2 == null) {
         return false;
      } else {
         return var2.char == (int)var1.int && var2.byte == (int)var1.do;
      }
   }
}
