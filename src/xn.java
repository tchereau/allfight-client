import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class xn implements xt, sa {
   private List if = new ArrayList();
   private Set a = new HashSet();
   private Object for = new Object();
   private final File do;

   public xn(File var1) {
      this.do = var1;
   }

   public xx a(y6 var1, int var2, int var3) {
      aqv var4 = null;
      zi var5 = new zi(var2, var3);
      synchronized(this.for) {
         if (this.a.contains(var5)) {
            for(int var7 = 0; var7 < this.if.size(); ++var7) {
               if (((xm)this.if.get(var7)).if.equals(var5)) {
                  var4 = ((xm)this.if.get(var7)).a;
                  break;
               }
            }
         }
      }

      if (var4 == null) {
         DataInputStream var6 = xo.do(this.do, var2, var3);
         if (var6 == null) {
            return null;
         }

         var4 = aqk.a((DataInput)var6);
      }

      return this.a(var1, var2, var3, var4);
   }

   protected xx a(y6 var1, int var2, int var3, aqv var4) {
      if (!var4.try("Level")) {
         var1.char().do("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if (!var4.char("Level").try("Sections")) {
         var1.char().do("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         xx var5 = this.a(var1, var4.char("Level"));
         if (!var5.if(var2, var3)) {
            var1.char().do("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var5.b + ", " + var5.void + ")");
            var4.a("xPos", var2);
            var4.a("zPos", var3);
            var5 = this.a(var1, var4.char("Level"));
         }

         return var5;
      }
   }

   public void if(y6 var1, xx var2) {
      var1.for();

      try {
         aqv var3 = new aqv();
         aqv var4 = new aqv();
         var3.a("Level", (aqd)var4);
         this.a(var2, var1, var4);
         this.a(var2.void(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected void a(zi var1, aqv var2) {
      synchronized(this.for) {
         if (this.a.contains(var1)) {
            for(int var4 = 0; var4 < this.if.size(); ++var4) {
               if (((xm)this.if.get(var4)).if.equals(var1)) {
                  this.if.set(var4, new xm(var1, var2));
                  return;
               }
            }
         }

         this.if.add(new xm(var1, var2));
         this.a.add(var1);
         sb.if.a(this);
      }
   }

   public boolean a() {
      xm var1 = null;
      synchronized(this.for) {
         if (this.if.isEmpty()) {
            return false;
         }

         var1 = (xm)this.if.remove(0);
         this.a.remove(var1.if);
      }

      if (var1 != null) {
         try {
            this.a(var1);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return true;
   }

   private void a(xm var1) {
      DataOutputStream var2 = xo.a(this.do, var1.if.if, var1.if.a);
      aqk.a(var1.a, (DataOutput)var2);
      var2.close();
   }

   public void a(y6 var1, xx var2) {
   }

   public void do() {
   }

   public void if() {
   }

   private void a(xx var1, y6 var2, aqv var3) {
      var3.a("xPos", var1.b);
      var3.a("zPos", var1.void);
      var3.a("LastUpdate", var2.m());
      var3.a("HeightMap", var1.c);
      var3.a("TerrainPopulated", var1.else);
      xw[] var4 = var1.else();
      aqm var5 = new aqm("Sections");
      boolean var6 = !var2.n.for;
      xw[] var7 = var4;
      int var8 = var4.length;

      aqv var11;
      for(int var9 = 0; var9 < var8; ++var9) {
         xw var10 = var7[var9];
         if (var10 != null) {
            var11 = new aqv();
            var11.a("Y", (byte)(var10.int() >> 4 & 255));
            var11.a("Blocks", var10.char());
            if (var10.try() != null) {
               var11.a("Add", var10.try().if);
            }

            var11.a("Data", var10.a().if);
            var11.a("BlockLight", var10.do().if);
            if (var6) {
               var11.a("SkyLight", var10.byte().if);
            } else {
               var11.a("SkyLight", new byte[var10.do().if.length]);
            }

            var5.a((aqd)var11);
         }
      }

      var3.a("Sections", (aqd)var5);
      var3.a("Biomes", var1.new());
      var1.case = false;
      aqm var16 = new aqm();

      Iterator var18;
      for(var8 = 0; var8 < var1.goto.length; ++var8) {
         var18 = var1.goto[var8].iterator();

         while(var18.hasNext()) {
            aiw var20 = (aiw)var18.next();
            var11 = new aqv();
            if (var20.case(var11)) {
               var1.case = true;
               var16.a((aqd)var11);
            }
         }
      }

      var3.a("Entities", (aqd)var16);
      aqm var17 = new aqm();
      var18 = var1.long.values().iterator();

      while(var18.hasNext()) {
         n4 var21 = (n4)var18.next();
         var11 = new aqv();
         var21.do(var11);
         var17.a((aqd)var11);
      }

      var3.a("TileEntities", (aqd)var17);
      List var19 = var2.a(var1, false);
      if (var19 != null) {
         long var22 = var2.m();
         aqm var12 = new aqm();
         Iterator var13 = var19.iterator();

         while(var13.hasNext()) {
            yr var14 = (yr)var13.next();
            aqv var15 = new aqv();
            var15.a("i", var14.try);
            var15.a("x", var14.if);
            var15.a("y", var14.a);
            var15.a("z", var14.byte);
            var15.a("t", (int)(var14.new - var22));
            var15.a("p", var14.int);
            var12.a((aqd)var15);
         }

         var3.a("TileTicks", (aqd)var12);
      }

   }

   private xx a(y6 var1, aqv var2) {
      int var3 = var2.goto("xPos");
      int var4 = var2.goto("zPos");
      xx var5 = new xx(var1, var3, var4);
      var5.c = var2.for("HeightMap");
      var5.else = var2.if("TerrainPopulated");
      aqm var6 = var2.void("Sections");
      byte var7 = 16;
      xw[] var8 = new xw[var7];
      boolean var9 = !var1.n.for;

      for(int var10 = 0; var10 < var6.for(); ++var10) {
         aqv var11 = (aqv)var6.a(var10);
         byte var12 = var11.else("Y");
         xw var13 = new xw(var12 << 4, var9);
         var13.a(var11.int("Blocks"));
         if (var11.try("Add")) {
            var13.for(new xz(var11.int("Add"), 4));
         }

         var13.a(new xz(var11.int("Data"), 4));
         var13.do(new xz(var11.int("BlockLight"), 4));
         if (var9) {
            var13.if(new xz(var11.int("SkyLight"), 4));
         }

         var13.for();
         var8[var12] = var13;
      }

      var5.a(var8);
      if (var2.try("Biomes")) {
         var5.a(var2.int("Biomes"));
      }

      aqm var17 = var2.void("Entities");
      if (var17 != null) {
         for(int var18 = 0; var18 < var17.for(); ++var18) {
            aqv var20 = (aqv)var17.a(var18);
            aiw var22 = air.a(var20, var1);
            var5.case = true;
            if (var22 != null) {
               var5.if(var22);
               aiw var14 = var22;

               for(aqv var15 = var20; var15.try("Riding"); var15 = var15.char("Riding")) {
                  aiw var16 = air.a(var15.char("Riding"), var1);
                  if (var16 != null) {
                     var5.if(var16);
                     var14.int(var16);
                  }

                  var14 = var16;
               }
            }
         }
      }

      aqm var19 = var2.void("TileEntities");
      if (var19 != null) {
         for(int var21 = 0; var21 < var19.for(); ++var21) {
            aqv var24 = (aqv)var19.a(var21);
            n4 var26 = n4.if(var24);
            if (var26 != null) {
               var5.a(var26);
            }
         }
      }

      if (var2.try("TileTicks")) {
         aqm var23 = var2.void("TileTicks");
         if (var23 != null) {
            for(int var25 = 0; var25 < var23.for(); ++var25) {
               aqv var27 = (aqv)var23.a(var25);
               var1.if(var27.goto("x"), var27.goto("y"), var27.goto("z"), var27.goto("i"), var27.goto("t"), var27.goto("p"));
            }
         }
      }

      return var5;
   }
}
