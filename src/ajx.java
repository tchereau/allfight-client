class ajx {
   final int if;
   Object a;
   ajx for;
   final int do;

   ajx(int var1, int var2, Object var3, ajx var4) {
      this.a = var3;
      this.for = var4;
      this.if = var2;
      this.do = var1;
   }

   public final int if() {
      return this.if;
   }

   public final Object a() {
      return this.a;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof ajx)) {
         return false;
      } else {
         ajx var2 = (ajx)var1;
         Integer var3 = this.if();
         Integer var4 = var2.if();
         if (var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.a();
            Object var6 = var2.a();
            if (var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return ajy.if(this.if);
   }

   public final String toString() {
      return this.if() + "=" + this.a();
   }
}
