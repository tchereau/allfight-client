public class fi {
   public nr if;
   public float a;
   public float do;

   public fi(float var1, float var2, float var3, float var4, float var5) {
      this(nr.do((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public fi a(float var1, float var2) {
      return new fi(this, var1, var2);
   }

   public fi(fi var1, float var2, float var3) {
      this.if = var1.if;
      this.a = var2;
      this.do = var3;
   }

   public fi(nr var1, float var2, float var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }
}
