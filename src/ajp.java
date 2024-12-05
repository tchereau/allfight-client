public final class ajp implements Comparable {
   public double if;
   public double a;
   public String do;

   public ajp(String var1, double var2, double var4) {
      this.do = var1;
      this.if = var2;
      this.a = var4;
   }

   public int a(ajp var1) {
      if (var1.if < this.if) {
         return -1;
      } else {
         return var1.if > this.if ? 1 : var1.do.compareTo(this.do);
      }
   }

   public int a() {
      return (this.do.hashCode() & 11184810) + 4473924;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((ajp)var1);
   }
}
