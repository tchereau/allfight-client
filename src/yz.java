public enum yz {
   if(-1, ""),
   a(0, "survival"),
   try(1, "creative"),
   new(2, "adventure");

   int int;
   String for;

   public static yz[] a() {
      return (yz[])do.clone();
   }

   private yz(int var3, String var4) {
      this.int = var3;
      this.for = var4;
   }

   public int new() {
      return this.int;
   }

   public String int() {
      return this.for;
   }

   public void a(aeo var1) {
      if (this == try) {
         var1.try = true;
         var1.new = true;
         var1.if = true;
      } else {
         var1.try = false;
         var1.new = false;
         var1.if = false;
         var1.a = false;
      }

      var1.int = !this.for();
   }

   public boolean for() {
      return this == new;
   }

   public boolean do() {
      return this == try;
   }

   public boolean if() {
      return this == a || this == new;
   }

   public static yz a(int var0) {
      yz[] var1 = a();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         yz var4 = var1[var3];
         if (var4.int == var0) {
            return var4;
         }
      }

      return a;
   }

   public static yz a(String var0) {
      yz[] var1 = a();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         yz var4 = var1[var3];
         if (var4.for.equals(var0)) {
            return var4;
         }
      }

      return a;
   }
}
