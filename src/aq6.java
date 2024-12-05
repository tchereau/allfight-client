public enum aq6 {
   long(0, 1, 0, -1, 0),
   goto(1, 0, 0, 1, 0),
   else(2, 3, 0, 0, -1),
   char(3, 2, 0, 0, 1),
   case(4, 5, -1, 0, 0),
   byte(5, 4, 1, 0, 0);

   private final int try;
   private final int new;
   private final int int;
   private final int for;
   private final int do;
   private static final aq6[] if = new aq6[6];

   public static aq6[] do() {
      return (aq6[])a.clone();
   }

   private aq6(int var3, int var4, int var5, int var6, int var7) {
      this.try = var3;
      this.new = var4;
      this.int = var5;
      this.for = var6;
      this.do = var7;
   }

   public int a() {
      return this.int;
   }

   public int for() {
      return this.for;
   }

   public int if() {
      return this.do;
   }

   public static aq6 a(int var0) {
      return if[var0 % if.length];
   }

   static {
      aq6[] var0 = do();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         aq6 var3 = var0[var2];
         if[var3.try] = var3;
      }

   }
}
