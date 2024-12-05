public class ahe extends ahf {
   private final aep aU;

   public ahe(aep var1) {
      super(var1, aek.class, 8.0F);
      this.aU = var1;
   }

   public boolean do() {
      if (this.aU.fK()) {
         this.aP = this.aU.fJ();
         return true;
      } else {
         return false;
      }
   }
}
