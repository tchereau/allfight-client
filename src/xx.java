import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class xx {
   public static boolean h;
   private xw[] for;
   private byte[] do;
   public int[] g;
   public boolean[] f;
   public boolean e;
   public y6 d;
   public int[] c;
   public final int b;
   public final int void;
   private boolean if;
   public Map long;
   public List[] goto;
   public boolean else;
   public boolean char;
   public boolean case;
   public long byte;
   public boolean try;
   public int new;
   private int a;
   boolean int;

   public xx(y6 var1, int var2, int var3) {
      this.for = new xw[16];
      this.do = new byte[256];
      this.g = new int[256];
      this.f = new boolean[256];
      this.if = false;
      this.long = new HashMap();
      this.else = false;
      this.char = false;
      this.case = false;
      this.byte = 0L;
      this.try = false;
      this.new = 0;
      this.a = 4096;
      this.int = false;
      this.goto = new List[16];
      this.d = var1;
      this.b = var2;
      this.void = var3;
      this.c = new int[256];

      for(int var4 = 0; var4 < this.goto.length; ++var4) {
         this.goto[var4] = new ArrayList();
      }

      Arrays.fill(this.g, -999);
      Arrays.fill(this.do, (byte)-1);
   }

   public xx(y6 var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      int var5 = var2.length / 256;

      for(int var6 = 0; var6 < 16; ++var6) {
         for(int var7 = 0; var7 < 16; ++var7) {
            for(int var8 = 0; var8 < var5; ++var8) {
               int var9 = var2[var6 << 11 | var7 << 7 | var8] & 255;
               if (var9 != 0) {
                  int var10 = var8 >> 4;
                  if (this.for[var10] == null) {
                     this.for[var10] = new xw(var10 << 4, !var1.n.for);
                  }

                  this.for[var10].a(var6, var8 & 15, var7, var9);
               }
            }
         }
      }

   }

   public boolean if(int var1, int var2) {
      return var1 == this.b && var2 == this.void;
   }

   public int int(int var1, int var2) {
      return this.c[var2 << 4 | var1];
   }

   public int long() {
      for(int var1 = this.for.length - 1; var1 >= 0; --var1) {
         if (this.for[var1] != null) {
            return this.for[var1].int();
         }
      }

      return 0;
   }

   public xw[] else() {
      return this.for;
   }

   public void goto() {
      int var1 = this.long();

      for(int var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            this.g[var2 + (var3 << 4)] = -999;

            for(int var4 = var1 + 16 - 1; var4 > 0; --var4) {
               int var5 = this.int(var2, var4 - 1, var3);
               if (pa.t[var5] != 0) {
                  this.c[var3 << 4 | var2] = var4;
                  break;
               }
            }
         }
      }

      this.char = true;
   }

   public void for() {
      int var1 = this.long();
      this.new = Integer.MAX_VALUE;

      int var2;
      int var3;
      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.g[var2 + (var3 << 4)] = -999;

            int var4;
            for(var4 = var1 + 16 - 1; var4 > 0; --var4) {
               if (this.try(var2, var4 - 1, var3) != 0) {
                  this.c[var3 << 4 | var2] = var4;
                  if (var4 < this.new) {
                     this.new = var4;
                  }
                  break;
               }
            }

            if (!this.d.n.for) {
               var4 = 15;
               int var5 = var1 + 16 - 1;

               do {
                  var4 -= this.try(var2, var5, var3);
                  if (var4 > 0) {
                     xw var6 = this.for[var5 >> 4];
                     if (var6 != null) {
                        var6.for(var2, var5 & 15, var3, var4);
                        this.d.g((this.b << 4) + var2, var5, (this.void << 4) + var3);
                     }
                  }

                  --var5;
               } while(var5 > 0 && var4 > 0);
            }
         }
      }

      this.char = true;

      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.for(var2, var3);
         }
      }

   }

   private void for(int var1, int var2) {
      this.f[var1 + var2 * 16] = true;
      this.if = true;
   }

   private void try() {
      this.d.e.a("recheckGaps");
      if (this.d.goto(this.b * 16 + 8, 0, this.void * 16 + 8, 16)) {
         for(int var1 = 0; var1 < 16; ++var1) {
            for(int var2 = 0; var2 < 16; ++var2) {
               if (this.f[var1 + var2 * 16]) {
                  this.f[var1 + var2 * 16] = false;
                  int var3 = this.int(var1, var2);
                  int var4 = this.b * 16 + var1;
                  int var5 = this.void * 16 + var2;
                  int var6 = this.d.int(var4 - 1, var5);
                  int var7 = this.d.int(var4 + 1, var5);
                  int var8 = this.d.int(var4, var5 - 1);
                  int var9 = this.d.int(var4, var5 + 1);
                  if (var7 < var6) {
                     var6 = var7;
                  }

                  if (var8 < var6) {
                     var6 = var8;
                  }

                  if (var9 < var6) {
                     var6 = var9;
                  }

                  this.for(var4, var5, var6);
                  this.for(var4 - 1, var5, var3);
                  this.for(var4 + 1, var5, var3);
                  this.for(var4, var5 - 1, var3);
                  this.for(var4, var5 + 1, var3);
               }
            }
         }

         this.if = false;
      }

      this.d.e.if();
   }

   private void for(int var1, int var2, int var3) {
      int var4 = this.d.do(var1, var2);
      if (var4 > var3) {
         this.if(var1, var2, var3, var4 + 1);
      } else if (var4 < var3) {
         this.if(var1, var2, var4, var3 + 1);
      }

   }

   private void if(int var1, int var2, int var3, int var4) {
      if (var4 > var3 && this.d.goto(var1, 0, var2, 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.d.int(yw.if, var1, var5, var2);
         }

         this.char = true;
      }

   }

   private void do(int var1, int var2, int var3) {
      int var4 = this.c[var3 << 4 | var1] & 255;
      int var5 = var4;
      if (var2 > var4) {
         var5 = var2;
      }

      while(var5 > 0 && this.try(var1, var5 - 1, var3) == 0) {
         --var5;
      }

      if (var5 != var4) {
         this.d.else(var1 + this.b * 16, var3 + this.void * 16, var5, var4);
         this.c[var3 << 4 | var1] = var5;
         int var6 = this.b * 16 + var1;
         int var7 = this.void * 16 + var3;
         int var8;
         int var9;
         if (!this.d.n.for) {
            xw var10;
            if (var5 < var4) {
               for(var8 = var5; var8 < var4; ++var8) {
                  var10 = this.for[var8 >> 4];
                  if (var10 != null) {
                     var10.for(var1, var8 & 15, var3, 15);
                     this.d.g((this.b << 4) + var1, var8, (this.void << 4) + var3);
                  }
               }
            } else {
               for(var8 = var4; var8 < var5; ++var8) {
                  var10 = this.for[var8 >> 4];
                  if (var10 != null) {
                     var10.for(var1, var8 & 15, var3, 0);
                     this.d.g((this.b << 4) + var1, var8, (this.void << 4) + var3);
                  }
               }
            }

            var8 = 15;

            while(var5 > 0 && var8 > 0) {
               --var5;
               var9 = this.try(var1, var5, var3);
               if (var9 == 0) {
                  var9 = 1;
               }

               var8 -= var9;
               if (var8 < 0) {
                  var8 = 0;
               }

               xw var11 = this.for[var5 >> 4];
               if (var11 != null) {
                  var11.for(var1, var5 & 15, var3, var8);
               }
            }
         }

         var8 = this.c[var3 << 4 | var1];
         var9 = var4;
         int var12 = var8;
         if (var8 < var4) {
            var9 = var8;
            var12 = var4;
         }

         if (var8 < this.new) {
            this.new = var8;
         }

         if (!this.d.n.for) {
            this.if(var6 - 1, var7, var9, var12);
            this.if(var6 + 1, var7, var9, var12);
            this.if(var6, var7 - 1, var9, var12);
            this.if(var6, var7 + 1, var9, var12);
            this.if(var6, var7, var9, var12);
         }

         this.char = true;
      }

   }

   public int try(int var1, int var2, int var3) {
      return pa.t[this.int(var1, var2, var3)];
   }

   public int int(int var1, int var2, int var3) {
      if (var2 >> 4 >= this.for.length) {
         return 0;
      } else {
         xw var4 = this.for[var2 >> 4];
         return var4 != null ? var4.a(var1, var2 & 15, var3) : 0;
      }
   }

   public int new(int var1, int var2, int var3) {
      if (var2 >> 4 >= this.for.length) {
         return 0;
      } else {
         xw var4 = this.for[var2 >> 4];
         return var4 != null ? var4.for(var1, var2 & 15, var3) : 0;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 << 4 | var1;
      if (var2 >= this.g[var6] - 1) {
         this.g[var6] = -999;
      }

      int var7 = this.c[var6];
      int var8 = this.int(var1, var2, var3);
      int var9 = this.new(var1, var2, var3);
      if (var8 == var4 && var9 == var5) {
         return false;
      } else {
         xw var10 = this.for[var2 >> 4];
         boolean var11 = false;
         if (var10 == null) {
            if (var4 == 0) {
               return false;
            }

            var10 = this.for[var2 >> 4] = new xw(var2 >> 4 << 4, !this.d.n.for);
            var11 = var2 >= var7;
         }

         int var12 = this.b * 16 + var1;
         int var13 = this.void * 16 + var3;
         if (var8 != 0 && !this.d.goto) {
            pa.x[var8].if(this.d, var12, var2, var13, var9);
         }

         var10.a(var1, var2 & 15, var3, var4);
         if (var8 != 0) {
            if (!this.d.goto) {
               pa.x[var8].do(this.d, var12, var2, var13, var8, var9);
            } else if (pa.x[var8] instanceof rb && var8 != var4) {
               this.d.b(var12, var2, var13);
            }
         }

         if (var10.a(var1, var2 & 15, var3) != var4) {
            return false;
         } else {
            var10.do(var1, var2 & 15, var3, var5);
            if (var11) {
               this.for();
            } else {
               if (pa.t[var4 & 4095] > 0) {
                  if (var2 >= var7) {
                     this.do(var1, var2 + 1, var3);
                  }
               } else if (var2 == var7 - 1) {
                  this.do(var1, var2, var3);
               }

               this.for(var1, var3);
            }

            n4 var14;
            if (var4 != 0) {
               if (!this.d.goto) {
                  pa.x[var4].for(this.d, var12, var2, var13);
               }

               if (pa.x[var4] instanceof rb) {
                  var14 = this.byte(var1, var2, var3);
                  if (var14 == null) {
                     var14 = ((rb)pa.x[var4]).if(this.d);
                     this.d.if(var12, var2, var13, var14);
                  }

                  if (var14 != null) {
                     var14.d();
                  }
               }
            } else if (var8 > 0 && pa.x[var8] instanceof rb) {
               var14 = this.byte(var1, var2, var3);
               if (var14 != null) {
                  var14.d();
               }
            }

            this.char = true;
            return true;
         }
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      xw var5 = this.for[var2 >> 4];
      if (var5 == null) {
         return false;
      } else {
         int var6 = var5.for(var1, var2 & 15, var3);
         if (var6 == var4) {
            return false;
         } else {
            this.char = true;
            var5.do(var1, var2 & 15, var3, var4);
            int var7 = var5.a(var1, var2 & 15, var3);
            if (var7 > 0 && pa.x[var7] instanceof rb) {
               n4 var8 = this.byte(var1, var2, var3);
               if (var8 != null) {
                  var8.d();
                  var8.if = var4;
               }
            }

            return true;
         }
      }
   }

   public int a(yw var1, int var2, int var3, int var4) {
      xw var5 = this.for[var3 >> 4];
      return var5 == null ? (this.a(var2, var3, var4) ? var1.for : 0) : (var1 == yw.if ? (this.d.n.for ? 0 : var5.do(var2, var3 & 15, var4)) : (var1 == yw.a ? var5.if(var2, var3 & 15, var4) : var1.for));
   }

   public void a(yw var1, int var2, int var3, int var4, int var5) {
      xw var6 = this.for[var3 >> 4];
      if (var6 == null) {
         var6 = this.for[var3 >> 4] = new xw(var3 >> 4 << 4, !this.d.n.for);
         this.for();
      }

      this.char = true;
      if (var1 == yw.if) {
         if (!this.d.n.for) {
            var6.for(var2, var3 & 15, var4, var5);
         }
      } else if (var1 == yw.a) {
         var6.if(var2, var3 & 15, var4, var5);
      }

   }

   public int do(int var1, int var2, int var3, int var4) {
      xw var5 = this.for[var2 >> 4];
      if (var5 != null) {
         int var6 = this.d.n.for ? 0 : var5.do(var1, var2 & 15, var3);
         if (var6 > 0) {
            h = true;
         }

         var6 -= var4;
         int var7 = var5.if(var1, var2 & 15, var3);
         if (var7 > var6) {
            var6 = var7;
         }

         return var6;
      } else {
         return !this.d.n.for && var4 < yw.if.for ? yw.if.for - var4 : 0;
      }
   }

   public void if(aiw var1) {
      this.case = true;
      int var2 = ajs.a(var1.al / 16.0D);
      int var3 = ajs.a(var1.aj / 16.0D);
      if (var2 != this.b || var3 != this.void) {
         this.d.char().do("Wrong location! " + var1);
         Thread.dumpStack();
      }

      int var4 = ajs.a(var1.ak / 16.0D);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var4 >= this.goto.length) {
         var4 = this.goto.length - 1;
      }

      var1.bf = true;
      var1.be = this.b;
      var1.bd = var4;
      var1.bc = this.void;
      this.goto[var4].add(var1);
   }

   public void a(aiw var1) {
      this.a(var1, var1.bd);
   }

   public void a(aiw var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.goto.length) {
         var2 = this.goto.length - 1;
      }

      this.goto[var2].remove(var1);
   }

   public boolean a(int var1, int var2, int var3) {
      return var2 >= this.c[var3 << 4 | var1];
   }

   public n4 byte(int var1, int var2, int var3) {
      yp var4 = new yp(var1, var2, var3);
      n4 var5 = (n4)this.long.get(var4);
      if (var5 == null) {
         int var6 = this.int(var1, var2, var3);
         if (var6 <= 0 || !pa.x[var6].h()) {
            return null;
         }

         if (var5 == null) {
            var5 = ((rb)pa.x[var6]).if(this.d);
            this.d.if(this.b * 16 + var1, var2, this.void * 16 + var3, var5);
         }

         var5 = (n4)this.long.get(var4);
      }

      if (var5 != null && var5.new()) {
         this.long.remove(var4);
         return null;
      } else {
         return var5;
      }
   }

   public void a(n4 var1) {
      int var2 = var1.new - this.b * 16;
      int var3 = var1.int;
      int var4 = var1.for - this.void * 16;
      this.a(var2, var3, var4, var1);
      if (this.e) {
         this.d.A.add(var1);
      }

   }

   public void a(int var1, int var2, int var3, n4 var4) {
      yp var5 = new yp(var1, var2, var3);
      var4.a(this.d);
      var4.new = this.b * 16 + var1;
      var4.int = var2;
      var4.for = this.void * 16 + var3;
      if (this.int(var1, var2, var3) != 0 && pa.x[this.int(var1, var2, var3)] instanceof rb) {
         if (this.long.containsKey(var5)) {
            ((n4)this.long.get(var5)).c();
         }

         var4.byte();
         this.long.put(var5, var4);
      }

   }

   public void if(int var1, int var2, int var3) {
      yp var4 = new yp(var1, var2, var3);
      if (this.e) {
         n4 var5 = (n4)this.long.remove(var4);
         if (var5 != null) {
            var5.c();
         }
      }

   }

   public void char() {
      this.e = true;
      this.d.a(this.long.values());

      for(int var1 = 0; var1 < this.goto.length; ++var1) {
         this.d.a(this.goto[var1]);
      }

   }

   public void if() {
      this.e = false;
      Iterator var1 = this.long.values().iterator();

      while(var1.hasNext()) {
         n4 var2 = (n4)var1.next();
         this.d.a(var2);
      }

      for(int var3 = 0; var3 < this.goto.length; ++var3) {
         this.d.if(this.goto[var3]);
      }

   }

   public void byte() {
      this.char = true;
   }

   public void a(aiw var1, nw var2, List var3, aip var4) {
      int var5 = ajs.a((var2.a - 2.0D) / 16.0D);
      int var6 = ajs.a((var2.int + 2.0D) / 16.0D);
      if (var5 < 0) {
         var5 = 0;
         var6 = Math.max(var5, var6);
      }

      if (var6 >= this.goto.length) {
         var6 = this.goto.length - 1;
         var5 = Math.min(var5, var6);
      }

      for(int var7 = var5; var7 <= var6; ++var7) {
         List var8 = this.goto[var7];

         for(int var9 = 0; var9 < var8.size(); ++var9) {
            aiw var10 = (aiw)var8.get(var9);
            if (var10 != var1 && var10.aZ.a(var2) && (var4 == null || var4.a(var10))) {
               var3.add(var10);
               aiw[] var11 = var10.R();
               if (var11 != null) {
                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     var10 = var11[var12];
                     if (var10 != var1 && var10.aZ.a(var2) && (var4 == null || var4.a(var10))) {
                        var3.add(var10);
                     }
                  }
               }
            }
         }
      }

   }

   public void a(Class var1, nw var2, List var3, aip var4) {
      int var5 = ajs.a((var2.a - 2.0D) / 16.0D);
      int var6 = ajs.a((var2.int + 2.0D) / 16.0D);
      if (var5 < 0) {
         var5 = 0;
      } else if (var5 >= this.goto.length) {
         var5 = this.goto.length - 1;
      }

      if (var6 >= this.goto.length) {
         var6 = this.goto.length - 1;
      } else if (var6 < 0) {
         var6 = 0;
      }

      for(int var7 = var5; var7 <= var6; ++var7) {
         List var8 = this.goto[var7];

         for(int var9 = 0; var9 < var8.size(); ++var9) {
            aiw var10 = (aiw)var8.get(var9);
            if (var1.isAssignableFrom(var10.getClass()) && var10.aZ.a(var2) && (var4 == null || var4.a(var10))) {
               var3.add(var10);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      if (var1) {
         if (this.case && this.d.m() != this.byte || this.char) {
            return true;
         }
      } else if (this.case && this.d.m() >= this.byte + 600L) {
         return true;
      }

      return this.char;
   }

   public Random a(long var1) {
      return new Random(this.d.b() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.void * this.void) * 4392871L + (long)(this.void * 389711) ^ var1);
   }

   public boolean int() {
      return false;
   }

   public void a(x0 var1, x0 var2, int var3, int var4) {
      if (!this.else && var1.for(var3 + 1, var4 + 1) && var1.for(var3, var4 + 1) && var1.for(var3 + 1, var4)) {
         var1.a(var2, var3, var4);
      }

      if (var1.for(var3 - 1, var4) && !var1.do(var3 - 1, var4).else && var1.for(var3 - 1, var4 + 1) && var1.for(var3, var4 + 1) && var1.for(var3 - 1, var4 + 1)) {
         var1.a(var2, var3 - 1, var4);
      }

      if (var1.for(var3, var4 - 1) && !var1.do(var3, var4 - 1).else && var1.for(var3 + 1, var4 - 1) && var1.for(var3 + 1, var4 - 1) && var1.for(var3 + 1, var4)) {
         var1.a(var2, var3, var4 - 1);
      }

      if (var1.for(var3 - 1, var4 - 1) && !var1.do(var3 - 1, var4 - 1).else && var1.for(var3, var4 - 1) && var1.for(var3 - 1, var4)) {
         var1.a(var2, var3 - 1, var4 - 1);
      }

   }

   public int a(int var1, int var2) {
      int var3 = var1 | var2 << 4;
      int var4 = this.g[var3];
      if (var4 == -999) {
         int var5 = this.long() + 15;
         var4 = -1;

         while(true) {
            while(var5 > 0 && var4 == -1) {
               int var6 = this.int(var1, var5, var2);
               ts var7 = var6 == 0 ? ts.z : pa.x[var6].at;
               if (!var7.void() && !var7.case()) {
                  --var5;
               } else {
                  var4 = var5 + 1;
               }
            }

            this.g[var3] = var4;
            break;
         }
      }

      return var4;
   }

   public void a() {
      if (this.if && !this.d.n.for) {
         this.try();
      }

   }

   public zi void() {
      return new zi(this.b, this.void);
   }

   public boolean do(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for(int var3 = var1; var3 <= var2; var3 += 16) {
         xw var4 = this.for[var3 >> 4];
         if (var4 != null && !var4.new()) {
            return false;
         }
      }

      return true;
   }

   public void a(xw[] var1) {
      this.for = var1;
   }

   public void a(byte[] var1, int var2, int var3, boolean var4) {
      int var5 = 0;
      boolean var6 = !this.d.n.for;

      int var7;
      for(var7 = 0; var7 < this.for.length; ++var7) {
         if ((var2 & 1 << var7) != 0) {
            if (this.for[var7] == null) {
               this.for[var7] = new xw(var7 << 4, var6);
            }

            byte[] var8 = this.for[var7].char();
            System.arraycopy(var1, var5, var8, 0, var8.length);
            var5 += var8.length;
         } else if (var4 && this.for[var7] != null) {
            this.for[var7] = null;
         }
      }

      xz var11;
      for(var7 = 0; var7 < this.for.length; ++var7) {
         if ((var2 & 1 << var7) != 0 && this.for[var7] != null) {
            var11 = this.for[var7].a();
            System.arraycopy(var1, var5, var11.if, 0, var11.if.length);
            var5 += var11.if.length;
         }
      }

      for(var7 = 0; var7 < this.for.length; ++var7) {
         if ((var2 & 1 << var7) != 0 && this.for[var7] != null) {
            var11 = this.for[var7].do();
            System.arraycopy(var1, var5, var11.if, 0, var11.if.length);
            var5 += var11.if.length;
         }
      }

      if (var6) {
         for(var7 = 0; var7 < this.for.length; ++var7) {
            if ((var2 & 1 << var7) != 0 && this.for[var7] != null) {
               var11 = this.for[var7].byte();
               System.arraycopy(var1, var5, var11.if, 0, var11.if.length);
               var5 += var11.if.length;
            }
         }
      }

      for(var7 = 0; var7 < this.for.length; ++var7) {
         if ((var3 & 1 << var7) != 0) {
            if (this.for[var7] == null) {
               var5 += 2048;
            } else {
               var11 = this.for[var7].try();
               if (var11 == null) {
                  var11 = this.for[var7].if();
               }

               System.arraycopy(var1, var5, var11.if, 0, var11.if.length);
               var5 += var11.if.length;
            }
         } else if (var4 && this.for[var7] != null && this.for[var7].try() != null) {
            this.for[var7].case();
         }
      }

      if (var4) {
         System.arraycopy(var1, var5, this.do, 0, this.do.length);
         int var10000 = var5 + this.do.length;
      }

      for(var7 = 0; var7 < this.for.length; ++var7) {
         if (this.for[var7] != null && (var2 & 1 << var7) != 0) {
            this.for[var7].for();
         }
      }

      this.goto();
      Iterator var9 = this.long.values().iterator();

      while(var9.hasNext()) {
         n4 var10 = (n4)var9.next();
         var10.d();
      }

   }

   public yn a(int var1, int var2, yi var3) {
      int var4 = this.do[var2 << 4 | var1] & 255;
      if (var4 == 255) {
         yn var5 = var3.a((this.b << 4) + var1, (this.void << 4) + var2);
         var4 = var5.try;
         this.do[var2 << 4 | var1] = (byte)(var4 & 255);
      }

      return yn.G[var4] == null ? yn.E : yn.G[var4];
   }

   public byte[] new() {
      return this.do;
   }

   public void a(byte[] var1) {
      this.do = var1;
   }

   public void do() {
      this.a = 0;
   }

   public void case() {
      for(int var1 = 0; var1 < 8; ++var1) {
         if (this.a >= 4096) {
            return;
         }

         int var2 = this.a % 16;
         int var3 = this.a / 16 % 16;
         int var4 = this.a / 256;
         ++this.a;
         int var5 = (this.b << 4) + var3;
         int var6 = (this.void << 4) + var4;

         for(int var7 = 0; var7 < 16; ++var7) {
            int var8 = (var2 << 4) + var7;
            if (this.for[var2] == null && (var7 == 0 || var7 == 15 || var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15) || this.for[var2] != null && this.for[var2].a(var3, var7, var4) == 0) {
               if (pa.o[this.d.new(var5, var8 - 1, var6)] > 0) {
                  this.d.k(var5, var8 - 1, var6);
               }

               if (pa.o[this.d.new(var5, var8 + 1, var6)] > 0) {
                  this.d.k(var5, var8 + 1, var6);
               }

               if (pa.o[this.d.new(var5 - 1, var8, var6)] > 0) {
                  this.d.k(var5 - 1, var8, var6);
               }

               if (pa.o[this.d.new(var5 + 1, var8, var6)] > 0) {
                  this.d.k(var5 + 1, var8, var6);
               }

               if (pa.o[this.d.new(var5, var8, var6 - 1)] > 0) {
                  this.d.k(var5, var8, var6 - 1);
               }

               if (pa.o[this.d.new(var5, var8, var6 + 1)] > 0) {
                  this.d.k(var5, var8, var6 + 1);
               }

               this.d.k(var5, var8, var6);
            }
         }
      }

   }
}
