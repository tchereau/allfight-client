import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public abstract class amh {
   private static final SimpleDateFormat else = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final net.minecraft.a.a char;
   public final List void = new ArrayList();
   private final am5 case = new am5(new File("banned-players.txt"));
   private final am5 byte = new am5(new File("banned-ips.txt"));
   private Set try = new HashSet();
   private Set new = new HashSet();
   private sd int;
   private boolean for;
   protected int long;
   protected int goto;
   private yz do;
   private boolean if;
   private int a = 0;

   public amh(net.minecraft.a.a var1) {
      this.char = var1;
      this.case.if(false);
      this.byte.if(false);
      this.long = 8;
   }

   public void a(aqb var1, ak2 var2) {
      aqv var3 = this.a(var2);
      var2.if((y6)this.char.aS(var2.a6));
      var2.pT.a((ak5)var2.ap);
      String var4 = "local";
      if (var1.do() != null) {
         var4 = var1.do().toString();
      }

      this.char.a().a(var2.fJ + "[" + var4 + "] logged in with entity id " + var2.av + " at (" + var2.al + ", " + var2.ak + ", " + var2.aj + ")");
      ak5 var5 = this.char.aS(var2.a6);
      apg var6 = var5.long();
      this.a(var2, (ak2)null, var5);
      akx var7 = new akx(this.char, var1, var2);
      var7.if((an7)(new aog(var2.av, var5.l().new(), var2.pT.a(), var5.l().void(), var5.n.if, var5.p, var5.if(), this.else())));
      var7.if((an7)(new anj(var6.if, var6.a, var6.do)));
      var7.if((an7)(new an5(var2.fY)));
      var7.if((an7)(new anw(var2.fR.aa)));
      this.a((amf)var5.f(), var2);
      this.a(var2, var5);
      this.a((an7)(new apf(aqj.b + var2.at() + aqj.b + " joined the game.")));
      this.do(var2);
      var7.a(var2.al, var2.ak, var2.aj, var2.a5, var2.a4);
      this.char.ho().a(var7);
      var7.if((an7)(new ani(var5.m(), var5.t())));
      if (this.char.gU().length() > 0) {
         var2.for(this.char.gU(), this.char.hx());
      }

      Iterator var8 = var2.bi().iterator();

      while(var8.hasNext()) {
         aiz var9 = (aiz)var8.next();
         var7.if((an7)(new am9(var2.av, var9)));
      }

      var2.eG();
      if (var3 != null && var3.try("Riding")) {
         aiw var10 = air.a((aqv)var3.char("Riding"), var5);
         if (var10 != null) {
            var10.aq = true;
            var5.new(var10);
            var2.int(var10);
            var10.aq = false;
         }
      }

   }

   protected void a(amf var1, ak2 var2) {
      HashSet var3 = new HashSet();
      Iterator var4 = var1.int().iterator();

      while(var4.hasNext()) {
         no var5 = (no)var4.next();
         var2.pV.if((an7)(new anm(var5, 0)));
      }

      for(int var9 = 0; var9 < 3; ++var9) {
         np var10 = var1.if(var9);
         if (var10 != null && !var3.contains(var10)) {
            List var6 = var1.new(var10);
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               an7 var8 = (an7)var7.next();
               var2.pV.if(var8);
            }

            var3.add(var10);
         }
      }

   }

   public void a(ak5[] var1) {
      this.int = var1[0].x().for();
   }

   public void if(ak2 var1, ak5 var2) {
      ak5 var3 = var1.eC();
      if (var2 != null) {
         var2.E().for(var1);
      }

      var3.E().if(var1);
      var3.T.if((int)var1.al >> 4, (int)var1.aj >> 4);
   }

   public int a() {
      return ak8.a(this.b());
   }

   public aqv a(ak2 var1) {
      aqv var2 = this.char.t4[0].l().byte();
      aqv var3;
      if (var1.do().equals(this.char.hC()) && var2 != null) {
         var1.byte(var2);
         var3 = var2;
         System.out.println("loading single player");
      } else {
         var3 = this.int.a(var1);
      }

      return var3;
   }

   protected void if(ak2 var1) {
      this.int.if(var1);
   }

   public void do(ak2 var1) {
      this.a((an7)(new an2(var1.fJ, true, 1000)));
      this.void.add(var1);
      ak5 var2 = this.char.aS(var1.a6);
      var2.new(var1);
      this.if(var1, (ak5)null);

      for(int var3 = 0; var3 < this.void.size(); ++var3) {
         ak2 var4 = (ak2)this.void.get(var3);
         var1.pV.if((an7)(new an2(var4.fJ, true, var4.pN)));
      }

   }

   public void for(ak2 var1) {
      var1.eC().E().do(var1);
   }

   public void int(ak2 var1) {
      this.if(var1);
      ak5 var2 = var1.eC();
      if (var1.ar != null) {
         var2.a((aiw)var1.ar);
         System.out.println("removing player mount");
      }

      var2.a((aiw)var1);
      var2.E().for(var1);
      this.void.remove(var1);
      this.a((an7)(new an2(var1.fJ, false, 9999)));
   }

   public String a(SocketAddress var1, String var2) {
      if (this.case.if(var2)) {
         am6 var6 = (am6)this.case.for().get(var2);
         String var7 = "You are banned from this server!\nReason: " + var6.do();
         if (var6.int() != null) {
            var7 = var7 + "\nYour ban will be removed on " + else.format(var6.int());
         }

         return var7;
      } else if (!this.do(var2)) {
         return "You are not white-listed on this server!";
      } else {
         String var3 = var1.toString();
         var3 = var3.substring(var3.indexOf("/") + 1);
         var3 = var3.substring(0, var3.indexOf(":"));
         if (this.byte.if(var3)) {
            am6 var4 = (am6)this.byte.for().get(var3);
            String var5 = "Your IP address is banned from this server!\nReason: " + var4.do();
            if (var4.int() != null) {
               var5 = var5 + "\nYour ban will be removed on " + else.format(var4.int());
            }

            return var5;
         } else {
            return this.void.size() >= this.long ? "The server is full!" : null;
         }
      }
   }

   public ak2 new(String var1) {
      ArrayList var2 = new ArrayList();

      ak2 var4;
      for(int var3 = 0; var3 < this.void.size(); ++var3) {
         var4 = (ak2)this.void.get(var3);
         if (var4.fJ.equalsIgnoreCase(var1)) {
            var2.add(var4);
         }
      }

      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         var4 = (ak2)var5.next();
         var4.pV.if("You logged in from another location");
      }

      Object var6;
      if (this.char.hk()) {
         var6 = new ald(this.char.aS(0));
      } else {
         var6 = new ak1(this.char.aS(0));
      }

      return new ak2(this.char, this.char.aS(0), var1, (ak1)var6);
   }

   public ak2 a(ak2 var1, int var2, boolean var3) {
      var1.eC().D().a(var1);
      var1.eC().D().a((aiw)var1);
      var1.eC().E().for(var1);
      this.void.remove(var1);
      this.char.aS(var1.a6).do(var1);
      apg var4 = var1.cP();
      boolean var5 = var1.cQ();
      var1.a6 = var2;
      Object var6;
      if (this.char.hk()) {
         var6 = new ald(this.char.aS(var1.a6));
      } else {
         var6 = new ak1(this.char.aS(var1.a6));
      }

      ak2 var7 = new ak2(this.char, this.char.aS(var1.a6), var1.fJ, (ak1)var6);
      var7.pV = var1.pV;
      var7.a(var1, var3);
      var7.av = var1.av;
      ak5 var8 = this.char.aS(var1.a6);
      this.a(var7, var1, var8);
      apg var9;
      if (var4 != null) {
         var9 = aek.a(this.char.aS(var1.a6), var4, var5);
         if (var9 != null) {
            var7.if((double)((float)var9.if + 0.5F), (double)((float)var9.a + 0.1F), (double)((float)var9.do + 0.5F), 0.0F, 0.0F);
            var7.a(var4, var5);
         } else {
            var7.pV.if((an7)(new aoq(0, 0)));
         }
      }

      var8.T.if((int)var7.al >> 4, (int)var7.aj >> 4);

      while(!var8.if(var7, var7.aZ).isEmpty()) {
         var7.try(var7.al, var7.ak + 1.0D, var7.aj);
      }

      var7.pV.if((an7)(new anz(var7.a6, (byte)var7.ap.p, var7.ap.l().new(), var7.ap.if(), var7.pT.a())));
      var9 = var8.long();
      var7.pV.a(var7.al, var7.ak, var7.aj, var7.a5, var7.a4);
      var7.pV.if((an7)(new anj(var9.if, var9.a, var9.do)));
      var7.pV.if((an7)(new anp(var7.fV, var7.fW, var7.fX)));
      this.a(var7, var8);
      var8.E().if(var7);
      var8.new(var7);
      this.void.add(var7);
      var7.eG();
      var7.t(var7.cd());
      return var7;
   }

   public void a(ak2 var1, int var2) {
      int var3 = var1.a6;
      ak5 var4 = this.char.aS(var1.a6);
      var1.a6 = var2;
      ak5 var5 = this.char.aS(var1.a6);
      var1.pV.if((an7)(new anz(var1.a6, (byte)var1.ap.p, var5.l().new(), var5.if(), var1.pT.a())));
      var4.do(var1);
      var1.aR = false;
      this.a(var1, var3, var4, var5);
      this.if(var1, var4);
      var1.pV.a(var1.al, var1.ak, var1.aj, var1.a5, var1.a4);
      var1.pT.a(var5);
      this.a(var1, var5);
      this.new(var1);
      Iterator var6 = var1.bi().iterator();

      while(var6.hasNext()) {
         aiz var7 = (aiz)var6.next();
         var1.pV.if((an7)(new am9(var1.av, var7)));
      }

   }

   public void a(aiw var1, int var2, ak5 var3, ak5 var4) {
      double var5 = var1.al;
      double var7 = var1.aj;
      double var9 = 8.0D;
      double var11 = var1.al;
      double var13 = var1.ak;
      double var15 = var1.aj;
      float var17 = var1.a5;
      var3.e.a("moving");
      if (var1.a6 == -1) {
         var5 /= var9;
         var7 /= var9;
         var1.if(var5, var1.ak, var7, var1.a5, var1.a4);
         if (var1.aA()) {
            var3.a(var1, false);
         }
      } else if (var1.a6 == 0) {
         var5 *= var9;
         var7 *= var9;
         var1.if(var5, var1.ak, var7, var1.a5, var1.a4);
         if (var1.aA()) {
            var3.a(var1, false);
         }
      } else {
         apg var18;
         if (var2 == 1) {
            var18 = var4.long();
         } else {
            var18 = var4.G();
         }

         var5 = (double)var18.if;
         var1.ak = (double)var18.a;
         var7 = (double)var18.do;
         var1.if(var5, var1.ak, var7, 90.0F, 0.0F);
         if (var1.aA()) {
            var3.a(var1, false);
         }
      }

      var3.e.if();
      if (var2 != 1) {
         var3.e.a("placing");
         var5 = (double)ajs.a((int)var5, -29999872, 29999872);
         var7 = (double)ajs.a((int)var7, -29999872, 29999872);
         if (var1.aA()) {
            var4.new(var1);
            var1.if(var5, var1.ak, var7, var1.a5, var1.a4);
            var4.a(var1, false);
            var4.B().if(var1, var11, var13, var15, var17);
         }

         var3.e.if();
      }

      var1.if((y6)var4);
   }

   public void new() {
      if (++this.a > 600) {
         this.a = 0;
      }

      if (this.a < this.void.size()) {
         ak2 var1 = (ak2)this.void.get(this.a);
         this.a((an7)(new an2(var1.fJ, true, var1.pN)));
      }

   }

   public void a(an7 var1) {
      for(int var2 = 0; var2 < this.void.size(); ++var2) {
         ((ak2)this.void.get(var2)).pV.if(var1);
      }

   }

   public void a(an7 var1, int var2) {
      for(int var3 = 0; var3 < this.void.size(); ++var3) {
         ak2 var4 = (ak2)this.void.get(var3);
         if (var4.a6 == var2) {
            var4.pV.if(var1);
         }
      }

   }

   public String goto() {
      String var1 = "";

      for(int var2 = 0; var2 < this.void.size(); ++var2) {
         if (var2 > 0) {
            var1 = var1 + ", ";
         }

         var1 = var1 + ((ak2)this.void.get(var2)).fJ;
      }

      return var1;
   }

   public String[] try() {
      String[] var1 = new String[this.void.size()];

      for(int var2 = 0; var2 < this.void.size(); ++var2) {
         var1[var2] = ((ak2)this.void.get(var2)).fJ;
      }

      return var1;
   }

   public am5 int() {
      return this.case;
   }

   public am5 for() {
      return this.byte;
   }

   public void a(String var1) {
      this.try.add(var1.toLowerCase());
   }

   public void if(String var1) {
      this.try.remove(var1.toLowerCase());
   }

   public boolean do(String var1) {
      var1 = var1.trim().toLowerCase();
      return !this.for || this.try.contains(var1) || this.new.contains(var1);
   }

   public boolean for(String var1) {
      return this.try.contains(var1.trim().toLowerCase()) || this.char.hb() && this.char.t4[0].l().char() && this.char.hC().equalsIgnoreCase(var1) || this.if;
   }

   public ak2 char(String var1) {
      Iterator var2 = this.void.iterator();

      ak2 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (ak2)var2.next();
      } while(!var3.fJ.equalsIgnoreCase(var1));

      return var3;
   }

   public List a(apg var1, int var2, int var3, int var4, int var5, int var6, int var7, Map var8, String var9, String var10) {
      if (this.void.isEmpty()) {
         return null;
      } else {
         Object var11 = new ArrayList();
         boolean var12 = var4 < 0;
         int var13 = var2 * var2;
         int var14 = var3 * var3;
         var4 = ajs.a(var4);

         for(int var15 = 0; var15 < this.void.size(); ++var15) {
            ak2 var16 = (ak2)this.void.get(var15);
            boolean var17;
            if (var9 != null) {
               var17 = var9.startsWith("!");
               if (var17) {
                  var9 = var9.substring(1);
               }

               if (var17 == var9.equalsIgnoreCase(var16.aB())) {
                  continue;
               }
            }

            if (var10 != null) {
               var17 = var10.startsWith("!");
               if (var17) {
                  var10 = var10.substring(1);
               }

               no var18 = var16.cu();
               String var19 = var18 == null ? "" : var18.try();
               if (var17 == var10.equalsIgnoreCase(var19)) {
                  continue;
               }
            }

            if (var1 != null && (var2 > 0 || var3 > 0)) {
               float var20 = var1.if(var16.for());
               if (var2 > 0 && var20 < (float)var13 || var3 > 0 && var20 > (float)var14) {
                  continue;
               }
            }

            if (this.a((aek)var16, (Map)var8) && (var5 == yz.if.new() || var5 == var16.pT.a().new()) && (var6 <= 0 || var16.fX >= var6) && var16.fX <= var7) {
               ((List)var11).add(var16);
            }
         }

         if (var1 != null) {
            Collections.sort((List)var11, new ami(var1));
         }

         if (var12) {
            Collections.reverse((List)var11);
         }

         if (var4 > 0) {
            var11 = ((List)var11).subList(0, Math.min(var4, ((List)var11).size()));
         }

         return (List)var11;
      }
   }

   private boolean a(aek var1, Map var2) {
      if (var2 != null && var2.size() != 0) {
         Iterator var3 = var2.entrySet().iterator();

         Entry var4;
         boolean var6;
         int var10;
         do {
            if (!var3.hasNext()) {
               return true;
            }

            var4 = (Entry)var3.next();
            String var5 = (String)var4.getKey();
            var6 = false;
            if (var5.endsWith("_min") && var5.length() > 4) {
               var6 = true;
               var5 = var5.substring(0, var5.length() - 4);
            }

            nl var7 = var1.ct();
            np var8 = var7.byte(var5);
            if (var8 == null) {
               return false;
            }

            nn var9 = var1.ct().a(var1.aB(), var8);
            var10 = var9.for();
            if (var10 < (Integer)var4.getValue() && var6) {
               return false;
            }
         } while(var10 <= (Integer)var4.getValue() || var6);

         return false;
      } else {
         return true;
      }
   }

   public void a(double var1, double var3, double var5, double var7, int var9, an7 var10) {
      this.a((aek)null, var1, var3, var5, var7, var9, var10);
   }

   public void a(aek var1, double var2, double var4, double var6, double var8, int var10, an7 var11) {
      for(int var12 = 0; var12 < this.void.size(); ++var12) {
         ak2 var13 = (ak2)this.void.get(var12);
         if (var13 != var1 && var13.a6 == var10) {
            double var14 = var2 - var13.al;
            double var16 = var4 - var13.ak;
            double var18 = var6 - var13.aj;
            if (var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.pV.if(var11);
            }
         }
      }

   }

   public void byte() {
      for(int var1 = 0; var1 < this.void.size(); ++var1) {
         this.if((ak2)this.void.get(var1));
      }

   }

   public void try(String var1) {
      this.new.add(var1);
   }

   public void byte(String var1) {
      this.new.remove(var1);
   }

   public Set e() {
      return this.new;
   }

   public Set case() {
      return this.try;
   }

   public void long() {
   }

   public void a(ak2 var1, ak5 var2) {
      var1.pV.if((an7)(new ani(var2.m(), var2.t())));
      if (var2.goto()) {
         var1.pV.if((an7)(new aoq(1, 0)));
      }

   }

   public void new(ak2 var1) {
      var1.a(var1.fQ);
      var1.eE();
      var1.pV.if((an7)(new anw(var1.fR.aa)));
   }

   public int if() {
      return this.void.size();
   }

   public int else() {
      return this.long;
   }

   public String[] d() {
      return this.char.t4[0].x().for().a();
   }

   public boolean do() {
      return this.for;
   }

   public void a(boolean var1) {
      this.for = var1;
   }

   public List int(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.void.iterator();

      while(var3.hasNext()) {
         ak2 var4 = (ak2)var3.next();
         if (var4.eH().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public int b() {
      return this.goto;
   }

   public net.minecraft.a.a void() {
      return this.char;
   }

   public aqv char() {
      return null;
   }

   public void a(yz var1) {
      this.do = var1;
   }

   private void a(ak2 var1, ak2 var2, y6 var3) {
      if (var2 != null) {
         var1.pT.a(var2.pT.a());
      } else if (this.do != null) {
         var1.pT.a(this.do);
      }

      var1.pT.if(var3.l().f());
   }

   public void if(boolean var1) {
      this.if = var1;
   }

   public void c() {
      while(!this.void.isEmpty()) {
         ((ak2)this.void.get(0)).pV.if("Server closed");
      }

   }

   public void case(String var1) {
      this.char.J(var1);
      this.a((an7)(new apf(var1)));
   }
}
