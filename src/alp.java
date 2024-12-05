public class alp extends ao8 {
   public String if() {
      return "testfor";
   }

   public int do() {
      return 2;
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length != 1) {
         throw new ard("commands.testfor.usage", new Object[0]);
      } else if (!(var1 instanceof ol)) {
         throw new ari("commands.testfor.failed", new Object[0]);
      } else {
         do(var1, var2[0]);
      }
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
