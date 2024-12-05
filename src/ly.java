public final class ly extends lz {
   private static final mk do = new mn();

   static ly a(l0 var0, Object[] var1, lh var2) {
      return new ly(var0, var1, var2);
   }

   private ly(l0 var1, Object[] var2, lh var3) {
      super(if(var1, var2, var3));
   }

   private static String if(l0 var0, Object[] var1, lh var2) {
      return "Failed to find " + var0.if.toString() + " at [" + l0.a(var0.a) + "] while resolving [" + a(var1) + "] in " + do.a(var2) + ".";
   }

   private static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = true;
      Object[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];
         if (!var2) {
            var1.append(".");
         }

         var2 = false;
         if (var6 instanceof String) {
            var1.append("\"").append(var6).append("\"");
         } else {
            var1.append(var6);
         }
      }

      return var1.toString();
   }
}
