import java.util.List;

public class ars extends ao8 {
   private static final String[] int = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};

   public String if() {
      return "difficulty";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.difficulty.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 0) {
         int var3 = this.try(var1, var2[0]);
         net.minecraft.a.a.g2().aU(var3);
         String var4 = aqz.if(int[var3]);
         a(var1, "commands.difficulty.success", new Object[]{var4});
      } else {
         throw new ard("commands.difficulty.usage", new Object[0]);
      }
   }

   protected int try(ar0 var1, String var2) {
      if (!var2.equalsIgnoreCase("peaceful") && !var2.equalsIgnoreCase("p")) {
         if (!var2.equalsIgnoreCase("easy") && !var2.equalsIgnoreCase("e")) {
            if (!var2.equalsIgnoreCase("normal") && !var2.equalsIgnoreCase("n")) {
               return !var2.equalsIgnoreCase("hard") && !var2.equalsIgnoreCase("h") ? a(var1, var2, 0, 3) : 3;
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, new String[]{"peaceful", "easy", "normal", "hard"}) : null;
   }
}
