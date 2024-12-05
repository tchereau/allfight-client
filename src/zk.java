import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class zk {
   public int goto = 20;
   private String long = "Pig";
   private List case = null;
   private zj byte = null;
   public double else;
   public double char = 0.0D;
   private int try = 200;
   private int new = 800;
   private int int = 4;
   private aiw for;
   private int do = 6;
   private int if = 16;
   private int a = 4;

   public String new() {
      if (this.for() == null) {
         if (this.long.equals("Minecart")) {
            this.long = "MinecartRideable";
         }

         return this.long;
      } else {
         return this.for().for;
      }
   }

   public void a(String var1) {
      this.long = var1;
   }

   public boolean char() {
      return this.do().a((double)this.byte() + 0.5D, (double)this.try() + 0.5D, (double)this.if() + 0.5D, (double)this.if) != null;
   }

   public void case() {
      if (this.char()) {
         double var5;
         if (this.do().goto) {
            double var12 = (double)((float)this.byte() + this.do().o.nextFloat());
            double var13 = (double)((float)this.try() + this.do().o.nextFloat());
            var5 = (double)((float)this.if() + this.do().o.nextFloat());
            this.do().a("smoke", var12, var13, var5, 0.0D, 0.0D, 0.0D);
            this.do().a("flame", var12, var13, var5, 0.0D, 0.0D, 0.0D);
            if (this.goto > 0) {
               --this.goto;
            }

            this.char = this.else;
            this.else = (this.else + (double)(1000.0F / ((float)this.goto + 200.0F))) % 360.0D;
         } else {
            if (this.goto == -1) {
               this.a();
            }

            if (this.goto > 0) {
               --this.goto;
               return;
            }

            boolean var1 = false;
            int var2 = 0;

            while(true) {
               if (var2 >= this.int) {
                  if (var1) {
                     this.a();
                  }
                  break;
               }

               aiw var3 = air.a(this.new(), this.do());
               if (var3 == null) {
                  return;
               }

               int var4 = this.do().a(var3.getClass(), nw.if().a((double)this.byte(), (double)this.try(), (double)this.if(), (double)(this.byte() + 1), (double)(this.try() + 1), (double)(this.if() + 1)).do((double)(this.a * 2), 4.0D, (double)(this.a * 2))).size();
               if (var4 >= this.do) {
                  this.a();
                  return;
               }

               var5 = (double)this.byte() + (this.do().o.nextDouble() - this.do().o.nextDouble()) * (double)this.a;
               double var7 = (double)(this.try() + this.do().o.nextInt(3) - 1);
               double var9 = (double)this.if() + (this.do().o.nextDouble() - this.do().o.nextDouble()) * (double)this.a;
               aig var11 = var3 instanceof aig ? (aig)var3 : null;
               var3.if(var5, var7, var9, this.do().o.nextFloat() * 360.0F, 0.0F);
               if (var11 == null || var11.bj()) {
                  this.a(var3);
                  this.do().for(2004, this.byte(), this.try(), this.if(), 0);
                  if (var11 != null) {
                     var11.br();
                  }

                  var1 = true;
               }

               ++var2;
            }
         }

      }
   }

   public aiw a(aiw var1) {
      if (this.for() != null) {
         aqv var2 = new aqv();
         var1.case(var2);
         Iterator var3 = this.for().if.new().iterator();

         while(var3.hasNext()) {
            aqd var4 = (aqd)var3.next();
            var2.a(var4.if(), var4.do());
         }

         var1.byte(var2);
         if (var1.ap != null) {
            var1.ap.new(var1);
         }

         aqv var10;
         for(aiw var9 = var1; var2.try("Riding"); var2 = var10) {
            var10 = var2.char("Riding");
            aiw var5 = air.a(var10.new("id"), this.do());
            if (var5 != null) {
               aqv var6 = new aqv();
               var5.case(var6);
               Iterator var7 = var10.new().iterator();

               while(var7.hasNext()) {
                  aqd var8 = (aqd)var7.next();
                  var6.a(var8.if(), var8.do());
               }

               var5.byte(var6);
               var5.if(var9.al, var9.ak, var9.aj, var9.a5, var9.a4);
               this.do().new(var5);
               var9.int(var5);
            }

            var9 = var5;
         }
      } else if (var1 instanceof aig && var1.ap != null) {
         ((aig)var1).bO();
         this.do().new(var1);
      }

      return var1;
   }

   private void a() {
      if (this.new <= this.try) {
         this.goto = this.try;
      } else {
         int var10003 = this.new - this.try;
         this.goto = this.try + this.do().o.nextInt(var10003);
      }

      if (this.case != null && this.case.size() > 0) {
         this.a((zj)ajk.a(this.do().o, (Collection)this.case));
      }

      this.if(1);
   }

   public void if(aqv var1) {
      this.long = var1.new("EntityId");
      this.goto = var1.case("Delay");
      if (var1.try("SpawnPotentials")) {
         this.case = new ArrayList();
         aqm var2 = var1.void("SpawnPotentials");

         for(int var3 = 0; var3 < var2.for(); ++var3) {
            this.case.add(new zj(this, (aqv)var2.a(var3)));
         }
      } else {
         this.case = null;
      }

      if (var1.try("SpawnData")) {
         this.a(new zj(this, var1.char("SpawnData"), this.long));
      } else {
         this.a((zj)null);
      }

      if (var1.try("MinSpawnDelay")) {
         this.try = var1.case("MinSpawnDelay");
         this.new = var1.case("MaxSpawnDelay");
         this.int = var1.case("SpawnCount");
      }

      if (var1.try("MaxNearbyEntities")) {
         this.do = var1.case("MaxNearbyEntities");
         this.if = var1.case("RequiredPlayerRange");
      }

      if (var1.try("SpawnRange")) {
         this.a = var1.case("SpawnRange");
      }

      if (this.do() != null && this.do().goto) {
         this.for = null;
      }

   }

   public void a(aqv var1) {
      var1.a("EntityId", this.new());
      var1.a("Delay", (short)this.goto);
      var1.a("MinSpawnDelay", (short)this.try);
      var1.a("MaxSpawnDelay", (short)this.new);
      var1.a("SpawnCount", (short)this.int);
      var1.a("MaxNearbyEntities", (short)this.do);
      var1.a("RequiredPlayerRange", (short)this.if);
      var1.a("SpawnRange", (short)this.a);
      if (this.for() != null) {
         var1.a("SpawnData", (aqv)this.for().if.do());
      }

      if (this.for() != null || this.case != null && this.case.size() > 0) {
         aqm var2 = new aqm();
         if (this.case != null && this.case.size() > 0) {
            Iterator var3 = this.case.iterator();

            while(var3.hasNext()) {
               zj var4 = (zj)var3.next();
               var2.a((aqd)var4.a());
            }
         } else {
            var2.a((aqd)this.for().a());
         }

         var1.a("SpawnPotentials", (aqd)var2);
      }

   }

   public aiw int() {
      if (this.for == null) {
         aiw var1 = air.a((String)this.new(), (y6)null);
         var1 = this.a(var1);
         this.for = var1;
      }

      return this.for;
   }

   public boolean a(int var1) {
      if (var1 == 1 && this.do().goto) {
         this.goto = this.try;
         return true;
      } else {
         return false;
      }
   }

   public zj for() {
      return this.byte;
   }

   public void a(zj var1) {
      this.byte = var1;
   }

   public abstract void if(int var1);

   public abstract y6 do();

   public abstract int byte();

   public abstract int try();

   public abstract int if();
}
