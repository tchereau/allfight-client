import java.util.List;

public class arl extends ao8 {
   public String if() {
      return "time";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.time.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length > 1) {
         int var3;
         if (var2[0].equals("set")) {
            if (var2[1].equals("day")) {
               var3 = 0;
            } else if (var2[1].equals("night")) {
               var3 = 12500;
            } else {
               var3 = a(var1, var2[1], 0);
            }

            this.if(var1, var3);
            a(var1, "commands.time.set", new Object[]{var3});
            return;
         }

         if (var2[0].equals("add")) {
            var3 = a(var1, var2[1], 0);
            this.a(var1, var3);
            a(var1, "commands.time.added", new Object[]{var3});
            return;
         }
      }

      throw new ard("commands.time.usage", new Object[0]);
   }

   public List a(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         return a(var2, new String[]{"set", "add"});
      } else {
         return var2.length == 2 && var2[0].equals("set") ? a(var2, new String[]{"day", "night"}) : null;
      }
   }

   protected void if(ar0 var1, int var2) {
      for(int var3 = 0; var3 < net.minecraft.a.a.g2().t4.length; ++var3) {
         net.minecraft.a.a.g2().t4[var3].if((long)var2);
      }

   }

   protected void a(ar0 var1, int var2) {
      for(int var3 = 0; var3 < net.minecraft.a.a.g2().t4.length; ++var3) {
         ak5 var4 = net.minecraft.a.a.g2().t4[var3];
         var4.if(var4.t() + (long)var2);
      }

   }
}
