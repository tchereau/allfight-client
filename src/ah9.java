public enum ah9 {
   char(ae5.class, 70, ts.z, false, false),
   case(af9.class, 10, ts.z, true, true),
   byte(agb.class, 15, ts.z, true, false),
   try(afx.class, 5, ts.s, true, false);

   private final Class new;
   private final int int;
   private final ts for;
   private final boolean do;
   private final boolean if;

   public static ah9[] new() {
      return (ah9[])a.clone();
   }

   private ah9(Class var3, int var4, ts var5, boolean var6, boolean var7) {
      this.new = var3;
      this.int = var4;
      this.for = var5;
      this.do = var6;
      this.if = var7;
   }

   public Class int() {
      return this.new;
   }

   public int for() {
      return this.int;
   }

   public ts if() {
      return this.for;
   }

   public boolean do() {
      return this.do;
   }

   public boolean a() {
      return this.if;
   }
}
