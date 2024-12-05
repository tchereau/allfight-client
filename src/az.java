import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class az {
   private Map if = new HashMap();
   public static az void = new az();
   private jq a;
   public static double long;
   public static double goto;
   public static double else;
   public c3 char;
   public y6 case;
   public aig byte;
   public float try;
   public float new;
   public double int;
   public double for;
   public double do;

   private az() {
      this.if.put(n7.class, new a2());
      this.if.put(oa.class, new a4());
      this.if.put(nx.class, new a3());
      this.if.put(om.class, new a7());
      this.if.put(of.class, new a5());
      this.if.put(og.class, new a6());
      this.if.put(n5.class, new a0());
      this.if.put(oo.class, new a8());
      this.if.put(n6.class, new a1());
      Iterator var1 = this.if.values().iterator();

      while(var1.hasNext()) {
         ay var2 = (ay)var1.next();
         var2.a(this);
      }

   }

   public ay a(Class var1) {
      ay var2 = (ay)this.if.get(var1);
      if (var2 == null && var1 != n4.class) {
         var2 = this.a(var1.getSuperclass());
         this.if.put(var1, var2);
      }

      return var2;
   }

   public boolean if(n4 var1) {
      return this.a(var1) != null;
   }

   public ay a(n4 var1) {
      return var1 == null ? null : this.a(var1.getClass());
   }

   public void a(y6 var1, c3 var2, jq var3, aig var4, float var5) {
      if (this.case != var1) {
         this.a(var1);
      }

      this.char = var2;
      this.byte = var4;
      this.a = var3;
      this.try = var4.a2 + (var4.a5 - var4.a2) * var5;
      this.new = var4.a0 + (var4.a4 - var4.a0) * var5;
      this.int = var4.aJ + (var4.al - var4.aJ) * (double)var5;
      this.for = var4.aI + (var4.ak - var4.aI) * (double)var5;
      this.do = var4.aH + (var4.aj - var4.aH) * (double)var5;
   }

   public void a(n4 var1, float var2) {
      if (var1.a(this.int, this.for, this.do) < var1.int()) {
         int var3 = this.case.do(var1.new, var1.int, var1.for, 0);
         int var4 = var3 % 65536;
         int var5 = var3 / 65536;
         q.a(q.a, (float)var4 / 1.0F, (float)var5 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a(var1, (double)var1.new - long, (double)var1.int - goto, (double)var1.for - else, var2);
      }

   }

   public void a(n4 var1, double var2, double var4, double var6, float var8) {
      ay var9 = this.a(var1);
      if (var9 != null) {
         try {
            var9.a(var1, var2, var4, var6, var8);
         } catch (Throwable var13) {
            aqh var11 = aqh.a(var13, "Rendering Tile Entity");
            apu var12 = var11.a("Tile Entity Details");
            var1.a(var12);
            throw new ape(var11);
         }
      }

   }

   public void a(y6 var1) {
      this.case = var1;
      Iterator var2 = this.if.values().iterator();

      while(var2.hasNext()) {
         ay var3 = (ay)var2.next();
         if (var3 != null) {
            var3.a(var1);
         }
      }

   }

   public jq a() {
      return this.a;
   }
}
