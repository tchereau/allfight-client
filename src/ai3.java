public class ai3 extends ai4 {
   protected aiw k;

   public ai3(String var1, aiw var2) {
      super(var1);
      this.k = var2;
   }

   public aiw new() {
      return this.k;
   }

   public String if(aig var1) {
      abp var2 = this.k instanceof aig ? ((aig)this.k).bW() : null;
      String var3 = "death.attack." + this.case;
      String var4 = var3 + ".item";
      return var2 != null && var2.g() && aqz.a(var4) ? aqz.a(var4, var1.at(), this.k.at(), var2.void()) : aqz.a(var3, var1.at(), this.k.at());
   }

   public boolean char() {
      return this.k != null && this.k instanceof aig && !(this.k instanceof aek);
   }
}
