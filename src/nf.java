public abstract class nf implements ng {
   public int hashCode() {
      return this.a().hashCode();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ng)) {
         return false;
      } else {
         ng var2 = (ng)var1;
         return this.a().equals(var2.a());
      }
   }

   public abstract nd a();
}
