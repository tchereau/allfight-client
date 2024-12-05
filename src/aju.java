class aju {
   final long if;
   Object a;
   aju for;
   final int do;

   aju(int var1, long var2, Object var4, aju var5) {
      this.a = var4;
      this.for = var5;
      this.if = var2;
      this.do = var1;
   }

   public final long if() {
      return this.if;
   }

   public final Object a() {
      return this.a;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof aju)) {
         return false;
      } else {
         aju var2 = (aju)var1;
         Long var3 = this.if();
         Long var4 = var2.if();
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
      return ajv.do(this.if);
   }

   public final String toString() {
      return this.if() + "=" + this.a();
   }
}
