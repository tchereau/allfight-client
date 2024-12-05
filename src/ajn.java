public class ajn {
   private float if;
   private float a;
   private float do;

   public float a(float var1, float var2) {
      this.if += var1;
      var1 = (this.if - this.a) * var2;
      this.do += (var1 - this.do) * 0.5F;
      if (var1 > 0.0F && var1 > this.do || var1 < 0.0F && var1 < this.do) {
         var1 = this.do;
      }

      this.a += var1;
      return var1;
   }
}
