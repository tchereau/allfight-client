import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public abstract class y6 implements yy {
   public boolean D = false;
   public List C = new ArrayList();
   protected List B = new ArrayList();
   public List A = new ArrayList();
   private List G = new ArrayList();
   private List F = new ArrayList();
   public List z = new ArrayList();
   public List y = new ArrayList();
   private long E = 16777215L;
   public int x = 0;
   protected int w = (new Random()).nextInt();
   protected final int v = 1013904223;
   protected float u;
   protected float t;
   protected float s;
   protected float r;
   public int q = 0;
   public int p;
   public Random o = new Random();
   public final xl n;
   protected List m = new ArrayList();
   protected x0 l;
   protected final si k;
   protected ss j;
   public boolean i;
   public sc h;
   public final agc g;
   protected final agd f = new agd(this);
   public final ajq e;
   private final nq else = new nq(300, 2000);
   private final Calendar char = Calendar.getInstance();
   protected nl d = new nl();
   private final ajw case;
   private ArrayList byte = new ArrayList();
   private boolean try;
   protected boolean c = true;
   protected boolean b = true;
   protected Set void = new HashSet();
   private int new;
   int[] long;
   public boolean goto;

   public yn a(int var1, int var2) {
      if (this.p(var1, 0, var2)) {
         xx var3 = this.try(var1, var2);
         if (var3 != null) {
            return var3.a(var1 & 15, var2 & 15, this.n.new);
         }
      }

      return this.n.new.a(var1, var2);
   }

   public yi void() {
      return this.n.new;
   }

   public y6(si var1, String var2, xl var3, y0 var4, ajq var5, ajw var6) {
      this.new = this.o.nextInt(12000);
      this.long = new int['耀'];
      this.goto = false;
      this.k = var1;
      this.e = var5;
      this.j = new ss(var4, var2);
      this.n = var3;
      this.h = new sc(var1);
      this.case = var6;
      agc var7 = (agc)this.h.a(agc.class, "villages");
      if (var7 == null) {
         this.g = new agc(this);
         this.h.a((String)"villages", (s0)this.g);
      } else {
         this.g = var7;
         this.g.a(this);
      }

      var3.a(this);
      this.l = this.s();
      this.c();
      this.try();
   }

   public y6(si var1, String var2, y0 var3, xl var4, ajq var5, ajw var6) {
      this.new = this.o.nextInt(12000);
      this.long = new int['耀'];
      this.goto = false;
      this.k = var1;
      this.e = var5;
      this.h = new sc(var1);
      this.case = var6;
      this.j = var1.int();
      if (var4 != null) {
         this.n = var4;
      } else if (this.j != null && this.j.e() != 0) {
         this.n = xl.a(this.j.e());
      } else {
         this.n = xl.a(0);
      }

      if (this.j == null) {
         this.j = new ss(var3, var2);
      } else {
         this.j.a(var2);
      }

      this.n.a(this);
      this.l = this.s();
      if (!this.j.i()) {
         try {
            this.a(var3);
         } catch (Throwable var11) {
            aqh var8 = aqh.a(var11, "Exception initializing level");

            try {
               this.a(var8);
            } catch (Throwable var10) {
            }

            throw new ape(var8);
         }

         this.j.if(true);
      }

      agc var7 = (agc)this.h.a(agc.class, "villages");
      if (var7 == null) {
         this.g = new agc(this);
         this.h.a((String)"villages", (s0)this.g);
      } else {
         this.g = var7;
         this.g.a(this);
      }

      this.c();
      this.try();
   }

   protected abstract x0 s();

   protected void a(y0 var1) {
      this.j.if(true);
   }

   public void else() {
      this.c(8, 64, 8);
   }

   public int if(int var1, int var2) {
      int var3;
      for(var3 = 63; !this.a(var1, var3 + 1, var2); ++var3) {
      }

      return this.new(var1, var3, var2);
   }

   public int new(int var1, int var2, int var3) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return 0;
         } else if (var2 >= 256) {
            return 0;
         } else {
            xx var4 = null;

            try {
               var4 = this.byte(var1 >> 4, var3 >> 4);
               return var4.int(var1 & 15, var2, var3 & 15);
            } catch (Throwable var8) {
               aqh var6 = aqh.a(var8, "Exception getting block type in world");
               apu var7 = var6.a("Requested block coordinates");
               var7.a((String)"Found chunk", (Object)(var4 == null));
               var7.a((String)"Location", (Object)apu.a(var1, var2, var3));
               throw new ape(var6);
            }
         }
      } else {
         return 0;
      }
   }

   public boolean a(int var1, int var2, int var3) {
      return this.new(var1, var2, var3) == 0;
   }

   public boolean r(int var1, int var2, int var3) {
      int var4 = this.new(var1, var2, var3);
      return pa.x[var4] != null && pa.x[var4].h();
   }

   public int q(int var1, int var2, int var3) {
      int var4 = this.new(var1, var2, var3);
      return pa.x[var4] != null ? pa.x[var4].new() : -1;
   }

   public boolean p(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 256 ? this.for(var1 >> 4, var3 >> 4) : false;
   }

   public boolean goto(int var1, int var2, int var3, int var4) {
      return this.for(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   public boolean for(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if (!this.for(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean for(int var1, int var2) {
      return this.l.for(var1, var2);
   }

   public xx try(int var1, int var2) {
      return this.byte(var1 >> 4, var2 >> 4);
   }

   public xx byte(int var1, int var2) {
      return this.l.do(var1, var2);
   }

   public boolean int(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return false;
         } else if (var2 >= 256) {
            return false;
         } else {
            xx var7 = this.byte(var1 >> 4, var3 >> 4);
            int var8 = 0;
            if ((var6 & 1) != 0) {
               var8 = var7.int(var1 & 15, var2, var3 & 15);
            }

            boolean var9 = var7.a(var1 & 15, var2, var3 & 15, var4, var5);
            this.e.a("checkLight");
            this.k(var1, var2, var3);
            this.e.if();
            if (var9) {
               if ((var6 & 2) != 0 && (!this.goto || (var6 & 4) == 0)) {
                  this.n(var1, var2, var3);
               }

               if (!this.goto && (var6 & 1) != 0) {
                  this.byte(var1, var2, var3, var8);
                  pa var10 = pa.x[var4];
                  if (var10 != null && var10.k()) {
                     this.new(var1, var2, var3, var4);
                  }
               }
            }

            return var9;
         }
      } else {
         return false;
      }
   }

   public ts byte(int var1, int var2, int var3) {
      int var4 = this.new(var1, var2, var3);
      return var4 == 0 ? ts.z : pa.x[var4].at;
   }

   public int for(int var1, int var2, int var3) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return 0;
         } else if (var2 >= 256) {
            return 0;
         } else {
            xx var4 = this.byte(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.new(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public boolean do(int var1, int var2, int var3, int var4, int var5) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var2 < 0) {
            return false;
         } else if (var2 >= 256) {
            return false;
         } else {
            xx var6 = this.byte(var1 >> 4, var3 >> 4);
            int var7 = var1 & 15;
            int var8 = var3 & 15;
            boolean var9 = var6.a(var7, var2, var8, var4);
            if (var9) {
               int var10 = var6.int(var7, var2, var8);
               if ((var5 & 2) != 0 && (!this.goto || (var5 & 4) == 0)) {
                  this.n(var1, var2, var3);
               }

               if (!this.goto && (var5 & 1) != 0) {
                  this.byte(var1, var2, var3, var10);
                  pa var11 = pa.x[var10];
                  if (var11 != null && var11.k()) {
                     this.new(var1, var2, var3, var10);
                  }
               }
            }

            return var9;
         }
      } else {
         return false;
      }
   }

   public boolean o(int var1, int var2, int var3) {
      return this.int(var1, var2, var3, 0, 0, 3);
   }

   public boolean int(int var1, int var2, int var3, boolean var4) {
      int var5 = this.new(var1, var2, var3);
      if (var5 > 0) {
         int var6 = this.for(var1, var2, var3);
         this.for(2001, var1, var2, var3, var5 + (var6 << 12));
         if (var4) {
            pa.x[var5].a(this, var1, var2, var3, var6, 0);
         }

         return this.int(var1, var2, var3, 0, 0, 3);
      } else {
         return false;
      }
   }

   public boolean int(int var1, int var2, int var3, int var4) {
      return this.int(var1, var2, var3, var4, 0, 3);
   }

   public void n(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         ((y1)this.m.get(var4)).a(var1, var2, var3);
      }

   }

   public void byte(int var1, int var2, int var3, int var4) {
      this.for(var1, var2, var3, var4);
   }

   public void else(int var1, int var2, int var3, int var4) {
      int var5;
      if (var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if (!this.n.for) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.int(yw.if, var1, var5, var2);
         }
      }

      this.new(var1, var3, var2, var1, var4, var2);
   }

   public void new(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.m.size(); ++var7) {
         ((y1)this.m.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void for(int var1, int var2, int var3, int var4) {
      this.try(var1 - 1, var2, var3, var4);
      this.try(var1 + 1, var2, var3, var4);
      this.try(var1, var2 - 1, var3, var4);
      this.try(var1, var2 + 1, var3, var4);
      this.try(var1, var2, var3 - 1, var4);
      this.try(var1, var2, var3 + 1, var4);
   }

   public void int(int var1, int var2, int var3, int var4, int var5) {
      if (var5 != 4) {
         this.try(var1 - 1, var2, var3, var4);
      }

      if (var5 != 5) {
         this.try(var1 + 1, var2, var3, var4);
      }

      if (var5 != 0) {
         this.try(var1, var2 - 1, var3, var4);
      }

      if (var5 != 1) {
         this.try(var1, var2 + 1, var3, var4);
      }

      if (var5 != 2) {
         this.try(var1, var2, var3 - 1, var4);
      }

      if (var5 != 3) {
         this.try(var1, var2, var3 + 1, var4);
      }

   }

   public void try(int var1, int var2, int var3, int var4) {
      if (!this.goto) {
         int var5 = this.new(var1, var2, var3);
         pa var6 = pa.x[var5];
         if (var6 != null) {
            try {
               var6.new(this, var1, var2, var3, var4);
            } catch (Throwable var13) {
               aqh var8 = aqh.a(var13, "Exception while updating neighbours");
               apu var9 = var8.a("Block being updated");

               int var10;
               try {
                  var10 = this.for(var1, var2, var3);
               } catch (Throwable var12) {
                  var10 = -1;
               }

               var9.a((String)"Source block type", (Callable)(new y5(this, var4)));
               apu.a(var9, var1, var2, var3, var5, var10);
               throw new ape(var8);
            }
         }
      }

   }

   public boolean case(int var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean j(int var1, int var2, int var3) {
      return this.byte(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15);
   }

   public int m(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      } else {
         if (var2 >= 256) {
            var2 = 255;
         }

         return this.byte(var1 >> 4, var3 >> 4).do(var1 & 15, var2, var3 & 15, 0);
      }
   }

   public int h(int var1, int var2, int var3) {
      return this.if(var1, var2, var3, true);
   }

   public int if(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if (var4) {
            int var5 = this.new(var1, var2, var3);
            if (pa.m[var5]) {
               int var6 = this.if(var1, var2 + 1, var3, false);
               int var7 = this.if(var1 + 1, var2, var3, false);
               int var8 = this.if(var1 - 1, var2, var3, false);
               int var9 = this.if(var1, var2, var3 + 1, false);
               int var10 = this.if(var1, var2, var3 - 1, false);
               if (var7 > var6) {
                  var6 = var7;
               }

               if (var8 > var6) {
                  var6 = var8;
               }

               if (var9 > var6) {
                  var6 = var9;
               }

               if (var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if (var2 < 0) {
            return 0;
         } else {
            if (var2 >= 256) {
               var2 = 255;
            }

            xx var11 = this.byte(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.do(var1, var2, var3, this.x);
         }
      } else {
         return 15;
      }
   }

   public int do(int var1, int var2) {
      if (var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if (!this.for(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            xx var3 = this.byte(var1 >> 4, var2 >> 4);
            return var3.int(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public int int(int var1, int var2) {
      if (var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if (!this.for(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            xx var3 = this.byte(var1 >> 4, var2 >> 4);
            return var3.new;
         }
      } else {
         return 0;
      }
   }

   public int do(yw var1, int var2, int var3, int var4) {
      if (this.n.for && var1 == yw.if) {
         return 0;
      } else {
         if (var3 < 0) {
            var3 = 0;
         }

         if (var3 >= 256) {
            return var1.for;
         } else if (var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
            int var5 = var2 >> 4;
            int var6 = var4 >> 4;
            if (!this.for(var5, var6)) {
               return var1.for;
            } else if (pa.m[this.new(var2, var3, var4)]) {
               int var12 = this.for(var1, var2, var3 + 1, var4);
               int var8 = this.for(var1, var2 + 1, var3, var4);
               int var9 = this.for(var1, var2 - 1, var3, var4);
               int var10 = this.for(var1, var2, var3, var4 + 1);
               int var11 = this.for(var1, var2, var3, var4 - 1);
               if (var8 > var12) {
                  var12 = var8;
               }

               if (var9 > var12) {
                  var12 = var9;
               }

               if (var10 > var12) {
                  var12 = var10;
               }

               if (var11 > var12) {
                  var12 = var11;
               }

               return var12;
            } else {
               xx var7 = this.byte(var5, var6);
               return var7.a(var1, var2 & 15, var3, var4 & 15);
            }
         } else {
            return var1.for;
         }
      }
   }

   public int for(yw var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 >= 256) {
         var3 = 255;
      }

      if (var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if (!this.for(var5, var6)) {
            return var1.for;
         } else {
            xx var7 = this.byte(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.for;
      }
   }

   public void a(yw var1, int var2, int var3, int var4, int var5) {
      if (var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000 && var3 >= 0 && var3 < 256 && this.for(var2 >> 4, var4 >> 4)) {
         xx var6 = this.byte(var2 >> 4, var4 >> 4);
         var6.a(var1, var2 & 15, var3, var4 & 15, var5);

         for(int var7 = 0; var7 < this.m.size(); ++var7) {
            ((y1)this.m.get(var7)).if(var2, var3, var4);
         }
      }

   }

   public void g(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.m.size(); ++var4) {
         ((y1)this.m.get(var4)).if(var1, var2, var3);
      }

   }

   public int do(int var1, int var2, int var3, int var4) {
      int var5 = this.do(yw.if, var1, var2, var3);
      int var6 = this.do(yw.a, var1, var2, var3);
      if (var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float if(int var1, int var2, int var3, int var4) {
      int var5 = this.h(var1, var2, var3);
      if (var5 < var4) {
         var5 = var4;
      }

      return this.n.do[var5];
   }

   public float int(int var1, int var2, int var3) {
      return this.n.do[this.h(var1, var2, var3)];
   }

   public boolean j() {
      return this.x < 4;
   }

   public nt a(nr var1, nr var2) {
      return this.a(var1, var2, false, false);
   }

   public nt a(nr var1, nr var2, boolean var3) {
      return this.a(var1, var2, var3, false);
   }

   public nt a(nr var1, nr var2, boolean var3, boolean var4) {
      if (!Double.isNaN(var1.int) && !Double.isNaN(var1.for) && !Double.isNaN(var1.do)) {
         if (!Double.isNaN(var2.int) && !Double.isNaN(var2.for) && !Double.isNaN(var2.do)) {
            int var5 = ajs.a(var2.int);
            int var6 = ajs.a(var2.for);
            int var7 = ajs.a(var2.do);
            int var8 = ajs.a(var1.int);
            int var9 = ajs.a(var1.for);
            int var10 = ajs.a(var1.do);
            int var11 = this.new(var8, var9, var10);
            int var12 = this.for(var8, var9, var10);
            pa var13 = pa.x[var11];
            if ((!var4 || var13 == null || var13.int(this, var8, var9, var10) != null) && var11 > 0 && var13.a(var12, var3)) {
               nt var14 = var13.a(this, var8, var9, var10, var1, var2);
               if (var14 != null) {
                  return var14;
               }
            }

            var11 = 200;

            while(var11-- >= 0) {
               if (Double.isNaN(var1.int) || Double.isNaN(var1.for) || Double.isNaN(var1.do)) {
                  return null;
               }

               if (var8 == var5 && var9 == var6 && var10 == var7) {
                  return null;
               }

               boolean var42 = true;
               boolean var15 = true;
               boolean var16 = true;
               double var17 = 999.0D;
               double var19 = 999.0D;
               double var21 = 999.0D;
               if (var5 > var8) {
                  var17 = (double)var8 + 1.0D;
               } else if (var5 < var8) {
                  var17 = (double)var8 + 0.0D;
               } else {
                  var42 = false;
               }

               if (var6 > var9) {
                  var19 = (double)var9 + 1.0D;
               } else if (var6 < var9) {
                  var19 = (double)var9 + 0.0D;
               } else {
                  var15 = false;
               }

               if (var7 > var10) {
                  var21 = (double)var10 + 1.0D;
               } else if (var7 < var10) {
                  var21 = (double)var10 + 0.0D;
               } else {
                  var16 = false;
               }

               double var23 = 999.0D;
               double var25 = 999.0D;
               double var27 = 999.0D;
               double var29 = var2.int - var1.int;
               double var31 = var2.for - var1.for;
               double var33 = var2.do - var1.do;
               if (var42) {
                  var23 = (var17 - var1.int) / var29;
               }

               if (var15) {
                  var25 = (var19 - var1.for) / var31;
               }

               if (var16) {
                  var27 = (var21 - var1.do) / var33;
               }

               boolean var35 = false;
               byte var36;
               if (var23 < var25 && var23 < var27) {
                  if (var5 > var8) {
                     var36 = 4;
                  } else {
                     var36 = 5;
                  }

                  var1.int = var17;
                  var1.for += var31 * var23;
                  var1.do += var33 * var23;
               } else if (var25 < var27) {
                  if (var6 > var9) {
                     var36 = 0;
                  } else {
                     var36 = 1;
                  }

                  var1.int += var29 * var25;
                  var1.for = var19;
                  var1.do += var33 * var25;
               } else {
                  if (var7 > var10) {
                     var36 = 2;
                  } else {
                     var36 = 3;
                  }

                  var1.int += var29 * var27;
                  var1.for += var31 * var27;
                  var1.do = var21;
               }

               nr var37 = this.do().a(var1.int, var1.for, var1.do);
               var8 = (int)(var37.int = (double)ajs.a(var1.int));
               if (var36 == 5) {
                  --var8;
                  ++var37.int;
               }

               var9 = (int)(var37.for = (double)ajs.a(var1.for));
               if (var36 == 1) {
                  --var9;
                  ++var37.for;
               }

               var10 = (int)(var37.do = (double)ajs.a(var1.do));
               if (var36 == 3) {
                  --var10;
                  ++var37.do;
               }

               int var38 = this.new(var8, var9, var10);
               int var39 = this.for(var8, var9, var10);
               pa var40 = pa.x[var38];
               if ((!var4 || var40 == null || var40.int(this, var8, var9, var10) != null) && var38 > 0 && var40.a(var39, var3)) {
                  nt var41 = var40.a(this, var8, var9, var10, var1, var2);
                  if (var41 != null) {
                     return var41;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(aiw var1, String var2, float var3, float var4) {
      if (var1 != null && var2 != null) {
         for(int var5 = 0; var5 < this.m.size(); ++var5) {
            ((y1)this.m.get(var5)).a(var2, var1.al, var1.ak - (double)var1.aQ, var1.aj, var3, var4);
         }
      }

   }

   public void a(aek var1, String var2, float var3, float var4) {
      if (var1 != null && var2 != null) {
         for(int var5 = 0; var5 < this.m.size(); ++var5) {
            ((y1)this.m.get(var5)).a(var1, var2, var1.al, var1.ak - (double)var1.aQ, var1.aj, var3, var4);
         }
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      if (var7 != null) {
         for(int var10 = 0; var10 < this.m.size(); ++var10) {
            ((y1)this.m.get(var10)).a(var7, var1, var3, var5, var8, var9);
         }
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
   }

   public void if(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.m.size(); ++var5) {
         ((y1)this.m.get(var5)).if(var1, var2, var3, var4);
      }

   }

   public void do(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.m.size(); ++var5) {
         ((y1)this.m.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.m.size(); ++var14) {
         ((y1)this.m.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean for(aiw var1) {
      this.y.add(var1);
      return true;
   }

   public boolean new(aiw var1) {
      int var2 = ajs.a(var1.al / 16.0D);
      int var3 = ajs.a(var1.aj / 16.0D);
      boolean var4 = var1.aq;
      if (var1 instanceof aek) {
         var4 = true;
      }

      if (!var4 && !this.for(var2, var3)) {
         return false;
      } else {
         if (var1 instanceof aek) {
            aek var5 = (aek)var1;
            this.z.add(var5);
            this.o();
         }

         this.byte(var2, var3).if(var1);
         this.C.add(var1);
         this.try(var1);
         return true;
      }
   }

   protected void try(aiw var1) {
      for(int var2 = 0; var2 < this.m.size(); ++var2) {
         ((y1)this.m.get(var2)).if(var1);
      }

   }

   protected void if(aiw var1) {
      for(int var2 = 0; var2 < this.m.size(); ++var2) {
         ((y1)this.m.get(var2)).a(var1);
      }

   }

   public void a(aiw var1) {
      if (var1.as != null) {
         var1.as.int((aiw)null);
      }

      if (var1.ar != null) {
         var1.int((aiw)null);
      }

      var1.az();
      if (var1 instanceof aek) {
         this.z.remove(var1);
         this.o();
      }

   }

   public void do(aiw var1) {
      var1.az();
      if (var1 instanceof aek) {
         this.z.remove(var1);
         this.o();
      }

      int var2 = var1.be;
      int var3 = var1.bc;
      if (var1.bf && this.for(var2, var3)) {
         this.byte(var2, var3).a(var1);
      }

      this.C.remove(var1);
      this.if(var1);
   }

   public void a(y1 var1) {
      this.m.add(var1);
   }

   public void if(y1 var1) {
      this.m.remove(var1);
   }

   public List if(aiw var1, nw var2) {
      this.byte.clear();
      int var3 = ajs.a(var2.if);
      int var4 = ajs.a(var2.new + 1.0D);
      int var5 = ajs.a(var2.a);
      int var6 = ajs.a(var2.int + 1.0D);
      int var7 = ajs.a(var2.try);
      int var8 = ajs.a(var2.for + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if (this.p(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  pa var12 = pa.x[this.new(var9, var11, var10)];
                  if (var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.byte, var1);
                  }
               }
            }
         }
      }

      double var14 = 0.25D;
      List var15 = this.a(var1, var2.do(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         nw var13 = ((aiw)var15.get(var16)).aL();
         if (var13 != null && var13.a(var2)) {
            this.byte.add(var13);
         }

         var13 = var1.case((aiw)var15.get(var16));
         if (var13 != null && var13.a(var2)) {
            this.byte.add(var13);
         }
      }

      return this.byte;
   }

   public List if(nw var1) {
      this.byte.clear();
      int var2 = ajs.a(var1.if);
      int var3 = ajs.a(var1.new + 1.0D);
      int var4 = ajs.a(var1.a);
      int var5 = ajs.a(var1.int + 1.0D);
      int var6 = ajs.a(var1.try);
      int var7 = ajs.a(var1.for + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var6; var9 < var7; ++var9) {
            if (this.p(var8, 64, var9)) {
               for(int var10 = var4 - 1; var10 < var5; ++var10) {
                  pa var11 = pa.x[this.new(var8, var10, var9)];
                  if (var11 != null) {
                     var11.a(this, var8, var10, var9, var1, this.byte, (aiw)null);
                  }
               }
            }
         }
      }

      return this.byte;
   }

   public int a(float var1) {
      float var2 = this.try(var1);
      float var3 = 1.0F - (ajs.for(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.char(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.if(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float case(float var1) {
      float var2 = this.try(var1);
      float var3 = 1.0F - (ajs.for(var2 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.char(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.if(var1) * 5.0F) / 16.0D));
      return var3 * 0.8F + 0.2F;
   }

   public nr a(aiw var1, float var2) {
      float var3 = this.try(var2);
      float var4 = ajs.for(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      int var5 = ajs.a(var1.al);
      int var6 = ajs.a(var1.aj);
      yn var7 = this.a(var5, var6);
      float var8 = var7.int();
      int var9 = var7.a(var8);
      float var10 = (float)(var9 >> 16 & 255) / 255.0F;
      float var11 = (float)(var9 >> 8 & 255) / 255.0F;
      float var12 = (float)(var9 & 255) / 255.0F;
      var10 *= var4;
      var11 *= var4;
      var12 *= var4;
      float var13 = this.char(var2);
      float var14;
      float var15;
      if (var13 > 0.0F) {
         var14 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.6F;
         var15 = 1.0F - var13 * 0.75F;
         var10 = var10 * var15 + var14 * (1.0F - var15);
         var11 = var11 * var15 + var14 * (1.0F - var15);
         var12 = var12 * var15 + var14 * (1.0F - var15);
      }

      var14 = this.if(var2);
      if (var14 > 0.0F) {
         var15 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.2F;
         float var16 = 1.0F - var14 * 0.75F;
         var10 = var10 * var16 + var15 * (1.0F - var16);
         var11 = var11 * var16 + var15 * (1.0F - var16);
         var12 = var12 * var16 + var15 * (1.0F - var16);
      }

      if (this.q > 0) {
         var15 = (float)this.q - var2;
         if (var15 > 1.0F) {
            var15 = 1.0F;
         }

         var15 *= 0.45F;
         var10 = var10 * (1.0F - var15) + 0.8F * var15;
         var11 = var11 * (1.0F - var15) + 0.8F * var15;
         var12 = var12 * (1.0F - var15) + 1.0F * var15;
      }

      return this.do().a((double)var10, (double)var11, (double)var12);
   }

   public float try(float var1) {
      return this.n.a(this.j.else(), var1);
   }

   public int r() {
      return this.n.a(this.j.else());
   }

   public float do(float var1) {
      float var2 = this.try(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   public nr for(float var1) {
      float var2 = this.try(var1);
      float var3 = ajs.for(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.E >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.E >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.E & 255L) / 255.0F;
      float var7 = this.char(var1);
      float var8;
      float var9;
      if (var7 > 0.0F) {
         var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      var8 = this.if(var1);
      if (var8 > 0.0F) {
         var9 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var8 * 0.95F;
         var4 = var4 * var10 + var9 * (1.0F - var10);
         var5 = var5 * var10 + var9 * (1.0F - var10);
         var6 = var6 * var10 + var9 * (1.0F - var10);
      }

      return this.do().a((double)var4, (double)var5, (double)var6);
   }

   public nr byte(float var1) {
      float var2 = this.try(var1);
      return this.n.a(var2, var1);
   }

   public int new(int var1, int var2) {
      return this.try(var1, var2).a(var1 & 15, var2 & 15);
   }

   public int case(int var1, int var2) {
      xx var3 = this.try(var1, var2);
      int var4 = var3.long() + 15;
      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.int(var1, var4, var2);
         if (var5 != 0 && pa.x[var5].at.void() && pa.x[var5].at != ts.q) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public float int(float var1) {
      float var2 = this.try(var1);
      float var3 = 1.0F - (ajs.for(var2 * 3.1415927F * 2.0F) * 2.0F + 0.25F);
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void if(int var1, int var2, int var3, int var4, int var5) {
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void if(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void p() {
      this.e.a("entities");
      this.e.a("global");

      int var1;
      aiw var2;
      aqh var3;
      apu var4;
      for(var1 = 0; var1 < this.y.size(); ++var1) {
         var2 = (aiw)this.y.get(var1);

         try {
            ++var2.bl;
            var2.aC();
         } catch (Throwable var13) {
            var3 = aqh.a(var13, "Ticking entity");
            var4 = var3.a("Entity being ticked");
            if (var2 == null) {
               var4.a((String)"Entity", (Object)"~~NULL~~");
            } else {
               var2.if(var4);
            }

            throw new ape(var3);
         }

         if (var2.aR) {
            this.y.remove(var1--);
         }
      }

      this.e.do("remove");
      this.C.removeAll(this.B);

      int var5;
      int var6;
      for(var1 = 0; var1 < this.B.size(); ++var1) {
         var2 = (aiw)this.B.get(var1);
         var5 = var2.be;
         var6 = var2.bc;
         if (var2.bf && this.for(var5, var6)) {
            this.byte(var5, var6).a(var2);
         }
      }

      for(var1 = 0; var1 < this.B.size(); ++var1) {
         this.if((aiw)this.B.get(var1));
      }

      this.B.clear();
      this.e.do("regular");

      for(var1 = 0; var1 < this.C.size(); ++var1) {
         var2 = (aiw)this.C.get(var1);
         if (var2.ar != null) {
            if (!var2.ar.aR && var2.ar.as == var2) {
               continue;
            }

            var2.ar.as = null;
            var2.ar = null;
         }

         this.e.a("tick");
         if (!var2.aR) {
            try {
               this.int(var2);
            } catch (Throwable var12) {
               var3 = aqh.a(var12, "Ticking entity");
               var4 = var3.a("Entity being ticked");
               var2.if(var4);
               throw new ape(var3);
            }
         }

         this.e.if();
         this.e.a("remove");
         if (var2.aR) {
            var5 = var2.be;
            var6 = var2.bc;
            if (var2.bf && this.for(var5, var6)) {
               this.byte(var5, var6).a(var2);
            }

            this.C.remove(var1--);
            this.if(var2);
         }

         this.e.if();
      }

      this.e.do("tileEntities");
      this.try = true;
      Iterator var7 = this.A.iterator();

      while(var7.hasNext()) {
         n4 var8 = (n4)var7.next();
         if (!var8.new() && var8.goto() && this.p(var8.new, var8.int, var8.for)) {
            try {
               var8.long();
            } catch (Throwable var11) {
               var3 = aqh.a(var11, "Ticking tile entity");
               var4 = var3.a("Tile entity being ticked");
               var8.a(var4);
               throw new ape(var3);
            }
         }

         if (var8.new()) {
            var7.remove();
            if (this.for(var8.new >> 4, var8.for >> 4)) {
               xx var9 = this.byte(var8.new >> 4, var8.for >> 4);
               if (var9 != null) {
                  var9.if(var8.new & 15, var8.int, var8.for & 15);
               }
            }
         }
      }

      this.try = false;
      if (!this.F.isEmpty()) {
         this.A.removeAll(this.F);
         this.F.clear();
      }

      this.e.do("pendingTileEntities");
      if (!this.G.isEmpty()) {
         for(int var14 = 0; var14 < this.G.size(); ++var14) {
            n4 var15 = (n4)this.G.get(var14);
            if (!var15.new()) {
               if (!this.A.contains(var15)) {
                  this.A.add(var15);
               }

               if (this.for(var15.new >> 4, var15.for >> 4)) {
                  xx var10 = this.byte(var15.new >> 4, var15.for >> 4);
                  if (var10 != null) {
                     var10.a(var15.new & 15, var15.int, var15.for & 15, var15);
                  }
               }

               this.n(var15.new, var15.int, var15.for);
            }
         }

         this.G.clear();
      }

      this.e.if();
      this.e.if();
   }

   public void a(Collection var1) {
      if (this.try) {
         this.G.addAll(var1);
      } else {
         this.A.addAll(var1);
      }

   }

   public void int(aiw var1) {
      this.a(var1, true);
   }

   public void a(aiw var1, boolean var2) {
      int var3 = ajs.a(var1.al);
      int var4 = ajs.a(var1.aj);
      byte var5 = 32;
      if (!var2 || this.for(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5)) {
         var1.aJ = var1.al;
         var1.aI = var1.ak;
         var1.aH = var1.aj;
         var1.a2 = var1.a5;
         var1.a0 = var1.a4;
         if (var2 && var1.bf) {
            if (var1.ar != null) {
               var1.aG();
            } else {
               ++var1.bl;
               var1.aC();
            }
         }

         this.e.a("chunkCheck");
         if (Double.isNaN(var1.al) || Double.isInfinite(var1.al)) {
            var1.al = var1.aJ;
         }

         if (Double.isNaN(var1.ak) || Double.isInfinite(var1.ak)) {
            var1.ak = var1.aI;
         }

         if (Double.isNaN(var1.aj) || Double.isInfinite(var1.aj)) {
            var1.aj = var1.aH;
         }

         if (Double.isNaN((double)var1.a4) || Double.isInfinite((double)var1.a4)) {
            var1.a4 = var1.a0;
         }

         if (Double.isNaN((double)var1.a5) || Double.isInfinite((double)var1.a5)) {
            var1.a5 = var1.a2;
         }

         int var6 = ajs.a(var1.al / 16.0D);
         int var7 = ajs.a(var1.ak / 16.0D);
         int var8 = ajs.a(var1.aj / 16.0D);
         if (!var1.bf || var1.be != var6 || var1.bd != var7 || var1.bc != var8) {
            if (var1.bf && this.for(var1.be, var1.bc)) {
               this.byte(var1.be, var1.bc).a(var1, var1.bd);
            }

            if (this.for(var6, var8)) {
               var1.bf = true;
               this.byte(var6, var8).if(var1);
            } else {
               var1.bf = false;
            }
         }

         this.e.if();
         if (var2 && var1.bf && var1.as != null) {
            if (!var1.as.aR && var1.as.ar == var1) {
               this.int(var1.as);
            } else {
               var1.as.ar = null;
               var1.as = null;
            }
         }
      }

   }

   public boolean int(nw var1) {
      return this.a(var1, (aiw)null);
   }

   public boolean a(nw var1, aiw var2) {
      List var3 = this.a((aiw)null, var1);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         aiw var5 = (aiw)var3.get(var4);
         if (!var5.aR && var5.at && var5 != var2) {
            return false;
         }
      }

      return true;
   }

   public boolean a(nw var1) {
      int var2 = ajs.a(var1.if);
      int var3 = ajs.a(var1.new + 1.0D);
      int var4 = ajs.a(var1.a);
      int var5 = ajs.a(var1.int + 1.0D);
      int var6 = ajs.a(var1.try);
      int var7 = ajs.a(var1.for + 1.0D);
      if (var1.if < 0.0D) {
         --var2;
      }

      if (var1.a < 0.0D) {
         --var4;
      }

      if (var1.try < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               pa var11 = pa.x[this.new(var8, var9, var10)];
               if (var11 != null) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean do(nw var1) {
      int var2 = ajs.a(var1.if);
      int var3 = ajs.a(var1.new + 1.0D);
      int var4 = ajs.a(var1.a);
      int var5 = ajs.a(var1.int + 1.0D);
      int var6 = ajs.a(var1.try);
      int var7 = ajs.a(var1.for + 1.0D);
      if (var1.if < 0.0D) {
         --var2;
      }

      if (var1.a < 0.0D) {
         --var4;
      }

      if (var1.try < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               pa var11 = pa.x[this.new(var8, var9, var10)];
               if (var11 != null && var11.at.case()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean for(nw var1) {
      int var2 = ajs.a(var1.if);
      int var3 = ajs.a(var1.new + 1.0D);
      int var4 = ajs.a(var1.a);
      int var5 = ajs.a(var1.int + 1.0D);
      int var6 = ajs.a(var1.try);
      int var7 = ajs.a(var1.for + 1.0D);
      if (this.for(var2, var4, var6, var3, var5, var7)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  int var11 = this.new(var8, var9, var10);
                  if (var11 == pa.bo.void || var11 == pa.a7.void || var11 == pa.a4.void) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean a(nw var1, ts var2, aiw var3) {
      int var4 = ajs.a(var1.if);
      int var5 = ajs.a(var1.new + 1.0D);
      int var6 = ajs.a(var1.a);
      int var7 = ajs.a(var1.int + 1.0D);
      int var8 = ajs.a(var1.try);
      int var9 = ajs.a(var1.for + 1.0D);
      if (!this.for(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         boolean var10 = false;
         nr var11 = this.do().a(0.0D, 0.0D, 0.0D);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  pa var15 = pa.x[this.new(var12, var13, var14)];
                  if (var15 != null && var15.at == var2) {
                     double var16 = (double)((float)(var13 + 1) - qn.i(this.for(var12, var13, var14)));
                     if ((double)var7 >= var16) {
                        var10 = true;
                        var15.a(this, var12, var13, var14, var3, var11);
                     }
                  }
               }
            }
         }

         if (var11.a() > 0.0D && var3.an()) {
            var11 = var11.if();
            double var18 = 0.014D;
            var3.ai += var11.int * var18;
            var3.ah += var11.for * var18;
            var3.ag += var11.do * var18;
         }

         return var10;
      }
   }

   public boolean if(nw var1, ts var2) {
      int var3 = ajs.a(var1.if);
      int var4 = ajs.a(var1.new + 1.0D);
      int var5 = ajs.a(var1.a);
      int var6 = ajs.a(var1.int + 1.0D);
      int var7 = ajs.a(var1.try);
      int var8 = ajs.a(var1.for + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               pa var12 = pa.x[this.new(var9, var10, var11)];
               if (var12 != null && var12.at == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(nw var1, ts var2) {
      int var3 = ajs.a(var1.if);
      int var4 = ajs.a(var1.new + 1.0D);
      int var5 = ajs.a(var1.a);
      int var6 = ajs.a(var1.int + 1.0D);
      int var7 = ajs.a(var1.try);
      int var8 = ajs.a(var1.for + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               pa var12 = pa.x[this.new(var9, var10, var11)];
               if (var12 != null && var12.at == var2) {
                  int var13 = this.for(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if (var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if (var14 >= var1.a) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public zg a(aiw var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.a(var1, var2, var4, var6, var8, false, var9);
   }

   public zg a(aiw var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      zg var11 = new zg(this, var1, var2, var4, var6, var8);
      var11.goto = var9;
      var11.else = var10;
      var11.if();
      var11.a(true);
      return var11;
   }

   public float a(nr var1, nw var2) {
      double var3 = 1.0D / ((var2.new - var2.if) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.int - var2.a) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.for - var2.try) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.if + (var2.new - var2.if) * (double)var11;
               double var16 = var2.a + (var2.int - var2.a) * (double)var12;
               double var18 = var2.try + (var2.for - var2.try) * (double)var13;
               if (this.a(this.do().a(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public boolean a(aek var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         --var3;
      }

      if (var5 == 1) {
         ++var3;
      }

      if (var5 == 2) {
         --var4;
      }

      if (var5 == 3) {
         ++var4;
      }

      if (var5 == 4) {
         --var2;
      }

      if (var5 == 5) {
         ++var2;
      }

      if (this.new(var2, var3, var4) == pa.bo.void) {
         this.a(var1, 1004, var2, var3, var4, 0);
         this.o(var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public String h() {
      return "All: " + this.C.size();
   }

   public String e() {
      return this.l.a();
   }

   public n4 if(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < 256) {
         n4 var4 = null;
         int var5;
         n4 var6;
         if (this.try) {
            for(var5 = 0; var5 < this.G.size(); ++var5) {
               var6 = (n4)this.G.get(var5);
               if (!var6.new() && var6.new == var1 && var6.int == var2 && var6.for == var3) {
                  var4 = var6;
                  break;
               }
            }
         }

         if (var4 == null) {
            xx var7 = this.byte(var1 >> 4, var3 >> 4);
            if (var7 != null) {
               var4 = var7.byte(var1 & 15, var2, var3 & 15);
            }
         }

         if (var4 == null) {
            for(var5 = 0; var5 < this.G.size(); ++var5) {
               var6 = (n4)this.G.get(var5);
               if (!var6.new() && var6.new == var1 && var6.int == var2 && var6.for == var3) {
                  var4 = var6;
                  break;
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   public void if(int var1, int var2, int var3, n4 var4) {
      if (var4 != null && !var4.new()) {
         if (this.try) {
            var4.new = var1;
            var4.int = var2;
            var4.for = var3;
            Iterator var5 = this.G.iterator();

            while(var5.hasNext()) {
               n4 var6 = (n4)var5.next();
               if (var6.new == var1 && var6.int == var2 && var6.for == var3) {
                  var6.c();
                  var5.remove();
               }
            }

            this.G.add(var4);
         } else {
            this.A.add(var4);
            xx var7 = this.byte(var1 >> 4, var3 >> 4);
            if (var7 != null) {
               var7.a(var1 & 15, var2, var3 & 15, var4);
            }
         }
      }

   }

   public void b(int var1, int var2, int var3) {
      n4 var4 = this.if(var1, var2, var3);
      if (var4 != null && this.try) {
         var4.c();
         this.G.remove(var4);
      } else {
         if (var4 != null) {
            this.G.remove(var4);
            this.A.remove(var4);
         }

         xx var5 = this.byte(var1 >> 4, var3 >> 4);
         if (var5 != null) {
            var5.if(var1 & 15, var2, var3 & 15);
         }
      }

   }

   public void a(n4 var1) {
      this.F.add(var1);
   }

   public boolean do(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      return var4 == null ? false : var4.do();
   }

   public boolean try(int var1, int var2, int var3) {
      return pa.if(this.new(var1, var2, var3));
   }

   public boolean void(int var1, int var2, int var3) {
      int var4 = this.new(var1, var2, var3);
      if (var4 != 0 && pa.x[var4] != null) {
         nw var5 = pa.x[var4].int(this, var1, var2, var3);
         return var5 != null && var5.a() >= 1.0D;
      } else {
         return false;
      }
   }

   public boolean case(int var1, int var2, int var3) {
      pa var4 = pa.x[this.new(var1, var2, var3)];
      return this.a(var4, this.for(var1, var2, var3));
   }

   public boolean a(pa var1, int var2) {
      return var1 == null ? false : (var1.at.goto() && var1.if() ? true : (var1 instanceof pk ? (var2 & 4) == 4 : (var1 instanceof q0 ? (var2 & 8) == 8 : (var1 instanceof qv ? true : (var1 instanceof o4 ? (var2 & 7) == 7 : false)))));
   }

   public boolean do(int var1, int var2, int var3, boolean var4) {
      if (var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         xx var5 = this.l.do(var1 >> 4, var3 >> 4);
         if (var5 != null && !var5.int()) {
            pa var6 = pa.x[this.new(var1, var2, var3)];
            return var6 == null ? false : var6.at.goto() && var6.if();
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void c() {
      int var1 = this.a(1.0F);
      if (var1 != this.x) {
         this.x = var1;
      }

   }

   public void a(boolean var1, boolean var2) {
      this.c = var1;
      this.b = var2;
   }

   public void d() {
      this.v();
   }

   private void try() {
      if (this.j.a()) {
         this.t = 1.0F;
         if (this.j.do()) {
            this.r = 1.0F;
         }
      }

   }

   protected void v() {
      if (!this.n.for) {
         int var1 = this.j.g();
         if (var1 <= 0) {
            if (this.j.do()) {
               this.j.int(this.o.nextInt(12000) + 3600);
            } else {
               this.j.int(this.o.nextInt(168000) + 12000);
            }
         } else {
            --var1;
            this.j.int(var1);
            if (var1 <= 0) {
               this.j.a(!this.j.do());
            }
         }

         int var2 = this.j.long();
         if (var2 <= 0) {
            if (this.j.a()) {
               this.j.do(this.o.nextInt(12000) + 12000);
            } else {
               this.j.do(this.o.nextInt(168000) + 12000);
            }
         } else {
            --var2;
            this.j.do(var2);
            if (var2 <= 0) {
               this.j.do(!this.j.a());
            }
         }

         this.u = this.t;
         if (this.j.a()) {
            this.t = (float)((double)this.t + 0.01D);
         } else {
            this.t = (float)((double)this.t - 0.01D);
         }

         if (this.t < 0.0F) {
            this.t = 0.0F;
         }

         if (this.t > 1.0F) {
            this.t = 1.0F;
         }

         this.s = this.r;
         if (this.j.do()) {
            this.r = (float)((double)this.r + 0.01D);
         } else {
            this.r = (float)((double)this.r - 0.01D);
         }

         if (this.r < 0.0F) {
            this.r = 0.0F;
         }

         if (this.r > 1.0F) {
            this.r = 1.0F;
         }
      }

   }

   public void n() {
      this.j.do(1);
   }

   protected void case() {
      this.void.clear();
      this.e.a("buildList");

      int var1;
      aek var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.z.size(); ++var1) {
         var2 = (aek)this.z.get(var1);
         var3 = ajs.a(var2.al / 16.0D);
         var4 = ajs.a(var2.aj / 16.0D);
         byte var5 = 7;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.void.add(new zi(var6 + var3, var7 + var4));
            }
         }
      }

      this.e.if();
      if (this.new > 0) {
         --this.new;
      }

      this.e.a("playerCheckLight");
      if (!this.z.isEmpty()) {
         var1 = this.o.nextInt(this.z.size());
         var2 = (aek)this.z.get(var1);
         var3 = ajs.a(var2.al) + this.o.nextInt(11) - 5;
         var4 = ajs.a(var2.ak) + this.o.nextInt(11) - 5;
         int var8 = ajs.a(var2.aj) + this.o.nextInt(11) - 5;
         this.k(var3, var4, var8);
      }

      this.e.if();
   }

   protected void a(int var1, int var2, xx var3) {
      this.e.do("moodSound");
      if (this.new == 0 && !this.goto) {
         this.w = this.w * 3 + 1013904223;
         int var4 = this.w >> 2;
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 16 & 127;
         int var8 = var3.int(var5, var7, var6);
         var5 += var1;
         var6 += var2;
         if (var8 == 0 && this.m(var5, var7, var6) <= this.o.nextInt(8) && this.for(yw.if, var5, var7, var6) <= 0) {
            aek var9 = this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, 8.0D);
            if (var9 != null && var9.if((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D) > 4.0D) {
               this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.o.nextFloat() * 0.2F);
               this.new = this.o.nextInt(12000) + 6000;
            }
         }
      }

      this.e.do("checkLight");
      var3.case();
   }

   protected void g() {
      this.case();
   }

   public boolean else(int var1, int var2, int var3) {
      return this.for(var1, var2, var3, false);
   }

   public boolean goto(int var1, int var2, int var3) {
      return this.for(var1, var2, var3, true);
   }

   public boolean for(int var1, int var2, int var3, boolean var4) {
      yn var5 = this.a(var1, var3);
      float var6 = var5.int();
      if (var6 > 0.15F) {
         return false;
      } else {
         if (var2 >= 0 && var2 < 256 && this.for(yw.a, var1, var2, var3) < 10) {
            int var7 = this.new(var1, var2, var3);
            if ((var7 == pa.ba.void || var7 == pa.bb.void) && this.for(var1, var2, var3) == 0) {
               if (!var4) {
                  return true;
               }

               boolean var8 = true;
               if (var8 && this.byte(var1 - 1, var2, var3) != ts.s) {
                  var8 = false;
               }

               if (var8 && this.byte(var1 + 1, var2, var3) != ts.s) {
                  var8 = false;
               }

               if (var8 && this.byte(var1, var2, var3 - 1) != ts.s) {
                  var8 = false;
               }

               if (var8 && this.byte(var1, var2, var3 + 1) != ts.s) {
                  var8 = false;
               }

               if (!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean long(int var1, int var2, int var3) {
      yn var4 = this.a(var1, var3);
      float var5 = var4.int();
      if (var5 > 0.15F) {
         return false;
      } else {
         if (var2 >= 0 && var2 < 256 && this.for(yw.a, var1, var2, var3) < 10) {
            int var6 = this.new(var1, var2 - 1, var3);
            int var7 = this.new(var1, var2, var3);
            if (var7 == 0 && pa.ca.case(this, var1, var2, var3) && var6 != 0 && var6 != pa.b9.void && pa.x[var6].at.void()) {
               return true;
            }
         }

         return false;
      }
   }

   public void k(int var1, int var2, int var3) {
      if (!this.n.for) {
         this.int(yw.if, var1, var2, var3);
      }

      this.int(yw.a, var1, var2, var3);
   }

   private int a(int var1, int var2, int var3, yw var4) {
      if (var4 == yw.if && this.j(var1, var2, var3)) {
         return 15;
      } else {
         int var5 = this.new(var1, var2, var3);
         int var6 = var4 == yw.if ? 0 : pa.o[var5];
         int var7 = pa.t[var5];
         if (var7 >= 15 && pa.o[var5] > 0) {
            var7 = 1;
         }

         if (var7 < 1) {
            var7 = 1;
         }

         if (var7 >= 15) {
            return 0;
         } else if (var6 >= 14) {
            return var6;
         } else {
            for(int var8 = 0; var8 < 6; ++var8) {
               int var9 = var1 + api.a[var8];
               int var10 = var2 + api.int[var8];
               int var11 = var3 + api.for[var8];
               int var12 = this.for(var4, var9, var10, var11) - var7;
               if (var12 > var6) {
                  var6 = var12;
               }

               if (var6 >= 14) {
                  return var6;
               }
            }

            return var6;
         }
      }
   }

   public void int(yw var1, int var2, int var3, int var4) {
      if (this.goto(var2, var3, var4, 17)) {
         int var5 = 0;
         int var6 = 0;
         this.e.a("getBrightness");
         int var7 = this.for(var1, var2, var3, var4);
         int var8 = this.a(var2, var3, var4, var1);
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         if (var8 > var7) {
            this.long[var6++] = 133152;
         } else if (var8 < var7) {
            this.long[var6++] = 133152 | var7 << 18;

            label95:
            while(true) {
               do {
                  do {
                     do {
                        if (var5 >= var6) {
                           var5 = 0;
                           break label95;
                        }

                        var9 = this.long[var5++];
                        var10 = (var9 & 63) - 32 + var2;
                        var11 = (var9 >> 6 & 63) - 32 + var3;
                        var12 = (var9 >> 12 & 63) - 32 + var4;
                        var13 = var9 >> 18 & 15;
                        var14 = this.for(var1, var10, var11, var12);
                     } while(var14 != var13);

                     this.a((yw)var1, var10, var11, var12, 0);
                  } while(var13 <= 0);

                  var15 = ajs.a(var10 - var2);
                  var17 = ajs.a(var11 - var3);
                  var16 = ajs.a(var12 - var4);
               } while(var15 + var17 + var16 >= 17);

               for(int var18 = 0; var18 < 6; ++var18) {
                  int var19 = var10 + api.a[var18];
                  int var20 = var11 + api.int[var18];
                  int var21 = var12 + api.for[var18];
                  int var22 = Math.max(1, pa.t[this.new(var19, var20, var21)]);
                  var14 = this.for(var1, var19, var20, var21);
                  if (var14 == var13 - var22 && var6 < this.long.length) {
                     this.long[var6++] = var19 - var2 + 32 | var20 - var3 + 32 << 6 | var21 - var4 + 32 << 12 | var13 - var22 << 18;
                  }
               }
            }
         }

         this.e.if();
         this.e.a("checkedPosition < toCheckCount");

         while(var5 < var6) {
            var9 = this.long[var5++];
            var10 = (var9 & 63) - 32 + var2;
            var11 = (var9 >> 6 & 63) - 32 + var3;
            var12 = (var9 >> 12 & 63) - 32 + var4;
            var13 = this.for(var1, var10, var11, var12);
            var14 = this.a(var10, var11, var12, var1);
            if (var14 != var13) {
               this.a(var1, var10, var11, var12, var14);
               if (var14 > var13) {
                  var15 = Math.abs(var10 - var2);
                  var17 = Math.abs(var11 - var3);
                  var16 = Math.abs(var12 - var4);
                  boolean var23 = var6 < this.long.length - 6;
                  if (var15 + var17 + var16 < 17 && var23) {
                     if (this.for(var1, var10 - 1, var11, var12) < var14) {
                        this.long[var6++] = var10 - 1 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if (this.for(var1, var10 + 1, var11, var12) < var14) {
                        this.long[var6++] = var10 + 1 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if (this.for(var1, var10, var11 - 1, var12) < var14) {
                        this.long[var6++] = var10 - var2 + 32 + (var11 - 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if (this.for(var1, var10, var11 + 1, var12) < var14) {
                        this.long[var6++] = var10 - var2 + 32 + (var11 + 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if (this.for(var1, var10, var11, var12 - 1) < var14) {
                        this.long[var6++] = var10 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - 1 - var4 + 32 << 12);
                     }

                     if (this.for(var1, var10, var11, var12 + 1) < var14) {
                        this.long[var6++] = var10 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

         this.e.if();
      }

   }

   public boolean a(boolean var1) {
      return false;
   }

   public List a(xx var1, boolean var2) {
      return null;
   }

   public List a(aiw var1, nw var2) {
      return this.a(var1, var2, (aip)null);
   }

   public List a(aiw var1, nw var2, aip var3) {
      ArrayList var4 = new ArrayList();
      int var5 = ajs.a((var2.if - 2.0D) / 16.0D);
      int var6 = ajs.a((var2.new + 2.0D) / 16.0D);
      int var7 = ajs.a((var2.try - 2.0D) / 16.0D);
      int var8 = ajs.a((var2.for + 2.0D) / 16.0D);

      for(int var9 = var5; var9 <= var6; ++var9) {
         for(int var10 = var7; var10 <= var8; ++var10) {
            if (this.for(var9, var10)) {
               this.byte(var9, var10).a((aiw)var1, var2, var4, var3);
            }
         }
      }

      return var4;
   }

   public List a(Class var1, nw var2) {
      return this.a(var1, var2, (aip)null);
   }

   public List a(Class var1, nw var2, aip var3) {
      int var4 = ajs.a((var2.if - 2.0D) / 16.0D);
      int var5 = ajs.a((var2.new + 2.0D) / 16.0D);
      int var6 = ajs.a((var2.try - 2.0D) / 16.0D);
      int var7 = ajs.a((var2.for + 2.0D) / 16.0D);
      ArrayList var8 = new ArrayList();

      for(int var9 = var4; var9 <= var5; ++var9) {
         for(int var10 = var6; var10 <= var7; ++var10) {
            if (this.for(var9, var10)) {
               this.byte(var9, var10).a((Class)var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public aiw a(Class var1, nw var2, aiw var3) {
      List var4 = this.a(var1, var2);
      aiw var5 = null;
      double var6 = Double.MAX_VALUE;

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         aiw var9 = (aiw)var4.get(var8);
         if (var9 != var3) {
            double var10 = var3.for(var9);
            if (var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public abstract aiw a(int var1);

   public List int() {
      return this.C;
   }

   public void a(int var1, int var2, int var3, n4 var4) {
      if (this.p(var1, var2, var3)) {
         this.try(var1, var3).byte();
      }

   }

   public int a(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.C.size(); ++var3) {
         aiw var4 = (aiw)this.C.get(var3);
         if (var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.C.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.try((aiw)var1.get(var2));
      }

   }

   public void if(List var1) {
      this.B.addAll(var1);
   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5, int var6, aiw var7, abp var8) {
      int var9 = this.new(var2, var3, var4);
      pa var10 = pa.x[var9];
      pa var11 = pa.x[var1];
      nw var12 = var11.int(this, var2, var3, var4);
      if (var5) {
         var12 = null;
      }

      if (var12 != null && !this.a(var12, var7)) {
         return false;
      } else {
         if (var10 != null && (var10 == pa.bb || var10 == pa.ba || var10 == pa.a7 || var10 == pa.a4 || var10 == pa.bo || var10.at.c())) {
            var10 = null;
         }

         return var10 != null && var10.at == ts.j && var11 == pa.y ? true : var1 > 0 && var10 == null && var11.a(this, var2, var3, var4, var6, var8);
      }
   }

   public s5 a(aiw var1, aiw var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.e.a("pathfind");
      int var8 = ajs.a(var1.al);
      int var9 = ajs.a(var1.ak + 1.0D);
      int var10 = ajs.a(var1.aj);
      int var11 = (int)(var3 + 16.0F);
      int var12 = var8 - var11;
      int var13 = var9 - var11;
      int var14 = var10 - var11;
      int var15 = var8 + var11;
      int var16 = var9 + var11;
      int var17 = var10 + var11;
      ys var18 = new ys(this, var12, var13, var14, var15, var16, var17, 0);
      s5 var19 = (new s4(var18, var4, var5, var6, var7)).a(var1, var2, var3);
      this.e.if();
      return var19;
   }

   public s5 a(aiw var1, int var2, int var3, int var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.e.a("pathfind");
      int var10 = ajs.a(var1.al);
      int var11 = ajs.a(var1.ak);
      int var12 = ajs.a(var1.aj);
      int var13 = (int)(var5 + 8.0F);
      int var14 = var10 - var13;
      int var15 = var11 - var13;
      int var16 = var12 - var13;
      int var17 = var10 + var13;
      int var18 = var11 + var13;
      int var19 = var12 + var13;
      ys var20 = new ys(this, var14, var15, var16, var17, var18, var19, 0);
      s5 var21 = (new s4(var20, var6, var7, var8, var9)).a(var1, var2, var3, var4, var5);
      this.e.if();
      return var21;
   }

   public int a(int var1, int var2, int var3, int var4) {
      int var5 = this.new(var1, var2, var3);
      return var5 == 0 ? 0 : pa.x[var5].for((yy)this, var1, var2, var3, var4);
   }

   public int l(int var1, int var2, int var3) {
      byte var4 = 0;
      int var5 = Math.max(var4, this.a(var1, var2 - 1, var3, 0));
      if (var5 >= 15) {
         return var5;
      } else {
         var5 = Math.max(var5, this.a(var1, var2 + 1, var3, 1));
         if (var5 >= 15) {
            return var5;
         } else {
            var5 = Math.max(var5, this.a(var1, var2, var3 - 1, 2));
            if (var5 >= 15) {
               return var5;
            } else {
               var5 = Math.max(var5, this.a(var1, var2, var3 + 1, 3));
               if (var5 >= 15) {
                  return var5;
               } else {
                  var5 = Math.max(var5, this.a(var1 - 1, var2, var3, 4));
                  if (var5 >= 15) {
                     return var5;
                  } else {
                     var5 = Math.max(var5, this.a(var1 + 1, var2, var3, 5));
                     return var5 >= 15 ? var5 : var5;
                  }
               }
            }
         }
      }
   }

   public boolean char(int var1, int var2, int var3, int var4) {
      return this.long(var1, var2, var3, var4) > 0;
   }

   public int long(int var1, int var2, int var3, int var4) {
      if (this.try(var1, var2, var3)) {
         return this.l(var1, var2, var3);
      } else {
         int var5 = this.new(var1, var2, var3);
         return var5 == 0 ? 0 : pa.x[var5].do((yy)this, var1, var2, var3, var4);
      }
   }

   public boolean f(int var1, int var2, int var3) {
      return this.long(var1, var2 - 1, var3, 0) > 0 ? true : (this.long(var1, var2 + 1, var3, 1) > 0 ? true : (this.long(var1, var2, var3 - 1, 2) > 0 ? true : (this.long(var1, var2, var3 + 1, 3) > 0 ? true : (this.long(var1 - 1, var2, var3, 4) > 0 ? true : this.long(var1 + 1, var2, var3, 5) > 0))));
   }

   public int i(int var1, int var2, int var3) {
      int var4 = 0;

      for(int var5 = 0; var5 < 6; ++var5) {
         int var6 = this.long(var1 + api.a[var5], var2 + api.int[var5], var3 + api.for[var5], var5);
         if (var6 >= 15) {
            return 15;
         }

         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public aek if(aiw var1, double var2) {
      return this.a(var1.al, var1.ak, var1.aj, var2);
   }

   public aek a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      aek var11 = null;

      for(int var12 = 0; var12 < this.z.size(); ++var12) {
         aek var13 = (aek)this.z.get(var12);
         double var14 = var13.if(var1, var3, var5);
         if ((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public aek a(aiw var1, double var2) {
      return this.if(var1.al, var1.ak, var1.aj, var2);
   }

   public aek if(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      aek var11 = null;

      for(int var12 = 0; var12 < this.z.size(); ++var12) {
         aek var13 = (aek)this.z.get(var12);
         if (!var13.fY.if && var13.aA()) {
            double var14 = var13.if(var1, var3, var5);
            double var16 = var7;
            if (var13.Q()) {
               var16 = var7 * 0.800000011920929D;
            }

            if (var13.U()) {
               float var18 = var13.cL();
               if (var18 < 0.1F) {
                  var18 = 0.1F;
               }

               var16 *= (double)(0.7F * var18);
            }

            if ((var7 < 0.0D || var14 < var16 * var16) && (var9 == -1.0D || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public aek if(String var1) {
      for(int var2 = 0; var2 < this.z.size(); ++var2) {
         if (var1.equals(((aek)this.z.get(var2)).fJ)) {
            return (aek)this.z.get(var2);
         }
      }

      return null;
   }

   public void u() {
   }

   public void for() throws y2 {
      this.k.new();
   }

   public void a(long var1) {
      this.j.if(var1);
   }

   public long b() {
      return this.j.case();
   }

   public long m() {
      return this.j.if();
   }

   public long t() {
      return this.j.else();
   }

   public void if(long var1) {
      this.j.a(var1);
   }

   public apg long() {
      return new apg(this.j.h(), this.j.int(), this.j.b());
   }

   public void c(int var1, int var2, int var3) {
      this.j.a(var1, var2, var3);
   }

   public void byte(aiw var1) {
      int var2 = ajs.a(var1.al / 16.0D);
      int var3 = ajs.a(var1.aj / 16.0D);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.byte(var5, var6);
         }
      }

      if (!this.C.contains(var1)) {
         this.C.add(var1);
      }

   }

   public boolean a(aek var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(aiw var1, byte var2) {
   }

   public x0 new() {
      return this.l;
   }

   public void do(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var4 > 0) {
         pa.x[var4].if(this, var1, var2, var3, var5, var6);
      }

   }

   public si x() {
      return this.k;
   }

   public ss l() {
      return this.j;
   }

   public ze i() {
      return this.j.c();
   }

   public void o() {
   }

   public float if(float var1) {
      return (this.s + (this.r - this.s) * var1) * this.char(var1);
   }

   public float char(float var1) {
      return this.u + (this.t - this.u) * var1;
   }

   public void new(float var1) {
      this.u = var1;
      this.t = var1;
   }

   public boolean w() {
      return (double)this.if(1.0F) > 0.9D;
   }

   public boolean goto() {
      return (double)this.char(1.0F) > 0.2D;
   }

   public boolean d(int var1, int var2, int var3) {
      if (!this.goto()) {
         return false;
      } else if (!this.j(var1, var2, var3)) {
         return false;
      } else if (this.new(var1, var3) > var2) {
         return false;
      } else {
         yn var4 = this.a(var1, var3);
         return var4.goto() ? false : var4.if();
      }
   }

   public boolean e(int var1, int var2, int var3) {
      yn var4 = this.a(var1, var3);
      return var4.do();
   }

   public void a(String var1, s0 var2) {
      this.h.a(var1, var2);
   }

   public s0 a(Class var1, String var2) {
      return this.h.a(var1, var2);
   }

   public int a(String var1) {
      return this.h.a(var1);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.m.size(); ++var6) {
         ((y1)this.m.get(var6)).a(var1, var2, var3, var4, var5);
      }

   }

   public void for(int var1, int var2, int var3, int var4, int var5) {
      this.a((aek)null, var1, var2, var3, var4, var5);
   }

   public void a(aek var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         for(int var7 = 0; var7 < this.m.size(); ++var7) {
            ((y1)this.m.get(var7)).a(var1, var2, var3, var4, var5, var6);
         }

      } catch (Throwable var10) {
         aqh var8 = aqh.a(var10, "Playing level event");
         apu var9 = var8.a("Level event being played");
         var9.a((String)"Block coordinates", (Object)apu.a(var3, var4, var5));
         var9.a((String)"Event source", (Object)var1);
         var9.a((String)"Event type", (Object)var2);
         var9.a((String)"Event data", (Object)var6);
         throw new ape(var8);
      }
   }

   public int if() {
      return 256;
   }

   public int q() {
      return this.n.for ? 128 : 256;
   }

   public amd a(afj var1) {
      return null;
   }

   public Random s(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.l().case() + (long)var3;
      this.o.setSeed(var4);
      return this.o;
   }

   public yp a(String var1, int var2, int var3, int var4) {
      return this.new().a(this, var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public double byte() {
      return this.j.new() == yx.byte ? 0.0D : 63.0D;
   }

   public apu a(aqh var1) {
      apu var2 = var1.a("Affected level", 1);
      var2.a((String)"Level name", (Object)(this.j == null ? "????" : this.j.l()));
      var2.a((String)"All players", (Callable)(new y4(this)));
      var2.a((String)"Chunk stats", (Callable)(new y3(this)));

      try {
         this.j.a(var2);
      } catch (Throwable var4) {
         var2.a("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public void new(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.m.size(); ++var6) {
         y1 var7 = (y1)this.m.get(var6);
         var7.if(var1, var2, var3, var4, var5);
      }

   }

   public nq do() {
      return this.else;
   }

   public Calendar k() {
      if (this.m() % 600L == 0L) {
         this.char.setTimeInMillis(System.currentTimeMillis());
      }

      return this.char;
   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11, aqv var13) {
   }

   public nl f() {
      return this.d;
   }

   public void new(int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         int var6 = var1 + apk.case[var5];
         int var7 = var3 + apk.byte[var5];
         int var8 = this.new(var6, var2, var7);
         if (var8 != 0) {
            pa var9 = pa.x[var8];
            if (pa.q.y(var8)) {
               var9.new(this, var6, var2, var7, var4);
            } else if (pa.if(var8)) {
               var6 += apk.case[var5];
               var7 += apk.byte[var5];
               var8 = this.new(var6, var2, var7);
               var9 = pa.x[var8];
               if (pa.q.y(var8)) {
                  var9.new(this, var6, var2, var7, var4);
               }
            }
         }
      }

   }

   public ajw char() {
      return this.case;
   }
}
