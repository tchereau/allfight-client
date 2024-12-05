public class sf implements Comparable {
   private final String if;
   private final String a;
   private final long byte;
   private final long try;
   private final boolean new;
   private final yz int;
   private final boolean for;
   private final boolean do;

   public sf(String var1, String var2, long var3, long var5, yz var7, boolean var8, boolean var9, boolean var10) {
      this.if = var1;
      this.a = var2;
      this.byte = var3;
      this.try = var5;
      this.int = var7;
      this.new = var8;
      this.for = var9;
      this.do = var10;
   }

   public String try() {
      return this.if;
   }

   public String int() {
      return this.a;
   }

   public boolean if() {
      return this.new;
   }

   public long new() {
      return this.byte;
   }

   public int a(sf var1) {
      if (this.byte < var1.byte) {
         return 1;
      } else {
         return this.byte > var1.byte ? -1 : this.if.compareTo(var1.if);
      }
   }

   public yz do() {
      return this.int;
   }

   public boolean for() {
      return this.for;
   }

   public boolean a() {
      return this.do;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((sf)var1);
   }
}
