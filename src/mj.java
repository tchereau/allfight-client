final class mj implements mi {
   private final lw if;
   private final lw a;

   mj(lw var1, lw var2) {
      this.if = var1;
      this.a = var2;
   }

   public boolean a(Object var1) {
      return this.if.a(var1) && this.a.a(this.if.if(var1));
   }

   public Object if(Object var1) {
      Object var2;
      try {
         var2 = this.if.if(var1);
      } catch (l0 var6) {
         throw l0.a(var6, this.if);
      }

      try {
         Object var3 = this.a.if(var2);
         return var3;
      } catch (l0 var5) {
         throw l0.if(var5, this.if);
      }
   }

   public String a() {
      return this.a.a();
   }

   public String toString() {
      return this.if.toString() + ", with " + this.a.toString();
   }
}
