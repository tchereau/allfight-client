import java.io.IOException;
import java.net.InetAddress;

public class as extends aku {
   private final ap9 int;
   private ap9 case;
   private String byte;
   private boolean try = false;
   private alg new;

   public as(av var1) {
      super(var1);
      this.int = new ap9(var1.a(), (an6)null);
   }

   public void a(ap9 var1, String var2) {
      this.case = var1;
      this.byte = var2;
   }

   public String int() {
      if (this.new == null) {
         int var1 = -1;

         try {
            var1 = aj3.a();
         } catch (IOException var4) {
         }

         if (var1 <= 0) {
            var1 = 25564;
         }

         try {
            this.new = new alg(this, (InetAddress)null, var1);
            this.new.start();
         } catch (IOException var3) {
            throw var3;
         }
      }

      return this.new.for().getHostAddress() + ":" + this.new.do();
   }

   public void do() {
      super.do();
      if (this.new != null) {
         this.try().a().a("Stopping server connection");
         this.new.a();
         this.new.interrupt();
         this.new = null;
      }

   }

   public void a() {
      if (this.case != null) {
         ak2 var1 = this.try().g6().new(this.byte);
         if (var1 != null) {
            this.int.a(this.case);
            this.try = true;
            this.try().g6().a((aqb)this.int, (ak2)var1);
         }

         this.case = null;
         this.byte = null;
      }

      if (this.new != null) {
         this.new.if();
      }

      super.a();
   }

   public av try() {
      return (av)super.if();
   }

   public boolean new() {
      return this.try && this.int.byte().case() && this.int.byte().try();
   }

   // $FF: synthetic method
   public net.minecraft.a.a if() {
      return this.try();
   }
}
