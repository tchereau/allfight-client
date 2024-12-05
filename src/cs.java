public class cs extends b4 {
   public cs(fx var1, float var2) {
      super(var1, var2);
   }

   public void a(af8 var1, double var2, double var4, double var6, float var8, float var9) {
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected float a(af8 var1, float var2) {
      float var3 = var1.rs + (var1.rv - var1.rs) * var2;
      float var4 = var1.rt + (var1.ru - var1.rt) * var2;
      return (ajs.try(var3) + 1.0F) * var4;
   }

   // $FF: synthetic method
   protected float for(aig var1, float var2) {
      return this.a((af8)var1, var2);
   }
}
