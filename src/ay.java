import org.lwjgl.opengl.GL11;

public abstract class ay {
   protected az a;

   public abstract void a(n4 var1, double var2, double var4, double var6, float var8);

   protected void a(String var1) {
      c3 var2 = this.a.char;
      if (var2 != null) {
         var2.for(var1);
      }

   }

   protected void a(String var1, String var2) {
      c3 var3 = this.a.char;
      if (var3 != null) {
         GL11.glBindTexture(3553, var3.a(var1, var2));
      }

      var3.do();
   }

   public void a(az var1) {
      this.a = var1;
   }

   public void a(y6 var1) {
   }

   public jq a() {
      return this.a.a();
   }
}
