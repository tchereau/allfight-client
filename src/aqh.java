import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class aqh {
   private final String if;
   private final Throwable a;
   private final apu try = new apu(this, "System Details");
   private final List new = new ArrayList();
   private File int = null;
   private boolean for = true;
   private StackTraceElement[] do = new StackTraceElement[0];

   public aqh(String var1, Throwable var2) {
      this.if = var1;
      this.a = var2;
      this.new();
   }

   private void new() {
      this.try.a((String)"Minecraft Version", (Callable)(new aqe(this)));
      this.try.a((String)"Operating System", (Callable)(new aqc(this)));
      this.try.a((String)"Java Version", (Callable)(new aqa(this)));
      this.try.a((String)"Java VM Version", (Callable)(new ap8(this)));
      this.try.a((String)"Memory", (Callable)(new ap6(this)));
      this.try.a((String)"JVM Flags", (Callable)(new ap4(this)));
      this.try.a((String)"AABB Pool Size", (Callable)(new ap2(this)));
      this.try.a((String)"Suspicious classes", (Callable)(new ap0(this)));
      this.try.a((String)"IntCache", (Callable)(new apw(this)));
      this.try.a((String)"ModLoader", (Object)ModLoader.try());
   }

   public String case() {
      return this.if;
   }

   public Throwable if() {
      return this.a;
   }

   public String byte() {
      StringBuilder var1 = new StringBuilder();
      this.a(var1);
      return var1.toString();
   }

   public void a(StringBuilder var1) {
      if (this.do != null && this.do.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Stacktrace:\n");
         StackTraceElement[] var2 = this.do;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            StackTraceElement var5 = var2[var4];
            var1.append("\t").append("at ").append(var5.toString());
            var1.append("\n");
         }

         var1.append("\n");
      }

      Iterator var6 = this.new.iterator();

      while(var6.hasNext()) {
         apu var7 = (apu)var6.next();
         var7.a(var1);
         var1.append("\n\n");
      }

      this.try.a(var1);
   }

   public String int() {
      StringWriter var1 = null;
      PrintWriter var2 = null;
      String var3 = this.a.toString();

      try {
         var1 = new StringWriter();
         var2 = new PrintWriter(var1);
         this.a.printStackTrace(var2);
         var3 = var1.toString();
      } finally {
         try {
            if (var1 != null) {
               var1.close();
            }

            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var10) {
         }

      }

      return var3;
   }

   public String do() {
      StringBuilder var1 = new StringBuilder();
      var1.append("---- Minecraft Crash Report ----\n");
      var1.append("// ");
      var1.append(a());
      var1.append("\n\n");
      var1.append("Time: ");
      var1.append((new SimpleDateFormat()).format(new Date()));
      var1.append("\n");
      var1.append("Description: ");
      var1.append(this.if);
      var1.append("\n\n");
      var1.append(this.int());
      var1.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for(int var2 = 0; var2 < 87; ++var2) {
         var1.append("-");
      }

      var1.append("\n\n");
      this.a(var1);
      return var1.toString();
   }

   public File try() {
      return this.int;
   }

   public boolean a(File var1, ajw var2) {
      if (this.int != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         try {
            FileWriter var3 = new FileWriter(var1);
            var3.write(this.do());
            var3.close();
            this.int = var1;
            return true;
         } catch (Throwable var4) {
            var2.a("Could not save crash report to " + var1, var4);
            return false;
         }
      }
   }

   public apu for() {
      return this.try;
   }

   public apu a(String var1) {
      return this.a(var1, 1);
   }

   public apu a(String var1, int var2) {
      apu var3 = new apu(this, var1);
      if (this.for) {
         int var4 = var3.a(var2);
         StackTraceElement[] var5 = this.a.getStackTrace();
         StackTraceElement var6 = null;
         StackTraceElement var7 = null;
         if (var5 != null && var5.length - var4 < var5.length) {
            var6 = var5[var5.length - var4];
            if (var5.length + 1 - var4 < var5.length) {
               var7 = var5[var5.length + 1 - var4];
            }
         }

         this.for = var3.a(var6, var7);
         if (var4 > 0 && !this.new.isEmpty()) {
            apu var8 = (apu)this.new.get(this.new.size() - 1);
            var8.if(var4);
         } else if (var5 != null && var5.length >= var4) {
            this.do = new StackTraceElement[var5.length - var4];
            System.arraycopy(var5, 0, this.do, 0, this.do.length);
         } else {
            this.for = false;
         }
      }

      this.new.add(var3);
      return var3;
   }

   private static String a() {
      String[] var0 = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!"};

      try {
         return var0[(int)(System.nanoTime() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public static aqh a(Throwable var0, String var1) {
      aqh var2;
      if (var0 instanceof ape) {
         var2 = ((ape)var0).a();
      } else {
         var2 = new aqh(var1, var0);
      }

      return var2;
   }
}
