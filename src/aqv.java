import java.io.DataInput;
import java.io.DataOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

public class aqv extends aqd {
   private Map goto = new HashMap();

   public aqv() {
      super("");
   }

   public aqv(String var1) {
      super(var1);
   }

   void a(DataOutput var1) {
      Iterator var2 = this.goto.values().iterator();

      while(var2.hasNext()) {
         aqd var3 = (aqd)var2.next();
         aqd.a(var3, var1);
      }

      var1.writeByte(0);
   }

   void if(DataInput var1) {
      this.goto.clear();

      aqd var2;
      while((var2 = aqd.a(var1)).a() != 0) {
         this.goto.put(var2.if(), var2);
      }

   }

   public Collection new() {
      return this.goto.values();
   }

   public byte a() {
      return 10;
   }

   public void a(String var1, aqd var2) {
      this.goto.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.goto.put(var1, new aqw(var1, var2));
   }

   public void a(String var1, short var2) {
      this.goto.put(var1, new aqi(var1, var2));
   }

   public void a(String var1, int var2) {
      this.goto.put(var1, new aqo(var1, var2));
   }

   public void a(String var1, long var2) {
      this.goto.put(var1, new aql(var1, var2));
   }

   public void a(String var1, float var2) {
      this.goto.put(var1, new aqq(var1, var2));
   }

   public void a(String var1, double var2) {
      this.goto.put(var1, new aqs(var1, var2));
   }

   public void a(String var1, String var2) {
      this.goto.put(var1, new aqf(var1, var2));
   }

   public void a(String var1, byte[] var2) {
      this.goto.put(var1, new aqx(var1, var2));
   }

   public void a(String var1, int[] var2) {
      this.goto.put(var1, new aqp(var1, var2));
   }

   public void a(String var1, aqv var2) {
      this.goto.put(var1, var2.a((String)var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2 ? 1 : 0));
   }

   public aqd byte(String var1) {
      return (aqd)this.goto.get(var1);
   }

   public boolean try(String var1) {
      return this.goto.containsKey(var1);
   }

   public byte else(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0 : ((aqw)this.goto.get(var1)).long;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 1, var3));
      }
   }

   public short case(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0 : ((aqi)this.goto.get(var1)).for;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 2, var3));
      }
   }

   public int goto(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0 : ((aqo)this.goto.get(var1)).byte;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 3, var3));
      }
   }

   public long long(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0L : ((aql)this.goto.get(var1)).int;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 4, var3));
      }
   }

   public float b(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0.0F : ((aqq)this.goto.get(var1)).char;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 5, var3));
      }
   }

   public double c(String var1) {
      try {
         return !this.goto.containsKey(var1) ? 0.0D : ((aqs)this.goto.get(var1)).else;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 6, var3));
      }
   }

   public String new(String var1) {
      try {
         return !this.goto.containsKey(var1) ? "" : ((aqf)this.goto.get(var1)).do;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 8, var3));
      }
   }

   public byte[] int(String var1) {
      try {
         return !this.goto.containsKey(var1) ? new byte[0] : ((aqx)this.goto.get(var1)).void;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 7, var3));
      }
   }

   public int[] for(String var1) {
      try {
         return !this.goto.containsKey(var1) ? new int[0] : ((aqp)this.goto.get(var1)).case;
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 11, var3));
      }
   }

   public aqv char(String var1) {
      try {
         return !this.goto.containsKey(var1) ? new aqv(var1) : (aqv)this.goto.get(var1);
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 10, var3));
      }
   }

   public aqm void(String var1) {
      try {
         return !this.goto.containsKey(var1) ? new aqm(var1) : (aqm)this.goto.get(var1);
      } catch (ClassCastException var3) {
         throw new ape(this.a(var1, 9, var3));
      }
   }

   public boolean if(String var1) {
      return this.else(var1) != 0;
   }

   public void do(String var1) {
      this.goto.remove(var1);
   }

   public String toString() {
      String var1 = this.if() + ":[";

      String var3;
      for(Iterator var2 = this.goto.keySet().iterator(); var2.hasNext(); var1 = var1 + var3 + ":" + this.goto.get(var3) + ",") {
         var3 = (String)var2.next();
      }

      return var1 + "]";
   }

   public boolean int() {
      return this.goto.isEmpty();
   }

   private aqh a(String var1, int var2, ClassCastException var3) {
      aqh var4 = aqh.a((Throwable)var3, (String)"Reading NBT data");
      apu var5 = var4.a("Corrupt NBT tag", 1);
      var5.a((String)"Tag type found", (Callable)(new aqu(this, var1)));
      var5.a((String)"Tag type expected", (Callable)(new aqt(this, var2)));
      var5.a((String)"Tag name", (Object)var1);
      if (this.if() != null && this.if().length() > 0) {
         var5.a((String)"Tag parent", (Object)this.if());
      }

      return var4;
   }

   public aqd do() {
      aqv var1 = new aqv(this.if());
      Iterator var2 = this.goto.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.a(var3, ((aqd)this.goto.get(var3)).do());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqv var2 = (aqv)var1;
         return this.goto.entrySet().equals(var2.goto.entrySet());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.goto.hashCode();
   }

   // $FF: synthetic method
   static Map a(aqv var0) {
      return var0.goto;
   }
}
