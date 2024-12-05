public class ah0 {
   private aig if;
   private boolean a = false;

   public ah0(aig var1) {
      this.if = var1;
   }

   public void if() {
      this.a = true;
   }

   public void a() {
      this.if.c(this.a);
      this.a = false;
   }
}
