public class ags extends ahk {
   private aep if;

   public ags(aep var1) {
      this.if = var1;
      this.a(5);
   }

   public boolean do() {
      if (!this.if.aA()) {
         return false;
      } else if (this.if.ap()) {
         return false;
      } else if (!this.if.aY) {
         return false;
      } else if (this.if.aU) {
         return false;
      } else {
         aek var1 = this.if.fJ();
         if (var1 == null) {
            return false;
         } else if (this.if.for((aiw)var1) > 16.0D) {
            return false;
         } else {
            return var1.fP instanceof ad1;
         }
      }
   }

   public void a() {
      this.if.bl().case();
   }

   public void new() {
      this.if.case((aek)null);
   }
}
