import java.lang.reflect.Field;

public class sw {
   private ac2 for = null;
   private String a = null;
   private boolean if = false;
   private Field do = null;

   public sw(ac2 var1, String var2) {
      this.for = var1;
      this.a = var2;
      Field var3 = this.if();
   }

   public Field if() {
      if (this.if) {
         return this.do;
      } else {
         this.if = true;
         Class var1 = this.for.if();
         if (var1 == null) {
            return null;
         } else {
            try {
               this.do = var1.getDeclaredField(this.a);
            } catch (SecurityException var3) {
               var3.printStackTrace();
            } catch (NoSuchFieldException var4) {
               qs.do("(Reflector) Field not present: " + var1.getName() + "." + this.a);
            }

            return this.do;
         }
      }
   }

   public Object a() {
      return vf.a((Object)null, (sw)this);
   }

   public void a(Object var1) {
      vf.a((Object)null, (sw)this, (Object)var1);
   }

   public boolean do() {
      return this.if() != null;
   }
}
