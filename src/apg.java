public class apg implements Comparable {
   public int if;
   public int a;
   public int do;

   public apg() {
   }

   public apg(int var1, int var2, int var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public apg(apg var1) {
      this.if = var1.if;
      this.a = var1.a;
      this.do = var1.do;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof apg)) {
         return false;
      } else {
         apg var2 = (apg)var1;
         return this.if == var2.if && this.a == var2.a && this.do == var2.do;
      }
   }

   public int hashCode() {
      return this.if + this.do << 8 + this.a << 16;
   }

   public int a(apg var1) {
      if (this.a == var1.a) {
         return this.do == var1.do ? this.if - var1.if : this.do - var1.do;
      } else {
         return this.a - var1.a;
      }
   }

   public void a(int var1, int var2, int var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public float if(int var1, int var2, int var3) {
      int var4 = this.if - var1;
      int var5 = this.a - var2;
      int var6 = this.do - var3;
      return (float)(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public float if(apg var1) {
      return this.if(var1.if, var1.a, var1.do);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((apg)var1);
   }
}
