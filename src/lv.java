import java.util.Arrays;

public final class lv {
   public static lw int(Object... var0) {
      return a(var0, new lw(new lu()));
   }

   public static lw if(Object... var0) {
      return a(var0, new lw(new lq()));
   }

   public static lw a(Object... var0) {
      return a(var0, new lw(new lp()));
   }

   public static lw for(Object... var0) {
      return a(var0, new lw(new lo()));
   }

   public static lw do(Object... var0) {
      return a(var0, new lw(new lt()));
   }

   public static lw if(String var0) {
      return a(lx.a(var0));
   }

   public static lw a(lg var0) {
      return new lw(new ls(var0));
   }

   public static lw a(String var0) {
      return do().a(if(var0));
   }

   public static lw if(int var0) {
      return new lw(new lr(var0));
   }

   public static lw a(int var0) {
      return for().a(if(var0));
   }

   private static lw a(Object[] var0, lw var1) {
      lw var2 = var1;

      for(int var3 = var0.length - 1; var3 >= 0; --var3) {
         if (var0[var3] instanceof Integer) {
            var2 = a(a((Integer)var0[var3]), var2);
         } else {
            if (!(var0[var3] instanceof String)) {
               throw new IllegalArgumentException("Element [" + var0[var3] + "] of path elements" + " [" + Arrays.toString(var0) + "] was of illegal type [" + var0[var3].getClass().getCanonicalName() + "]; only Integer and String are valid.");
            }

            var2 = a(a((String)var0[var3]), var2);
         }
      }

      return var2;
   }

   private static lw a(lw var0, lw var1) {
      return new lw(new mj(var0, var1));
   }
}
