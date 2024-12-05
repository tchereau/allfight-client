import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.Map.Entry;

public class aja {
   private Map case = new HashMap();
   private final String byte = UUID.randomUUID().toString();
   private final URL try;
   private final ai8 new;
   private final Timer int = new Timer("Snooper Timer", true);
   private final Object for = new Object();
   private final long do = System.currentTimeMillis();
   private boolean if = false;
   private int a = 0;

   public aja(String var1, ai8 var2) {
      try {
         this.try = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 1);
      } catch (MalformedURLException var4) {
         throw new IllegalArgumentException();
      }

      this.new = var2;
   }

   public void for() {
      if (!this.if) {
         this.if = true;
         this.try();
         this.int.schedule(new ai9(this), 0L, 900000L);
      }
   }

   private void try() {
      this.new();
      this.a("snooper_token", this.byte);
      this.a("os_name", System.getProperty("os.name"));
      this.a("os_version", System.getProperty("os.version"));
      this.a("os_architecture", System.getProperty("os.arch"));
      this.a("java_version", System.getProperty("java.version"));
      this.a("version", "1.5.1");
      this.new.a(this);
   }

   private void new() {
      RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
      List var2 = var1.getInputArguments();
      int var3 = 0;
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if (var5.startsWith("-X")) {
            this.a("jvm_arg[" + var3++ + "]", var5);
         }
      }

      this.a("jvm_args", var3);
   }

   public void a() {
      this.a("memory_total", Runtime.getRuntime().totalMemory());
      this.a("memory_max", Runtime.getRuntime().maxMemory());
      this.a("memory_free", Runtime.getRuntime().freeMemory());
      this.a("cpu_cores", Runtime.getRuntime().availableProcessors());
      this.a("run_time", (System.currentTimeMillis() - this.do) / 60L * 1000L);
      this.new.if(this);
   }

   public void a(String var1, Object var2) {
      synchronized(this.for) {
         this.case.put(var1, var2);
      }
   }

   public Map byte() {
      LinkedHashMap var1 = new LinkedHashMap();
      synchronized(this.for) {
         this.a();
         Iterator var3 = this.case.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var1.put(var4.getKey(), var4.getValue().toString());
         }

         return var1;
      }
   }

   public boolean int() {
      return this.if;
   }

   public void do() {
      this.int.cancel();
   }

   public String if() {
      return this.byte;
   }

   // $FF: synthetic method
   static ai8 if(aja var0) {
      return var0.new;
   }

   // $FF: synthetic method
   static Object a(aja var0) {
      return var0.for;
   }

   // $FF: synthetic method
   static Map do(aja var0) {
      return var0.case;
   }

   // $FF: synthetic method
   static int for(aja var0) {
      return var0.a++;
   }

   // $FF: synthetic method
   static URL int(aja var0) {
      return var0.try;
   }
}
