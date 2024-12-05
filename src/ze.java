import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class ze {
   private TreeMap a = new TreeMap();

   public ze() {
      this.if("doFireTick", "true");
      this.if("mobGriefing", "true");
      this.if("keepInventory", "false");
      this.if("doMobSpawning", "true");
      this.if("doMobLoot", "true");
      this.if("doTileDrops", "true");
      this.if("commandBlockOutput", "true");
   }

   public void if(String var1, String var2) {
      this.a.put(var1, new zd(var2));
   }

   public void a(String var1, String var2) {
      zd var3 = (zd)this.a.get(var1);
      if (var3 != null) {
         var3.a(var2);
      } else {
         this.if(var1, var2);
      }

   }

   public String do(String var1) {
      zd var2 = (zd)this.a.get(var1);
      return var2 != null ? var2.a() : "";
   }

   public boolean a(String var1) {
      zd var2 = (zd)this.a.get(var1);
      return var2 != null ? var2.if() : false;
   }

   public aqv if() {
      aqv var1 = new aqv("GameRules");
      Iterator var2 = this.a.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         zd var4 = (zd)this.a.get(var3);
         var1.a(var3, var4.a());
      }

      return var1;
   }

   public void a(aqv var1) {
      Collection var2 = var1.new();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         aqd var4 = (aqd)var3.next();
         String var5 = var4.if();
         String var6 = var1.new(var4.if());
         this.a(var5, var6);
      }

   }

   public String[] a() {
      return (String[])this.a.keySet().toArray(new String[0]);
   }

   public boolean if(String var1) {
      return this.a.containsKey(var1);
   }
}
