import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ix extends i5 {
   private final i5 lu;
   private final ke lt;
   private final List lA = new ArrayList();
   private final List ly = new ArrayList();
   private String lz;
   private String[] lx;
   private iw lw;
   private j6 lv;

   public ix(i5 var1, ke var2) {
      this.lu = var1;
      this.lt = var2;
   }

   public void dA() {
      this.lz = aqz.if("options.snooper.title");
      String var1 = aqz.if("options.snooper.desc");
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.hR.do(var1, this.hV - 30).iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         var2.add(var4);
      }

      this.lx = (String[])var2.toArray(new String[0]);
      this.lA.clear();
      this.ly.clear();
      this.hT.add(this.lv = new j6(1, this.hV / 2 - 152, this.hU - 30, 150, 20, this.lt.do(kc.o)));
      this.hT.add(new j6(2, this.hV / 2 + 2, this.hU - 30, 150, 20, aqz.if("gui.done")));
      boolean var6 = this.hW.hV() != null && this.hW.hV().gZ() != null;
      Iterator var7 = (new TreeMap(this.hW.ip().byte())).entrySet().iterator();

      Entry var5;
      while(var7.hasNext()) {
         var5 = (Entry)var7.next();
         this.lA.add((var6 ? "C " : "") + (String)var5.getKey());
         this.ly.add(this.hR.a((String)var5.getValue(), this.hV - 220));
      }

      if (var6) {
         var7 = (new TreeMap(this.hW.hV().gZ().byte())).entrySet().iterator();

         while(var7.hasNext()) {
            var5 = (Entry)var7.next();
            this.lA.add("S " + (String)var5.getKey());
            this.ly.add(this.hR.a((String)var5.getValue(), this.hV - 220));
         }
      }

      this.lw = new iw(this);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 2) {
            this.lt.new();
            this.lt.new();
            this.hW.a(this.lu);
         }

         if (var1.hv == 1) {
            this.lt.a((kc)kc.o, 1);
            this.lv.hw = this.lt.do(kc.o);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.lw.a(var1, var2, var3);
      this.a(this.hR, this.lz, this.hV / 2, 8, 16777215);
      int var4 = 22;
      String[] var5 = this.lx;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String var8 = var5[var7];
         this.a(this.hR, var8, this.hV / 2, var4, 8421504);
         var4 += this.hR.i;
      }

      super.if(var1, var2, var3);
   }

   // $FF: synthetic method
   static List if(ix var0) {
      return var0.lA;
   }

   // $FF: synthetic method
   static List a(ix var0) {
      return var0.ly;
   }
}
