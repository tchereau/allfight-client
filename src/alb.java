import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

public class alb {
   private final ak5 if;
   private Set a = new HashSet();
   private ajy for = new ajy();
   private int do;

   public alb(ak5 var1) {
      this.if = var1;
      this.do = var1.F().g6().a();
   }

   public void if(aiw var1) {
      if (var1 instanceof ak2) {
         this.a(var1, 512, 2);
         ak2 var2 = (ak2)var1;
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            ak0 var4 = (ak0)var3.next();
            if (var4.j != var2) {
               var4.a(var2);
            }
         }
      } else if (var1 instanceof aee) {
         this.a(var1, 64, 5, true);
      } else if (var1 instanceof aei) {
         this.a(var1, 64, 20, false);
      } else if (var1 instanceof aeb) {
         this.a(var1, 64, 10, false);
      } else if (var1 instanceof aeg) {
         this.a(var1, 64, 10, false);
      } else if (var1 instanceof aea) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof ad6) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof aeh) {
         this.a(var1, 64, 4, true);
      } else if (var1 instanceof ad7) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof ad4) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof ad5) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof aef) {
         this.a(var1, 64, 10, true);
      } else if (var1 instanceof afk) {
         this.a(var1, 64, 20, true);
      } else if (var1 instanceof afj) {
         this.a(var1, 80, 3, true);
      } else if (var1 instanceof afm) {
         this.a(var1, 80, 3, true);
      } else if (var1 instanceof afz) {
         this.a(var1, 64, 3, true);
      } else if (var1 instanceof afq) {
         this.a(var1, 80, 3, false);
      } else if (var1 instanceof aga) {
         this.a(var1, 80, 3, false);
      } else if (var1 instanceof aix) {
         this.a(var1, 80, 3, true);
      } else if (var1 instanceof afr) {
         this.a(var1, 160, 3, true);
      } else if (var1 instanceof afa) {
         this.a(var1, 160, 10, true);
      } else if (var1 instanceof afl) {
         this.a(var1, 160, 20, true);
      } else if (var1 instanceof ah7) {
         this.a(var1, 160, Integer.MAX_VALUE, false);
      } else if (var1 instanceof aik) {
         this.a(var1, 160, 20, true);
      } else if (var1 instanceof afs) {
         this.a(var1, 256, Integer.MAX_VALUE, false);
      } else if (var1 instanceof aih) {
         this.a(var1, 160, Integer.MAX_VALUE, false);
      } else {
         Iterator var5 = ModLoader.a().values().iterator();

         while(var5.hasNext()) {
            g var6 = (g)var5.next();
            if (var6.a.isAssignableFrom(var1.getClass())) {
               this.a(var1, var6.int, var6.for, var6.do);
            }
         }
      }

   }

   public void a(aiw var1, int var2, int var3) {
      this.a(var1, var2, var3, false);
   }

   public void a(aiw var1, int var2, int var3, boolean var4) {
      if (var2 > this.do) {
         var2 = this.do;
      }

      try {
         if (this.for.byte(var1.av)) {
            throw new IllegalStateException("Entity is already tracked!");
         }

         ak0 var5 = new ak0(var1, var2, var3, var4);
         this.a.add(var5);
         this.for.a(var1.av, var5);
         var5.if(this.if.z);
      } catch (Throwable var11) {
         aqh var6 = aqh.a(var11, "Adding entity to track");
         apu var7 = var6.a("Entity To Track");
         var7.a((String)"Tracking range", (Object)(var2 + " blocks"));
         var7.a((String)"Update interval", (Callable)(new ala(this, var3)));
         var1.if(var7);
         apu var8 = var6.a("Entity That Is Already Tracked");
         ((ak0)this.for.for(var1.av)).j.if(var8);

         try {
            throw new ape(var6);
         } catch (ape var10) {
            System.err.println("\"Silently\" catching entity tracking error.");
            var10.printStackTrace();
         }
      }

   }

   public void a(aiw var1) {
      if (var1 instanceof ak2) {
         ak2 var2 = (ak2)var1;
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            ak0 var4 = (ak0)var3.next();
            var4.if(var2);
         }
      }

      ak0 var5 = (ak0)this.for.try(var1.av);
      if (var5 != null) {
         this.a.remove(var5);
         var5.a();
      }

   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ak0 var3 = (ak0)var2.next();
         var3.a(this.if.z);
         if (var3.char && var3.j instanceof ak2) {
            var1.add((ak2)var3.j);
         }
      }

      for(int var7 = 0; var7 < var1.size(); ++var7) {
         ak2 var4 = (ak2)var1.get(var7);
         Iterator var5 = this.a.iterator();

         while(var5.hasNext()) {
            ak0 var6 = (ak0)var5.next();
            if (var6.j != var4) {
               var6.a(var4);
            }
         }
      }

   }

   public void a(aiw var1, an7 var2) {
      ak0 var3 = (ak0)this.for.for(var1.av);
      if (var3 != null) {
         var3.if(var2);
      }

   }

   public void if(aiw var1, an7 var2) {
      ak0 var3 = (ak0)this.for.for(var1.av);
      if (var3 != null) {
         var3.a(var2);
      }

   }

   public void a(ak2 var1) {
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ak0 var3 = (ak0)var2.next();
         var3.for(var1);
      }

   }

   public void a(ak2 var1, xx var2) {
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         ak0 var4 = (ak0)var3.next();
         if (var4.j != var1 && var4.j.be == var2.b && var4.j.bc == var2.void) {
            var4.a(var1);
         }
      }

   }
}
