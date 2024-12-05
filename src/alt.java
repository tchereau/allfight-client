import java.util.Iterator;

public class alt extends ao7 implements apa {
   public alt() {
      this.a(new arl());
      this.a(new arr());
      this.a(new ars());
      this.a(new ary());
      this.a(new arn());
      this.a(new ark());
      this.a(new arj());
      this.a(new aru());
      this.a(new alq());
      this.a(new arp());
      this.a(new arw());
      this.a(new arv());
      this.a(new al6());
      this.a(new arm());
      this.a(new aro());
      this.a(new al7());
      this.a(new al2());
      this.a(new ama());
      this.a(new als());
      this.a(new arq());
      this.a(new al9());
      this.a(new alp());
      this.a(new alu());
      if (net.minecraft.a.a.g2().ht()) {
         this.a(new al1());
         this.a(new al8());
         this.a(new alr());
         this.a(new alx());
         this.a(new alw());
         this.a(new alv());
         this.a(new amc());
         this.a(new al0());
         this.a(new amb());
         this.a(new al4());
         this.a(new alz());
         this.a(new al5());
         this.a(new al3());
         this.a(new alo());
      } else {
         this.a(new aly());
      }

      ao8.a((apa)this);
   }

   public void a(ar0 var1, int var2, String var3, Object... var4) {
      boolean var5 = true;
      if (var1 instanceof ol && !net.minecraft.a.a.g2().t4[0].i().a("commandBlockOutput")) {
         var5 = false;
      }

      if (var5) {
         Iterator var6 = net.minecraft.a.a.g2().g6().void.iterator();

         while(var6.hasNext()) {
            ak2 var7 = (ak2)var6.next();
            if (var7 != var1 && net.minecraft.a.a.g2().g6().for(var7.fJ)) {
               var7.a((String)("" + aqj.i + "" + aqj.new + "[" + var1.do() + ": " + var7.a(var3, var4) + "]"));
            }
         }
      }

      if (var1 != net.minecraft.a.a.g2()) {
         net.minecraft.a.a.g2().a().a("[" + var1.do() + ": " + net.minecraft.a.a.g2().a(var3, var4) + "]");
      }

      if ((var2 & 1) != 1) {
         var1.a(var1.a(var3, var4));
      }

   }
}
