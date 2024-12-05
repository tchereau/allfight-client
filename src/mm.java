// $FF: synthetic class
class mm {
   // $FF: synthetic field
   static final int[] a = new int[ln.a().length];

   static {
      try {
         a[ln.a.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         a[ln.if.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         a[ln.byte.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[ln.try.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[ln.int.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[ln.new.ordinal()] = 6;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[ln.for.ordinal()] = 7;
      } catch (NoSuchFieldError var1) {
      }

   }
}
