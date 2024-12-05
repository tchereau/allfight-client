public enum abq {
   b(0, 59, 2.0F, 0, 15),
   void(1, 131, 4.0F, 1, 5),
   goto(2, 250, 6.0F, 2, 14),
   else(3, 1561, 8.0F, 3, 10),
   char(0, 32, 12.0F, 0, 22),
   a(3, 700, 10.0F, 4, 16),
   if(3, 800, 8.0F, 3, 50),
   long(3, 1200, 12.0F, 4, 20),
   case(3, 900, 14.0F, 6, 25);

   private final int byte;
   private final int try;
   private final float new;
   private final int int;
   private final int for;

   public static abq[] a() {
      return (abq[])do.clone();
   }

   private abq(int var3, int var4, float var5, int var6, int var7) {
      this.byte = var3;
      this.try = var4;
      this.new = var5;
      this.int = var6;
      this.for = var7;
   }

   public int new() {
      return this.try;
   }

   public float int() {
      return this.new;
   }

   public int if() {
      return this.int;
   }

   public int try() {
      return this.byte;
   }

   public int for() {
      return this.for;
   }

   public int do() {
      return this == b ? pa.be.void : (this == void ? pa.bf.void : (this == char ? abr.L.A : (this == goto ? abr.N.A : (this == else ? abr.P.A : (this == a ? mod_rubis.ao.A : (this == if ? abr.bP.A : (this == long ? mod_saphir.L.A : 0)))))));
   }
}
