import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class xg implements x0 {
   private y6 af;
   private Random ae;
   private final byte[] ad = new byte[256];
   private final byte[] ac = new byte[256];
   private final we ab;
   private final List aa = new ArrayList();
   private final boolean Z;
   private final boolean Y;
   private wu X;
   private wu W;

   public xg(y6 var1, long var2, boolean var4, String var5) {
      this.af = var1;
      this.ae = new Random(var2);
      this.ab = we.a(var5);
      if (var4) {
         Map var6 = this.ab.if();
         if (var6.containsKey("village")) {
            Map var7 = (Map)var6.get("village");
            if (!var7.containsKey("size")) {
               var7.put("size", "1");
            }

            this.aa.add(new uh(var7));
         }

         if (var6.containsKey("biome_1")) {
            this.aa.add(new vk((Map)var6.get("biome_1")));
         }

         if (var6.containsKey("mineshaft")) {
            this.aa.add(new wb((Map)var6.get("mineshaft")));
         }

         if (var6.containsKey("stronghold")) {
            this.aa.add(new vb((Map)var6.get("stronghold")));
         }
      }

      this.Z = this.ab.if().containsKey("decoration");
      if (this.ab.if().containsKey("lake")) {
         this.X = new wu(pa.ba.void);
      }

      if (this.ab.if().containsKey("lava_lake")) {
         this.W = new wu(pa.a4.void);
      }

      this.Y = this.ab.if().containsKey("dungeon");
      Iterator var9 = this.ab.a().iterator();

      while(var9.hasNext()) {
         wd var10 = (wd)var9.next();

         for(int var8 = var10.for(); var8 < var10.for() + var10.do(); ++var8) {
            this.ad[var8] = (byte)(var10.if() & 255);
            this.ac[var8] = (byte)var10.a();
         }
      }

   }

   public xx if(int var1, int var2) {
      return this.do(var1, var2);
   }

   public xx do(int var1, int var2) {
      xx var3 = new xx(this.af, var1, var2);

      for(int var4 = 0; var4 < this.ad.length; ++var4) {
         int var5 = var4 >> 4;
         xw var6 = var3.else()[var5];
         if (var6 == null) {
            var6 = new xw(var4, !this.af.n.for);
            var3.else()[var5] = var6;
         }

         for(int var7 = 0; var7 < 16; ++var7) {
            for(int var8 = 0; var8 < 16; ++var8) {
               var6.a(var7, var4 & 15, var8, this.ad[var4] & 255);
               var6.do(var7, var4 & 15, var8, this.ac[var4]);
            }
         }
      }

      var3.for();
      yn[] var9 = this.af.void().a((yn[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var10 = var3.new();

      for(int var11 = 0; var11 < var10.length; ++var11) {
         var10[var11] = (byte)var9[var11].try;
      }

      Iterator var12 = this.aa.iterator();

      while(var12.hasNext()) {
         uo var13 = (uo)var12.next();
         var13.a(this, this.af, var1, var2, (byte[])null);
      }

      var3.for();
      return var3;
   }

   public boolean for(int var1, int var2) {
      return true;
   }

   public void a(x0 var1, int var2, int var3) {
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      yn var6 = this.af.a(var4 + 16, var5 + 16);
      boolean var7 = false;
      this.ae.setSeed(this.af.b());
      long var8 = this.ae.nextLong() / 2L * 2L + 1L;
      long var10 = this.ae.nextLong() / 2L * 2L + 1L;
      this.ae.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.af.b());
      Iterator var12 = this.aa.iterator();

      while(var12.hasNext()) {
         uo var13 = (uo)var12.next();
         boolean var14 = var13.a(this.af, this.ae, var2, var3);
         if (var13 instanceof uh) {
            var7 |= var14;
         }
      }

      int var16;
      int var17;
      int var18;
      if (this.X != null && !var7 && this.ae.nextInt(4) == 0) {
         var16 = var4 + this.ae.nextInt(16) + 8;
         var17 = this.ae.nextInt(128);
         var18 = var5 + this.ae.nextInt(16) + 8;
         this.X.a(this.af, this.ae, var16, var17, var18);
      }

      if (this.W != null && !var7 && this.ae.nextInt(8) == 0) {
         var16 = var4 + this.ae.nextInt(16) + 8;
         var17 = this.ae.nextInt(this.ae.nextInt(120) + 8);
         var18 = var5 + this.ae.nextInt(16) + 8;
         if (var17 < 63 || this.ae.nextInt(10) == 0) {
            this.W.a(this.af, this.ae, var16, var17, var18);
         }
      }

      if (this.Y) {
         for(var16 = 0; var16 < 8; ++var16) {
            var17 = var4 + this.ae.nextInt(16) + 8;
            var18 = this.ae.nextInt(128);
            int var15 = var5 + this.ae.nextInt(16) + 8;
            (new wr()).a(this.af, this.ae, var17, var18, var15);
         }
      }

      if (this.Z) {
         var6.a(this.af, this.ae, var4, var5);
      }

   }

   public boolean a(boolean var1, ajo var2) {
      return true;
   }

   public boolean for() {
      return false;
   }

   public boolean if() {
      return true;
   }

   public String a() {
      return "FlatLevelSource";
   }

   public List a(ah9 var1, int var2, int var3, int var4) {
      yn var5 = this.af.a(var2, var4);
      return var5 == null ? null : var5.a(var1);
   }

   public yp a(y6 var1, String var2, int var3, int var4, int var5) {
      if ("Stronghold".equals(var2)) {
         Iterator var6 = this.aa.iterator();

         while(var6.hasNext()) {
            uo var7 = (uo)var6.next();
            if (var7 instanceof vb) {
               return var7.a(var1, var3, var4, var5);
            }
         }
      }

      return null;
   }

   public int do() {
      return 0;
   }

   public void a(int var1, int var2) {
      Iterator var3 = this.aa.iterator();

      while(var3.hasNext()) {
         uo var4 = (uo)var3.next();
         var4.a(this, this.af, var1, var2, (byte[])null);
      }

   }
}
