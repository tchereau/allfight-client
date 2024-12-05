public class nc extends nd {
   String if;
   private static ne[][] a = new ne[255][];

   public nc(String var1) {
      if (!a(var1)) {
         throw new IllegalArgumentException("string " + var1 + " not an OID");
      } else {
         this.if = var1;
      }
   }

   public String if() {
      return this.if;
   }

   public int hashCode() {
      return this.if.hashCode();
   }

   boolean a(nd var1) {
      return !(var1 instanceof nc) ? false : this.if.equals(((nc)var1).if);
   }

   public String toString() {
      return this.if();
   }

   private static boolean a(String var0) {
      if (var0.length() >= 3 && var0.charAt(1) == '.') {
         char var1 = var0.charAt(0);
         if (var1 >= '0' && var1 <= '2') {
            boolean var2 = false;

            for(int var3 = var0.length() - 1; var3 >= 2; --var3) {
               char var4 = var0.charAt(var3);
               if ('0' <= var4 && var4 <= '9') {
                  var2 = true;
               } else {
                  if (var4 != '.') {
                     return false;
                  }

                  if (!var2) {
                     return false;
                  }

                  var2 = false;
               }
            }

            return var2;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
