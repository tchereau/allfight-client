public class s6 {
   public final int char;
   public final int case;
   public final int byte;
   private final int a;
   int try = -1;
   float new;
   float int;
   float for;
   s6 do;
   public boolean if = false;

   public s6(int var1, int var2, int var3) {
      this.char = var1;
      this.case = var2;
      this.byte = var3;
      this.a = a(var1, var2, var3);
   }

   public static int a(int var0, int var1, int var2) {
      return var1 & 255 | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? '耀' : 0);
   }

   public float if(s6 var1) {
      float var2 = (float)(var1.char - this.char);
      float var3 = (float)(var1.case - this.case);
      float var4 = (float)(var1.byte - this.byte);
      return ajs.if(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public float a(s6 var1) {
      float var2 = (float)(var1.char - this.char);
      float var3 = (float)(var1.case - this.case);
      float var4 = (float)(var1.byte - this.byte);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof s6)) {
         return false;
      } else {
         s6 var2 = (s6)var1;
         return this.a == var2.a && this.char == var2.char && this.case == var2.case && this.byte == var2.byte;
      }
   }

   public int hashCode() {
      return this.a;
   }

   public boolean a() {
      return this.try >= 0;
   }

   public String toString() {
      return this.char + ", " + this.case + ", " + this.byte;
   }
}
