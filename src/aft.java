public class aft extends aiw {
   public final afu d5;
   public final String d4;

   public aft(afu var1, String var2, float var3, float var4) {
      super(var1.e7());
      this.if(var3, var4);
      this.d5 = var1;
      this.d4 = var2;
   }

   protected void X() {
   }

   protected void try(aqv var1) {
   }

   protected void for(aqv var1) {
   }

   public boolean aw() {
      return true;
   }

   public boolean a(ai4 var1, int var2) {
      return this.ac() ? false : this.d5.a(this, var1, var2);
   }

   public boolean do(aiw var1) {
      return this == var1 || this.d5 == var1;
   }
}
