public enum ac1 {
   long(5, new int[]{1, 3, 2, 1}, 15),
   goto(15, new int[]{2, 5, 4, 1}, 12),
   else(15, new int[]{2, 6, 5, 2}, 9),
   case(7, new int[]{2, 5, 3, 1}, 25),
   void(20, new int[]{2, 7, 6, 3}, 10),
   byte(33, new int[]{3, 8, 6, 3}, 10),
   a(37, new int[]{3, 8, 6, 3}, 12),
   if(33, new int[]{3, 8, 6, 3}, 50),
   char(40, new int[]{3, 8, 6, 3}, 15),
   try(43, new int[]{3, 8, 6, 3}, 25);

   private int new;
   private int[] int;
   private int for;

   public static ac1[] do() {
      return (ac1[])do.clone();
   }

   private ac1(int var3, int[] var4, int var5) {
      this.new = var3;
      this.int = var4;
      this.for = var5;
   }

   public int a(int var1) {
      return ac4.z()[var1] * this.new;
   }

   public int if(int var1) {
      return this.int[var1];
   }

   public int if() {
      return this.for;
   }

   public int a() {
      return this == long ? abr.cs.A : (this == goto ? abr.N.A : (this == case ? abr.L.A : (this == else ? abr.N.A : (this == byte ? abr.P.A : (this == a ? mod_rubis.ao.A : (this == if ? abr.bP.A : (this == char ? mod_saphir.L.A : 0)))))));
   }
}
