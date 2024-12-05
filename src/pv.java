import java.lang.reflect.Constructor;

public class pv {
   private ac2 for = null;
   private Class[] if = null;
   private boolean do = false;
   private Constructor a = null;

   public pv(ac2 var1, Class[] var2) {
      this.for = var1;
      this.if = var2;
      Constructor var3 = this.a();
   }

   public Constructor a() {
      if (this.do) {
         return this.a;
      } else {
         this.do = true;
         Class var1 = this.for.if();
         if (var1 == null) {
            return null;
         } else {
            this.a = a(var1, this.if);
            if (this.a == null) {
               qs.for("(Reflector) Constructor not present: " + var1.getName() + ", params: " + qs.a((Object[])this.if));
            }

            return this.a;
         }
      }
   }

   private static Constructor a(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getConstructors();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if (vf.a(var1, var5)) {
            return var4;
         }
      }

      return null;
   }
}
