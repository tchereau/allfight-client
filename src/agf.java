import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class agf {
   private y6 goto;
   private final List else = new ArrayList();
   private final apg char = new apg(0, 0, 0);
   private final apg case = new apg(0, 0, 0);
   private int byte = 0;
   private int try = 0;
   private int new = 0;
   private int int = 0;
   private int for;
   private TreeMap do = new TreeMap();
   private List if = new ArrayList();
   private int a = 0;

   public agf() {
   }

   public agf(y6 var1) {
      this.goto = var1;
   }

   public void a(y6 var1) {
      this.goto = var1;
   }

   public void a(int var1) {
      this.new = var1;
      this.byte();
      this.new();
      if (var1 % 20 == 0) {
         this.do();
      }

      if (var1 % 30 == 0) {
         this.a();
      }

      int var2 = this.int / 10;
      if (this.a < var2 && this.else.size() > 20 && this.goto.o.nextInt(7000) == 0) {
         nr var3 = this.a(ajs.new((float)this.case.if), ajs.new((float)this.case.a), ajs.new((float)this.case.do), 2, 4, 2);
         if (var3 != null) {
            afy var4 = new afy(this.goto);
            var4.try(var3.int, var3.for, var3.do);
            this.goto.new(var4);
            ++this.a;
         }
      }

   }

   private nr a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 10; ++var7) {
         int var8 = var1 + this.goto.o.nextInt(16) - 8;
         int var9 = var2 + this.goto.o.nextInt(6) - 3;
         int var10 = var3 + this.goto.o.nextInt(16) - 8;
         if (this.a(var8, var9, var10) && this.if(var8, var9, var10, var4, var5, var6)) {
            return this.goto.do().a((double)var8, (double)var9, (double)var10);
         }
      }

      return null;
   }

   private boolean if(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (!this.goto.case(var1, var2 - 1, var3)) {
         return false;
      } else {
         int var7 = var1 - var4 / 2;
         int var8 = var3 - var6 / 2;

         for(int var9 = var7; var9 < var7 + var4; ++var9) {
            for(int var10 = var2; var10 < var2 + var5; ++var10) {
               for(int var11 = var8; var11 < var8 + var6; ++var11) {
                  if (this.goto.try(var9, var10, var11)) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void a() {
      List var1 = this.goto.a(afy.class, nw.if().a((double)(this.case.if - this.byte), (double)(this.case.a - 4), (double)(this.case.do - this.byte), (double)(this.case.if + this.byte), (double)(this.case.a + 4), (double)(this.case.do + this.byte)));
      this.a = var1.size();
   }

   private void do() {
      List var1 = this.goto.a(aep.class, nw.if().a((double)(this.case.if - this.byte), (double)(this.case.a - 4), (double)(this.case.do - this.byte), (double)(this.case.if + this.byte), (double)(this.case.a + 4), (double)(this.case.do + this.byte)));
      this.int = var1.size();
      if (this.int == 0) {
         this.do.clear();
      }

   }

   public apg void() {
      return this.case;
   }

   public int if() {
      return this.byte;
   }

   public int int() {
      return this.else.size();
   }

   public int try() {
      return this.new - this.try;
   }

   public int char() {
      return this.int;
   }

   public boolean a(int var1, int var2, int var3) {
      return this.case.if(var1, var2, var3) < (float)(this.byte * this.byte);
   }

   public List for() {
      return this.else;
   }

   public agg if(int var1, int var2, int var3) {
      agg var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.else.iterator();

      while(var6.hasNext()) {
         agg var7 = (agg)var6.next();
         int var8 = var7.a(var1, var2, var3);
         if (var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public agg for(int var1, int var2, int var3) {
      agg var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.else.iterator();

      while(var6.hasNext()) {
         agg var7 = (agg)var6.next();
         int var8 = var7.a(var1, var2, var3);
         if (var8 > 256) {
            var8 *= 1000;
         } else {
            var8 = var7.for();
         }

         if (var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public agg do(int var1, int var2, int var3) {
      if (this.case.if(var1, var2, var3) > (float)(this.byte * this.byte)) {
         return null;
      } else {
         Iterator var4 = this.else.iterator();

         agg var5;
         do {
            if (!var4.hasNext()) {
               return null;
            }

            var5 = (agg)var4.next();
         } while(var5.if != var1 || var5.byte != var3 || Math.abs(var5.a - var2) > 1);

         return var5;
      }
   }

   public void a(agg var1) {
      this.else.add(var1);
      apg var10000 = this.char;
      var10000.if += var1.if;
      var10000 = this.char;
      var10000.a += var1.a;
      var10000 = this.char;
      var10000.do += var1.byte;
      this.else();
      this.try = var1.int;
   }

   public boolean case() {
      return this.else.isEmpty();
   }

   public void do(aig var1) {
      Iterator var2 = this.if.iterator();

      age var3;
      do {
         if (!var2.hasNext()) {
            this.if.add(new age(this, var1, this.new));
            return;
         }

         var3 = (age)var2.next();
      } while(var3.if != var1);

      var3.a = this.new;
   }

   public aig a(aig var1) {
      double var2 = Double.MAX_VALUE;
      age var4 = null;

      for(int var5 = 0; var5 < this.if.size(); ++var5) {
         age var6 = (age)this.if.get(var5);
         double var7 = var6.if.for((aiw)var1);
         if (!(var7 > var2)) {
            var4 = var6;
            var2 = var7;
         }
      }

      return var4 != null ? var4.if : null;
   }

   public aek if(aig var1) {
      double var2 = Double.MAX_VALUE;
      aek var4 = null;
      Iterator var5 = this.do.keySet().iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if (this.if(var6)) {
            aek var7 = this.goto.if(var6);
            if (var7 != null) {
               double var8 = var7.for(var1);
               if (!(var8 > var2)) {
                  var4 = var7;
                  var2 = var8;
               }
            }
         }
      }

      return var4;
   }

   private void new() {
      Iterator var1 = this.if.iterator();

      while(true) {
         age var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (age)var1.next();
         } while(var2.if.aA() && Math.abs(this.new - var2.a) <= 300);

         var1.remove();
      }
   }

   private void byte() {
      boolean var1 = false;
      boolean var2 = this.goto.o.nextInt(50) == 0;
      Iterator var3 = this.else.iterator();

      while(true) {
         agg var4;
         do {
            if (!var3.hasNext()) {
               if (var1) {
                  this.else();
               }

               return;
            }

            var4 = (agg)var3.next();
            if (var2) {
               var4.do();
            }
         } while(this.int(var4.if, var4.a, var4.byte) && Math.abs(this.new - var4.int) <= 1200);

         apg var10000 = this.char;
         var10000.if -= var4.if;
         var10000 = this.char;
         var10000.a -= var4.a;
         var10000 = this.char;
         var10000.do -= var4.byte;
         var1 = true;
         var4.for = true;
         var3.remove();
      }
   }

   private boolean int(int var1, int var2, int var3) {
      int var4 = this.goto.new(var1, var2, var3);
      if (var4 <= 0) {
         return false;
      } else {
         return var4 == pa.co.void;
      }
   }

   private void else() {
      int var1 = this.else.size();
      if (var1 == 0) {
         this.case.a(0, 0, 0);
         this.byte = 0;
      } else {
         this.case.a(this.char.if / var1, this.char.a / var1, this.char.do / var1);
         int var2 = 0;

         agg var4;
         for(Iterator var3 = this.else.iterator(); var3.hasNext(); var2 = Math.max(var4.a(this.case.if, this.case.a, this.case.do), var2)) {
            var4 = (agg)var3.next();
         }

         this.byte = Math.max(32, (int)Math.sqrt((double)var2) + 1);
      }
   }

   public int a(String var1) {
      Integer var2 = (Integer)this.do.get(var1);
      return var2 != null ? var2 : 0;
   }

   public int a(String var1, int var2) {
      int var3 = this.a(var1);
      int var4 = ajs.a(var3 + var2, -30, 10);
      this.do.put(var1, var4);
      return var4;
   }

   public boolean if(String var1) {
      return this.a(var1) <= -15;
   }

   public void a(aqv var1) {
      this.int = var1.goto("PopSize");
      this.byte = var1.goto("Radius");
      this.a = var1.goto("Golems");
      this.try = var1.goto("Stable");
      this.new = var1.goto("Tick");
      this.for = var1.goto("MTick");
      this.case.if = var1.goto("CX");
      this.case.a = var1.goto("CY");
      this.case.do = var1.goto("CZ");
      this.char.if = var1.goto("ACX");
      this.char.a = var1.goto("ACY");
      this.char.do = var1.goto("ACZ");
      aqm var2 = var1.void("Doors");

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         agg var5 = new agg(var4.goto("X"), var4.goto("Y"), var4.goto("Z"), var4.goto("IDX"), var4.goto("IDZ"), var4.goto("TS"));
         this.else.add(var5);
      }

      aqm var6 = var1.void("Players");

      for(int var7 = 0; var7 < var6.for(); ++var7) {
         aqv var8 = (aqv)var6.a(var7);
         this.do.put(var8.new("Name"), var8.goto("S"));
      }

   }

   public void if(aqv var1) {
      var1.a("PopSize", this.int);
      var1.a("Radius", this.byte);
      var1.a("Golems", this.a);
      var1.a("Stable", this.try);
      var1.a("Tick", this.new);
      var1.a("MTick", this.for);
      var1.a("CX", this.case.if);
      var1.a("CY", this.case.a);
      var1.a("CZ", this.case.do);
      var1.a("ACX", this.char.if);
      var1.a("ACY", this.char.a);
      var1.a("ACZ", this.char.do);
      aqm var2 = new aqm("Doors");
      Iterator var3 = this.else.iterator();

      while(var3.hasNext()) {
         agg var4 = (agg)var3.next();
         aqv var5 = new aqv("Door");
         var5.a("X", var4.if);
         var5.a("Y", var4.a);
         var5.a("Z", var4.byte);
         var5.a("IDX", var4.try);
         var5.a("IDZ", var4.new);
         var5.a("TS", var4.int);
         var2.a((aqd)var5);
      }

      var1.a("Doors", (aqd)var2);
      aqm var8 = new aqm("Players");
      Iterator var9 = this.do.keySet().iterator();

      while(var9.hasNext()) {
         String var7 = (String)var9.next();
         aqv var6 = new aqv(var7);
         var6.a("Name", var7);
         var6.a("S", (Integer)this.do.get(var7));
         var8.a((aqd)var6);
      }

      var1.a("Players", (aqd)var8);
   }

   public void goto() {
      this.for = this.new;
   }

   public boolean long() {
      return this.for == 0 || this.new - this.for >= 3600;
   }

   public void if(int var1) {
      Iterator var2 = this.do.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.a(var3, var1);
      }

   }
}
