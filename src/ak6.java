import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ak6 implements x0 {
   private Set ag = new HashSet();
   private xx an;
   private x0 am;
   private xt al;
   public boolean ah = true;
   private ajv ak = new ajv();
   private List aj = new ArrayList();
   private ak5 ai;

   public ak6(ak5 var1, xt var2, x0 var3) {
      this.an = new xy(var1, 0, 0);
      this.ai = var1;
      this.al = var2;
      this.am = var3;
   }

   public boolean for(int var1, int var2) {
      return this.ak.try(zi.a(var1, var2));
   }

   public void int(int var1, int var2) {
      if (this.ai.n.do()) {
         apg var3 = this.ai.long();
         int var4 = var1 * 16 + 8 - var3.if;
         int var5 = var2 * 16 + 8 - var3.do;
         short var6 = 128;
         if (var4 < -var6 || var4 > var6 || var5 < -var6 || var5 > var6) {
            this.ag.add(zi.a(var1, var2));
         }
      } else {
         this.ag.add(zi.a(var1, var2));
      }

   }

   public void int() {
      Iterator var1 = this.aj.iterator();

      while(var1.hasNext()) {
         xx var2 = (xx)var1.next();
         this.int(var2.b, var2.void);
      }

   }

   public xx if(int var1, int var2) {
      long var3 = zi.a(var1, var2);
      this.ag.remove(var3);
      xx var5 = (xx)this.ak.int(var3);
      if (var5 == null) {
         var5 = this.new(var1, var2);
         if (var5 == null) {
            if (this.am == null) {
               var5 = this.an;
            } else {
               try {
                  var5 = this.am.do(var1, var2);
               } catch (Throwable var9) {
                  aqh var7 = aqh.a(var9, "Exception generating new chunk");
                  apu var8 = var7.a("Chunk to be generated");
                  var8.a((String)"Location", (Object)String.format("%d,%d", var1, var2));
                  var8.a((String)"Position hash", (Object)var3);
                  var8.a((String)"Generator", (Object)this.am.a());
                  throw new ape(var7);
               }
            }
         }

         this.ak.a(var3, var5);
         this.aj.add(var5);
         if (var5 != null) {
            var5.char();
         }

         var5.a(this, this, var1, var2);
      }

      return var5;
   }

   public xx do(int var1, int var2) {
      xx var3 = (xx)this.ak.int(zi.a(var1, var2));
      return var3 == null ? (!this.ai.i && !this.ah ? this.an : this.if(var1, var2)) : var3;
   }

   private xx new(int var1, int var2) {
      if (this.al == null) {
         return null;
      } else {
         try {
            xx var3 = this.al.a(this.ai, var1, var2);
            if (var3 != null) {
               var3.byte = this.ai.m();
               if (this.am != null) {
                  this.am.a(var1, var2);
               }
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private void if(xx var1) {
      if (this.al != null) {
         try {
            this.al.a(this.ai, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   private void a(xx var1) {
      if (this.al != null) {
         try {
            var1.byte = this.ai.m();
            this.al.if(this.ai, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         } catch (y2 var4) {
            var4.printStackTrace();
         }
      }

   }

   public void a(x0 var1, int var2, int var3) {
      xx var4 = this.do(var2, var3);
      if (!var4.else) {
         var4.else = true;
         if (this.am != null) {
            this.am.a(var1, var2, var3);
            ModLoader.a(this.am, var2, var3, this.ai);
            var4.byte();
         }
      }

   }

   public boolean a(boolean var1, ajo var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.aj.size(); ++var4) {
         xx var5 = (xx)this.aj.get(var4);
         if (var1) {
            this.if(var5);
         }

         if (var5.a(var1)) {
            this.a(var5);
            var5.char = false;
            ++var3;
            if (var3 == 24 && !var1) {
               return false;
            }
         }
      }

      if (var1) {
         if (this.al == null) {
            return true;
         }

         this.al.if();
      }

      return true;
   }

   public boolean for() {
      if (!this.ai.Q) {
         for(int var1 = 0; var1 < 100; ++var1) {
            if (!this.ag.isEmpty()) {
               Long var2 = (Long)this.ag.iterator().next();
               xx var3 = (xx)this.ak.int(var2);
               var3.if();
               this.a(var3);
               this.if(var3);
               this.ag.remove(var2);
               this.ak.new(var2);
               this.aj.remove(var3);
            }
         }

         if (this.al != null) {
            this.al.do();
         }
      }

      return this.am.for();
   }

   public boolean if() {
      return !this.ai.Q;
   }

   public String a() {
      return "ServerChunkCache: " + this.ak.if() + " Drop: " + this.ag.size();
   }

   public List a(ah9 var1, int var2, int var3, int var4) {
      return this.am.a(var1, var2, var3, var4);
   }

   public yp a(y6 var1, String var2, int var3, int var4, int var5) {
      return this.am.a(var1, var2, var3, var4, var5);
   }

   public int do() {
      return this.ak.if();
   }

   public void a(int var1, int var2) {
   }
}
