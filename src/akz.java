import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.SecretKey;

public class akz extends an6 {
   private static Random n = new Random();
   private byte[] m;
   private final net.minecraft.a.a l;
   public final ap7 p;
   public boolean o = false;
   private int k = 0;
   private String j = null;
   private volatile boolean i = false;
   private String h = "";
   private boolean g = false;
   private SecretKey f = null;

   public akz(net.minecraft.a.a var1, Socket var2, String var3) throws IOException {
      this.l = var1;
      this.p = new ap7(var1.a(), var2, var3, this, var1.g9().getPrivate());
      this.p.u = 0;
   }

   public void try() {
      if (this.i) {
         this.new();
      }

      if (this.k++ == 600) {
         this.do("Took too long to log in");
      } else {
         this.p.if();
      }

   }

   public void do(String var1) {
      try {
         this.l.a().a("Disconnecting " + this.int() + ": " + var1);
         this.p.a((an7)(new aou(var1)));
         this.p.int();
         this.o = true;
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void a(ao5 var1) {
      this.j = var1.E();
      if (!this.j.equals(ajm.a(this.j))) {
         this.do("Invalid username!");
      } else {
         PublicKey var2 = this.l.g9().getPublic();
         if (var1.F() != 70) {
            if (var1.F() > 70) {
               this.do("Veuillez utiliser notre lanceur !");
            } else {
               this.do("Veuillez utiliser notre lanceur !");
            }
         } else {
            this.h = this.l.hu() ? Long.toString(n.nextLong(), 16) : "-";
            this.m = new byte[4];
            n.nextBytes(this.m);
            this.p.a((an7)(new anx(this.h, var2, this.m)));
         }
      }

   }

   public void a(anh var1) {
      PrivateKey var2 = this.l.g9().getPrivate();
      this.f = var1.if(var2);
      if (!Arrays.equals(this.m, var1.a(var2))) {
         this.do("Invalid client reply");
      }

      this.p.a((an7)(new anh()));
   }

   public void a(apb var1) {
      if (var1.c8 == 0) {
         if (this.g) {
            this.do("Duplicate login");
            return;
         }

         this.g = true;
         if (this.l.hu()) {
            (new aky(this)).start();
         } else {
            this.i = true;
         }
      }

   }

   public void a(aog var1) {
   }

   public void new() {
      String var1 = this.l.g6().a(this.p.do(), this.j);
      if (var1 != null) {
         this.do(var1);
      } else {
         ak2 var2 = this.l.g6().new(this.j);
         if (var2 != null) {
            this.l.g6().a((aqb)this.p, (ak2)var2);
         }
      }

      this.o = true;
   }

   public void a(String var1, Object[] var2) {
      this.l.a().a(this.int() + " lost connection");
      this.o = true;
   }

   public void a(aop var1) {
      try {
         amh var2 = this.l.g6();
         String var3 = null;
         if (var1.b9 == 1) {
            List var4 = Arrays.asList(1, 60, this.l.hq(), this.l.gV(), var2.if(), var2.else());

            Object var5;
            for(Iterator var6 = var4.iterator(); var6.hasNext(); var3 = var3 + var5.toString().replaceAll("\u0000", "")) {
               var5 = var6.next();
               if (var3 == null) {
                  var3 = "§";
               } else {
                  var3 = var3 + "\u0000";
               }
            }
         } else {
            var3 = this.l.gV() + "§" + var2.if() + "§" + var2.else();
         }

         InetAddress var8 = null;
         if (this.p.long() != null) {
            var8 = this.p.long().getInetAddress();
         }

         this.p.a((an7)(new aou(var3)));
         this.p.int();
         if (var8 != null && this.l.ho() instanceof alh) {
            ((alh)this.l.ho()).a(var8);
         }

         this.o = true;
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public void a(an7 var1) {
      this.do("Protocol error");
   }

   public String int() {
      return this.j != null ? this.j + " [" + this.p.do().toString() + "]" : this.p.do().toString();
   }

   public boolean a() {
      return true;
   }

   static String do(akz var0) {
      return var0.h;
   }

   static net.minecraft.a.a for(akz var0) {
      return var0.l;
   }

   static SecretKey if(akz var0) {
      return var0.f;
   }

   static String a(akz var0) {
      return var0.j;
   }

   static boolean a(akz var0, boolean var1) {
      return var0.i = var1;
   }
}
