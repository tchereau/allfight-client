import java.net.SocketAddress;

public class ax extends amh {
   private aqv d = null;

   public ax(av var1) {
      super(var1);
      this.goto = 10;
   }

   protected void if(ak2 var1) {
      if (var1.do().equals(this.k().hC())) {
         this.d = new aqv();
         var1.int((aqv)this.d);
      }

      super.if(var1);
   }

   public String a(SocketAddress var1, String var2) {
      return var2.equalsIgnoreCase(this.k().hC()) ? "That name is already taken." : super.a(var1, var2);
   }

   public av k() {
      return (av)super.void();
   }

   public aqv char() {
      return this.d;
   }

   // $FF: synthetic method
   public net.minecraft.a.a void() {
      return this.k();
   }
}
