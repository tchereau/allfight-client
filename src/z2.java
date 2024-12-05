public enum z2 {
   char,
   case,
   byte,
   try,
   new,
   int,
   for,
   do,
   if;

   public static z2[] a() {
      return (z2[])a.clone();
   }

   public boolean a(abr var1) {
      if (this == char) {
         return true;
      } else if (var1 instanceof ac4) {
         if (this == case) {
            return true;
         } else {
            ac4 var2 = (ac4)var1;
            if (var2.dV == 0) {
               return this == int;
            } else if (var2.dV == 2) {
               return this == try;
            } else if (var2.dV == 1) {
               return this == new;
            } else if (var2.dV == 3) {
               return this == byte;
            } else {
               return false;
            }
         }
      } else if (var1 instanceof aav) {
         return this == for;
      } else if (var1 instanceof aca) {
         return this == do;
      } else if (var1 instanceof acv) {
         return this == if;
      } else {
         return false;
      }
   }
}
