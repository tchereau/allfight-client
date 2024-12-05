public class yr implements Comparable {
   private static long for = 0L;
   public int if;
   public int a;
   public int byte;
   public int try;
   public long new;
   public int int;
   private long do;

   public yr(int var1, int var2, int var3, int var4) {
      this.do = (long)(for++);
      this.if = var1;
      this.a = var2;
      this.byte = var3;
      this.try = var4;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof yr)) {
         return false;
      } else {
         yr var2 = (yr)var1;
         return this.if == var2.if && this.a == var2.a && this.byte == var2.byte && pa.a(this.try, var2.try);
      }
   }

   public int hashCode() {
      return (this.if * 1024 * 1024 + this.byte * 1024 + this.a) * 256;
   }

   public yr a(long var1) {
      this.new = var1;
      return this;
   }

   public void a(int var1) {
      this.int = var1;
   }

   public int a(yr var1) {
      if (this.new < var1.new) {
         return -1;
      } else if (this.new > var1.new) {
         return 1;
      } else if (this.int != var1.int) {
         return this.int - var1.int;
      } else if (this.do < var1.do) {
         return -1;
      } else {
         return this.do > var1.do ? 1 : 0;
      }
   }

   public String toString() {
      return this.try + ": (" + this.if + ", " + this.a + ", " + this.byte + "), " + this.new + ", " + this.int + ", " + this.do;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((yr)var1);
   }
}
