public abstract class r8 extends pa implements rb {
   protected r8(int var1, ts var2) {
      super(var1, var2);
      this.aU = true;
   }

   public void for(y6 var1, int var2, int var3, int var4) {
      super.for(var1, var2, var3, var4);
   }

   public void do(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.do(var1, var2, var3, var4, var5, var6);
      var1.b(var2, var3, var4);
   }

   public boolean if(y6 var1, int var2, int var3, int var4, int var5, int var6) {
      super.if(var1, var2, var3, var4, var5, var6);
      n4 var7 = var1.if(var2, var3, var4);
      return var7 != null ? var7.a(var5, var6) : false;
   }
}
