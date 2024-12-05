public class ac2 {
   private String a = null;
   private boolean do = false;
   private Class if = null;

   public ac2(String var1) {
      this.a = var1;
      Class var2 = this.if();
   }

   public ac2(Class var1) {
      this.if = var1;
      this.a = var1.getName();
      this.do = true;
   }

   public Class if() {
      if (this.do) {
         return this.if;
      } else {
         this.do = true;

         try {
            this.if = Class.forName(this.a);
         } catch (ClassNotFoundException var2) {
            qs.do("(Reflector) Class not present: " + this.a);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return this.if;
      }
   }

   public boolean do() {
      return this.if() != null;
   }

   public String a() {
      return this.a;
   }
}
