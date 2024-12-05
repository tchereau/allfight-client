import java.lang.reflect.Method;

public class m {
   private ac2 for;
   private String do;
   private Class[] if;
   private boolean a;
   private Method int;

   public m(ac2 var1, String var2) {
      this(var1, var2, (Class[])null);
   }

   public m(ac2 var1, String var2, Class[] var3) {
      this.for = null;
      this.do = null;
      this.if = null;
      this.a = false;
      this.int = null;
      this.for = var1;
      this.do = var2;
      this.if = var3;
      Method var4 = this.if();
   }

   public Method if() {
      if (this.a) {
         return this.int;
      } else {
         this.a = true;
         Class var1 = this.for.if();
         if (var1 == null) {
            return null;
         } else {
            Method[] var2 = var1.getMethods();
            int var3 = 0;

            Method var4;
            while(true) {
               if (var3 >= var2.length) {
                  qs.do("(Reflector) Method not pesent: " + var1.getName() + "." + this.do);
                  return null;
               }

               var4 = var2[var3];
               if (var4.getName().equals(this.do)) {
                  if (this.if == null) {
                     break;
                  }

                  Class[] var5 = var4.getParameterTypes();
                  if (vf.a(this.if, var5)) {
                     break;
                  }
               }

               ++var3;
            }

            this.int = var4;
            return this.int;
         }
      }
   }

   public boolean for() {
      return this.if() != null;
   }

   public Class do() {
      Method var1 = this.if();
      return var1 == null ? null : var1.getReturnType();
   }

   public void a() {
      this.a = true;
      this.int = null;
   }
}
