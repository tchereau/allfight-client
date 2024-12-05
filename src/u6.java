// $FF: synthetic class
class u6 {
   // $FF: synthetic field
   static final int[] a = new int[up.a().length];

   static {
      try {
         a[up.if.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[up.a.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[up.int.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[up.for.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
