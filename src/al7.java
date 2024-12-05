import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class al7 extends ao8 {
   private long do = 0L;
   private int if = 0;

   public String if() {
      return "debug";
   }

   public int do() {
      return 3;
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length == 1) {
         if (var2[0].equals("start")) {
            a(var1, "commands.debug.start", new Object[0]);
            net.minecraft.a.a.g2().gN();
            this.do = System.currentTimeMillis();
            this.if = net.minecraft.a.a.g2().gO();
            return;
         }

         if (var2[0].equals("stop")) {
            if (!net.minecraft.a.a.g2().t5.else) {
               throw new ari("commands.debug.notStarted", new Object[0]);
            }

            long var3 = System.currentTimeMillis();
            int var5 = net.minecraft.a.a.g2().gO();
            long var6 = var3 - this.do;
            int var8 = var5 - this.if;
            this.a(var6, var8);
            net.minecraft.a.a.g2().t5.else = false;
            a(var1, "commands.debug.stop", new Object[]{(float)var6 / 1000.0F, var8});
            return;
         }
      }

      throw new ard("commands.debug.usage", new Object[0]);
   }

   private void a(long var1, int var3) {
      File var4 = new File(net.minecraft.a.a.g2().M("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
      var4.getParentFile().mkdirs();

      try {
         FileWriter var5 = new FileWriter(var4);
         var5.write(this.if(var1, var3));
         var5.close();
      } catch (Throwable var6) {
         net.minecraft.a.a.g2().a().a("Could not save profiler results to " + var4, var6);
      }

   }

   private String if(long var1, int var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("---- Minecraft Profiler Results ----\n");
      var4.append("// ");
      var4.append(int());
      var4.append("\n\n");
      var4.append("Time span: ").append(var1).append(" ms\n");
      var4.append("Tick span: ").append(var3).append(" ticks\n");
      var4.append("// This is approximately ").append(String.format("%.2f", (float)var3 / ((float)var1 / 1000.0F))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
      var4.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.a(0, "root", var4);
      var4.append("--- END PROFILE DUMP ---\n\n");
      return var4.toString();
   }

   private void a(int var1, String var2, StringBuilder var3) {
      List var4 = net.minecraft.a.a.g2().t5.if(var2);
      if (var4 != null && var4.size() >= 3) {
         for(int var5 = 1; var5 < var4.size(); ++var5) {
            ajp var6 = (ajp)var4.get(var5);
            var3.append(String.format("[%02d] ", var1));

            for(int var7 = 0; var7 < var1; ++var7) {
               var3.append(" ");
            }

            var3.append(var6.do);
            var3.append(" - ");
            var3.append(String.format("%.2f", var6.if));
            var3.append("%/");
            var3.append(String.format("%.2f", var6.a));
            var3.append("%\n");
            if (!var6.do.equals("unspecified")) {
               try {
                  this.a(var1 + 1, var2 + "." + var6.do, var3);
               } catch (Exception var8) {
                  var3.append("[[ EXCEPTION " + var8 + " ]]");
               }
            }
         }

      }
   }

   private static String int() {
      String[] var0 = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, new String[]{"start", "stop"}) : null;
   }
}
