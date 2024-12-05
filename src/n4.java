import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class n4 {
   private static Map case = new HashMap();
   private static Map byte = new HashMap();
   protected y6 try;
   public int new;
   public int int;
   public int for;
   protected boolean do;
   public int if = -1;
   public pa a;

   private static void a(Class var0, String var1) {
      if (case.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         case.put(var1, var0);
         byte.put(var0, var1);
      }
   }

   public y6 b() {
      return this.try;
   }

   public void a(y6 var1) {
      this.try = var1;
   }

   public boolean goto() {
      return this.try != null;
   }

   public void a(aqv var1) {
      this.new = var1.goto("x");
      this.int = var1.goto("y");
      this.for = var1.goto("z");
   }

   public void do(aqv var1) {
      String var2 = (String)byte.get(this.getClass());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.a("id", var2);
         var1.a("x", this.new);
         var1.a("y", this.int);
         var1.a("z", this.for);
      }
   }

   public void long() {
   }

   public static n4 if(aqv var0) {
      n4 var1 = null;

      try {
         Class var2 = (Class)case.get(var0.new("id"));
         if (var2 != null) {
            var1 = (n4)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if (var1 != null) {
         var1.a(var0);
      } else {
         net.minecraft.a.a.g2().a().if("Skipping TileEntity with id " + var0.new("id"));
      }

      return var1;
   }

   public int try() {
      if (this.if == -1) {
         this.if = this.try.for(this.new, this.int, this.for);
      }

      return this.if;
   }

   public void case() {
      if (this.try != null) {
         this.if = this.try.for(this.new, this.int, this.for);
         this.try.a(this.new, this.int, this.for, this);
         if (this.else() != null) {
            this.try.new(this.new, this.int, this.for, this.else().void);
         }
      }

   }

   public double a(double var1, double var3, double var5) {
      double var7 = (double)this.new + 0.5D - var1;
      double var9 = (double)this.int + 0.5D - var3;
      double var11 = (double)this.for + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double int() {
      return 4096.0D;
   }

   public pa else() {
      if (this.a == null) {
         this.a = pa.x[this.try.new(this.new, this.int, this.for)];
      }

      return this.a;
   }

   public an7 char() {
      return null;
   }

   public boolean new() {
      return this.do;
   }

   public void c() {
      this.do = true;
   }

   public void byte() {
      this.do = false;
   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public void d() {
      this.a = null;
      this.if = -1;
   }

   public void a(apu var1) {
      var1.a((String)"Name", (Callable)(new n3(this)));
      apu.a(var1, this.new, this.int, this.for, this.else().void, this.try());
      var1.a((String)"Actual block type", (Callable)(new n2(this)));
      var1.a((String)"Actual block data value", (Callable)(new n1(this)));
   }

   // $FF: synthetic method
   static Map void() {
      return byte;
   }

   static {
      a(oe.class, "Furnace");
      a(om.class, "Chest");
      a(of.class, "EnderChest");
      a(py.class, "RecordPlayer");
      a(oi.class, "Trap");
      a(oh.class, "Dropper");
      a(n7.class, "Sign");
      a(oa.class, "MobSpawner");
      a(n8.class, "Music");
      a(nx.class, "Piston");
      a(on.class, "Cauldron");
      a(og.class, "EnchantTable");
      a(n5.class, "Airportal");
      a(ol.class, "Control");
      a(oo.class, "Beacon");
      a(n6.class, "Skull");
      a(oj.class, "DLDetector");
      a(oc.class, "Hopper");
      a(ok.class, "Comparator");
   }
}
